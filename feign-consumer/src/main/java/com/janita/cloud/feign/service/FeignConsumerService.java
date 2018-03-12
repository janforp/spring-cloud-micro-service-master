package com.janita.cloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Janita on 2018-03-12 14:26
 */
@FeignClient("USER-SERVICE")
public interface FeignConsumerService {

    @RequestMapping("/hello")
    String hello();

}
