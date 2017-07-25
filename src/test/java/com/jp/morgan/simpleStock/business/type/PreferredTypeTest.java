/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.morgan.simpleStock.business.type;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;
import com.jp.morgan.simpleStock.business.util.Stock;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Poliana Nascimento
 */
public class PreferredTypeTest {
    
    public PreferredTypeTest() {
    } 
    /**
     * Test of calculateDividendYield method, of class PreferredType.
     */
    @Test
    public void testCalculateDividendYield() {
        System.out.println("calculateDividendYield");
        StocksBean stock = new StocksBean();
        Stock st = new Stock("GIN", "PREFERRED", 8, 2, 100);
        stock.setStock(st);        
        stock.setTickerPrice(33.00);
        PreferredType instance = new PreferredType();
        Double expResult = 0.061;
        Double result = instance.calculateDividendYield(stock);
        assertEquals(expResult, result);
    }
    
}
