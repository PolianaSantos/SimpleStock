/*
 * The object that contain the parameters  for create a trade
 */
package com.jp.morgan.simpleStock.business.util;

import com.jp.morgan.simpleStock.business.enums.Indicator;
import java.util.Date;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public class Trade {
    private Date timestamp;
    private int quantityShares;
    private String indicator;
    private Double price;
    private String stockSymbol;
    

    public Trade(Date timestamp, int quantityShares, String indicator, Double price, String stockSymbol) {
        this.indicator=indicator;
        this.quantityShares=quantityShares;
        this.price=price;
        this.stockSymbol=stockSymbol;
        this.timestamp=timestamp;
    }

    public Trade(Date time, int i, Indicator indicator, double d, String tea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }
    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the quantityShares
     */
    public int getQuantityShares() {
        return quantityShares;
    }

    /**
     * @param quantityShares the quantityShares to set
     */
    public void setQuantityShares(int quantityShares) {
        this.quantityShares = quantityShares;
    }

    /**
     * @return the indicator
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * @param indicator the indicator to set
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the stockSymbol
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * @param stockSymbol the stockSymbol to set
     */
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }
}
