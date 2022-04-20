package com.netcracker.chNine.programmingProjects.exOne;

import java.util.ArrayList;

public class Pawn extends ChessPiece{

    public ArrayList<String> canMoveTo(){
        ArrayList<String> validMoves = new ArrayList<>();
        int indexCol = colum.indexOf(position.substring(0,1));
        int indexRow = row.indexOf(position.substring(1,2));
        int count;
        if (COLOR_GAME)
            count = 1;
        else
            count = -1;

        boolean indCheck1 = (indexCol + count > -1 && indexCol + count<8);
        boolean indCheck2 = (indexCol - count > -1 && indexCol - count<8);
        boolean indCheck3 = (indexRow + count > -1 && indexRow + count<8);

        // рубим
        // вправо вверх/ влево вниз со стороны белых (симметрия)
        if (flag && indCheck1 && indCheck3)
            validMoves.add(colum.substring(indexCol + count, indexCol + count + 1) + row.substring(indexRow + count, indexRow + count + 1));
        // влево вверх/ вправо вниз со стороны белых
        if (flag && indCheck2 && indCheck3)
            validMoves.add(colum.substring(indexCol - count, indexCol - count + 1) + row.substring(indexRow + count, indexRow + count + 1));
        // просто ходим
        // вверх/ вниз

        if (indCheck3)
            validMoves.add(position.substring(0,1)+row.substring(indexRow+count, indexRow+count+1));
        return validMoves;
    }

}
