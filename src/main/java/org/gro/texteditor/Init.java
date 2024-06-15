package org.gro.texteditor;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.gro.texteditor.characters.Special;
import org.gro.texteditor.page.KeyPressHandler;
import org.gro.texteditor.page.MouseClickHandler;
import org.gro.texteditor.page.Page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;

public class Init {

    Stage stage;

    HashMap<Character, KeyCode> keyCodeLookup;

    Text error;
    TextArea input;
    Button button;
    VBox layout;
    Scene openFileScene;

    public Init(Stage stage) {
        this.stage = stage;
        stage.setResizable(false);

        KeyCode[] keyCodes = KeyCode.values();
        keyCodeLookup = new HashMap<>();
        for(KeyCode keyCode : keyCodes)
            keyCodeLookup.put((char) keyCode.getCode(), keyCode);

        error = new Text("FILE NOT FOUND");
        error.setFont(Font.font(20));
        error.setFill(Color.RED);

        input = new TextArea();
        input.setMaxHeight(5);
        input.setMaxWidth(400);

        button = new Button("Open");

        layout = new VBox(error, input, button);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(10);

        button.setOnAction(_ -> submit());
        input.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode().getCode() == 10) {
                keyEvent.consume();
                submit();
            }
        });

        openFileScene = new Scene(layout, 800, 300);
    }

    public void openFile() {
        input.clear();
        error.setVisible(false);
        stage.setScene(openFileScene);
        stage.show();
    }

    private void submit() {
        stage.hide();

        String fileContent;

        try { fileContent = Files.readString(Path.of(Properties.path + input.getText())); }
        catch (IOException e) {
            error.setVisible(true);
            stage.show();
            throw new RuntimeException(e);
        }

        Scene newPage = newPage();
        EventHandler<? super KeyEvent> onKeyPressed = newPage.getOnKeyPressed();
        Page page = (Page) ((ScrollPane)newPage.getRoot()).getContent();

        for (char letter : fileContent.toCharArray()) {
            if (letter == 13) continue;
            boolean shiftDown = false;
            if(Special.mappings.get(letter) != null) shiftDown = false;
            else letter = specialLookup(letter);
            String toString = String.valueOf(letter);
            if (letter >= 97 && letter <= 122) letter -= 32;
            else shiftDown = true;

            KeyCode keyCode = keyCodeLookup.get(letter);
            KeyEvent event = new KeyEvent(
                    openFileScene, page,
                    KeyEvent.KEY_PRESSED,
                    keyCode.getChar(), toString, keyCode,
                    shiftDown, false, false, false
            );
            System.out.println(event);
            onKeyPressed.handle(event);
        }

        stage.setScene(newPage);
        stage.show();
    }

    private Character specialLookup(char character) {
        Collection<Character> characters = Special.mappings.values();
        if (!characters.contains(character)) return character;

        int index = 0;
        for(Character c : characters)
            if (c == character) {
                return (char) Special.mappings.keySet().toArray()[index];
            } else index++;
        return ' ';
    }

    public Scene newPage() {
        Page page = new Page();
        ScrollPane layout = new ScrollPane(page);

        layout.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        layout.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        Scene scene = new Scene(layout, 1100, 600);
        scene.setOnKeyPressed(new KeyPressHandler(page)::handle);
        scene.addEventFilter(MouseEvent.ANY, new MouseClickHandler(page)::handle);

        return scene;
    }

}
