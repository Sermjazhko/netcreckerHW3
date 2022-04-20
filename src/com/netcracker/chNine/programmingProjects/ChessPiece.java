package com.netcracker.chNine.programmingProjects;

/*Implement a class ChessPiece with method setifaPosition(String coordinates). The coordinate string identifies the row and column in chess notation, such as "d8" for the initial position of the black queen. Also provide a method ArrayList<String> can Move To()
that enumerates the valid moves from the current position. Provide subclasses Pawn,
Knight, Bishop, Rook, Queen, and King.*/

import java.util.ArrayList;

abstract public class ChessPiece {

    public final boolean COLOR_GAME = true;
    protected String position;
    protected String colum = "abcdefgh";
    protected String row = "12345678";
    protected boolean flag = true; // true - можно ходить

    public void setPosition(String coordinates){
        position = coordinates;
    }

    public abstract ArrayList<String> canMoveTo();

    public String getPosition() {
        return position;
    }


    public String getColum() {
        return colum;
    }

    public String getRow() {
        return row;
    }
}
