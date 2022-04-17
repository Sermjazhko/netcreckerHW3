package com.netcracker.chThree;

/*• P3.1 Enhance the CashRegister class so that it counts the purchased items. Provide a getItemCount method that returns the count.
••• P3.2 Support computing sales tax in the CashRegister class. The tax rate should be supplied
when constructing a CashRegister object. Add recordTaxablePurchase and getTotalTax methods. (Amounts added with recordPurchase are not taxable.) The giveChange
method should correctly reflect the sales tax that is charged on taxable items.*/

public class CashRegister {

    private double purchase;
    private double payment;
    private double taxRate;
    private int itemCount;

    public CashRegister() {}

    public CashRegister(double taxRate) {
        this.taxRate = taxRate;
    }

    // покупка
    public void recordPurchase(double amount){
        itemCount++;
        purchase += amount;
    }
    // клиент платит
    public void recevePayment(double amount){
        payment += amount;
    }
    // сдача
    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0;
        return change;
    }
    // налог
    public void recordTaxablePurchase(double amount){
        itemCount++;
        purchase += amount + amount*taxRate*0.01;
    }
    public int getItemCount(){
        return itemCount;
    }
}
