package com.springcloud.service;

import com.springcloud.entity.Order;
import org.springframework.stereotype.Service;


public interface OrderService {
    void create(Order order);
}
