package group144.tetin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunServer extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Server.fxml"));
        primaryStage.setTitle("You play as X");
        primaryStage.setScene(new Scene(root, 350, 300));
        primaryStage.show();
        primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(325);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
