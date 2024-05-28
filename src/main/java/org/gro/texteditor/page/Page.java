package org.gro.texteditor.page;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import org.gro.texteditor.characters.Character;
import org.gro.texteditor.characters.Type;

public class Page extends VBox {

    ObservableList<Node> children = this.getChildren();
    Line current;

    public Page() {
        newLine();
        // Padding lines
        for(int i = 0; i < 18; i ++) {
            Line line = new Line();
            line.write(new Character(' ', Type.SPECIAL));
            children.add(line);
        }
    }

    public int activeLineNumber() {
        return children.indexOf(current);
    }

    public void newLine() {
        int index = activeLineNumber() + 1;
        Line next = new Line();

        for (char character : String.valueOf(index).toCharArray())
            next.write(new Character(character, Type.NUMBER));
        for (int i = String.valueOf(index).length(); i < 4; i++)
            next.write(new Character(' ', Type.SPECIAL));

        if (current != null) {
            Character previous = current.delete();
            while (previous.code != ' ') {
                next.write(4, previous);
                previous = current.delete();
            }
        }

        current = next;
        children.add(index, next);
    }

}