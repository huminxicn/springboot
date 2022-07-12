package com.huminxi.springboot;

import com.huminxi.springboot.entity.User;
import com.huminxi.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/04/08 19:07
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam(required = false) Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/hello")
    public String getUser() {
        return "hello docker";
    }

}
