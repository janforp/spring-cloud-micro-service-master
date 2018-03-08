package com.janita.cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Janita on 2018-03-08 18:43
 */
@SpringBootApplication
@EnableEurekaClient
public class UserServerBApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServerBApplication.class, args);
    }
}
