package com.netcracker.chThree;

public class Main {
    public static void main(String[] args) {


        CashRegister reg3 = new CashRegister(7.5); // 7.5 percent sales tax

        reg3.recordPurchase(3.95); // Not taxable
        reg3.recordTaxablePurchase(20.0); // Taxable
        reg3.recordPurchase(1.45);
        reg3.recevePayment(50.0);
        System.out.println("Item count: " + reg3.getItemCount());
        double change = reg3.giveChange();
        System.out.println("Change: " + change);

        System.out.println("-------------------------------------------");

        Sheet sheet = new Sheet();
        System.out.println("Sheet: "+ sheet);
        sheet.cutInHalf();
        System.out.println("Sheet: "+ sheet);
        sheet.cutInHalf();
        System.out.println("Sheet: "+ sheet);
        sheet.cutInHalf();
        System.out.println("Sheet: "+ sheet);
        sheet.cutInHalf();
        System.out.println("Sheet: "+ sheet);

        System.out.println("-------------------------------------------");

        Person person = new Person("Peter");
        Person person1 = new Person("Ned");
        Person person2 = new Person("Tony");

        person.befriend(person1);
        person.befriend(person2);
        System.out.println("Friends " + person.getName() + ": " + person.getFriendNames());
        System.out.println("Friends count: " + person.getFriendCount());
        person.unfriend(person2); System.out.println("Friends " + person.getName() + ": " + person.getFriendNames());
        System.out.println("Friends count: " + person.getFriendCount());

        System.out.println("-------------------------------------------");

        Battery battery = new Battery(2500);

        System.out.println("Remaining capacity: " + battery.getRemainingCapacity());
        battery.drain(1500);
        System.out.println("Remaining capacity: " + battery.getRemainingCapacity());
        battery.drain(1400);
        System.out.println("Remaining capacity: " + battery.getRemainingCapacity());
        battery.charge();
        System.out.println("Remaining capacity: " + battery.getRemainingCapacity());




    }
}
