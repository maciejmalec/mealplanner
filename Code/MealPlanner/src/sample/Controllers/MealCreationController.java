package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.JavaClasses.*;
import sample.Main;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MealCreationController implements Initializable {

    @FXML
    private ListView<String> addedIngList;

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
    private ListView<String> mealList;

    @FXML
    private TextField mealNameTxt;

    @FXML
    private Button mealSearchBtn;

    @FXML
    private TextField mealSearchTxt;

    @FXML
    private AnchorPane addPopup;

    @FXML
    private Label ingAmountLbl;

    @FXML
    private TextField ingAmountText;

    @FXML
    private Button addIngBtn;

    private DataHandler dh = new DataHandler();
    private Ingredient[] ingredients;
    private ArrayList<Ingredient> found;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ingredients = dh.loadIngredients();
        addPopup.setVisible(false);
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
    void selectIng(){
        ingAmountLbl.setText("Amount of " + found.get(ingList.getSelectionModel().getSelectedIndex()).toString() + " in g:");
        addPopup.setVisible(true);
    }

    public void addIngBtnHandler(){
        addedIngList.getItems().add(ingAmountText.getText() + "g " + found.get(ingList.getSelectionModel().getSelectedIndex()).toString());
        addPopup.setVisible(false);
    }

    @FXML
    void mealSearch(ActionEvent event) {

    }

    @FXML
    void sumbitMeal(ActionEvent event) {

    }

}
