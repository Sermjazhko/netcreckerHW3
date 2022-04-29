package com.netcracker.chEight;

/*Declare a class Combo Lock that works like the combination lock
in a gym locker, as shown here. The lock is constructed with
a combination—three numbers between 0 and 39. The reset
method resets the dial so that it points to 0. The turn Left and
turn Right methods turn the dial by a given number of ticks to the
left or right. The open method attempts to open the lock. The lock opens if the user first turned it right to the first number in the combination, then left
to the second, and the right to the third.*/

public class ComboLock {
    private int[] secret = new int[3];
    private int dial;
    private int open;
    private boolean flag;
    private int number;

    // Пусть на 0 ticks можем повернуть
    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret[0] =  Math.floorMod(secret1, 39);
        this.secret[1] =  Math.floorMod(secret2, 39);
        this.secret[2] =  Math.floorMod(secret3, 39);
    }

    public void reset(){
        dial = 0;
        flag = false;
        open = 0;
        number = 0;
    }

    public void turnLeft(int ticks){
        if (number != 1)
            flag = true;
        dial =  Math.floorMod(dial - ticks, 39);
        if (dial == secret[number])
            open++;
        number++;
    }

    public void turnRight(int ticks){
        if (number == 1)
            flag = true;
        dial =  Math.floorMod(dial + ticks, 39);
        if (dial == secret[number])
            open++;
        number++;
    }

    public boolean open(){
        return !(flag || (number!= 3) || (open!= 3));
    }
}
