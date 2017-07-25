/*
 * Abstract class for a  stock type 
 */
package com.jp.morgan.simpleStock.business.abs;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;


/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public abstract class Type {
    /**
     * Calculate the Dividend Yield
     * @param stock
     * @return Double the Dividend Yield calculated
     */
    public Double calculateDividendYield(StocksBean stock){        
        return 0.0;
    }    
  
}
