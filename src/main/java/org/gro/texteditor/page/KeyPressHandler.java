package org.gro.texteditor.page;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.gro.texteditor.Properties;
import org.gro.texteditor.characters.Character;
import org.gro.texteditor.characters.Type;

public class KeyPressHandler {

    Page page;
    LineFrame frame;

    public KeyPressHandler(Page page){
        this.page = page;
        frame = new LineFrame(page.children);
    }

    public void handle(KeyEvent event) {
        KeyCode keycode = event.getCode();
        int code = keycode.getCode();
        boolean shift = event.isShiftDown(), control = event.isControlDown();

        if (page.current.length > Properties.lineLimit && code != 10) {
            page.newLine(); shiftDown();
        }
        switch(code) {
            case 8: // backspace
                int index = page.activeLineNumber();
                if (page.current.children.size() == 4 && index != 0) {
                    page.children.remove(index);
                    page.current = (Line) page.children.get(index - 1);
                    page.lineNumber -= 1;
                    frame.shiftUp();
                } else page.current.delete(); break;
            case 10: // enter
                page.current.write(new Character(' ', Type.SPECIAL));
                page.newLine(); shiftDown(); break;
            case 16, 17: break; // shift, ctrl
            case 37: break; // left arrow
            case 38: frame.shiftUp(); break; // up arrow
            case 39: break; // right arrow
            case 40: shiftDown(); break; // down arrow
            default:
                Type type =
                        code >= '0' && code <= '9' ?
                                shift ? Type.SHIFTED :
                                        Type.NUMBER  :
                        code >= 'A' && code <= 'Z' ?
                                shift ? Type.CAPITAL   :
                                        Type.LOWERCASE :
                        shift? Type.SHIFTED :
                               Type.SPECIAL;

                Character character = new Character(code, type);
                page.current.length += character.length;
                page.current.write(character);
        }

        event.consume();
    }

    private void shiftDown(){
        frame.shiftDown();
        int linesRemaining = frame.forwardSize();
        if (linesRemaining <= 5)
            page.current = (Line)page.children.get(page.children.size() + linesRemaining - 6);
    }

}
