package com.company.convertCurrency;

public class Dram {
    private double amount;

    //region Constructors

    public Dram() {
    }

    public Dram(double amount) {
        this.amount = amount;
    }

    //endregion

    //region Setters and Getters

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //endregion
}
