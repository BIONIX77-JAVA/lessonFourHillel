package com.company.model;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String title;
    private BigDecimal price;

    public Product(int id, String title, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " " + getTitle()
                + " id " + getId()
                + " price = " + getPrice();
    }
}