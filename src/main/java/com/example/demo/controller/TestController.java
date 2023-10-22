package com.example.demo.controller;

import com.example.demo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lam h
 * @date: 2023/10/22
 */
@RestController
@RequestMapping("/test")
public class TestController {

    
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        try {
            Assert.hasText(user.getName(), "name is required");
            Assert.notNull(user.getAge(), "age is required");
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage(), e);
            return e.getMessage();
        }
        return "success";
    }
}
