package com.janita.cloud.user.consumer.controller;

import com.janita.cloud.common.bean.User;
import com.janita.cloud.common.result.ResultDto;
import com.janita.cloud.common.result.ResultDtoFactory;
import com.janita.cloud.user.consumer.service.HelloService;
import com.janita.cloud.user.consumer.service.UserService;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2018-03-09 10:44
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;
    @Autowired
    private UserService userService;

    /**
     * 辅负载均衡：效果是轮训两个服务
     * @return
     */
    @GetMapping("/ribbon-consumer")
    public String helloConsumerA(){
        return helloService.helloService();
    }

    @GetMapping("/getUserById/{userId}")
    @CacheResult
    public ResultDto getUserById(@CacheKey("id") @PathVariable long userId) {
        User user = userService.getUserById(userId);
        return ResultDtoFactory.toSuccessData(user);
    }
}
