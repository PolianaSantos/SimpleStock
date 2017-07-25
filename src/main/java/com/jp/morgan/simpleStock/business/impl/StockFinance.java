/*
 * For a given a stock, this class do the bussiness, caluculate the stock price, the p/e ratio and record a trade
 */
package com.jp.morgan.simpleStock.business.impl;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;
import com.jp.morgan.simpleStock.business.abs.Type;
import com.jp.morgan.simpleStock.business.enums.StockType;
import com.jp.morgan.simpleStock.business.inter.StockFinanceInterface;
import com.jp.morgan.simpleStock.business.type.CommonType;
import com.jp.morgan.simpleStock.business.type.PreferredType;
import com.jp.morgan.simpleStock.business.util.Trade;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public class StockFinance implements StockFinanceInterface {

    /** 
     * This method calculate the stock price for a trade list
     * @param trades
     * @return double (the stock price calculated)
     */
    @Override
    public Double stockPrice(final List<Trade> trades) {
        if (trades != null && !trades.isEmpty()) {
            Double sumPriceQuant = trades.stream().mapToDouble(trade -> trade.getPrice() * trade.getQuantityShares()).sum();
            int sumQuantity = trades.stream().mapToInt(trade -> trade.getQuantityShares()).sum();
            System.out.println(sumPriceQuant / sumQuantity);
            return new BigDecimal(sumPriceQuant / sumQuantity).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
        }
        return 0.0;
    }

    /**
     * This method record a trade in a bean
     * @param stocks
     * @param trade
     * @return StocksBean all the trades and stocks
     */
    @Override
    public List<StocksBean> recordTrade(List<StocksBean> stocks, Trade trade) {
        if (stocks != null && !stocks.isEmpty() && trade != null) {
            
            stocks.stream().filter((stock) -> (stock.getStock().getStockSymbol().
                    equals(trade.getStockSymbol()))).forEachOrdered((stock) -> {
                        if(stock.getTrades()== null){
                             stock.setTrades(new ArrayList<>());
                        }
                stock.getTrades().add(trade);
            });
        }
        return stocks;
    }

    /**
     * The class calculate the p/e ratio for a stock
     * @param stocks
     * @return a double (the p/e ratio for a stock)
     */
    @Override
    public Double pERatio(StocksBean stocks) {
        if (stocks != null) {
            return new BigDecimal(stocks.getTickerPrice() / stocks.getStock().getLastDividend()).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
        } else {
            return 0.0;
        }
    }

    /**
     * This method calculate the dividend Yield for a stock. Depending on the stock type symbol. 
     * If the type is it preferred it instance the class PreferredType else CommonType.
     * @param stocks
     * @return 
     */
    @Override
    public Double dividendYield(StocksBean stocks) {
        Type stockSymbol;
        if (stocks != null) {
            if (StockType.PREFERRED.toString().equals(stocks.getStock().getStockSymbol())) {
                stockSymbol = new PreferredType();
            } else {
                stockSymbol = new CommonType();
            }
            return stockSymbol.calculateDividendYield(stocks);
        }
        return 0.0;
    }    
}
