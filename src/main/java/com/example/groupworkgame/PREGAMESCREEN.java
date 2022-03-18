package com.example.groupworkgame;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;


public class PREGAMESCREEN extends Application {
    public ImageView placeholder;
    @FXML

    public void mouserelease() {
        FadeTransition ft = new FadeTransition(Duration.millis(1000),placeholder);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setAutoReverse(true);
        ft.play();
    }

    public void switchscene(MouseEvent actionEvent) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("game-scene.fxml"));
        Scene scene1 = new Scene(root1);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
        Game.launch();


    }

    @FXML


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PREGAMESCREEN.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch();}

}