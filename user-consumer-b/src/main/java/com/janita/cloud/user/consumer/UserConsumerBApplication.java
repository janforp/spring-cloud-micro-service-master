package com.janita.cloud.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Janita on 2018-03-09 16:24
 */
@SpringBootApplication
@EnableEurekaClient
//启用熔断器
@EnableCircuitBreaker
public class UserConsumerBApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerBApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
