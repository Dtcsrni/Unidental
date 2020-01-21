package main;


import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class main extends Application {

    @Override
    public void start(Stage primaryStage) {

        try{
            FXMLLoader loader = new FXMLLoader();

            AnchorPane root = loader.load(getClass().getResourceAsStream("/view/login.fxml"));



            Scene scene = new Scene(root);
            primaryStage.setTitle("Sistema de control Unidental");
            primaryStage.setScene(scene);
            primaryStage.show();

        }
        catch(Exception ex){
            Logger.getLogger(main.class.getName()).log(Level.SEVERE,null,ex);
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

}