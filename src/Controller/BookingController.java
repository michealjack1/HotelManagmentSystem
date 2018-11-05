/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXComboBox;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author micheal
 */
public class BookingController implements Initializable {

    @FXML
    private JFXComboBox<String> cb_room_type;
    @FXML
    private JFXComboBox<String> cb_room_available;
    @FXML
    private ImageView next_frame;
    @FXML
    private ImageView back_frame;
    @FXML
    private Pane pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FadeTransition fd = new FadeTransition(Duration.seconds(3), pane);
        fd.setFromValue(1);
        fd.setToValue(0);
        fd.play();
        pane.setDisable(true);
        cb_room_available.setValue("Choise");
        cb_room_available.setStyle("-fx-font: 15px \"Serif\";");
        ObservableList<String> roomType = FXCollections.observableArrayList("Single", "Double", "Trible");
        cb_room_type.setItems(roomType);
        cb_room_type.setValue("Choise");
        cb_room_type.setStyle("-fx-font: 15px \"Serif\";");

    }

    @FXML
    private void room_type(ActionEvent event) {
        ObservableList<String> ob = FXCollections.observableArrayList("Admin", "Tourist");
        cb_room_available.setItems(ob);
        cb_room_available.setValue("Choise");
        cb_room_available.setStyle("-fx-font: 15px \"Serif\";");
    }

    @FXML
    private void choise_room(ActionEvent event) {

    }

    @FXML
    private void back(MouseEvent event) {
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

    @FXML
    private void next(MouseEvent event) {
        Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/Signup.fxml"));
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
