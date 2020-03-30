package com.springcloud.controller;

import com.sprincloud.entities.CommonResult;
import com.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Integer productId,Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"successful");
    }

}
