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
    private ArrayList<Ingredient> found;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ingredients = dh.loadIngredients();
    }

    @FXML
    void backBtnHandler(MouseEvent event) {
        Main.changeScene("menu");
    }

    @FXML
    void updateIngList(){
        ingList.getItems().clear();
        if(ingSearchTxt.getText().length() > 2){
            found = new ArrayList<>();
            for(Ingredient ing: ingredients){
                if(ing.toString().toUpperCase().contains(ingSearchTxt.getText().toUpperCase())){
                    found.add(ing);
                }
            }

            found.sort(new Compare());
            int counter = 0;
            while(counter<15 && counter < found.size()){
                ingList.getItems().add(found.get(counter).toString());
                counter++;
            }
        }
    }

    @FXML
    void addIng(){
        System.out.println(found.get(ingList.getSelectionModel().getSelectedIndex()).toString());
    }

    @FXML
    void mealSearch(ActionEvent event) {

    }

    @FXML
    void sumbitMeal(ActionEvent event) {

    }

}
