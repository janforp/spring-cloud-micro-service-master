package com.janita.cloud.user.controller;

import com.janita.cloud.common.bean.User;
import com.janita.cloud.common.exception.CustomException;
import com.janita.cloud.common.exception.ResultEnum;
import com.janita.cloud.common.result.ResultDto;
import com.janita.cloud.common.result.ResultDtoFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2018-03-08 17:51
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from user a";
    }
}
