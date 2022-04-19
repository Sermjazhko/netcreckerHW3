package com.netcracker.chEight;

public class Main {
    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(1, 30, 12);
        comboLock.turnRight(1);
        comboLock.turnLeft(10);
        comboLock.turnRight(21);
        System.out.println(comboLock.open());
    }
}
