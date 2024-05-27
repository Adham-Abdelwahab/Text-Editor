package org.gro.texteditor.characters;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import org.gro.texteditor.Properties;

public class Character extends Canvas {

    public char code;
    public double length;

    public Character(int code, Type type) {
        super(Properties.width, Properties.height);
        GraphicsContext canvas = this.getGraphicsContext2D();
        this.code = (char) code;

        switch(type) {
            case CAPITAL, NUMBER: length = 15.2; break;
            case LOWERCASE: this.code = (char)(code + 32); length = 11.2; break;
            case SHIFTED: this.code = Special.mappings.get(this.code);
            case SPECIAL: length = 11.2; break;
        }
        // SPECIAL + SHIFTED + LOWERCASE
        if ((".," + "!'" + "ijl")
                .contains(String.valueOf(this.code))) length = 6.4;
        System.out.println(length);

        switch(type) {
            case LOWERCASE: Lowercase.draw(this.code, canvas); break;
            case CAPITAL:     Capital.draw(this.code, canvas); break;
            case NUMBER:      Numbers.draw(this.code, canvas); break;
            case SHIFTED, SPECIAL:
                              Special.draw(this.code, canvas); break;
        }
    }

}