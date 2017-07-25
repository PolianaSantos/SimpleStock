/*
 * Interfece for the Gbce methods
 */
package com.jp.morgan.simpleStock.business.inter;

import java.util.List;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public interface GbceFinanceInterface {
    public Double calculateGeometricMean(List<Double> prices);    
}
