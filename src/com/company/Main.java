package com.company;

import com.company.model.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Main to_to = new Main();
        to_to.fourthHub();
    }

    private void fourthHub() {

        Map<Integer, Product> productList = new HashMap();
        IntStream.rangeClosed(1, 100).forEach(step -> {
            productList.put(step, new Product(step, "title #" + step, BigDecimal.TEN));
        });

        List<Order> orders = new ArrayList<>();
        Order order = new Order(1);
        order.getProducts().add(new ProductItem(productList.get(1), 3));
        order.getProducts().add(new ProductItem(productList.get(14), 7));
        order.getProducts().add(new ProductItem(productList.get(17), 5));
        order.setCustomer(new Customer(1, "Vasil"));
        order.setShippingDetails(new ShippingDetails(BigDecimal.TEN, "Puskina 45"));
        order.setStatus(OrderStatus.DELIVERING);
        orders.add(order);

        Order order1 = new Order(2);
        order1.getProducts().add(new ProductItem(productList.get(24), 3));
        order1.getProducts().add(new ProductItem(productList.get(10), 6));
        order1.getProducts().add(new ProductItem(productList.get(55), 11));
        order1.setCustomer(new Customer(2, "Petro"));
        order1.setShippingDetails(new ShippingDetails(BigDecimal.TEN, "Buskin 23"));
        order1.setStatus(OrderStatus.CREATED);
        orders.add(order1);

        Order order2 = new Order(3);
        order2.getProducts().add(new ProductItem(productList.get(66), 23));
        order2.getProducts().add(new ProductItem(productList.get(23), 56));
        order2.getProducts().add(new ProductItem(productList.get(34), 7));
        order2.getProducts().add(new ProductItem(productList.get(27), 8));
        order2.setCustomer(new Customer(1, "Tolik"));
        order2.setShippingDetails(new ShippingDetails(BigDecimal.TEN, "Esenina 45"));
        order2.setStatus(OrderStatus.DELIVERING);
        orders.add(order2);

        Order order3 = new Order(4);
        order3.getProducts().add(new ProductItem(productList.get(12), 19));
        order3.getProducts().add(new ProductItem(productList.get(23), 12));
        order3.getProducts().add(new ProductItem(productList.get(25), 9));
        order3.getProducts().add(new ProductItem(productList.get(28), 32));
        order3.getProducts().add(new ProductItem(productList.get(45), 45));
        order3.getProducts().add(new ProductItem(productList.get(56), 13));

        order3.setCustomer(new Customer(2, "Petro"));
        order3.setShippingDetails(new ShippingDetails(BigDecimal.TEN, "Lenin 23"));
        order3.setStatus(OrderStatus.DELIVERING);
        orders.add(order3);

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order order, Order t1) {
                return Integer.compare(t1.getProducts().size(), order.getProducts().size());
            }
        });


//        System.out.println(orders.size());
//
//        for (int i = 0; i < orders.size(); i++) {
        System.out.println(orders.get(0));
    }

//        orders.forEach(System.out::println);
}