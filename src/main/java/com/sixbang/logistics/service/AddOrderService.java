package com.sixbang.logistics.service;

import com.sixbang.logistics.domain.Orders;
import com.sixbang.logistics.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddOrderService {
    @Autowired
    private OrdersMapper ordersMapper;

    public int addOrder(Orders orders){
        return ordersMapper.insertorder(orders);
    }
}
