package org.gro.texteditor.page;

import javafx.scene.input.KeyEvent;
import org.gro.texteditor.Initialize;
import org.gro.texteditor.Properties;
import org.gro.texteditor.characters.Character;
import org.gro.texteditor.characters.Type;

public class KeyPressHandler {

    String file;
    Page page;
    LineFrame frame;

    public KeyPressHandler(Page page, String file){
        this.file = file;
        this.page = page;
        frame = new LineFrame(page.children);
    }

    public void handle(KeyEvent event) {
        int code = event.getCode().getCode();
        boolean shift = event.isShiftDown(), control = event.isControlDown();
        if (control && code == 'S') {
            System.out.println("Saving file " + file);
            Initialize.saveFile(frame, file);
            event.consume();
            return;
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
            case 16, 17, 37, 39: break; // shift, ctrl, left arrow, right arrow
            case 38: frame.shiftUp(); break; // up arrow
            case 40: shiftDown(); break; // down arrow

            default:
                Character character = getCharacter(code, shift);
                page.current.write(character);
        }
        if (page.current.length > Properties.lineLimit) {
            page.newLine(); shiftDown();
        }

        event.consume();
    }

    private static Character getCharacter(int code, boolean shift) {
        Type type =
                code >= '0' && code <= '9' ?
                        shift ? Type.SHIFTED :
                                Type.NUMBER  :
                code >= 'A' && code <= 'Z' ?
                        shift ? Type.CAPITAL   :
                                Type.LOWERCASE :
                shift ? Type.SHIFTED :
                        Type.SPECIAL;

        return new Character(code, type);
    }

    private void shiftDown(){
        frame.shiftDown();
        int linesRemaining = frame.forwardSize();
        if (linesRemaining <= 5)
            page.current = (Line)page.children.get(page.children.size() + linesRemaining - 6);
    }

}
