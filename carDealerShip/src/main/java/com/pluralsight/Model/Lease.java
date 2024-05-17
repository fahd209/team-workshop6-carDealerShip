package com.pluralsight.Model;

public class Lease extends Contract
{
    private double EXPECTED_ENDING_VALUE;
    private final double LEASE_FEE;


    public Lease(String date, String customerName, String customerEmail, boolean vehicleSold, double monthlyPayment, double totalPrice)
    {
        super(date, customerName, customerEmail, vehicleSold, monthlyPayment, totalPrice);
        this.EXPECTED_ENDING_VALUE = totalPrice / 2;
        this.LEASE_FEE = totalPrice * .07;
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
