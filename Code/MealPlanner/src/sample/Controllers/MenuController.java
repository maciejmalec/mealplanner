package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;


public class MenuController {

    @FXML
    Button createBtn;

    @FXML
    Button planBtn;

    @FXML
    Button listBtn;

    @FXML
    Button aboutBtn;

    public void createBtnHandler() throws IOException {
        Main.changeScene("mealCreation");
    }

    public void planBtnHandler() throws IOException {
        Main.changeScene("mealPlan");
    }

    public void listBtnHandler(){
        Main.changeScene("shoppingList");
    }

    public void aboutBtnHandler(){
        Main.changeScene("about");
    }

}
