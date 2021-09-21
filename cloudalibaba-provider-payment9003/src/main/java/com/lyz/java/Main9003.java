package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuan
 * @date 2021/9/20 下午7:31
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Main9003 {
    public static void main(String[] args) {
        SpringApplication.run(Main9003.class, args);
    }
}
