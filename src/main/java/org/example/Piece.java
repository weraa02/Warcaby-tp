package org.example;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
//dodac eventhandlery (z klasy pawn?), dodac nowe pola

//
public class Piece extends Circle {

    private typecolor type;
    public enum typecolor{
        WHITE,BLACK
    }

    private Color color;

    public void setcolortype(typecolor t){
        if (type == null) {
            type = t;
        }
        setColor(type);
    }

    public typecolor getColorType() {
        return type;
    }

    void setColor(typecolor tc) {
        if (tc == typecolor.BLACK){
            color = Color.BLACK;
        } else if (tc == typecolor.WHITE) {
            color = Color.WHITE;
        }
        setFill(color);
    }

    Color getColor(){
        return color;
    }

    public Piece(typecolor tc) {
        super(20.0);
        setcolortype(tc);

    }

}
