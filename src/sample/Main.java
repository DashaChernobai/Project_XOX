package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Крестики-Нолики");
        primaryStage.setScene(new Scene(root, 400, 450));
        primaryStage.setResizable(false);
        primaryStage.show();
        int player = 1;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
