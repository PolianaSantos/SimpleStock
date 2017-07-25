/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.morgan.simpleStock.business.type;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;
import com.jp.morgan.simpleStock.business.abs.Type;
import com.jp.morgan.simpleStock.business.util.Stock;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Poliana Nascimento
 */
public class CommonTypeTest {

    /**
     * Test of calculateDividendYield method, of class CommonType.
     */
    @Test
    public void testCalculateDividendYield() {
        System.out.println("calculateDividendYield");
        StocksBean stock = new StocksBean();
        Stock st = new Stock("ALE", "COMMON", 23, 0, 60);
        stock.setStock(st);        
        stock.setTickerPrice(10.00);
        Type instance = new CommonType();
        Double expResult = 2.300;
        Double result = instance.calculateDividendYield(stock);
        assertEquals(expResult, result);
    }
    
}
