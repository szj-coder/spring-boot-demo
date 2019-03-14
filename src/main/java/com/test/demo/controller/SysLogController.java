package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/h")
public class SysLogController {


    @GetMapping("/hello")
    public String helloWord() {
        return "helloWorld";
    }
}
