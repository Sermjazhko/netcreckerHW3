package com.netcracker.chNine.programmingProjects.exOne;

import java.util.ArrayList;

public class Bishop extends ChessPiece{


    public ArrayList<String> canMoveTo(){
        ArrayList<String> validMoves = new ArrayList<>();
        int indexCol = colum.indexOf(position.substring(0,1));
        int indexRow = row.indexOf(position.substring(1,2));

        int i =indexCol+1;
        int j = indexRow+1;
        while (flag && i<8 && j<8 ) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            i++;
            j++;
        }
        i =indexCol-1;
        j = indexRow-1;
        while (flag && i>-1 && j>-1) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            i--;
            j--;
        }
        i =indexCol+1;
        j = indexRow-1;
        while (flag && i<8 && j>-1) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            i++;
            j--;
        }
        i = indexCol-1;
        j = indexRow+1;
        while (flag && i>-1 && j<8) {
            validMoves.add(colum.substring(i, i + 1) + row.substring(j, j + 1));
            i--;
            j++;
        }
        return validMoves;
    }
}
