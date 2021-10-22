package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import sample.Main;

public class ShoppingListController {

    @FXML
    private Label backBtn;

    @FXML
    private ListView<?> shoppingList;

    @FXML
    void backBtnHandler(MouseEvent event) {
        Main.changeScene("menu");
    }

}