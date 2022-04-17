package com.netcracker.chThree;

/*Write a class Battery that models a rechargeable battery. A battery has a constructor
public Battery(double capacity)
where capacity is a value measured in milliampere hours. A typical AA battery has a
capacity of 2000 to 3000 mAh. The method
public void drain(double amount)
drains the capacity of the battery by the given amount. The method
public void charge()
charges the battery to its original capacity.
The method
public double getRemainingCapacity()
gets the remaining capacity of the battery*/

public class Battery {
    private double capacity;//milliampere/hours
    private double charge;

    public Battery(double capacity) {
        if (capacity>3000)
            this.capacity = 3000;
        else if (capacity<2000)
            this.capacity = 2000;
        else
            this.capacity = capacity;
        charge = this.capacity;
    }

    public void drain (double amount){
        if (amount>=charge) {
            charge = 0;
            System.out.println("The battery is completely discharged");
        }
        else
            charge -= amount;

    }

    public void charge(){
        charge = capacity;
    }

    public double getRemainingCapacity(){
        return charge;
    }
}
