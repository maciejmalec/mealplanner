package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    //loads up and displays the fxml file
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML/menu.fxml"));
        stage.setTitle("Meal Planner");
        stage.setScene(new Scene(root, 1400, 800));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
