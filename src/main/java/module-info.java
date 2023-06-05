module com.example.democalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens democalcu to javafx.fxml;
    exports democalcu;
}