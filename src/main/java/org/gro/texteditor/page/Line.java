package org.gro.texteditor.page;

import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.collections.ObservableList;
import org.gro.texteditor.characters.Character;

public class Line extends HBox {

    ObservableList<Node> children = this.getChildren();
    double length = 0;

    public void write(Character character) {
        children.add(children.size(), character);
    }
    public void write(int index, Character character) {
        length += character.length;
        children.add(index, character);
    }

    public Character delete() {
        if (!children.isEmpty()) {
            Character last = (Character) children.removeLast();
            length -= last.length;
            return last;
        } return null;
    }

}