package com.example.michael.raysmusicexchange;

import java.util.ArrayList;

/**
 * Created by michael on 08/09/2017.
 */

public class Shop {
    private String name;
    private ArrayList<Saleable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }
}
