package com.cognizant.inventory_service.model;

public class Inventory {

    private int productId;
    private int stock;

    public Inventory() {
    }

    public Inventory(int productId, int stock) {
        this.productId = productId;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}