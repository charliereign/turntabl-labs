package com.company;

public class Main {

    public static void main(String[] args) {
        Trade trade = new Trade("T2","NASDAQ",200, -29);
        System.out.println(trade);
        System.out.println(trade.getPrice());
    }
}
