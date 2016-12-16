package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MenuPRC.fxml"));
        primaryStage.setTitle("Papier Roche Ciseau");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("sample/Edward.png"));
        AudioClip sound = new AudioClip(this.getClass().getResource("Suffocating.mp3").toExternalForm());
        sound.play(0.5);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
