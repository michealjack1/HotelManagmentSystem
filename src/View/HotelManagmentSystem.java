package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HotelManagmentSystem extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("start.fxml"));
            Scene s = new Scene(parent);
            primaryStage.setScene(s);
            primaryStage.show();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File Not Found");
        }

    }

}
