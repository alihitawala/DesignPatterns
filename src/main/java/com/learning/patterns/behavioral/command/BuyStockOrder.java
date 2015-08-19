package com.learning.patterns.behavioral.command;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class BuyStockOrder implements Order {
    StockTrade stockMarket;

    public BuyStockOrder(StockTrade stockMarket) {
        this.stockMarket = stockMarket;
    }

    @Override
    public void execute() {
        stockMarket.buy();
    }
}
