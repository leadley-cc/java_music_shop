package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 09/09/2017.
 */

public class Clarinet extends Instrument {
    private String key;

    public Clarinet(
            String name, String material, String colour, String key,
            double buyPrice, double sellPrice
    ) {
        super(name, material, colour, InstrumentType.WOODWIND, buyPrice, sellPrice);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String play() {
        return "fooooooo";
    }
}
