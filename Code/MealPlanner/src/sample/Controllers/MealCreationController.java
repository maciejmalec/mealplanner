package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.JavaClasses.Compare;
import sample.JavaClasses.DataHandler;
import sample.JavaClasses.Ingredient;
import sample.JavaClasses.Meal;
import sample.Main;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MealCreationController implements Initializable {

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

    private DataHandler dh = new DataHandler();
    private Ingredient[] ingredients;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ingredients = dh.loadIngredients();
    }

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
        if(ingSearchTxt.getText().length() > 2){
            ArrayList<Ingredient> found = new ArrayList<>();
            for(Ingredient ing: ingredients){
                if(ing.toString().toUpperCase().contains(ingSearchTxt.getText().toUpperCase())){
                    found.add(ing);
                }
            }

            found.sort(new Compare());



            for(int i=0; i<10; i++){
                ingList.getItems().add(found.get(i).toString());
            }
        }
    }
}
