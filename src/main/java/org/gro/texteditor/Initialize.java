package org.gro.texteditor;

import javafx.geometry.Pos;
import javafx.scene.Node;
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
import org.gro.texteditor.characters.Character;
import org.gro.texteditor.characters.Special;
import org.gro.texteditor.page.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Initialize {

    Stage stage;

    HashMap<java.lang.Character, KeyCode> keyCodeLookup;
    ArrayList<java.lang.Character> specialKeys;
    ArrayList<java.lang.Character> specialValues;

    Text error;
    TextArea input;
    Button button;
    VBox layout;
    Scene openFileScene;

    public Initialize(Stage stage) {
        this.stage = stage;
        stage.setResizable(false);

        // KeyCode lookups
        KeyCode[] keyCodes = KeyCode.values();
        keyCodeLookup = new HashMap<>();
        for(KeyCode keyCode : keyCodes)
            keyCodeLookup.put((char) keyCode.getCode(), keyCode);

        specialKeys   = new ArrayList<>(Special.mappings.keySet());
        specialValues = new ArrayList<>(Special.mappings.values());

        // Initialize file open scene
        error = new Text("FILE NOT FOUND");
        error.setFont(Font.font(20));
        error.setFill(Color.RED);

        input = new TextArea();
        input.setMaxHeight(5);
        input.setMaxWidth(400);

        button = new Button("Open");

        layout = new VBox(error, input, button);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);

        button.setOnAction(_ -> readFile());
        input.addEventFilter(KeyEvent.KEY_PRESSED, keyEvent -> {
            if (keyEvent.getCode().getCode() == 10) {
                keyEvent.consume();
                readFile();
            }
        });

        openFileScene = new Scene(layout, 500, 200);
    }

    public void openFile() {
        input.clear();
        error.setVisible(false);
        stage.setScene(openFileScene);
        stage.show();
    }

    private void readFile() {
        stage.hide();

        Path path = Path.of(Properties.path + input.getText());

        try {
            Scene newPage;
            if (input.getText().isEmpty()) newPage = newPage("document.txt", "");
            else newPage = newPage(input.getText(), Files.readString(path));

            stage.setScene(newPage);
            stage.show();
        } catch (IOException e) {
            error.setVisible(true);
            stage.show();
        }
    }

    public static void saveFile(LineFrame frame, String file) {
        try (FileWriter writer = new FileWriter(Properties.path + file)){
            StringBuilder fileContent = new StringBuilder();
            for (Line line : frame.backward) fileContent.append(lineToString(line));
            for (Node line : frame.lines) fileContent.append(lineToString((Line) line));
            for (Line line : frame.forward) fileContent.append(lineToString(line));
            writer.write(fileContent.toString());
        } catch (IOException _) { System.out.println("Unable to save file " + file); }
    }
    private static String lineToString(Line line) {
        StringBuilder string = new StringBuilder();
        for (Node character : line.getChildren())
            string.append(((Character) character).code);
        string.delete(0, 4); string.append('\n');
        return string.toString();
    }

    public Scene newPage(String file, String fileContent) {
        Page page = new Page(file);
        ScrollPane layout = new ScrollPane(page);
        KeyPressHandler keyPressHandler = new KeyPressHandler(page, file);

        layout.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        layout.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        Scene scene = new Scene(layout, 1100, 600);
        scene.setOnKeyPressed(keyPressHandler::handle);
        scene.addEventFilter(MouseEvent.ANY, new MouseClickHandler(page)::handle);

        for (char letter : fileContent.toCharArray()) {
            if (letter == 13) continue;
            if (letter == '\'') letter = (char) 222;

            boolean shiftDown = false;
            if (letter >= 97 && letter <= 122) letter -= 32;
            else if (letter >= 65 && letter <= 90) shiftDown = true;
            else if (specialValues.contains(letter)) {
                letter = specialKeys.get(specialValues.indexOf(letter));
                shiftDown = true;
            }

            KeyCode keyCode = keyCodeLookup.get(letter);
            KeyEvent event = new KeyEvent(
                    openFileScene, page,
                    KeyEvent.KEY_PRESSED,
                    keyCode.getChar(), String.valueOf(letter), keyCode,
                    shiftDown, false, false, false
            );
            keyPressHandler.handle(event);
        }

        return scene;
    }

}
