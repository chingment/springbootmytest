package com.lumos.demo.mapper;

import com.lumos.demo.pojo.Stock;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMapper {
    Stock selectByProductSkuId(Integer productSkuId);
}
