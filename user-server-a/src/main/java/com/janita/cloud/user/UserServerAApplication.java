package com.janita.cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServerAApplication.class, args);
	}
}
