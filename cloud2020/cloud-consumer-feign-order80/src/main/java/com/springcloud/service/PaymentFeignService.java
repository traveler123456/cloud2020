package com.springcloud.service;

import com.sprincloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @RequestMapping("payment/create")
    public int create(Payment payment);

    @RequestMapping("payment/get/{id}")
    public Payment getPaymentById(@Param("id") Long id);

}
