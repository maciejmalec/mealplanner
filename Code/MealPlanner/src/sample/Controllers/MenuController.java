package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.JavaClasses.DataHandler;
import sample.JavaClasses.MealIngredient;
import sample.Main;

import java.io.IOException;
import java.util.Arrays;


public class MenuController {

    @FXML
    Button createBtn;

    @FXML
    Button planBtn;

    @FXML
    Button listBtn;

    @FXML
    Button aboutBtn;

    public void createBtnHandler() {
        Main.changeScene("mealCreation");

        //testing purposes
//        DataHandler dh = new DataHandler();
//        MealIngredient makaron = new MealIngredient("makaron", 350.0);
//        MealIngredient pasta = new MealIngredient("pasta", 50.0);
//
//        MealIngredient[] ing = {makaron, pasta};
//
//        dh.saveData(ing);
    }

    public void planBtnHandler(){
       Main.changeScene("mealPlan");
    }

    public void listBtnHandler(){
        Main.changeScene("shoppingList");
    }

    public void aboutBtnHandler(){
        Main.changeScene("about");
    }

}
