package com.example.michael.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by michael on 09/09/2017.
 */

public class ShopTest {
    Shop shop;
    Saleable guitar;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("Fender Telecaster", "Ash & Maple", "Beige", 6, 350.0, 500.0);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void hasStock() {
        assertNotNull(shop.getStock());
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.getStock().size());
        assertEquals(guitar, shop.getStock().get(0));
    }

    @Test
    public void canRemoveStockByIndex() {
        shop.addStock(guitar);
        shop.removeStock(0);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canRemoveStockByReference() {
        shop.addStock(guitar);
        boolean result = shop.removeStock(guitar);
        assertEquals(true, result);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateProfit() {
        for (int i = 0; i < 10; i++) shop.addStock(guitar);
        assertEquals(1500.0, shop.calculateProfit(), 0.01);
    }
}
