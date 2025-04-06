module com.example.userinterfacefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens com.example.userinterfacefx to javafx.fxml;
    exports com.example.userinterfacefx;
}