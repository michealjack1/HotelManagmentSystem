/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AdminModel;
import Model.AdminOperation;
import Model.Connector;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    private JFXButton btn_login;
    @FXML
    private JFXTextField tf_user_name;
    @FXML
    private JFXPasswordField tf_pass;

    Connection con = null;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        con = Connector.getConnection();
        RotateTransition rt = new RotateTransition(Duration.seconds(50), image);
        rt.setByAngle(9 * 360);
        rt.play();
    }

    @FXML
    private void login_action(ActionEvent event) {
        AdminModel admin = new AdminModel();
        admin.setUserName(tf_user_name.getText());
        admin.setPass(tf_pass.getText());
        AdminOperation ad = new AdminOperation();
        ArrayList<AdminModel> al = new ArrayList<>();
               al = ad.searchAdmin(con, admin);
        if(al.size()!=1){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Enter Correct User Name Or Pass");
            a.setHeaderText("Error Info");
            a.show();
        }else{
              Pane p = new Pane();
        try {
            p = FXMLLoader.load(getClass().getResource("../View/Admin.fxml"));
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

    {
      

    }

}
