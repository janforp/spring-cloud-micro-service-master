package com.janita.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by Janita on 2018-03-09 15:34
 * 启动该项目之后访问：
 * http://localhost:9003/hystrix
 * 即可
 */
@SpringBootApplication
//启用 Hystrix Board 功能
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
