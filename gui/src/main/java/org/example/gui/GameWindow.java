package org.example.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameWindow extends Application {
    static int size = 10;   //usunac/zmienic/nadawac na biezaco

    public static void display() {
        Stage stage = new Stage();

        //layout i scena
        BorderPane root = new BorderPane(); //zeby mozna bylo pozniej cos dodac innego jeszcze np z boku
        GridPane board = new GridPane();//do samej planszy
        root.setCenter(board);
        Scene scene = new Scene(root, 40* size,40* size);


        //mozna zmianiac jakies polecenia itd
        Label communication = new Label("Rozpoczęto rozgrywke");
        root.setTop(communication);

        //dodaje kwadraty udajace plansze, zeby cos tam bylo
        for(int i = 0; i < size; i++) {
            for(int j = 0; j< size; j++){
                Rectangle square = new Rectangle(40,40);
                if(((i+j)%2) ==0){
                    square.setFill(Color.BLUE);
                }
                board.add(square, i+1,j+1);
            }
        }

        //dzialanie okna
        stage.setTitle("Warcaby - rozgrywka");
        stage.setScene(scene); //WIELKOSC okna
        //stage.sizeToScene(); //dopasoeuje okno do zawartosci - moze sie przydac pozniej, teraz nie bardzo dziala
        stage.show();
    }
    //musi byc ponoc
    @Override
    public void start(Stage stage){}
}