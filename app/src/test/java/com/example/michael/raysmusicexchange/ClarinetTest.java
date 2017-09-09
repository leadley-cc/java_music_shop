package com.example.michael.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 09/09/2017.
 */

public class ClarinetTest {
    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet("Soprano Clarinet", "African blackwood", "Black", "B♭", 1900.0, 2300.0);
    }

    @Test
    public void hasCorrectType() {
        assertEquals(InstrumentType.WOODWIND, clarinet.getType());
    }

    @Test
    public void hasKey() {
        assertEquals("B♭", clarinet.getKey());
    }

    @Test
    public void canPlay() {
        assertEquals("fooooooo", clarinet.play());
    }
}
