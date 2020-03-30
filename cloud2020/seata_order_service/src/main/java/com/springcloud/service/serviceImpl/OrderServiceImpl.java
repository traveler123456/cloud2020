package com.springcloud.service.serviceImpl;

import com.springcloud.dao.OrderDao;
import com.springcloud.entity.Order;
import com.springcloud.service.AccountService;
import com.springcloud.service.OrderService;
import com.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    private Long id=16L;

    @Override
    //@GlobalTransactional(name = "seata_test_tx_group",rollbackFor = Exception.class)
    public void create(Order order) {
        order.setId(id++);
        /*
        创建订单
         */
        orderDao.creatOrder(order);
        /*
        商品扣减
         */
        storageService.decrease(order.getProductId(),order.getCount());
        /*
        账户扣减余额
         */
        accountService.decrease(order.getUserId(),order.getMoney());
        /*
        修改订单状态
        0:未完成，1:已完成
         */
        orderDao.updateStatus(order.getId(),1);
    }
}
