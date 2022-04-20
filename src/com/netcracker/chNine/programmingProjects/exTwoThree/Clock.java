package com.netcracker.chNine.programmingProjects.exTwoThree;

/*Implement a class Clock whose getHours and getMinutes methods return the current
time at your location. (Call java.time.LocalTime.now().toString() and extract the time
from that string.) Also provide a getTime method that returns a string with the hours
and minutes by calling the getHours and getMinutes methods. Provide a subclass WorldClock whose constructor accepts a time offset. For example, if you live in California, a new World Clock(3) should show the time in New York, three time zones ahead.
Which methods did you override? (You should not override getTime.)*/

/*Add an alarm feature to the Clock class of Exercise •• P9.2. When setAlarm(hours,
minutes) is called, the clock stores the alarm. When you call getTime, and the alarm
time has been reached or exceeded, return the time followed by the string "Alarm" (or,
if you prefer, the string "\u23F0") and clear the alarm. What do you need to do to
make the setAlarm method work for WorldClock objects?
*/

import java.time.LocalTime;

public class Clock {
    protected LocalTime alarm;
    protected LocalTime time;

    public Clock() {
        time = LocalTime.now();
    }

    public String getHours(){
        return  Integer.toString(time.getHour());
    }

    public String getMinutes(){
        return Integer.toString(time.getMinute());
    }

    public String getTime() {
        if (alarm.isBefore(time))
            return getHours() + ":" + getMinutes() + "\u23F0";
        return getHours() + ":" + getMinutes();
    }

    public void setAlarm(int hours, int minutes){
        alarm = LocalTime.of(hours, minutes);
    }

}
