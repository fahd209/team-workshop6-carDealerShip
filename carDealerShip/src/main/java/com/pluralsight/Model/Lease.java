package com.pluralsight.Model;

public class Lease extends Contract
{
    private double expectedEndingValue;
    private double leaseFee;


    public Lease(String date, String customerName, String customerEmail, boolean vehicleSold, double monthlyPayment, double totalPrice, double expectedEndingValue, double leaseFee)
    {
        super(date, customerName, customerEmail, vehicleSold, monthlyPayment, totalPrice);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    @Override
    public double getTotalPrice(){
        return 0;
    }

    @Override
    public double getMonthlyPayment(){
        return 0;
    }

}
