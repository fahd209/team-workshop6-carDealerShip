package com.pluralsight.Model;

public class Sales extends Contract
{  private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean financed;

    public Sales(String date, String customerName, String customerEmail, boolean vehicleSold, double monthlyPayment, double totalPrice, double salesTax, double recordingFee, double processingFee, boolean financed)
    {
        super(date, customerName, customerEmail, vehicleSold, monthlyPayment, totalPrice);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financed = financed;
    }


    @Override
    public double getTotalPrice()
    {
        return 0;
    }

    @Override
    public double getMonthlyPayment()
    {
        return 0;
    }






}
