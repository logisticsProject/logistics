package com.sixbang.logistics.service;

import com.sixbang.logistics.domain.Orders;
import com.sixbang.logistics.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrdersMapper ordersMapper;


    public List<Orders> allOrders(){
        return ordersMapper.selectAll();
    }
}
