/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.morgan.simpleStock.test;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;
import com.jp.morgan.simpleStock.business.enums.Indicator;
import com.jp.morgan.simpleStock.business.routine.GbceMarketRoutine;
import com.jp.morgan.simpleStock.business.util.Stock;
import com.jp.morgan.simpleStock.business.util.Trade;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;

/**
 *
 * @author Poliana Nascimento
 */
public class TestRoutine {
    
    /**
     * Call the task for calculate the stock price every 15 minutes
     * @param args 
     */
    public static void main(String args[]) {          
        Timer t = new Timer();
        t.schedule(new GbceMarketRoutine(creatStock()), 0, 150000);    
    }            

    /**
     * Crete a object for a Exemple  
     * @return 
     */
    private static List<StocksBean> creatStock(){
        StocksBean stock = new StocksBean();
        List<StocksBean> list =new ArrayList<>();
        Stock st = new Stock("JOE", "COMMON", 13, 0, 250);
        stock.setStock(st);        
        stock.setTickerPrice(3.00);
        Calendar calendar = Calendar.getInstance();
        Trade trade1 = new Trade(calendar.getTime(), 7, Indicator.BUY.toString(), 5.50, "TEA");
        calendar.add(Calendar.MINUTE, -2);
        Trade trade2 = new Trade(calendar.getTime(), 2, Indicator.SELL.toString(), 3.00, "TEA");
        calendar.add(Calendar.MINUTE, -3);
        Trade trade3 = new Trade(calendar.getTime(), 1, Indicator.BUY.toString(), 3.50, "TEA");
        calendar.add(Calendar.MINUTE, -5);
        Trade trade4 = new Trade(calendar.getTime(), 2, Indicator.BUY.toString(), 2.00, "TEA");
        calendar.add(Calendar.MINUTE, -1);
        List<Trade> trades = new ArrayList<>(Arrays.asList(trade1, trade2, trade3, trade4));
        stock.setTrades(trades);
        list.add(stock);
        st = new Stock("GIN", "PREFERRED", 8, 2, 100);
        stock = new StocksBean();
        stock.setStock(st);        
        stock.setTickerPrice(3.00);
        calendar = Calendar.getInstance();
        trade1 = new Trade(calendar.getTime(), 1, Indicator.BUY.toString(), 5.50, "GIN");
        calendar.add(Calendar.MINUTE, -2);
        trade2 = new Trade(calendar.getTime(), 2, Indicator.SELL.toString(), 3.00, "GIN");
        calendar.add(Calendar.MINUTE, -3);
        trade3 = new Trade(calendar.getTime(), 1, Indicator.BUY.toString(), 3.50, "GIN");
        calendar.add(Calendar.MINUTE, -5);
        calendar.add(Calendar.MINUTE, -1);
        trades = new ArrayList<>(Arrays.asList(trade1, trade2, trade3));
        stock.setTrades(trades);
        list.add(stock);
        return list;
    }
}
