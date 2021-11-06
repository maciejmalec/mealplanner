package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
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

    @FXML
    private Button deleteIngBtn;

    private DataHandler dh = new DataHandler();
    private Ingredient[] ingredients;
    private ArrayList<Ingredient> found;

    private ArrayList<Ingredient> added = new ArrayList<>();
    private ArrayList<Double> amounts = new ArrayList<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ingredients = dh.loadIngredients();
        addPopup.setVisible(false);
    }

    @FXML
    void backBtnHandler() {
        Main.changeScene("menu");
    }

    @FXML
    void updateIngList(){
        ingList.getItems().clear();
        if(ingSearchTxt.getText().length() > 2){
            found = new ArrayList<>();
            for(Ingredient ing: ingredients){
                if(ing.getName().toUpperCase().contains(ingSearchTxt.getText().toUpperCase())){
                    found.add(ing);
                }
            }

            found.sort(new AlphabeticSort());
            int counter = 0;
            while(counter<15 && counter < found.size()){
                ingList.getItems().add(found.get(counter).getName());
                counter++;
            }
        }
    }

    @FXML
    void selectIng(){
        ingAmountLbl.setText("Amount of " + found.get(ingList.getSelectionModel().getSelectedIndex()).getName() + " in g:");
        deleteIngBtn.setVisible(false);
        addIngBtn.setText("Add");
        addPopup.setVisible(true);
    }

    public void addIngBtnHandler(){
        if(ingAmountText.getText().isEmpty() || ingAmountText.getText().matches("^[0-9]{1,2}([,.][0-9]{1,2})?$")){
            System.out.println("incorrect input");
            return;
        }

        if(addIngBtn.getText().equals("Change")){
            int listIndex = addedIngList.getSelectionModel().getSelectedIndex();

            amounts.set(listIndex, Double.parseDouble(ingAmountText.getText()));

            String changedText = amounts.get(listIndex).toString() + "g " + added.get(listIndex).getName();
            addedIngList.getItems().set(listIndex, changedText);
        }else{
            int listIndex = ingList.getSelectionModel().getSelectedIndex();
            String name = found.get(listIndex).getName();
            double amount = Double.parseDouble(ingAmountText.getText());

            addedIngList.getItems().add(amount + "g " + name);
            added.add(found.get(listIndex));
            amounts.add(amount);
        }
        addPopup.setVisible(false);
    }

    public void editIng(){
        if(addedIngList.getItems().isEmpty()){
            System.out.println("empty list");
        }else{
            deleteIngBtn.setVisible(true);
            addIngBtn.setText("Change");
            addPopup.setVisible(true);
        }
    }

    public void deleteIngBtnHandler(){
        int indexToDelete = addedIngList.getSelectionModel().getSelectedIndex();
        addedIngList.getItems().remove(indexToDelete);
        added.remove(indexToDelete);
        amounts.remove(indexToDelete);
        deleteIngBtn.setVisible(false);
        addPopup.setVisible(false);
    }

    @FXML
    void sumbitMeal() {
        if(mealNameTxt.getText().isEmpty() || added.isEmpty()){
            System.out.println("pick a name for the meal");
        }else{
            //create a new meal
            double[] tempAmounts = new double[amounts.size()];
            Ingredient[] tempAdded = new Ingredient[added.size()];

            for(int i=0; i<amounts.size(); i++){
                tempAmounts[i] = amounts.get(i);
                tempAdded[i] = added.get(i);
            }


            Meal meal = new Meal(mealNameTxt.getText(), tempAdded, tempAmounts);
            //save the meal

            //testing
            System.out.println(meal.getCalories());
        }
    }

    @FXML
    void mealSearch(ActionEvent event) {

    }

}
