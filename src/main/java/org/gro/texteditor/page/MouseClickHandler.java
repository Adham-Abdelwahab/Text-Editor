package org.gro.texteditor.page;

import javafx.scene.input.MouseEvent;

public class MouseClickHandler {

    Page page;

    public MouseClickHandler(Page page){
        this.page = page;
    }

    public void handle(MouseEvent event) {
        event.consume();
    }
}
