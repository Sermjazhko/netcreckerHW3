package com.netcracker.chNine.workedExample;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    /*
     Constructs a salaried employee with a given name and annual salary.
     */
    public SalariedEmployee(String name, double salary) {
        setName(name);
        annualSalary = salary;
    }

    //salary
    public double weeklyPay(int hoursWorked){
        final int WEEKS_PER_YEAR = 52;
        return annualSalary/WEEKS_PER_YEAR;
    }
}
