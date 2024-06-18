package org.gro.texteditor.page;

import javafx.collections.ObservableList;
import javafx.scene.Node;

import java.util.Stack;

public class LineFrame {

    public final ObservableList<Node> lines;
    public Stack<Line> backward = new Stack<>(),
                        forward = new Stack<>();

    public LineFrame(ObservableList<Node> lines) { this.lines = lines; }

    public void shiftUp() {
        if (!backward.empty()) lines.addFirst(backward.pop());
        if (lines.size() > 20) forward.push((Line) lines.removeLast());
    }

    public void shiftDown() {
        if (!forward.empty()) lines.add(forward.pop());
        if (lines.size() > 20) backward.push((Line) lines.removeFirst());
    }

    public int forwardSize() { return forward.size(); }
}
