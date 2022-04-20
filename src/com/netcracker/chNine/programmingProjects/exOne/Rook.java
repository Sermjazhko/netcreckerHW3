package com.netcracker.chNine.programmingProjects.exOne;

import java.util.ArrayList;

public class Rook extends ChessPiece{


    public ArrayList<String> canMoveTo(){
        ArrayList<String> validMoves = new ArrayList<>();
        int indexCol = colum.indexOf(position.substring(0,1));
        int indexRow = row.indexOf(position.substring(1,2));

        for (int i = indexCol+1; i<8; i++)
            if (flag)
                validMoves.add(colum.substring(i,i+1) + position.substring(1,2));

        for (int i = indexCol-1; i>-1; i--)
            if (flag)
                validMoves.add(colum.substring(i,i+1)  + position.substring(1,2));

        for (int i = indexRow+1; i<8; i++)
            if (flag)
                validMoves.add(position.substring(0,1)+Integer.toString(i+1));

        for (int i = indexRow-1; i>-1; i--)
            if (flag)
                validMoves.add(position.substring(0,1)+Integer.toString(i+1));
        return validMoves;
    }

}
