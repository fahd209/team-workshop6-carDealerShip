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

    public double getExpectedEndingValue()
    {
        return expectedEndingValue;
    }

    public double getLEASE_FEE()
    {
        return LEASE_FEE;
    }

    @Override
    public double getTotalPrice()
    {
        return  getExpectedEndingValue() + getLEASE_FEE();
    }

    @Override
    public double getMonthlyPayment()
    {
        double principal = getTotalPrice();
        double rate = 0.04;
        double time = 3;

        return calculateMonthlyPayment(principal,rate,time);

    }

    public double calculateMonthlyPayment(double principal, double rate, double time)
    {
        double r = rate /(12*100);
        double t = time *12;

        return (principal * r * (double)Math.pow(1 + r,t)) / (double)(Math.pow(1+r,t) -1);

    }

}
