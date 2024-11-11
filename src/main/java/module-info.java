module com.example.battleshipfpoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.battleshipfpoe to javafx.fxml;
    exports com.example.battleshipfpoe;
}