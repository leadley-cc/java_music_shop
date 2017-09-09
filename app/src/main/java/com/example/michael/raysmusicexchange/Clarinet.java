package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 09/09/2017.
 */

public class Clarinet extends Instrument {
    private String key;

    public Clarinet(String name, String material, String colour, String key) {
        super(name, material, colour, InstrumentType.WOODWIND);
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
