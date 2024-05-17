package com.pluralsight.Model;

public class Lease extends Contract
{
    private double expectedEndingValue;
    private final double LEASE_FEE;


    public Lease(String date, String customerName, String customerEmail, boolean vehicleSold, double monthlyPayment, double salePrice)
    {
        super(date, customerName, customerEmail, vehicleSold, monthlyPayment, salePrice);
        this.expectedEndingValue = salePrice / 2;
        this.LEASE_FEE = salePrice * .07;
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
