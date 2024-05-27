module org.gro.texteditor {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens org.gro.texteditor to javafx.fxml;
    exports org.gro.texteditor;
    exports org.gro.texteditor.page;
    exports org.gro.texteditor.cursor;
    exports org.gro.texteditor.characters;
    opens org.gro.texteditor.page to javafx.fxml;
    opens org.gro.texteditor.cursor to javafx.fxml;
}