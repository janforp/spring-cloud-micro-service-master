package com.janita.cloud.feign.controller;

import com.janita.cloud.feign.service.FeignConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2018-03-12 14:25
 */
@RestController
public class FeignConsumerController {

    @Autowired
    private FeignConsumerService feignConsumerService;

    @GetMapping("/feign")
    public String helloConsumer() {
        return feignConsumerService.hello();
    }
}
