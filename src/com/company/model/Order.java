package com.company.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private List<ProductItem> products;
    private Customer customer;
    private ShippingDetails shippingDetails;
    private LocalDateTime created;
    private OrderStatus status;

    public Order(int id) {
        this.status = OrderStatus.CREATED;
        this.products = new ArrayList<>();
        this.id = id;
        this.created = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProductItem> getProducts() {
        return products;
    }

    public void setProducts(List<ProductItem> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order("
                + "Customer  " + getCustomer()
                + ", Products " + getProducts()
                + ", total cost =  " + getCost()
                + ", ShippingDetails " + getShippingDetails()
                + ", date " + getCreated()
                + ", status " + getStatus()
                + ", ID " + getId()
                + ')';
    }

    public BigDecimal getCost() {
        BigDecimal cost = BigDecimal.ZERO;
        for (ProductItem product : products) {
            cost = cost.add(product.getCost());
        }
        return cost;
    }
}