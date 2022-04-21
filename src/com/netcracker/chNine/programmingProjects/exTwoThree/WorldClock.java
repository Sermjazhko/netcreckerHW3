package com.netcracker.chNine.programmingProjects.exTwoThree;

public class WorldClock extends Clock {
    public WorldClock(int timeOffset) {
        time = time.plusHours(timeOffset);
    }
}
