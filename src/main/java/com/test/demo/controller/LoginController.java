package com.test.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.demo.model.UserInfo;
import com.test.demo.server.LoginServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
@ResponseBody
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {


    @Autowired
    private LoginServer loginServer;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

    @GetMapping("")
    public String login(HttpSession session) {
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        try {
            UserInfo userInfo = loginServer.login(id, password);
            if (userInfo == null) {
                return failReturn("用户名或密码错误");
            }
            log.info("登陆成功：<{}>", JSONObject.toJSONString(userInfo));
            session.setAttribute("userInfo", userInfo);
            return successReturn();
        } catch (Exception e) {
            e.printStackTrace();
            return failReturn(e.getMessage());
        }
    }
}
