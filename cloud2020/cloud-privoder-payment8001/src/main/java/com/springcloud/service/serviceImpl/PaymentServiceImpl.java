package com.springcloud.service.serviceImpl;

import com.springcloud.dao.PaymentDao;
import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import com.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public CommonResult add(Payment payment) {
        int result = paymentDao.add(payment);
        if(result == 1){
            return new CommonResult(CommonResult.SUCCESS,"添加成功");
        }else {
            return new CommonResult(CommonResult.FAIlED,"添加失败");
        }
    }

    @Override
    public CommonResult getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        if (payment == null){
            return new CommonResult(CommonResult.FAIlED,"该id"+id+"没有消息记录");
        }
        return new CommonResult(CommonResult.SUCCESS,"查询成功",payment);
    }
}
