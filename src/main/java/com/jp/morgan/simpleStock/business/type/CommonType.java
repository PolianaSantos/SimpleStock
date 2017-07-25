/*
 * This class calculate the Dividend Yield for a common type
 */
package com.jp.morgan.simpleStock.business.type;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;
import com.jp.morgan.simpleStock.business.abs.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public class CommonType extends Type{
    /**
     * Calculate the Dividend Yield for a stock
     * @param stock
     * @return Double
     */
    @Override
    public Double calculateDividendYield(StocksBean stock) {
        if (stock != null) {
            Double dividendYield = stock.getStock().getLastDividend() / stock.getTickerPrice();
            return new BigDecimal(dividendYield).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
        }
        return 0.0;
    }
    
}
