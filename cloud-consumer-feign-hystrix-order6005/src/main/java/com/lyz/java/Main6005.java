package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yuan
 * @date 2021/9/12 下午9:57
 */

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class Main6005 {
    public static void main(String[] args) {
        SpringApplication.run(Main6005.class, args);
    }
}
