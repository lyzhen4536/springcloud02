package com.lyz.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yuan
 * @date 2021/9/15 下午10:29
 */

@SpringBootApplication
@EnableConfigServer
public class Main3344 {
    public static void main(String[] args) {
        SpringApplication.run(Main3344.class, args);
    }
}
