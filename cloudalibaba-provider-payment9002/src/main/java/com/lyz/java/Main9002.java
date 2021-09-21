package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuan
 * @date 2021/9/18 下午9:57
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Main9002 {
    public static void main(String[] args) {
        SpringApplication.run(Main9002.class, args);
    }
}
