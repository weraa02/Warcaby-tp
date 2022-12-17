package org.example.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameWindow extends Application {
    static int size = 10;   //usunac/zmienic/nadawac na biezaco

    public static void display() {
        Stage stage = new Stage();

        //layout
        BorderPane root = new BorderPane(); //zeby mozna bylo pozniej cos dodac innego jeszcze np z boku
        root.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, null, null)));
        root.setPadding(new Insets(25)); //marginesy

        GridPane board = new GridPane();//do samej planszy
        //wypelnianie root
        root.setCenter(board);
        root.setLeft(null);
        root.setRight(null);
        root.setBottom(null);

        //mozna zrobic zeby zmieniać jakieś polecenia itd
        Label communication = new Label("Rozpoczęto rozgrywke");
        root.setTop(communication);

        //zeby byla jakas zawartosc
        //dodaje kwadraty udajace plansze - prawdopdobnie dodac klasy i pokombinować z StackPane
        for(int i = 0; i < size; i++) {
            for(int j = 0; j< size; j++){
                Rectangle square = new Rectangle(50,50);
                if(((i+j)%2) ==0){
                    square.setFill(Color.BLUE);//byle jaki kolor dalam, byle rozne byly
                }
                board.add(square, i+1,j+1);
            }
        }

        //dzialanie okna
        Scene scene = new Scene(root);
        stage.setTitle("Warcaby - rozgrywka");
        stage.setScene(scene);
        stage.sizeToScene(); //dopasoeuje okno do zawartosci
        stage.show();
    }
    //musi byc ponoc
    @Override
    public void start(Stage stage){}
}