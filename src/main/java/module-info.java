module com.mycompany.hiperdefault {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.hiperdefault to javafx.fxml;
    exports com.mycompany.hiperdefault;
}
