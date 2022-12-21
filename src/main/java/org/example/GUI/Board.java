package org.example.GUI;

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Board extends GridPane {

   //ilosc pol jednego boku planszy - dodac inne dane
    int size;


    public Board(int size){
        this.size = size;
        creatingBoard();
        puttingPieces();
    }

    private void puttingPieces() {
    }

    private void creatingBoard() {
    }


    public ArrayList<Rectangle> getList(){

        return new ArrayList<>();
    }
}
