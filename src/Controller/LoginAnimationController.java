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
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author micheal
 */
public class LoginAnimationController implements Initializable {

    @FXML
    private ImageView image;
    @FXML
    private JFXButton btn_signup;
    @FXML
    private JFXButton btn_login;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RotateTransition rt = new RotateTransition(Duration.seconds(50), image);
        rt.setByAngle(9*360);
        rt.play();
    }    

    @FXML
    private void signup_action(ActionEvent event) {
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

    @FXML
    private void login_action(ActionEvent event) {
    }
    
//    void fade() {
//        FadeTransition f = new FadeTransition(Duration.millis(1000), pane);
//        f.setFromValue(0);
//        f.setToValue(1);
//        f.play();
//    }
    
}
