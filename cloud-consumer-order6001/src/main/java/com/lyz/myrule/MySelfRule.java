package com.lyz.myrule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    
    @Bean
    public IRule myRule() {
        //负载均衡机制改为随机
        return new RandomRule();
    }

}
