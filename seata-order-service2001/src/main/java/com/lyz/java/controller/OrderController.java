package com.lyz.java.controller;

import com.lyz.java.domain.CommonResult;
import com.lyz.java.domain.Order;
import com.lyz.java.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-26 15:24
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        System.out.println("###########################");
        orderService.create(order);
        System.out.println("###########################");
        return new CommonResult(200,"订单创建成功");
    }
}
