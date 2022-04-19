package com.netcracker.chNine;

public class HourlyEmployee extends Employee{

  private double hourlyWage;
/*
 Constructs an hourly employee with a given name and weekly wage.
 */
  public HourlyEmployee(String name, double wage){
    setName(name);
    hourlyWage = wage;
  }

  public double weeklyPay(int hoursWorked){
    double pay = hoursWorked * hourlyWage;
    if (hoursWorked>40){
      // Add overtime. More money, he-he
      pay = pay + ((hoursWorked-40)*0.5)*hourlyWage;
    }
    return pay;
  }


}
