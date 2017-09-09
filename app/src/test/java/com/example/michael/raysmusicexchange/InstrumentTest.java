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
        piano = new Piano("Upright Piano", "Mahogany", "Brown", 88);
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
}
