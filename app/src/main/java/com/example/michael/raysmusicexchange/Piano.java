package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 09/09/2017.
 */

public class Piano extends Instrument {
    private int numberOfKeys;

    public Piano(String name, String material, String colour, int numberOfKeys) {
        super(name, material, colour, InstrumentType.PIANO);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    @Override
    public String play() {
        return "plinkety plonk";
    }
}
