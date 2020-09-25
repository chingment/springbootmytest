package com.lumos.demo.service;

import com.lumos.demo.pojo.Stock;

public interface StockService {
    Stock getStockByProductSkuId(int productSkuId);
}
