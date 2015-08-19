package com.learning.patterns.behavioral.command;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class Runner {
    public static void main(String[] args) {
        StockTrade stockTrade = new StockTrade();
        Invoker invoker = new Invoker();
        invoker.addOrder(new SellStockOrder(stockTrade));
        invoker.addOrder(new SellStockOrder(stockTrade));
        invoker.addOrder(new BuyStockOrder(stockTrade));
        invoker.placeOrder();
    }
}
