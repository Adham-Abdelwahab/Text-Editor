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
            Character previous = (Character) current.children.getLast();
            while (previous.code != ' ') {
                next.children.add(4, current.children.removeLast());
                next.length += previous.length;
                previous = (Character) current.children.getLast();
            }
        }

        current = next;
        children.add(index, current);
    }
    public void setLine() {

    }
}