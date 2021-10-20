package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.Main;

public class MealCreationController {

    @FXML
    Label backBtn;

    public void backBtnHandler(){
        Main.changeScene("menu");
    }
}
