package org.example.GUI;

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
import org.example.Data.Date;

import java.util.ArrayList;

public class GameWindow extends Application {
    private static Date date;

         //usunac/zmienic/nadawac na biezaco
        static ArrayList<Rectangle> rectangles=new ArrayList<>();

        public static void display() {

            int size =date.getSize() ;

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
                    rectangles.add(square);
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
            stage.sizeToScene(); //dopasowuje okno do zawartosci
            stage.show();
        }

        public ArrayList<Rectangle> getRectangles(){
            return rectangles;
        }
        //musi byc ponoc
        @Override
        public void start(Stage stage){}
    }

