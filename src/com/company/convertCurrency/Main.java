package com.company.convertCurrency;

public class Main {
    public static void main(String[] args) {
        Dram dram = new Dram();
        Ruble ruble = new Ruble();
        Dollar dollar = new Dollar();
        Convertor convertor = new Convertor();

        dram.setAmount(500);
        convertor.convert(dram, ruble);
        System.out.println(ruble.getAmount());

        ruble.setAmount(100);
        convertor.convert(ruble, dram);
        System.out.println(dram.getAmount());


        dollar.setAmount(100);
        convertor.convert(dollar, dram);
        System.out.println(dram.getAmount());


        dram.setAmount(100000);
        convertor.convert(dram, dollar);
        System.out.println(dram.getAmount() + " drams is " +dollar.getAmount() + " dollars");

        ruble.setAmount(100);
        convertor.convert(ruble, dollar);
        System.out.println(ruble.getAmount() + " rubles is " + dollar.getAmount() + " dollars.");


        dollar.setAmount(1000);
        ruble.setAmount(0);
        convertor.convert(dollar, ruble);
        System.out.println(dollar.getAmount() + " dollars is " +ruble.getAmount() + " rubles.");
    }
}
