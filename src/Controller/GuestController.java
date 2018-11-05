/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
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
public class GuestController implements Initializable {

    @FXML
    private ImageView img_exist_guest;
    @FXML
    private ImageView img_new_guest;
    @FXML
    private JFXButton btn_back;
    @FXML
    private JFXButton btn_cancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void exist_guest(MouseEvent event) {
        Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/Exist.fxml"));
            Scene scene = new Scene(p);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    @FXML
    private void new_guest(MouseEvent event) {
        Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/Reservation.fxml"));
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
    private void back(ActionEvent event) {
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
            System.out.println("File Not Found");
        }
    }

    @FXML
    private void cancel(ActionEvent event) {
        System.exit(0);
    }
    
}
