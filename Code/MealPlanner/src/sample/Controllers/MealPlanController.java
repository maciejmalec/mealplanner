package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.JavaClasses.DataHandler;
import sample.JavaClasses.MealIngredient;
import sample.JavaClasses.MealPlan;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class MealPlanController implements Initializable {

    @FXML
    Label backBtn;

    @FXML
    TableView<MealIngredient> tableView;

    @FXML
    TableColumn<MealPlan, String> d1Col;

    @FXML
    TableColumn<MealPlan, String> d2Col;

    @FXML
    TableColumn<MealPlan, String> d3Col;

    @FXML
    TableColumn<MealPlan, String> d4Col;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        d1Col.setCellValueFactory(new PropertyValueFactory<>("breakfasts"));
//        d2Col.setCellValueFactory(new PropertyValueFactory<>("lunches"));
//        d3Col.setCellValueFactory(new PropertyValueFactory<>("dinners"));
//        d4Col.setCellValueFactory(new PropertyValueFactory<>("suppers"));
//
//
//        DataHandler dh = new DataHandler();
//        ObservableList<MealIngredient> meals = FXCollections.observableArrayList(dh.loadData());
//        tableView.setItems(meals);
    }

    public MealPlanController(){
       //d1Col.setText("Oats");

    }

    public void backBtnHandler(){
        Main.changeScene("menu");
    }


}

