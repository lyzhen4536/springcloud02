package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuan
 * @date 2021/9/20 下午7:34
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Main9004 {
    public static void main(String[] args) {
        SpringApplication.run(Main9004.class, args);
    }
}
