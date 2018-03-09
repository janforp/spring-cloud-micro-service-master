package com.janita.cloud.user.consumer.service;

import com.janita.cloud.common.bean.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Janita on 2018-03-09 13:58
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "userFallBack")
    public User getUserById(long userId) {
        return restTemplate.getForEntity("http://USER-SERVICE/user/findByUserId/"+userId, User.class).getBody();
    }

    public User userFallBack(long userId){
        User user = new User();
        user.setAge(0);
        user.setName("无名氏");
        user.setUserId(userId);
        return user;
    }
}
