package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class ShoppingListController implements Initializable {

    @FXML
    private ListView<?> shoppingList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void backBtnHandler(MouseEvent event) {
        Main.changeScene("menu");
    }

}