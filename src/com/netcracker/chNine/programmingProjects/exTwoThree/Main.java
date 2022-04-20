package com.netcracker.chNine.programmingProjects.exTwoThree;

public class Main {
    public static void main(String[] args) {
        // не учитывает дату
        Clock clock = new Clock();
        clock.setAlarm(00, 11);
        System.out.println("Now: " + clock.getTime());
        WorldClock worldClock =new WorldClock(3);
        worldClock.setAlarm(00,7);
        System.out.println("+3 hours: "+worldClock.getTime());

    }
}
