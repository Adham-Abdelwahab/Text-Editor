package org.gro.texteditor.characters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import org.gro.texteditor.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public final class Special {
    static final double height = Properties.height,
                         width = Properties.width;

    public final static Map<java.lang.Character, java.lang.Character> mappings = Map.ofEntries(
            Map.entry('1', '!'), Map.entry('2', '@'), Map.entry('3', '#'),
            Map.entry('4', '$'), Map.entry('5', '%'), Map.entry('6', '^'),
            Map.entry('7', '&'), Map.entry('8', '*'), Map.entry('9', '('),
            Map.entry('0', ')'), Map.entry('-', '_'), Map.entry('=', '+'),
            Map.entry('[', '{'), Map.entry(']', '}'), Map.entry('\\', '|'),
            Map.entry(';', ':'), Map.entry('\'', '"'), Map.entry(',','<'),
            Map.entry('.', '>'), Map.entry('/', '?'), Map.entry('`', '~'),
            Map.entry((char)222, '"'), Map.entry(' ', ' ')
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
        canvas.getCanvas().setWidth(width);
        canvas.strokeLine(0.10 * width, 0.35 * height, 0.90 * width, 0.35 * height);
        canvas.strokeLine(0.10 * width, 0.65 * height, 0.90 * width, 0.65 * height);
        canvas.strokeLine(0.25 * width, 0.85 * height, 0.35 * width, 0.15 * height);
        canvas.strokeLine(0.65 * width, 0.85 * height, 0.75 * width, 0.15 * height);
    }

    private static void dollar() {

    }

    private static void percent() {
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.60 * width, 0.15 * height);
        canvas.strokeArc (0.10 * width, 0.25 * height, 0.20 * width, 0.20 * height, 0, 360, ArcType.OPEN);
        canvas.strokeArc (0.40 * width, 0.55 * height, 0.20 * width, 0.20 * height, 0, 360, ArcType.OPEN);
    }

    private static void carrot() {
        canvas.strokeLine(0.10 * width, 0.30 * height, 0.35 * width, 0.15 * height);
        canvas.strokeLine(0.60 * width, 0.30 * height, 0.35 * width, 0.15 * height);
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
        canvas.strokeLine(0.00 * width, 0.85 * height, 0.70 * width, 0.85 * height);
    }

    private static void hyphen() {
        canvas.strokeLine(0.10 * width, 0.60 * height, 0.60 * width, 0.60 * height);
    }

    private static void plus() {
        canvas.strokeLine(0.10 * width, 0.60 * height, 0.60 * width, 0.60 * height);
        canvas.strokeLine(0.35 * width, 0.45 * height, 0.35 * width, 0.75 * height);
    }

    private static void equals() {
        canvas.strokeLine(0.10 * width, 0.50 * height, 0.60 * width, 0.50 * height);
        canvas.strokeLine(0.10 * width, 0.70 * height, 0.60 * width, 0.70 * height);
    }

    private static void lparen() {
        canvas.strokeArc(0.10 * width, 0.15 * height, 0.50 * width, 0.70 * height, 90, 180, ArcType.OPEN);
    }

    private static void rparen() {
        canvas.strokeArc(0.10 * width, 0.15 * height, 0.50 * width, 0.70 * height, 270, 180, ArcType.OPEN);
    }

    private static void lbrace() {

    }

    private static void rbrace() {

    }

    private static void lbracket() {
        canvas.strokeLine(0.15 * width, 0.15 * height, 0.50 * width, 0.15 * height);
        canvas.strokeLine(0.15 * width, 0.15 * height, 0.15 * width, 0.85 * height);
        canvas.strokeLine(0.15 * width, 0.85 * height, 0.50 * width, 0.85 * height);
    }

    private static void rbracket() {
        canvas.strokeLine(0.20 * width, 0.15 * height, 0.55 * width, 0.15 * height);
        canvas.strokeLine(0.55 * width, 0.15 * height, 0.55 * width, 0.85 * height);
        canvas.strokeLine(0.20 * width, 0.85 * height, 0.55 * width, 0.85 * height);
    }

    private static void langle() {
        canvas.strokeLine(0.15 * width, 0.60 * height, 0.55 * width, 0.45 * height);
        canvas.strokeLine(0.15 * width, 0.60 * height, 0.55 * width, 0.75 * height);
    }

    private static void rangle() {
        canvas.strokeLine(0.55 * width, 0.60 * height, 0.15 * width, 0.45 * height);
        canvas.strokeLine(0.55 * width, 0.60 * height, 0.15 * width, 0.75 * height);
    }

    private static void colon() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc(0.17 * width, 0.47 * height, 0.06 * width, 0.06 * height, 0, 360, ArcType.ROUND);
        canvas.strokeArc(0.17 * width, 0.67 * height, 0.06 * width, 0.06 * height, 0, 360, ArcType.ROUND);
    }

    private static void semicolon() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc(0.17 * width, 0.47 * height, 0.06 * width, 0.06 * height, 0, 360, ArcType.ROUND);
        canvas.strokeArc(0.175 * width, 0.80 * height, 0.05 * width, 0.05 * height, 0, 360, ArcType.ROUND);
        canvas.strokeLine(0.225 * width, 0.85 * height, 0.15 * width, 0.90 * height);
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
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeLine(0.20 * width, 0.05 * height, 0.20 * width, 0.95 * height);
    }

    private static void quote() {
        canvas.strokeLine(0.20 * width, 0.15 * height, 0.20 * width, 0.35 * height);
        canvas.strokeLine(0.50 * width, 0.15 * height, 0.50 * width, 0.35 * height);
    }

    private static void apostraphe() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc(0.175 * width, 0.15 * height, 0.05 * width, 0.05 * height, 0, 360, ArcType.ROUND);
        canvas.strokeLine(0.225 * width, 0.20 * height, 0.15 * width, 0.25 * height);
    }

    private static void backslash() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.60 * width, 0.85 * height);
    }

    private static void forwardslash() {
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.60 * width, 0.15 * height);
    }
}
