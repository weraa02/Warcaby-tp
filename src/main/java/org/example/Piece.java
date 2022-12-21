package org.example;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Piece extends Circle {

    private typecolor type;
    enum typecolor{
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

    Piece(){
        super(20.0);
        setcolortype(typecolor.WHITE);

    }

}
