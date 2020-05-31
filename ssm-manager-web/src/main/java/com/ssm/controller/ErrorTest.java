package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorTest {

    @RequestMapping("/test")
    public void test(){
        int i = 1 / 0;
    }
}
