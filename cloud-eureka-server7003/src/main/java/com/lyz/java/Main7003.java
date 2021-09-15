package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yuan
 * @date 2021/9/3 上午11:33
 */

@SpringBootApplication
@EnableEurekaServer
public class Main7003 {
    public static void main(String[] args) {
        SpringApplication.run(Main7003.class, args);
    }
}
