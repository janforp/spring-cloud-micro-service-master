package com.janita.cloud.user.controller;

import com.janita.cloud.common.bean.User;
import com.janita.cloud.common.exception.CustomException;
import com.janita.cloud.common.exception.ResultEnum;
import com.janita.cloud.common.result.ResultDto;
import com.janita.cloud.common.result.ResultDtoFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2018-03-08 17:51
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from user a";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(1L,name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
