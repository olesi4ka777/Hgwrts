module com.example.hgwrts {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.hgwrts to javafx.fxml;
    exports com.example.hgwrts;
}