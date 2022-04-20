package com.netcracker.chNine.programmingProjects.exTwoThree;

public class WorldClock extends Clock{

    public WorldClock(int timeOffset) {
        time = time.plusHours(timeOffset);
    }

    @Override
    public String getHours() {
        return Integer.toString(time.getHour());
    }

    @Override
    public String getTime() {
        if (alarm.isBefore(time))
            return getHours() + ":" + super.getMinutes() + "\u23F0";
        return getHours() +":"+ super.getMinutes();
    }

}
