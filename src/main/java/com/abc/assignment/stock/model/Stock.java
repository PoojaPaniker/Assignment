package com.abc.assignment.stock.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
    @Id
    private int itemId;
    private int availableStock;

    public Stock(int itemId, int availableStock) {
        this.itemId = itemId;
        this.availableStock = availableStock;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Stock() {
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }
}

