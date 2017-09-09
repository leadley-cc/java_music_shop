package com.example.michael.raysmusicexchange;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by michael on 09/09/2017.
 */

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Upright Piano", "Mahogany", "Brown", 88);
    }

    @Test
    public void hasCorrectType() {
        assertEquals(InstrumentType.PIANO, piano.getType());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("plinkety plonk", piano.play());
    }
}
