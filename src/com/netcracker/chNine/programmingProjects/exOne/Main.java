package com.netcracker.chNine.programmingProjects.exOne;

public class Main {

    public static void main(String[] args) {
        // считаем, что есть кого срубить, дополнительно нужно делать метод,
        // проверяющий наличие фигур, которые мешают или которые нужно срубить,
        // вместо этого пока стоит flag. Соответственно не учитывается, как расположены
        // другие фигуры на поле
        Pawn pawn = new Pawn();
        // черные
        pawn.setPosition("g7");
        System.out.println(pawn.canMoveTo());
        Knight knight = new Knight();
        knight.setPosition("e1");
        System.out.println(knight.canMoveTo());

        Rook rook = new Rook();
        rook.setPosition("d1");
        System.out.println(rook.canMoveTo());

        Bishop bishop = new Bishop();
        bishop.setPosition("e8");
        System.out.println(bishop.canMoveTo());

        Queen queen = new Queen();
        queen.setPosition("a8");
        System.out.println(queen.canMoveTo());

        King king = new King();
        king.setPosition("f5");
        System.out.println(king.canMoveTo());

    }
}
