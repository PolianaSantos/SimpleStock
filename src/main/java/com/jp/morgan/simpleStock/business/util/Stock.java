/*
 * The object that contain the parameters  for a stock
 */
package com.jp.morgan.simpleStock.business.util;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public class Stock {
    private String stockSymbol;
    private String stocyType;
    private int lastDividend;
    private double fixedDividend;
    private int parValue;

    public Stock(String stockSymbol,String stocyType,int lastDividend,double fixedDividend,int parValue) {
        this.fixedDividend=fixedDividend;
        this.lastDividend=lastDividend;
        this.parValue=parValue;
        this.stockSymbol=stockSymbol;
        this.stocyType=stocyType;
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

    /**
     * @return the stocyType
     */
    public String getStocyType() {
        return stocyType;
    }

    /**
     * @param stocyType the stocyType to set
     */
    public void setStocyType(String stocyType) {
        this.stocyType = stocyType;
    }

    /**
     * @return the lastDividend
     */
    public int getLastDividend() {
        return lastDividend;
    }

    /**
     * @param lastDividend the lastDividend to set
     */
    public void setLastDividend(int lastDividend) {
        this.lastDividend = lastDividend;
    }

    /**
     * @return the fixedDividend
     */
    public double getFixedDividend() {
        return fixedDividend;
    }

    /**
     * @param fixedDividend the fixedDividend to set
     */
    public void setFixedDividend(double fixedDividend) {
        this.fixedDividend = fixedDividend;
    }

    /**
     * @return the parValue
     */
    public int getParValue() {
        return parValue;
    }

    /**
     * @param parValue the parValue to set
     */
    public void setParValue(int parValue) {
        this.parValue = parValue;
    }
    
    
           
}
