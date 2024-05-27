package org.gro.texteditor;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import org.gro.texteditor.page.KeyPressHandler;
import org.gro.texteditor.page.MouseClickHandler;
import org.gro.texteditor.page.Page;

public class Init {

    public static Scene newPage() {
        Page page = new Page();
        ScrollPane layout = new ScrollPane(page);

        layout.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        layout.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        Scene scene = new Scene(layout, 1100, 600);
        scene.setOnKeyPressed(new KeyPressHandler(page)::handle);
        scene.addEventFilter(MouseEvent.ANY, new MouseClickHandler(page, layout)::handle);

        return scene;
    }

}
