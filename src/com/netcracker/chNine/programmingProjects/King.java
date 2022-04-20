package com.netcracker.chNine.programmingProjects;

import java.util.ArrayList;

public class King extends ChessPiece{
     // проще лень придумывать
    public ArrayList<String> canMoveTo(){
        ArrayList<String> validMoves = new ArrayList<>();

        int indexCol = colum.indexOf(position.substring(0,1));
        int indexRow = row.indexOf(position.substring(1,2));

        int i = indexCol+1;
        int j = indexRow+1;
        // верх право
        if (flag && i<8 && j<8 ) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            i--;
        }
        // верх
        if (flag && j<8) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            i--;
        }
        // верх лево
        if (flag && j<8 && i>-1) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            j--;
        }
        // лево
        if (flag && i>-1) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            j--;
        }
        // низ лево
        if (flag && j>-1 && i>-1) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            i++;
        }
        // низ
        if (flag && j>-1) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            i++;
        }
        // низ право
        if (flag && j>-1 && i<8) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            j++;
        }
        // право
        if (flag && i<8) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            j++;
        }
        return validMoves;
    }
}
