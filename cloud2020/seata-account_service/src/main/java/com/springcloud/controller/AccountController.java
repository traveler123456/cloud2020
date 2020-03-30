package com.springcloud.controller;

import com.sprincloud.entities.CommonResult;
import com.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(Long userId, BigDecimal money){
        accountService.decrease(userId, money);
        return new CommonResult(200,"successful");
    }
}
