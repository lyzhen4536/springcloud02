package com.lyzjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yuan
 * @date 2021/9/2 下午11:37
 */

@SpringBootApplication
@EnableEurekaServer
public class Main7001 {
    public static void main(String[] args) {
        SpringApplication.run(Main7001.class, args);
    }
}
