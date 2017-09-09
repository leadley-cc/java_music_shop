package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 09/09/2017.
 */

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(
            String name, String material, String colour, int numberOfStrings,
            double buyPrice, double sellPrice
    ) {
        super(name, material, colour, InstrumentType.GUITAR, buyPrice, sellPrice);
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
