package com.example.michael.raysmusicexchange;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by michael on 09/09/2017.
 */

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender Telecaster", "Ash & Maple", "Beige", 6, 350.0, 500.0);
    }

    @Test
    public void hasCorrectType() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("strummmmmm", guitar.play());
    }
}
