package com.example.michael.raysmusicexchange;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by michael on 08/09/2017.
 */

public class InstrumentTest {
    Instrument piano;

    @Before
    public void before() {
        piano = new Piano("Upright Piano", "Mahogany", "Brown", 88, 600.0, 1000.0);
    }

    @Test
    public void hasName() {
        assertEquals("Upright Piano", piano.getName());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Mahogany", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", piano.getColour());
    }

    @Test
    public void hasType() {
        assertNotNull(piano.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(600.0, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(1000.0, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        piano.setSellPrice(900.0);
        assertEquals(900.0, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(400.0, piano.calculateMarkup(), 0.01);
    }
}
