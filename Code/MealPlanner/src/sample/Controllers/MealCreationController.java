package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.Main;

public class MealCreationController {

    @FXML
    private ListView<?> addedIngList;

    @FXML
    private Label backBtn;

    @FXML
    private Button createMealBtn;

    @FXML
    private ListView<String> ingList;

    @FXML
    private Button ingSearchBtn;

    @FXML
    private TextField ingSearchTxt;

    @FXML
    private ListView<?> mealList;

    @FXML
    private TextField mealNameTxt;

    @FXML
    private Button mealSearchBtn;

    @FXML
    private TextField mealSearchTxt;

    @FXML
    void backBtnHandler(MouseEvent event) {
        Main.changeScene("menu");
    }

    @FXML
    void ingSearch(ActionEvent event) {

    }

    @FXML
    void mealSearch(ActionEvent event) {

    }

    @FXML
    void sumbitMeal(ActionEvent event) {

    }

    @FXML
    void updateIngList(){
        ingList.getItems().clear();
        ingList.getItems().add(ingSearchTxt.getText());
    }

}
