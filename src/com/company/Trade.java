package com.company;

public class Trade {
    private String id,symbol;
    private int quantity;
    private double price;

    public Trade(){
        this("T1","AAPL",100,15.25);
    }

    public Trade(String t_id, String sym, int qty){
        id = t_id;
        symbol = sym;
        quantity = qty;
    }

    public Trade(String t_id, String sym, int qty, double pri){
        id = t_id;
        symbol = sym;
        quantity = qty;
        price = pri > 0 ? pri : 15.25;
    }

    public void setPrice(double price) {
        this.price = price > 0 ? price : 15.25;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPositive(double price){
        return getPrice() > 0;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
