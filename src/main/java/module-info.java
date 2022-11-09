module github.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens github.demo to javafx.fxml;
    exports github.demo;
}