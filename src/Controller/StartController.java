/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author micheal
 */
public class StartController implements Initializable {

    @FXML
    private ImageView img_admin;
    @FXML
    private ImageView img_tourist;
    @FXML
    private Button btn_cancel;
    @FXML
    private Button btn_back;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }

    @FXML
    private void admin(MouseEvent event) {
        Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/LoginAnimation.fxml"));
            Scene scene = new Scene(p);
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
    private void tourist(MouseEvent event) {
       Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/guest.fxml"));
            Scene scene = new Scene(p);
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
    private void cancel(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void back(ActionEvent event) {
        
    }



}
