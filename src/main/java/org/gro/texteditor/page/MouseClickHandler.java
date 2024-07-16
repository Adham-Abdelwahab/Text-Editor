package org.gro.texteditor.page;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import org.gro.texteditor.characters.Character;

public class MouseClickHandler {

    Page page;
    LineFrame frame;

    public MouseClickHandler(Page page, LineFrame frame) {
        this.page = page;
        this.frame = frame;
    }

    public void handle(MouseEvent event) {
        event.consume();
        if (event.getEventType() != MouseEvent.MOUSE_CLICKED) return;

        ObservableList<Node> lines = page.children;
        Node target = event.getPickResult().getIntersectedNode();

        int paddingLines = frame.forwardSize() - 5;
        int finalValidLine = lines.size() - 1 + paddingLines;

        if (target instanceof Character)
            target = target.getParent();

        if (target instanceof Line) {
            if (paddingLines < 0 && lines.indexOf(target) >= finalValidLine) {
                setLine(lines.get(finalValidLine));
            } else setLine(target);
        } else {
            int lineNumber = (int) (event.getY() / 30);
            if (paddingLines < 0 && lineNumber >= finalValidLine) {
                setLine(lines.get(finalValidLine));
            } else setLine(lines.get(lineNumber));
        }

    }

    private void setLine(Node line) {
        page.current = (Line) line;
        page.lineNumber = frame.backwardSize() + page.children.indexOf(line);
    }
}
