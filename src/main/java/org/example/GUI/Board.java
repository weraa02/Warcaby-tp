package org.example.GUI;

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import org.example.Piece;
import org.example.Tile;

import java.util.ArrayList;

public class Board extends GridPane {

   //ilosc pol jednego boku planszy - dodac inne dane
    int size;

    Tile[][] tiles;

    public Board(int size){
        this.size = size;
        creatingBoard();
        puttingPieces();
    }



    private void creatingBoard() {
        tiles = new Tile[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j< size; j++){
                Tile tile = new Tile(i,j);
                tiles[i][j]=tile;
                add(tile,i,j);
            }
        }
    }

    //przykladowe ulozenie
    private void puttingPieces(){
        //pawns = new Piece[size][size];
        int j=0;
        while(j<size){
            for(int i = 0; i < size; i++){
                Piece piece;
                if(tiles[i][j].getTaken().equals(Tile.istaken.FREE)){
                    if(j<(size/2)) {
                        piece = new Piece(Piece.typecolor.WHITE);
                    }
                    else {
                        piece = new Piece(Piece.typecolor.BLACK);
                    }
                    tiles[i][j].setPiese(piece);
                }
            }
            j+=9;
        }

    }
    public ArrayList<Rectangle> getList(){

        return new ArrayList<>();
    }
}
