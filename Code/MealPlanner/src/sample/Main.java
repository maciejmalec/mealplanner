package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stage;

    //loads up and displays the fxml file
    @Override
    public void start(Stage stage){
        this.stage = stage;

        changeScene("menu");

        stage.setTitle("Meal Planner");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static void changeScene(String fileName){
        try{
            fileName = "FXML/" + fileName + ".fxml";
            Parent root = FXMLLoader.load(Main.class.getResource(fileName));

            stage.setScene(new Scene(root, 1400, 800));
        }catch( IOException e){
            System.out.println(e);
        }

    }

}
