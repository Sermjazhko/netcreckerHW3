package com.netcracker.chNine;

public class Manager extends SalariedEmployee{

    private double weeklyBonus;
    /*
     Constructs a manager with a given name, annual salary, and weekly bonus.
     */
    public Manager(String name, double salary, double bonus){
        super(name,salary);
        weeklyBonus = bonus;
    }

    // through super get a salary
    public double weeklyPay(int hours){
        return super.weeklyPay(hours)+weeklyBonus;
    }
}
