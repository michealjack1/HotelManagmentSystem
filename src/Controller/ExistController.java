/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author micheal
 */
public class ExistController implements Initializable {

    @FXML
    private Label lb_room_num;
    @FXML
    private JFXButton btn_edit_food;
    @FXML
    private JFXButton btn_edit_drink;
    @FXML
    private JFXButton btn_edit_trip;
    @FXML
    private Label tf_food;
    @FXML
    private Label tf_drink;
    @FXML
    private Label tf_trip;
    ComboBox<String> cb_food;
    ComboBox<String> cb_drink;
    ComboBox<String> cb_trip;
    @FXML
    private AnchorPane main_pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cb_food = new ComboBox<>();
        cb_drink = new ComboBox<>();
        cb_trip = new ComboBox<>();
        cb_drink.setStyle("-fx-font-size:17px;-fx-pref-width: 268;");
        cb_food.setStyle("-fx-font-size:17px;-fx-pref-width: 268;");
        cb_trip.setStyle("-fx-font-size:17px;-fx-pref-width: 268;");
    }    

    @FXML
    private void edit_food(ActionEvent event) {
        main_pane.getChildren().removeAll(tf_food);
        cb_food.setLayoutX(330.0);
        cb_food.setLayoutY(126.0);
        main_pane.getChildren().add(cb_food);
    }

    @FXML
    private void edit_drink(ActionEvent event) {
        main_pane.getChildren().removeAll(tf_drink);
        cb_drink.setLayoutX(330.0);
        cb_drink.setLayoutY(212.0);
        main_pane.getChildren().add(cb_drink);
    }

    @FXML
    private void edit_trip(ActionEvent event) {
        main_pane.getChildren().remove(tf_trip);
        cb_trip.setLayoutX(330.0);
        cb_trip.setLayoutY(294.0);
        main_pane.getChildren().add(cb_trip);
    }
    
}
