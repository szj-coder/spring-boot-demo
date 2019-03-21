package com.test.demo.controller;

import com.test.demo.server.SysLogServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@ResponseBody
@RequestMapping("/h")
public class SysLogController extends BaseController {

    @Autowired
    private SysLogServer sysLogServer;

    @GetMapping("/hello")
    public String helloWord() {
        log.info("=====hello====");
        return successReturn();
    }

    @GetMapping("/accessLog")
    public String accessLog(@RequestParam String num) {
        log.info("=============: " + num);
        return successReturn();
//        return successReturn(sysLogServer.accessLogin(num));
    }

}
