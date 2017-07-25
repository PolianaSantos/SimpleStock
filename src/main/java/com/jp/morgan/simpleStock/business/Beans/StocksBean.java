/*
 * This class it is a object that represent the datas that are recorded
 * Contain the trades per stock and the ticker price
 */
package com.jp.morgan.simpleStock.business.Beans;

import com.jp.morgan.simpleStock.business.util.Stock;
import com.jp.morgan.simpleStock.business.util.Trade;
import java.util.List;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public class StocksBean {
    
    private Stock stock;
    private List<Trade> trades;
    private Double tickerPrice;
    /**
     * @return the stock
     */
    public Stock getStock() {
        return stock;
    }
    /**
     * @param stock the stock to set
     */
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    /**
     * @return the trades
     */
    public List<Trade> getTrades() {
        return trades;
    }

    /**
     * @param trades the trades to set
     */
    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }    

    /**
     * @return the tickerPrice
     */
    public Double getTickerPrice() {
        return tickerPrice;
    }

    /**
     * @param tickerPrice the tickerPrice to set
     */
    public void setTickerPrice(Double tickerPrice) {
        this.tickerPrice = tickerPrice;
    }
    
}
