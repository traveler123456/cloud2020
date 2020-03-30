package com.springcloud.service.serviceImpl;

import com.springcloud.dao.StorageDao;
import com.springcloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Integer productId, Integer count) {
        storageDao.decrease(productId,count);
    }
}
