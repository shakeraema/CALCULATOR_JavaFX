module com.example.democalculator {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.democalculator to javafx.fxml;
    exports com.example.democalculator;
}