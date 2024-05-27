package org.gro.texteditor.page;

import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.collections.ObservableList;
import org.gro.texteditor.characters.Character;

public class Line extends HBox {

    ObservableList<Node> children = this.getChildren();
    double length = 0;

    public void write(Character character) {
        children.add(character);
    }
    public void write(int index, Character character) {
        children.add(index, character);
    }

    public void delete() {
        if (!children.isEmpty())
            length -= ((Character) children.removeLast()).length;
    }
    public void delete(int index) {
        if (children.size() > index) children.remove(index);
    }

}