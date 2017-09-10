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

    public String getName() {
        return name;
    }

    public ArrayList<Saleable> getStock() {
        return stock;
    }

    public void addStock(Saleable itemToAdd) {
        stock.add(itemToAdd);
    }

    public Saleable removeStock(int index) {
        return stock.remove(index);
    }

    public boolean removeStock(Saleable itemToRemove) {
        return stock.remove(itemToRemove);
    }

    public double calculateProfit() {
        int totalProfit = 0;
        for (Saleable item : stock) {
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}
