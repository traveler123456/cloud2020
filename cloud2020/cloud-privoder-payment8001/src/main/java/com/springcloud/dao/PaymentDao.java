package com.springcloud.dao;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentDao {
    
    public int add(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
