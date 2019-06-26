package com.gfk.farmshop;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * An item that is in stock in the shop.
 */
public class StockItem {
    private String name; // the thing being sold
    private BigDecimal price; // "normal" retail price
    private int quantity; // the quantity in stock

    /**
     * the name of the thing being sold
     */
    public String getName() {
        return name;
    }

    /**
     * the quantity of an item in stock
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * the price of the thing being sold
     */
    public BigDecimal getPrice() {
        return price;
    }

    public StockItem(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
