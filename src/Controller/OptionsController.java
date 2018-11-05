/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author micheal
 */
public class OptionsController implements Initializable {

    ArrayList<String> al;

    @FXML
    private ImageView btn_complete_drink;
    @FXML
    private ImageView btn_complete_travel;
    @FXML
    private JFXButton btn_submit_options;
    @FXML
    private Pane pane1;
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane3;
    @FXML
    private JFXCheckBox check_break_fast;
    @FXML
    private JFXCheckBox check_lunch;
    @FXML
    private JFXCheckBox check_dinner;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void complete_drink(MouseEvent event) {
        al = new ArrayList<>();
        if (check_break_fast.isSelected()) {
            al.add("Break Fast");
        }
        if (check_dinner.isSelected()) {
            al.add("Lunch");
        }
        if (check_lunch.isSelected()) {
            al.add("Dinner");
        }
        int n = al.size();
        System.out.println(al);
        Pane p = new Pane();
        try {

            p = FXMLLoader.load(getClass().getResource("../View/options.fxml"));
            Scene scene = new Scene(p, 600, 400);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File Not Found");
        }
    }

    @FXML
    private void complete_travel(MouseEvent event) {
        Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/options.fxml"));
            Scene scene = new Scene(p, 600, 600);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File Not Found");
        }
    }

    @FXML
    private void submit(ActionEvent event) {
        Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/Date.fxml"));
            Scene scene = new Scene(p, 600, 600);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File Not Found");
        }
    }

}
