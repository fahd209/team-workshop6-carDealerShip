package com.pluralsight.Model;

public class Sales extends Contract
{
    private final double SALES_TAX;
    private final double RECORDING_FEE;
    private double processingFee;
    private boolean financed;

    public Sales(String date, String customerName, String customerEmail, boolean vehicleSold, double monthlyPayment, double totalPrice, boolean financed)
    {
        super(date, customerName, customerEmail, vehicleSold, monthlyPayment, totalPrice);
        this.SALES_TAX = totalPrice * .05;
        this.RECORDING_FEE = 100;
        this.processingFee = totalPrice < 10000 ? 295 : 495;
        this.financed = financed;
    }

    public double getSALES_TAX() {
        return SALES_TAX;
    }

    public double getRECORDING_FEE() {
        return RECORDING_FEE;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return financed;
    }

    public void setFinanced(boolean financed) {
        this.financed = financed;
    }

    @Override
    public double getTotalPrice()
    {
        return getSalePrice() + getSALES_TAX() + getRECORDING_FEE() + getProcessingFee();
    }

    @Override
    public double getMonthlyPayment()
    {
        double monthlyPayment = 0;

        if(isFinanced())
        {
            if(getTotalPrice() >= 10000)
            {
                monthlyPayment = 4.25 * (getTotalPrice() / 48);
            }
            else
            {
                monthlyPayment = 5.25 * (getTotalPrice() / 24);
            }
        }
        return monthlyPayment;
    }
}
