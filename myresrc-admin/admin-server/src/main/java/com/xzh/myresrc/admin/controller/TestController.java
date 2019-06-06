package com.xzh.myresrc.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authur: joshuasiu
 * @Date: 2019-06-03 14:34
 * @Description:
 */
@RestController
@Slf4j
public class TestController {


    @GetMapping("test")
    public String test() {
        return "hello ";
    }

}
