package com.lyz.java;

import com.lyz.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author yuan
 * @date 2021/9/2 下午9:59
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
public class Main6001 {
    public static void main(String[] args) {
        SpringApplication.run(Main6001.class, args);
    }
}
