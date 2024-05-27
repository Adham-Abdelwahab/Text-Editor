package org.gro.texteditor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextEditor extends Application {

    @Override
    public void start(Stage stage) {
        Scene init = Init.newPage();
        stage.setResizable(false);
        stage.setScene(init);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}