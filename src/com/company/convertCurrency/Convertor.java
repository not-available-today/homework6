package com.company.convertCurrency;

public class Convertor {

    public Ruble convert(Dram from, Ruble to) {
        double amountInRubles = from.getAmount() * .15;
        to.setAmount(amountInRubles);
        return to;
    }

    public Dollar convert(Dram from, Dollar to) {
        double amountInDollars = from.getAmount() * 0.0020;
        to.setAmount(amountInDollars);
        return to;
    }

    public Dram convert(Ruble from, Dram to) {
        double amountInDrams = from.getAmount() * 6.61;
        to.setAmount(amountInDrams);
        return to;
    }

    public Dollar convert(Ruble from, Dollar to) {
        double amountInDollars = from.getAmount() * 0.013;
        to.setAmount(amountInDollars);
        return to;
    }

    public Dram convert(Dollar from, Dram to) {
        double amountInDrams = from.getAmount() * 503.22;
        to.setAmount(amountInDrams);
        return to;
    }

    public Ruble convert(Dollar from, Ruble to) {
        double amountInRubles = from.getAmount() * 76.13;
        to.setAmount(amountInRubles);
        return to;
    }


}
