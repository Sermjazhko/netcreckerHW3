package com.netcracker.chThree;

/*• P3.6 A Person has a name (just a first name for simplicity) and friends. Store the names of
the friends in a string, separated by spaces. Provide a constructor that constructs a
person with a given name and no friends. Provide methods
public void befriend(Person p)
public void unfriend(Person p)
public String getFriendNames()
• P3.7 Add a method
public int getFriendCount()
to the Person class of Exercise •• P3.6*/

public class Person {
    private String name;
    private String friends;
    private int count;

    public Person(String name) {
        this.name = name;
        friends = "";
    }

    public void befriend(Person p){
        friends += " " + p.name;
        count++;
    }

    public void unfriend(Person p){
        friends = friends.replace(" "  + p.name, "");
        count--;
    }

    public String getFriendNames(){
        return friends;
    }

    public int getFriendCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}
