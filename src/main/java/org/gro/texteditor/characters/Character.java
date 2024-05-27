package org.gro.texteditor.characters;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import org.gro.texteditor.Properties;

public class Character extends Canvas {

    public int code;
    public double length;

    public Character(int code, Type type) {
        super(Properties.width, Properties.height);
        GraphicsContext canvas = this.getGraphicsContext2D();
        this.code = code;

        switch(type) {
            case CAPITAL, NUMBER: length = 15.2; break;
            case SPECIAL: length = 11.2; break;
            case SHIFTED:
                this.code = Special.mappings.get((char) this.code); break;
            case LOWERCASE:
                this.code = code + 32;
                switch(this.code) {
                    case 'i', 'j', 'l': length = 6.4; break;
                    default: length += 11.2; break;
                } break;
        }

        switch(type) {
            case LOWERCASE: Lowercase.draw(this.code, canvas); break;
            case CAPITAL:     Capital.draw(this.code, canvas); break;
            case NUMBER:      Numbers.draw(this.code, canvas); break;
            case SHIFTED:
            case SPECIAL:     Special.draw(this.code, canvas); break;
        }

    }

}