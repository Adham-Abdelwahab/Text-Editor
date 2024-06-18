package org.gro.texteditor;

import javafx.application.Application;
import javafx.stage.Stage;

public class TextEditor extends Application {

    @Override
    public void start(Stage stage) {
        new Initialize(stage).openFile();
    }

    public static void main(String[] args) {
        launch();
    }
}