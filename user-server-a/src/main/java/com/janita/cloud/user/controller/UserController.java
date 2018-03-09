package com.janita.cloud.user.controller;

import com.janita.cloud.common.bean.User;
import com.janita.cloud.common.exception.CustomException;
import com.janita.cloud.common.exception.ResultEnum;
import com.janita.cloud.common.result.ResultDto;
import com.janita.cloud.common.result.ResultDtoFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2018-03-09 13:56
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/findByUserId/{userId}")
    public User findByUserId(@PathVariable long userId) {
        User user = new User();
        if (userId == 0) throw new CustomException(ResultEnum.USER_NOT_EXISTS);
        user.setUserId(userId);
        user.setName("李四");
        user.setAge(18);
        return user;
    }
}
