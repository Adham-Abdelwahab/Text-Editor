package org.gro.texteditor.page;

import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;

public class MouseClickHandler {

    Page page;
    ScrollPane layout;

    public MouseClickHandler(Page page, ScrollPane layout){
        this.page = page;
        this.layout = layout;
    }

    public void handle(MouseEvent event) {
        event.consume();
    }
}
