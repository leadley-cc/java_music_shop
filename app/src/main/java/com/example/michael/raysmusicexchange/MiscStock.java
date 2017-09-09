package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 09/09/2017.
 */

public class MiscStock implements Saleable {

    private String name;

    private double buyPrice;
    private double sellPrice;

    public MiscStock(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
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
