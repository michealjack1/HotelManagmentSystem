/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class AdminController implements Initializable {

    @FXML
    private ImageView emp_img;
    @FXML
    private ImageView guest_img;
    @FXML
    private ImageView room_img;
    @FXML
    private ImageView add_emp_img;
    @FXML
    private Pane emp_pane;
    @FXML
    private Pane guest_pane;
    @FXML
    private Pane room_pane;
    @FXML
    private Pane new_emp_pane;
    @FXML
    private Pane pane1;
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane3;
    @FXML
    private Pane pane4;
    @FXML
    private ImageView back_img;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void emp_pane(MouseEvent event) {
        emp_pane.setVisible(true);
        guest_pane.setVisible(false);
        room_pane.setVisible(false);
        new_emp_pane.setVisible(false);
        pane1.setStyle("-fx-background-color: white");
        pane2.setStyle("-fx-background-color: #3f4144");
        pane3.setStyle("-fx-background-color: #3f4144");
        pane4.setStyle("-fx-background-color: #3f4144");
    }

    @FXML
    private void guest_pane(MouseEvent event) {
         emp_pane.setVisible(false);
        guest_pane.setVisible(true);
        room_pane.setVisible(false);
        new_emp_pane.setVisible(false);
        pane1.setStyle("-fx-background-color: #3f4144");
        pane2.setStyle("-fx-background-color: white");
        pane3.setStyle("-fx-background-color: #3f4144");
        pane4.setStyle("-fx-background-color: #3f4144");
    }

    @FXML
    private void room_pane(MouseEvent event) {
     emp_pane.setVisible(false);
        guest_pane.setVisible(false);
        room_pane.setVisible(true);
        new_emp_pane.setVisible(false);
        pane1.setStyle("-fx-background-color: #3f4144");
        pane2.setStyle("-fx-background-color: #3f4144");
        pane3.setStyle("-fx-background-color: white");
        pane4.setStyle("-fx-background-color: #3f4144");
    }

    @FXML
    private void add_emp(MouseEvent event) {
     emp_pane.setVisible(false);
        guest_pane.setVisible(false);
        room_pane.setVisible(false);
        new_emp_pane.setVisible(true);
        pane1.setStyle("-fx-background-color: #3f4144");
        pane2.setStyle("-fx-background-color: #3f4144");
        pane3.setStyle("-fx-background-color: #3f4144");
        pane4.setStyle("-fx-background-color: white");
    }

    @FXML
    private void backSS(MouseEvent event) {
        Pane p = new Pane();
            try {
                p = FXMLLoader.load(getClass().getResource("../View/start.fxml"));
                Scene scene = new Scene(p);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setResizable(false);
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }
    
}
