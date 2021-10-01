package com.company;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @org.junit.jupiter.api.Test
    void setPrice() {
        Trade trade = new Trade();
        trade.setPrice(25);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
    }
}