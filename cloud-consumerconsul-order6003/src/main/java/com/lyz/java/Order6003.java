package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuan
 * @date 2021/9/9 上午12:01
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Order6003 {
    public static void main(String[] args) {
        SpringApplication.run(Order6003.class, args);
    }
}
