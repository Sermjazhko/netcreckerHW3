package com.netcracker.chNine.programmingProjects.exOne;

import java.util.ArrayList;

public class Queen extends ChessPiece{

    public ArrayList<String> canMoveTo(){
        Bishop bishop = new Bishop();
        Rook rook = new Rook();
        bishop.setPosition(position);
        rook.setPosition(position);
        ArrayList<String> validMoves = new ArrayList<>(bishop.canMoveTo());
        validMoves.addAll(rook.canMoveTo());
        return validMoves;
    }
}
