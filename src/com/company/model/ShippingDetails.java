package com.company.model;

import java.math.BigDecimal;

public class ShippingDetails {
    private BigDecimal cost;
    private String address;

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShippingDetails(BigDecimal cost, String address) {
        this.cost = cost;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ShippingDetails{"
                + "Address= " + getAddress() + '\''
                + ", cost= " + getCost()
                + '}';
    }
}
