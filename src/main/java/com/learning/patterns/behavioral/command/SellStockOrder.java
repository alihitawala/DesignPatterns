package com.learning.patterns.behavioral.command;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class SellStockOrder implements Order {
    StockTrade stockMarket;

    public SellStockOrder(StockTrade stockMarket) {
        this.stockMarket = stockMarket;
    }

    @Override
    public void execute() {
        stockMarket.sell();
    }
}
