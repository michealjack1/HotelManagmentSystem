/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author micheal
 */
public class ReservationController implements Initializable {

    @FXML
    private JFXTextField tf_first;
    @FXML
    private JFXTextField tf_last;
    @FXML
    private JFXTextField tf_id;
    @FXML
    private JFXRadioButton rd_male;
    @FXML
    private JFXRadioButton rd_female;
    @FXML
    private JFXTextField tf_address;
    @FXML
    private JFXComboBox<String> cb_country;
    @FXML
    private JFXComboBox<String> cb_status;
    @FXML
    private JFXTextField tf_number_adult;
    @FXML
    private JFXTextField tf_number_children;
    @FXML
    private JFXTextField tf_email;
    @FXML
    private JFXTextField tf_phone;
    @FXML
    private JFXComboBox<String> cb_room_type;
    @FXML
    private JFXComboBox<String> cb_room_number;
    @FXML
    private JFXDatePicker enter_date;
    @FXML
    private JFXDatePicker leave_date;
    @FXML
    private ImageView img_back;
    @FXML
    private ImageView img_next;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup tg = new ToggleGroup();
        rd_male.setToggleGroup(tg);
        rd_female.setToggleGroup(tg);
        
      
    }    

    @FXML
    private void room_available(MouseEvent event) {
    }

    @FXML
    private void back(MouseEvent event) {
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
        }
    }

    @FXML
    private void next(MouseEvent event) {
    }
    
}
