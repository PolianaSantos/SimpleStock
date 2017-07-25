/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.morgan.simpleStock.business.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Poliana Nascimento
 */
public class GbceFinanceTest {
    
    

    /**
     * Test of calculateGeometricMean method, of class GbceFinance.
     */
    @Test
    public void testCalculateGeometricMean() {
        System.out.println("calculateGeometricMean");
        List<Double> prices = new ArrayList<>(Arrays.asList(7.0,9.0, 12.0));        
        GbceFinance instance = new GbceFinance();
        Double expResult = 9.110;
        Double result = instance.calculateGeometricMean(prices);
        assertEquals(expResult, result);
        
    }
    
}
