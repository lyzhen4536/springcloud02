package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuan
 * @date 2021/9/8 下午10:58
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Order6002 {
    public static void main(String[] args) {
        SpringApplication.run(Order6002.class, args);
    }
}
