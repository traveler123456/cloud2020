package com.springcloud.dao;

import com.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {

    void creatOrder(Order order);

    void updateStatus(@Param("id") String orderId,@Param("status") Integer status);

}
