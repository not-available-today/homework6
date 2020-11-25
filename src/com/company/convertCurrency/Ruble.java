package com.company.convertCurrency;

public class Ruble {

    private double amount;

    //region Constructors

    public Ruble() {
    }

    public Ruble(double amount) {
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
