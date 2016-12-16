package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    public Button Rock;
    @FXML
    public Button Paper;
    @FXML
    public Button Scissors;
    @FXML
    public Label Player;
    @FXML
    public Label PC;
    @FXML
    public Button resultW;
    @FXML
    public ImageView resultat;
    @FXML
    public Button resultL;


    @FXML
    /**-----------------Redirection Vers PRCGame-----------------------------------*/
    public void ToGame(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("PRCGame.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
        AudioClip sound = new AudioClip(this.getClass().getResource("chinese.mp3").toExternalForm());
         sound.play(0.1);
    }

    int i =0;
    int j =0;
    @FXML
    /**------------------Choix du boutton-------------------------------------------*/
    public void choice(ActionEvent actionEvent) throws Exception {
            int x = (int) ((Math.random() * (3)) + 1);
            Button button = (Button) actionEvent.getSource();
            final String buttonId = button.getId();
            if (x == 1) {
                if (buttonId.equals("Paper")) {
                    j++;
                    PC.setText(String.valueOf(j));
                }
                if (buttonId.equals("Rock")) {
                    i++;
                    Player.setText(String.valueOf(i));
                }
            }
            if (x == 2) {
                if (buttonId.equals("Rock")) {
                    j++;
                    PC.setText(String.valueOf(j));
                }
                if (buttonId.equals("Scissors")) {
                    i++;
                    Player.setText(String.valueOf(i));
                }
            }
            if (x == 3) {
                if (buttonId.equals("Scissors")) {
                    j++;
                    PC.setText(String.valueOf(j));
                }
                if (buttonId.equals("Papier")) {
                    i++;
                    Player.setText(String.valueOf(i));
                }
            }
            if(i==10 ||j==10){
                if(i>j){
                    resultW.setVisible(true);
                }
                if(j>i){
                    resultL.setVisible(true);
                }
                System.out.print(x);
                resultat.setVisible(true);
                Paper.setVisible(false);
                Rock.setVisible(false);
                Scissors.setVisible(false);
            }

    }

    @FXML
    /**-----------------Redirection Vers Menu Principale-----------------------------------*/
    public void ToMenu(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("MenuPRC.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @FXML
    /**-----------------Redirection Vers Resultat de la partie-----------------------------------*/
    public void ToResultW(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("resultat.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }


    @FXML
    /**-----------------Redirection Vers Resultat de la partie-----------------------------------*/
    public void ToResultL(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("resultatL.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @FXML
    /**-----------------Redirection Vers About-----------------------------------*/
    public void ToAbout(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("about.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        AudioClip sound = new AudioClip(this.getClass().getResource("chinese.mp3").toExternalForm());
        sound.play(0.1);
        app_stage.show();
    }

}