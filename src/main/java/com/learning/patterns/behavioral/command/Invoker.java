package com.learning.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class Invoker {
    List<Order> orders = new ArrayList<Order>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        for(Order o : orders) {
            o.execute();
        }
        orders.clear();
    }
}
