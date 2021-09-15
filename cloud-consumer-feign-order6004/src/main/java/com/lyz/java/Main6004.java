package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yuan
 * @date 2021/9/12 下午8:32
 */

@SpringBootApplication
@EnableFeignClients
public class Main6004 {
    public static void main(String[] args) {
        SpringApplication.run(Main6004.class, args);
    }
}
