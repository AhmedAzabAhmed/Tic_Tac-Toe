/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ITI
 */
public class Design extends Application {
  

    public Design() {
       

    }

    @Override
    public void start(Stage stage) throws Exception {
        Login root= new Login(stage);
         Scene scene = new Scene(root);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
