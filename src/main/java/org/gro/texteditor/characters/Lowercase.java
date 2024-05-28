package org.gro.texteditor.characters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import org.gro.texteditor.Properties;

final class Lowercase {
    static final double height = Properties.height,
                         width = Properties.width;

    private static GraphicsContext canvas;

    public static void draw(int character, GraphicsContext draw) {
        canvas = draw;
        canvas.getCanvas().setWidth(0.70 * width);

        switch(character) {
            case 'a': a(); break; case 'b': b(); break; case 'c': c(); break; case 'd': d(); break;
            case 'e': e(); break; case 'f': f(); break; case 'g': g(); break; case 'h': h(); break;
            case 'i': i(); break; case 'j': j(); break; case 'k': k(); break; case 'l': l(); break;
            case 'm': m(); break; case 'n': n(); break; case 'o': o(); break; case 'p': p(); break;
            case 'q': q(); break; case 'r': r(); break; case 's': s(); break; case 't': t(); break;
            case 'u': u(); break; case 'v': v(); break; case 'w': w(); break; case 'x': x(); break;
            case 'y': y(); break; case 'z': z(); break;
        }
    }

    private static void a() {
        canvas.strokeArc (0.10 * width, 0.40 * height, 0.60 * width, 0.45 * height, 40, 280, ArcType.OPEN);
        canvas.strokeLine(0.65 * width, 0.48 * height, 0.65 * width, 0.85 * height);
    }

    private static void b() {
        canvas.strokeLine(0.10 * width, 0.25 * height, 0.10 * width, 0.85 * height);
        canvas.strokeArc (0.05 * width, 0.40 * height, 0.60 * width, 0.45 * height, 215, 290, ArcType.OPEN);
    }

    private static void c() {
        canvas.strokeArc(0.10 * width, 0.40 * height, 0.70 * width, 0.45 * height, 60, 240, ArcType.OPEN);
    }

    private static void d() {
        canvas.strokeArc (0.10 * width, 0.40 * height, 0.80 * width, 0.45 * height, 70, 220, ArcType.OPEN);
        canvas.strokeLine(0.65 * width, 0.25 * height, 0.65 * width, 0.85 * height);
    }

    private static void e() {
        canvas.strokeArc(0.10 * width, 0.40 * height, 0.50 * width, 0.45 * height, 0, 280, ArcType.OPEN);
        canvas.strokeLine(0.10 * width, 0.62 * height, 0.60 * width, 0.62 * height);
    }

    private static void f() {
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.10 * width, 0.85 * height);
        canvas.strokeArc (0.10 * width, 0.25 * height, 0.50 * width, 0.30 * height, 0, 180, ArcType.OPEN);
        canvas.strokeLine(0.00 * width, 0.55 * height, 0.40 * width, 0.55 * height);
    }

    private static void g() {
        canvas.strokeArc(0.10 * width, 0.40 * height, 0.60 * width, 0.45 * height, 50, 260, ArcType.OPEN);
        canvas.strokeLine(0.60 * width, 0.40 * height, 0.60 * width, 0.80 * height);
        canvas.strokeArc(0.10 * width, 0.60 * height, 0.50 * width, 0.38 * height, 220, 140, ArcType.OPEN);
    }

    private static void h() {
        canvas.strokeLine(0.10 * width, 0.25 * height, 0.10 * width, 0.85 * height);
        canvas.strokeArc (0.10 * width, 0.40 * height, 0.50 * width, 0.30 * height, 0, 180, ArcType.OPEN);
        canvas.strokeLine(0.60 * width, 0.55 * height, 0.60 * width, 0.85 * height);
    }

    private static void i() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeLine(0.20 * width, 0.45 * height, 0.20 * width, 0.85 * height);
        canvas.strokeArc (0.17 * width, 0.30 * height, 0.06 * width, 0.06 * height, 0, 360, ArcType.CHORD);
    }

    private static void j() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeArc (0.22 * width, 0.30 * height, 0.06 * width, 0.06 * height, 0, 360, ArcType.CHORD);
        canvas.strokeLine(0.25 * width, 0.45 * height, 0.25 * width, 0.80 * height);
        canvas.strokeArc(-0.10 * width, 0.60 * height, 0.35 * width, 0.38 * height, 250, 120, ArcType.OPEN);
    }

    private static void k() {
        canvas.strokeLine(0.10 * width, 0.25 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.60 * width, 0.40 * height, 0.10 * width, 0.70 * height);
        canvas.strokeLine(0.60 * width, 0.85 * height, 0.35 * width, 0.55 * height);
    }

    private static void l() {
        canvas.getCanvas().setWidth(0.40 * width);
        canvas.strokeLine(0.20 * width, 0.25 * height, 0.20 * width, 0.85 * height);
    }

    private static void m() {
        canvas.strokeLine(0.05 * width, 0.40 * height, 0.05 * width, 0.85 * height);
        canvas.strokeLine(0.35 * width, 0.55 * height, 0.35 * width, 0.85 * height);
        canvas.strokeLine(0.65 * width, 0.55 * height, 0.65 * width, 0.85 * height);
        canvas.strokeArc(0.05 * width, 0.40 * height, 0.30 * width, 0.40 * height, 0, 180, ArcType.OPEN);
        canvas.strokeArc(0.35 * width, 0.40 * height, 0.30 * width, 0.40 * height, 0, 180, ArcType.OPEN);
    }

    private static void n() {
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.10 * width, 0.85 * height);
        canvas.strokeLine(0.60 * width, 0.55 * height, 0.60 * width, 0.85 * height);
        canvas.strokeArc (0.10 * width, 0.40 * height, 0.50 * width, 0.30 * height, 0, 180, ArcType.OPEN);
    }

    private static void o() {
        canvas.strokeArc(0.10 * width, 0.40 * height, 0.50 * width, 0.45 * height, 0, 360, ArcType.OPEN);
    }

    private static void p() {
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.10 * width, 0.99 * height);
        canvas.strokeArc(-0.45 * width, 0.40 * height, 1.10 * width, 0.45 * height, 270, 180, ArcType.OPEN);
    }

    private static void q() {
        canvas.strokeLine(0.60 * width, 0.40 * height, 0.60 * width, 0.99 * height);
        canvas.strokeLine(0.60 * width, 0.99 * height, 0.70 * width, 0.90 * height);
        canvas.strokeArc (0.05 * width, 0.40 * height, 1.10 * width, 0.45 * height, 90, 180, ArcType.OPEN);
    }

    private static void r() {
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.10 * width, 0.85 * height);
        canvas.strokeArc (0.10 * width, 0.40 * height, 0.50 * width, 0.30 * height, 0, 180, ArcType.OPEN);
    }

    private static void s() {
        canvas.strokeArc (0.10 * width, 0.40  * height, 0.50 * width, 0.225 * height, 0, 220, ArcType.OPEN);
        canvas.strokeArc (0.10 * width, 0.625 * height, 0.50 * width, 0.225 * height, 180, 220, ArcType.OPEN);
        canvas.strokeLine(0.16 * width, 0.59  * height, 0.54 * width, 0.66  * height);
    }

    private static void t() {
        canvas.strokeLine(0.35 * width, 0.25 * height, 0.35 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.45 * height, 0.60 * width, 0.45 * height);
    }

    private static void u() {
        canvas.strokeArc (0.10 * width, 0.35 * height, 0.50 * width, 0.50 * height, 180, 180, ArcType.OPEN);
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.10 * width, 0.60 * height);
        canvas.strokeLine(0.60 * width, 0.40 * height, 0.60 * width, 0.60 * height);
    }

    private static void v() {
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.35 * width, 0.85 * height);
        canvas.strokeLine(0.35 * width, 0.85 * height, 0.60 * width, 0.40 * height);
    }

    private static void w() {
        canvas.strokeLine(0.10  * width, 0.40 * height, 0.225 * width, 0.85 * height);
        canvas.strokeLine(0.225 * width, 0.85 * height, 0.35  * width, 0.50 * height);
        canvas.strokeLine(0.35  * width, 0.50 * height, 0.475 * width, 0.85 * height);
        canvas.strokeLine(0.475 * width, 0.85 * height, 0.60  * width, 0.40 * height);
    }

    private static void x() {
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.60 * width, 0.85 * height);
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.60 * width, 0.40 * height);
    }

    private static void y() {
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.35 * width, 0.85 * height);
        canvas.strokeLine(0.27 * width, 0.99 * height, 0.60 * width, 0.40 * height);
    }

    private static void z() {
        canvas.strokeLine(0.10 * width, 0.40 * height, 0.60 * width, 0.40 * height);
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.60 * width, 0.40 * height);
        canvas.strokeLine(0.10 * width, 0.85 * height, 0.60 * width, 0.85 * height);
    }
}
