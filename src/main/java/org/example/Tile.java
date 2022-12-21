package org.example;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

//tworzy pola planszy, przechowuje pionek       do dopracowania
//potencjalne State design pattern
public class Tile extends StackPane {

    //wielkosc pola
    Rectangle field;
    Piece piece;

    double size = 50.0;

    int kolumn;
    int line;
    Color kolor;

    private colortype type;
    public enum colortype{
        LIGHT,DARK
    }

    istaken istakenn;

    //pokazuje czy pole jest zajete - przerobic na STATE?
    public enum istaken{
        FREE, TAKEN, FOREVERFREE
        //ABLETOTAKE
    }

    public istaken getTaken(){
        return istakenn;
    }


    //podaje rodzaj/kolor pola
    public colortype getfieldtype(){
        return type;
    }
    /* ponizsze funckje, pewnie można wziac w jedno, albo calkiem usunac, ale jeszcze nie wiem jak i gdzie najlepiej je dać*/
    //nadaje rodzaj
    public void setColortype(colortype t){
        type = t;
        setColor(type);
    }


    //sprawdza jaki typ i ustawia kolor
    public void setColor(colortype t){
        if( t.equals(colortype.LIGHT)){
            kolor = Color.BISQUE;
            istakenn = istaken.FOREVERFREE;
        }
        else if(t.equals(colortype.DARK)){
            kolor = Color.BROWN;
        }
        field.setFill(kolor);
    }

    public Color getColor(){
        return kolor;
    }

    int getLine(){
        return line;
    }
    int getKolumn(){
        return kolumn;
    }

    public Tile(int i, int j){
        field = new Rectangle(50,50);

        kolumn = i;
        line = j;

        if(((i+j)%2) ==0){
            setColortype(colortype.DARK);
            istakenn = istaken.FREE;
        }
        else {
            setColortype(colortype.LIGHT);
            //bo bialy
            istakenn = istaken.FOREVERFREE;
        }

        //setPiece(int i, int j);
        getChildren().add(field);
    }

    //funkcje zeby dostac sie do Piece - dopracuj dodaj errory itd
    public void setPiese(Piece pie){
        getChildren().add(pie);
        piece = pie;
        istakenn = istaken.TAKEN;
    }
    public Piece getPiece(){
        return piece;
    }
    public void deletePiese(){
        getChildren().remove(piece);
    }
}
