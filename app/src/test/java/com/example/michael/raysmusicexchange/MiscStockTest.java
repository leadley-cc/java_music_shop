package com.example.michael.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 09/09/2017.
 */

public class MiscStockTest {
    MiscStock drumsticks;

    @Before
    public void before() {
        drumsticks = new MiscStock("Drumsticks", 6.0, 10.0);
    }

    @Test
    public void hasName() {
        assertEquals("Drumsticks", drumsticks.getName());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(6.0, drumsticks.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10.0, drumsticks.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        drumsticks.setSellPrice(15.0);
        assertEquals(15.0, drumsticks.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.0, drumsticks.calculateMarkup(), 0.01);
    }
}
