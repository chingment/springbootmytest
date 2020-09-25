package com.lumos.demo.service.impl;

import com.lumos.demo.pojo.Stock;
import com.lumos.demo.service.OrderService;
import com.lumos.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private StockService stockService;

    @Override
    public int createWrongOrder(int sid){

        Stock stock =stockService.getStockByProductSkuId(101);

        return 0;
    }
}
