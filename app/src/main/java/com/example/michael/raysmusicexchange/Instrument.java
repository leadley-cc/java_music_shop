package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 08/09/2017.
 */

public abstract class Instrument
        implements Playable/*, Saleable*/ {

    private String name;
    private String material;
    private String colour;
    private InstrumentType type;

    public Instrument(String name, String material, String colour, InstrumentType type) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }
}
