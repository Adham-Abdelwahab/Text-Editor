package org.gro.texteditor.characters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import org.gro.texteditor.Properties;

import java.util.Map;

public final class Special {
    static final double height = Properties.height,
                         width = Properties.width;

    public final static Map<java.lang.Character, java.lang.Character> mappings = Map.ofEntries(
            Map.entry('1', '!'), Map.entry('2', '@'), Map.entry('3', '#'),
            Map.entry('4', '$'), Map.entry('5', '%'), Map.entry('6', '^'),
            Map.entry('7', '&'), Map.entry('8', '*'), Map.entry('9', '('),
            Map.entry('0', ')'), Map.entry('/', '?'), Map.entry(' ', ' '),
            Map.entry(',', '<'),
            Map.entry( '\'', '"'), Map.entry((char)222, '"')
    );

    private static GraphicsContext canvas;

    public static void draw(int character, GraphicsContext draw) {
        canvas = draw;
        canvas.getCanvas().setWidth(0.70 * width);

        switch(character) {
            case ' ': canvas.getCanvas().setWidth(0.70 * width); break;
            case '!': exclamation(); break;         case '@': at();           break;
            case '#': hashtag();     break;         case '$': dollar();       break;
            case '%': percent();     break;         case '^': carrot();       break;
            case '=': equals();      break;         case '+': plus();         break;
            case '(': lparen();      break;         case ')': rparen();       break;
            case '{': lbrace();      break;         case '}': rbrace();       break;
            case '[': lbracket();    break;         case ']': rbracket();     break;
            case '|': pipe();        break;         case '<': langle();       break;
            case '>': rangle();      break;         case '?': question();     break;
            case ',': comma();       break;         case '.': period();       break;
            case ';': semicolon();   break;         case ':': colon();        break;
            case '-': hyphen();      break;         case '_': underscore();   break;
            case '&': ampersand();   break;         case '*': asterisk();     break;
            case 222: apostraphe(); break;          case '"': quote();        break;
            case '\\': backslash();  break;         case '/': forwardslash(); break;
        }
    }

    private static void exclamation() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc(0.175 * width, 0.80 * height, 0.05 * width, 0.05 * height, 0, 360, ArcType.ROUND);
        canvas.strokeLine(0.20 * width, 0.15 * height, 0.20 * width, 0.65 * height);
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
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeLine(0.175 * width, 0.15  * height, 0.225 * width, 0.15  * height);
        canvas.strokeLine(0.20  * width, 0.125 * height, 0.20  * width, 0.175 * height);
        canvas.strokeLine(0.18  * width, 0.13  * height, 0.22  * width, 0.17  * height);
        canvas.strokeLine(0.18  * width, 0.17  * height, 0.22  * width, 0.13  * height);
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
        canvas.strokeLine(0.225 * width, 0.85 * height, 0.15 * width, 0.90 * height);
    }

    private static void period() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc(0.175 * width, 0.80 * height, 0.05 * width, 0.05 * height, 0, 360, ArcType.ROUND);
    }

    private static void question() {
        canvas.strokeArc(0.325 * width, 0.80 * height, 0.05 * width, 0.05 * height, 0, 360, ArcType.ROUND);
        canvas.strokeLine(0.35 * width, 0.55 * height, 0.35 * width, 0.65 * height);
        canvas.strokeArc (0.10 * width, 0.15 * height, 0.50 * width, 0.35 * height, 270, 270, ArcType.OPEN);
    }

    private static void pipe() {

    }

    private static void quote() {

    }

    private static void apostraphe() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc(0.175 * width, 0.15 * height, 0.05 * width, 0.05 * height, 0, 360, ArcType.ROUND);
        canvas.strokeLine(0.225 * width, 0.20 * height, 0.15 * width, 0.25 * height);
    }

    private static void backslash() {

    }

    private static void forwardslash() {

    }
}
