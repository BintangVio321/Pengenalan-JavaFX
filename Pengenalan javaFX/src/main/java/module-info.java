module com.example.pengenalanjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pengenalanjavafx to javafx.fxml;
    exports com.example.pengenalanjavafx;
}