package org.gro.texteditor.characters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import org.gro.texteditor.Properties;

final class Capital {
    static final double height = Properties.height,
                         width = Properties.width;

    private static GraphicsContext canvas;

    public static void draw(int character, GraphicsContext draw){
        canvas = draw;

        switch(character) {
            case 'A': A(); break; case 'B': B(); break; case 'C': C(); break; case 'D': D(); break;
            case 'E': E(); break; case 'F': F(); break; case 'G': G(); break; case 'H': H(); break;
            case 'I': I(); break; case 'J': J(); break; case 'K': K(); break; case 'L': L(); break;
            case 'M': M(); break; case 'N': N(); break; case 'O': O(); break; case 'P': P(); break;
            case 'Q': Q(); break; case 'R': R(); break; case 'S': S(); break; case 'T': T(); break;
            case 'U': U(); break; case 'V': V(); break; case 'W': W(); break; case 'X': X(); break;
            case 'Y': Y(); break; case 'Z': Z(); break;
        }
    }

    private static void A() {
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.50 * width, 0.15 * height);
        canvas.strokeLine(0.50 * width, 0.15 * height, 0.90 * width, 0.85 * height);
        canvas.strokeLine(0.20 * width, 0.65 * height, 0.80 * width, 0.65 * height);
    }

    private static void B() {
        canvas.strokeLine(0.10 * width, 0.15 * height,  0.10 * width,  0.85 * height);
        canvas.strokeArc(-0.65 * width, 0.15 * height,  1.40 * width,  0.35 * height, 290, 155, ArcType.OPEN);
        canvas.strokeArc(-0.80 * width, 0.425 * height, 1.70 * width, 0.425 * height, 274, 143, ArcType.OPEN);
    }

    private static void C() {
        canvas.strokeArc (0.10 * width, 0.15 * height, 0.80 * width, 0.30 * height, 20, 156, ArcType.OPEN);
        canvas.strokeLine(0.10 * width, 0.28 * height, 0.10 * width, 0.72 * height);
        canvas.strokeArc (0.10 * width, 0.55 * height, 0.80 * width, 0.30 * height, 180, 160, ArcType.OPEN);
    }

    private static void D() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeArc(-0.70 * width, 0.15 * height, 1.60 * width, 0.70 * height, 270, 180, ArcType.OPEN);
    }

    private static void E() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.90 * width, 0.15 * height);
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.90 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.50 * height, 0.50 * width, 0.50 * height);
        canvas.strokeLine(0.90 * width, 0.15 * height, 0.90 * width, 0.25 * height);
        canvas.strokeLine(0.90 * width, 0.85 * height, 0.90 * width, 0.75 * height);
        canvas.strokeLine(0.50 * width, 0.45 * height, 0.50 * width, 0.55 * height);
    }

    private static void F() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.90 * width, 0.15 * height);
        canvas.strokeLine(0.90 * width, 0.15 * height, 0.90 * width, 0.25 * height);
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.50 * height, 0.50 * width, 0.50 * height);
        canvas.strokeLine(0.50 * width, 0.45 * height, 0.50 * width, 0.55 * height);
    }

    private static void G() {
        canvas.strokeLine(0.10 * width, 0.35 * height, 0.10 * width, 0.65 * height);
        canvas.strokeArc (0.10 * width, 0.15 * height, 0.80 * width, 0.40 * height, 0, 180, ArcType.OPEN);
        canvas.strokeArc (0.10 * width, 0.45 * height, 0.80 * width, 0.40 * height, 180, 180, ArcType.OPEN);
        canvas.strokeLine(0.90 * width, 0.65 * height, 0.90 * width, 0.55 * height);
        canvas.strokeLine(0.90 * width, 0.55 * height, 0.50 * width, 0.55 * height);
    }

    private static void H() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.50 * height, 0.90 * width, 0.50 * height);
        canvas.strokeLine(0.90 * width, 0.15 * height, 0.90 * width, 0.85 * height);
    }

    private static void I() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.90 * width, 0.15 * height);
        canvas.strokeLine(0.50 * width, 0.15 * height, 0.50 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.90 * width, 0.85 * height);
    }

    private static void J() {
        canvas.strokeLine(0.90 * width, 0.15 * height, 0.90 * width, 0.65 * height);
        canvas.strokeArc (0.10 * width, 0.45 * height, 0.80 * width, 0.40 * height, 160, 200, ArcType.OPEN);
    }

    private static void K() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.80 * width, 0.15 * height, 0.10 * width, 0.60 * height);
        canvas.strokeLine(0.41 * width, 0.40 * height, 0.90 * width, 0.85 * height);
    }

    private static void L() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.90 * width, 0.85 * height);
    }

    private static void M() {
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.20 * width, 0.15 * height);
        canvas.strokeLine(0.20 * width, 0.15 * height, 0.50 * width, 0.50 * height);
        canvas.strokeLine(0.50 * width, 0.50 * height, 0.80 * width, 0.15 * height);
        canvas.strokeLine(0.80 * width, 0.15 * height, 0.90 * width, 0.85 * height);
    }

    private static void N() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.90 * width, 0.85 * height);
        canvas.strokeLine(0.90 * width, 0.15 * height, 0.90 * width, 0.85 * height);
    }

    private static void O() {
        canvas.strokeArc( 0.10 * width, 0.15 * height, 0.80 * width, 0.30 * height, 0, 170, ArcType.OPEN);
        canvas.strokeArc( 0.10 * width, 0.55 * height, 0.80 * width, 0.30 * height, 180, 180, ArcType.OPEN);
        canvas.strokeLine(0.10 * width, 0.28 * height, 0.10 * width, 0.72 * height);
        canvas.strokeLine(0.90 * width, 0.28 * height, 0.90 * width, 0.72 * height);
    }

    private static void P() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeArc(-0.70 * width, 0.15 * height, 1.60 * width, 0.40 * height, 270, 180, ArcType.OPEN);
    }

    private static void Q() {
        canvas.strokeArc( 0.10 * width, 0.15 * height, 0.80 * width, 0.30 * height, 0, 170, ArcType.OPEN);
        canvas.strokeArc( 0.10 * width, 0.55 * height, 0.80 * width, 0.30 * height, 180, 180, ArcType.OPEN);
        canvas.strokeLine(0.10 * width, 0.28 * height, 0.10 * width, 0.72 * height);
        canvas.strokeLine(0.90 * width, 0.28 * height, 0.90 * width, 0.72 * height);
        canvas.strokeLine(0.70 * width, 0.70 * height, 0.95 * width, 0.85 * height);
    }

    private static void R() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeArc(-0.70 * width, 0.15 * height, 1.60 * width, 0.40 * height, 270, 180, ArcType.OPEN);
        canvas.strokeLine(0.50 * width, 0.53 * height, 0.90 * width, 0.85 * height);
    }

    private static void S() {
        canvas.strokeArc (0.10 * width, 0.15 * height, 0.80 * width, 0.35 * height, 30, 200, ArcType.OPEN);
        canvas.strokeArc (0.10 * width, 0.50 * height, 0.80 * width, 0.35 * height, 210, 200, ArcType.OPEN);
        canvas.strokeLine(0.23 * width, 0.46 * height, 0.76 * width, 0.54 * height);
    }

    private static void T() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.90 * width, 0.15 * height);
        canvas.strokeLine(0.50 * width, 0.15 * height, 0.50 * width, 0.85 * height);
    }

    private static void U() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.10 * width, 0.60 * height);
        canvas.strokeLine(0.90 * width, 0.15 * height, 0.90 * width, 0.60 * height);
        canvas.strokeArc(0.10 * width, 0.35 * height, 0.80 * width, 0.50 * height, 180, 180, ArcType.OPEN);
    }

    private static void V() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.50 * width, 0.85 * height);
        canvas.strokeLine(0.50 * width, 0.85 * height, 0.90 * width, 0.15 * height);
    }

    private static void W() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.20 * width, 0.85 * height);
        canvas.strokeLine(0.20 * width, 0.85 * height, 0.50 * width, 0.45 * height);
        canvas.strokeLine(0.50 * width, 0.45 * height, 0.80 * width, 0.85 * height);
        canvas.strokeLine(0.80 * width, 0.85 * height, 0.90 * width, 0.15 * height);
    }

    private static void X() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.90 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.90 * width, 0.15 * height);
    }

    private static void Y() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.50 * width, 0.50 * height);
        canvas.strokeLine(0.90 * width, 0.15 * height, 0.50 * width, 0.50 * height);
        canvas.strokeLine(0.50 * width, 0.50 * height, 0.50 * width, 0.85 * height);
    }

    private static void Z() {
        canvas.strokeLine(0.10 * width, 0.15 * height, 0.90 * width, 0.15 * height);
        canvas.strokeLine(0.90 * width, 0.15 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.90 * width, 0.85 * height);
    }
}