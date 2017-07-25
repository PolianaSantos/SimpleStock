/*
 * Operations for a Global Beverage Corporation Exchange. 
 */
package com.jp.morgan.simpleStock.business.impl;

import com.jp.morgan.simpleStock.business.inter.GbceFinanceInterface;
import static java.lang.Math.pow;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public class GbceFinance implements GbceFinanceInterface{    
    
    /**
     * This method calculate Geometric Mean for all stocks
     * @param prices
     * @return Double the Geometric Mean
     */
    @Override
    public Double calculateGeometricMean(List<Double> prices) {
        Double sumPrice = 0.0;
        if (prices != null && !prices.isEmpty()) {           
            sumPrice =  pow(prices.stream().reduce(1.0, (p, c) -> p * c), 1.0 / prices.size());
            return new BigDecimal(sumPrice).setScale(3, RoundingMode.HALF_EVEN).doubleValue();            
        }
        return sumPrice;
    }
    
    
    
}
