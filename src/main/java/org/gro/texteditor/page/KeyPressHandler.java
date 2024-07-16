package org.gro.texteditor.page;

import javafx.scene.input.KeyEvent;
import org.gro.texteditor.Initialize;
import org.gro.texteditor.Properties;
import org.gro.texteditor.characters.Character;
import org.gro.texteditor.characters.Type;

public class KeyPressHandler {

    Page page;
    LineFrame frame;

    public KeyPressHandler(Page page, LineFrame frame) {
        this.page = page;
        this.frame = frame;
    }

    public void handle(KeyEvent event) {
        int code = event.getCode().getCode();
        boolean shift = event.isShiftDown(), control = event.isControlDown();
        if (control && code == 'S') {
            System.out.println("Saving file " + page.file);
            Initialize.saveFile(frame, page.file);
            event.consume();
            return;
        }

        switch(code) {
            case 8: // backspace
                int index = page.activeLineNumber();
                if (page.current.children.size() == 4 && index != 0)
                    deleteLine(index); else page.current.delete(); break;
            case 10: // enter
                page.current.write(new Character(' ', Type.SPECIAL));
                newLine(); break;
            case 16, 17, 37, 39: break; // shift, ctrl, left arrow, right arrow
            case 38: frame.shiftUp(); break; // up arrow
            case 40: frame.shiftDown(); break; // down arrow

            default:
                Character character = getCharacter(code, shift);
                page.current.write(character);
        }
        if (page.current.length > Properties.lineLimit)
            newLine();

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

    private void deleteLine(int index) {
        redrawLines();
        page.children.remove(index);
        page.current = (Line) page.children.get(index - 1);
        page.lineNumber -= 1;
        frame.shiftUp();
        redrawLines();
    }

    private void newLine() {
        page.newLine();
        frame.shiftDown();
        redrawLines();
    }

    private void redrawLines() {
        int lineNumber = page.lineNumber + 1;
        int forwardStackSize = frame.forwardSize();
        int offset = forwardStackSize > 5 ? 0 : forwardStackSize - 5;

        for (int i = page.activeLineNumber() + 1; i < page.children.size() + offset; i++)
            redrawNumber((Line) page.children.get(i), lineNumber++);
        for (int i = forwardStackSize - 1; i >= 5; i--)
            redrawNumber(frame.forward.get(i), lineNumber++);
    }

    private void redrawNumber(Line redraw, int lineNumber) {
        redraw.children.remove(0, 4);
        char[] nextNumber = String.valueOf(lineNumber).toCharArray();
        for (int j = 0; j < nextNumber.length; j++)
            redraw.write(j, new Character(nextNumber[j], Type.NUMBER));
        for (int k = nextNumber.length; k < 4; k++)
            redraw.write(k, new Character(' ', Type.SPECIAL));
    }
}
