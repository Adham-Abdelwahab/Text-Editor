package org.gro.texteditor.characters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import org.gro.texteditor.Properties;

import java.util.Map;

public final class Special {
    static final double height = Properties.height,
                         width = Properties.width;

    public final static Map<java.lang.Character, java.lang.Character> mappings = Map.ofEntries(
            Map.entry('1', '!'),
            Map.entry('2', '@'),
            Map.entry('3', '#'),
            Map.entry('4', '$'),
            Map.entry('5', '%'),
            Map.entry('6', '^'),
            Map.entry('7', '&'),
            Map.entry('8', '*'),
            Map.entry('9', '('),
            Map.entry('0', ')')
    );

    private static GraphicsContext canvas;

    public static void draw(int character, GraphicsContext draw) {
        canvas = draw;

        switch(character) {
            case ' ': canvas.getCanvas().setWidth(0.70 * width); break;
            case '!': exclamation(); break;
            case '@': at(); break;
            case '#': hashtag(); break;
            case '$': dollar(); break;
            case '%': percent(); break;
            case '^': carrot(); break;
            case '&': ampersand(); break;
            case '*': asterisk(); break;
            case '(': lparen(); break;
            case ')': rparen(); break;
            case '-': hyphen(); break;
            case '_': underscore(); break;
            case '=': equals(); break;
            case '+': plus(); break;
            case '{': lbrace(); break;
            case '}': rbrace(); break;
            case '[': lbracket(); break;
            case ']': rbracket(); break;
            case '\\': backslash(); break;
            case '/': forwardslash(); break;
            case '|': pipe(); break;
            case '<': langle(); break;
            case '>': rangle(); break;
            case '?': question(); break;
            case ',': comma(); break;
            case '.': period(); break;
            case ';': semicolon(); break;
            case ':': colon(); break;
            case '\'': apostraphe(); break;
            case '"': quote(); break;
        }
    }

    private static void exclamation() {

    }

    private static void at() {

    }

    private static void hashtag() {

    }

    private static void dollar() {

    }

    private static void percent() {

    }

    private static void carrot() {

    }

    private static void ampersand() {

    }

    private static void asterisk() {

    }

    private static void underscore() {

    }

    private static void hyphen() {

    }

    private static void plus() {

    }

    private static void equals() {

    }

    private static void lparen() {

    }

    private static void rparen() {

    }

    private static void lbrace() {

    }

    private static void rbrace() {

    }

    private static void lbracket() {

    }

    private static void rbracket() {

    }

    private static void langle() {

    }

    private static void rangle() {

    }

    private static void colon() {

    }

    private static void semicolon() {

    }

    private static void comma() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc(0.175 * width, 0.80 * height, 0.05 * width, 0.05 * height, 0, 360, ArcType.ROUND);
        canvas.strokeArc(0.175 * width, 0.85 * height, 0.05 * width, 0.05 * height, 270, 90, ArcType.OPEN);
    }

    private static void period() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc(0.175 * width, 0.80 * height, 0.05 * width, 0.05 * height, 0, 360, ArcType.ROUND);
    }

    private static void question() {

    }

    private static void pipe() {

    }

    private static void quote() {

    }

    private static void apostraphe() {

    }

    private static void backslash() {

    }

    private static void forwardslash() {

    }
}
