package com.company;

public class Account {
    private double totalValue;
    private String id;

    public Account(String id, double totalValue) {
        this.totalValue = totalValue;
        this.id = id;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Trade{" +
                "name='" + id + '\'' +
                ", account='" + totalValue + '\'' +
                '}';
    }

}
