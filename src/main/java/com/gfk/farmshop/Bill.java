package com.gfk.farmshop;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A quote for a customers purchases at a point-in-time
 */
public interface Bill {
    LocalDate getPurchaseDate();

    /**
     * Gets the total purchase price (so far).
     * @return
     */
    BigDecimal getTotal();

    /**
     * Add an item to the bill
     * @param item the item to purchase
     * @return the price of the item
     */
    BigDecimal addItem(StockItem item);
}
