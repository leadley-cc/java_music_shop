package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 09/09/2017.
 */

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String name, String material, String colour, int numberOfStrings) {
        super(name, material, colour, InstrumentType.GUITAR);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "strummmmmm";
    }
}
