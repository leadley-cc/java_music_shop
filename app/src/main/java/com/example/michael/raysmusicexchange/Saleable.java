package com.example.michael.raysmusicexchange;

/**
 * Created by michael on 08/09/2017.
 */

public interface Saleable {
    String getDescription();

    double getBuyPrice();

    double getSellPrice();
    void setSellPrice();

    double calculateMarkup();
}
