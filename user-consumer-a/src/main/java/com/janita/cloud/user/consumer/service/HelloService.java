package com.janita.cloud.user.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Janita on 2018-03-09 11:18
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hellFallBack",ignoreExceptions = {RuntimeException.class})
    public String helloService() {
        return restTemplate.getForEntity("http://USER-SERVICE/hello", String.class).getBody();
    }

    public String hellFallBack(){
        return "error";
    }
}
