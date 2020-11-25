package com.company.convertCurrency;

public class Dollar {
    private double amount;

    //region Constructors

    public Dollar() {
    }

    public Dollar(double amount) {
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
