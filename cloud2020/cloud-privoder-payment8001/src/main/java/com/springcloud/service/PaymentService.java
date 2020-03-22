package com.springcloud.service;


import com.sprincloud.entities.CommonResult;
import com.sprincloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public CommonResult add(Payment payment);

    public CommonResult getPaymentById(@Param("id") Long id);
}
