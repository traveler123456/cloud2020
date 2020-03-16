package com.springcloud.service;

import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public CommonResult add(Payment payment);

    public CommonResult getPaymentById(@Param("id") Long id);
}
