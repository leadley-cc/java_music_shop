package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 08/09/2017.
 */

public abstract class Instrument
        implements Playable, Saleable {

    private String name;
    private String material;
    private String colour;
    private InstrumentType type;

    private double buyPrice;
    private double sellPrice;

    public Instrument(
            String name, String material, String colour, InstrumentType type,
            double buyPrice, double sellPrice
    ) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

    @Override
    public double getBuyPrice() {
        return buyPrice;
    }

    @Override
    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
