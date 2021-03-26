package com.company.model;

import java.math.BigDecimal;

public class ProductItem {
    private Product product;
    private int quantity;


    public ProductItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return " " + getProduct() +
                " * " + getQuantity() +
                " = " + getCost().toString();
    }
    public  BigDecimal getCost(){
        return product.getPrice().multiply(new BigDecimal(quantity));
    }
}