package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yuan
 * @date 2021/9/20 下午7:27
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Main8844 {
    public static void main(String[] args) {
        SpringApplication.run(Main8844.class, args);
    }
}
