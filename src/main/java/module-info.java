module com.app.album {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.app.album to javafx.fxml;
    exports com.app.album;
    exports com.app.album.controllers;
    opens com.app.album.controllers to javafx.fxml;
}