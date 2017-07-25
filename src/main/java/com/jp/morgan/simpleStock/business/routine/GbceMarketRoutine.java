/*
 * This class extends timertask. 
 * A routine that will be execute every "n"- (that will be passed in the parameter) minute
 */
package com.jp.morgan.simpleStock.business.routine;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;
import com.jp.morgan.simpleStock.business.impl.StockFinance;
import com.jp.morgan.simpleStock.business.inter.StockFinanceInterface;
import com.jp.morgan.simpleStock.business.util.Trade;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public class GbceMarketRoutine extends TimerTask{
    private List<StocksBean> stockPrice;

    public GbceMarketRoutine(List<StocksBean> stockPrice) {
        this.stockPrice = stockPrice;
    }
    /**
     * @return the stockPrice
     */
    public List<StocksBean> getStockPrice() {
        return stockPrice;
    }
    /**
     * @param stockPrice the stockPrice to set
     */
    public void setStockPrice(List<StocksBean> stockPrice) {
        this.stockPrice = stockPrice;
    }
    
  
    /**
     * Execute the task
     */
    @Override     
    public void run() {            
        try {              
            System.out.println("Start...");            
            calculateStockPrice(getStockPrice());            
            System.out.println("End...");  
        } catch (UnsupportedOperationException e) {
            System.err.println(e);
        } 
        
    }
    
    /**
     * Calculate Stock Price based on trades recorded 
     * @param stock
    */     
    public void calculateStockPrice(List<StocksBean> stock){
        Date systemDate = getTimeSystem ();        
        Date date = getMinutesBefore(systemDate);
        stock.forEach((stocks) -> {
            List<Trade> trades = new ArrayList<>();
            stocks.getTrades().stream().filter((trade) -> (trade.getTimestamp().after(date) && trade.getTimestamp().before(systemDate))).forEachOrdered((trade) -> {
                trades.add(trade);
            });
            StockFinanceInterface stocksPrice = new StockFinance();
            System.out.println(stocks.getStock().getStockSymbol()+":"+ stocksPrice.stockPrice(trades)+":"+getTimeSystem ());
      });
    }  

     /**
     * Return the system date
     * @return Date 
     */
    private Date getTimeSystem (){
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();        
    }
    
    /**
     * Return the time 15 min ago
     * @param systemDate
     * @return Date
     */
    private Date getMinutesBefore(Date systemDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(systemDate);
        calendar.add(Calendar.MINUTE, -15);
        return calendar.getTime();
    }   

    
}
