package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuan
 * @date 2021/9/8 下午11:55
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Main8006 {
    public static void main(String[] args) {
        SpringApplication.run(Main8006.class, args);
    }
}
