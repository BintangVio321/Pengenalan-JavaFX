package com.example.pengenalanjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public  class HelloApplication extends Application {
    @Override
    public  void start(Stage primaryStage) throws Exception{
        // Menghubungkan Main ke sample.fxml
        Parent root =
                FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        // Mengatur title pada window
        primaryStage.setTitle("Kalkulator Sederhana");

        // Mengatur size window
        primaryStage.setScene(new Scene(root, 300, 275));

        primaryStage.show();
    }
    public  static void  main(String[] args) {
        launch(args);
    }
}