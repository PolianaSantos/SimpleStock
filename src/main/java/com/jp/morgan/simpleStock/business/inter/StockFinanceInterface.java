/*
 * Interfase Stock methods
 */
package com.jp.morgan.simpleStock.business.inter;

import com.jp.morgan.simpleStock.business.Beans.StocksBean;
import com.jp.morgan.simpleStock.business.util.Trade;
import java.util.List;

/**
 * @version 1.0
 * @author Poliana Nascimento
 */
public interface StockFinanceInterface{
    List<StocksBean> recordTrade(List<StocksBean> stocks, Trade trade);
    Double stockPrice(final List<Trade> trades);
    Double pERatio(StocksBean stocks);
    Double dividendYield (StocksBean stocks);
}
