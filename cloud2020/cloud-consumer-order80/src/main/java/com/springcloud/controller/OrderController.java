package com.springcloud.controller;

import com.sprincloud.entities.CommonResult;
import com.sprincloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    public static final String PAYMENT_URL = "http://192.168.0.101:8001";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("consumer/payment/create")
    public CommonResult creat(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create/", payment,CommonResult.class);
    }

    @RequestMapping("consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

}
