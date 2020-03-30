package com.springcloud.controller;

import com.sprincloud.entities.CommonResult;
import com.springcloud.entity.Order;
import com.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/order/create")
    public CommonResult createOrder(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
