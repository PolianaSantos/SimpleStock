/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.morgan.simpleStock.business.impl;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;
import com.jp.morgan.simpleStock.business.enums.Indicator;
import com.jp.morgan.simpleStock.business.util.Stock;
import com.jp.morgan.simpleStock.business.util.Trade;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Assert;

/**
 *
 * @author Poliana Nascimento
 */
public class StockFinanceTest {
    

    /**
     * Test of stockPrice method, of class StockFinance.
     */
    @Test
    public void testStockPrice() {
        System.out.println("stockPrice");
        List<Trade> trades = creatTradeList();
        StockFinance instance = new StockFinance();
        Double expResult = 4.333;
        Double result = instance.stockPrice(trades);
        assertEquals(expResult, result);
    }



    /**
     * Test of pERatio method, of class StockFinance.
     */
    @Test
    public void testPERatio() {
        System.out.println("pERatio");
        StocksBean stocks = creatStock();
        StockFinance instance = new StockFinance();
        Double expResult = 0.231;
        Double result = instance.pERatio(stocks);
        assertEquals(expResult, result);
    }

    /**
     * Test of dividendYield method, of class StockFinance.
     */
    @Test
    public void testDividendYield() {
        System.out.println("dividendYield");
        StocksBean stocks = creatStock();
        StockFinance instance = new StockFinance();
        Double expResult = 4.333;
        Double result = instance.dividendYield(stocks);
        assertEquals(expResult, result);
    }
   
    private List<Trade> creatTradeList(){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        Trade trade1 = new Trade(date, 7, Indicator.BUY.toString(), 5.50, "TEA");
        Trade trade2 = new Trade(date, 2, Indicator.SELL.toString(), 3.00, "TEA");
        Trade trade3 = new Trade(date, 1, Indicator.BUY.toString(), 3.50, "TEA");
        Trade trade4 = new Trade(date, 2, Indicator.BUY.toString(), 2.00, "TEA");
        List<Trade> trades = new ArrayList<>(Arrays.asList(trade1, trade2, trade3, trade4));
        return trades;

    }
     private StocksBean creatStock() {
        StocksBean stock = new StocksBean();
        Stock st = new Stock("JOE", "COMMON", 13, 0, 250);
        stock.setStock(st);
        stock.setTickerPrice(3.00);

        return stock;
    }

    
            
         
    
}
