package org.gro.texteditor.cursor;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import org.gro.texteditor.Properties;

public class Cursor extends Canvas {
    public Cursor() {
        super(Properties.width, Properties.height);

        GraphicsContext canvas = this.getGraphicsContext2D();

        double height = Properties.height,
                width = Properties.width;

        canvas.setLineWidth(3.0);
        canvas.strokeLine(0.98 * width, 0.15 * height, 0.98 * width, 0.85 * height);
    }
}
