package com.test.demo.server;

import com.test.demo.dao.java.UserInfoMapper;
import com.test.demo.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LoginServer {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo login(String idString, String password) {
        if (null == idString || null == password) {
            throw new RuntimeException("登陆失败");
        }
        Integer id = Integer.valueOf(idString);
        List<UserInfo> userInfos = userInfoMapper.selectUsers(id, password);
        if (userInfos == null || userInfos.size() == 0) {
            throw new RuntimeException("账号或密码错误");
        }
        return userInfos.get(0);
    }
}
