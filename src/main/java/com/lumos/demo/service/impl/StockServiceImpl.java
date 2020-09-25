package com.lumos.demo.service.impl;

import com.lumos.demo.mapper.StockMapper;
import com.lumos.demo.pojo.Stock;
import com.lumos.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockMapper stockMapper;

    @Override
    public Stock getStockByProductSkuId(int productSkuId){
        Stock stock= stockMapper.selectByProductSkuId(productSkuId);
        return stock;
    }
}
