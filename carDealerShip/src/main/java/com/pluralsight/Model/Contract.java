package com.pluralsight.Model;

public abstract class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private boolean vehicleSold;
    private double monthlyPayment;
    private double salePrice;

    public Contract(String date, String customerName, String customerEmail, boolean vehicleSold, double monthlyPayment, double salePrice) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.monthlyPayment = monthlyPayment;
        this.salePrice = salePrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean isVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
