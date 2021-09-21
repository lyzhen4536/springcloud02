package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yuan
 * @date 2021/9/16 上午11:26
 */

@SpringBootApplication
@EnableEurekaClient
public class Main3355 {
    public static void main(String[] args) {
        SpringApplication.run(Main3355.class, args);
    }
}
