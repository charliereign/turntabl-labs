package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    Trade trade = new Trade();
    @Test
    public void shouldTakePositivePrice() {
        trade.setPrice(500);
        assertTrue( trade.isPositive(trade.getPrice()));
    }
}