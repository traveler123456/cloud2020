package com.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.springcloud.dao")//定义接口位置
@SpringBootApplication
public class PaymentMainApp {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainApp.class);
    }
}
