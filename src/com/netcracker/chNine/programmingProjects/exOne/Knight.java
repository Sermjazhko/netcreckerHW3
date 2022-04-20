package com.netcracker.chNine.programmingProjects.exOne;

import java.util.ArrayList;

public class Knight extends ChessPiece{


    public ArrayList<String> canMoveTo(){
        ArrayList<String> validMoves = new ArrayList<>();
        int indexCol = colum.indexOf(position.substring(0,1));
        int indexRow = row.indexOf(position.substring(1,2));

        // наверное, можно придумать поумнее, чтобы не всё проверять, но времени пока на это нет
        boolean indCheck1 = (indexCol + 2 > -1 && indexCol + 2<8);
        boolean indCheck2 = (indexCol - 2 > -1 && indexCol - 2<8);
        boolean indCheck3 = (indexRow + 1 > -1 && indexRow + 1<8);
        boolean indCheck4 = (indexRow - 1 > -1 && indexRow - 1<8);
        boolean indCheck5 = (indexCol + 1 > -1 && indexCol + 1<8);
        boolean indCheck6 = (indexCol - 1 > -1 && indexCol - 1<8);
        boolean indCheck7 = (indexRow + 2 > -1 && indexRow + 2<8);
        boolean indCheck8 = (indexRow - 2 > -1 && indexRow - 2<8);
        // 2 вперед, 1 влево/вправо
        if (indCheck1) {
            if (flag && indCheck3)
                validMoves.add(colum.substring(indexCol + 2, indexCol + 3) + row.substring(indexRow + 1, indexRow + 2));
            if (flag && indCheck4)
                validMoves.add(colum.substring(indexCol + 2, indexCol + 3) + row.substring(indexRow - 1, indexRow ));
        }
        // 1 вперед, 2 влево/вправо
        if (indCheck5) {
            if (flag && indCheck7)
                validMoves.add(colum.substring(indexCol + 1, indexCol + 2) + row.substring(indexRow + 2, indexRow + 3));
            if (flag && indCheck8)
                validMoves.add(colum.substring(indexCol + 1, indexCol + 2) + row.substring(indexRow - 2, indexRow -1));
        }
        // 2 назад, 1 влево/вправо
        if (indCheck2) {
            if (flag && indCheck3)
                validMoves.add(colum.substring(indexCol - 2, indexCol - 1) + row.substring(indexRow + 1, indexRow + 2));
            if (flag && indCheck4)
                validMoves.add(colum.substring(indexCol - 2, indexCol - 1) + row.substring(indexRow - 1, indexRow ));
        }
        // 1 назад, 2 влево/вправо
        if (indCheck6) {
            if (flag && indCheck7)
                validMoves.add(colum.substring(indexCol - 1, indexCol ) + row.substring(indexRow + 2, indexRow + 3));
            if (flag && indCheck8)
                validMoves.add(colum.substring(indexCol - 1, indexCol) + row.substring(indexRow - 2, indexRow -1));
        }
        return validMoves;
    }
}
