package com.janita.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Janita on 2018-03-08 18:04
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaBApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaBApplication.class, args);
    }
}
