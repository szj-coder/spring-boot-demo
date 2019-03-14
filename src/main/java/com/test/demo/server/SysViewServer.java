package com.test.demo.server;

import com.test.demo.dao.java.SysViewMapper;
import com.test.demo.model.SysView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysViewServer {

    @Autowired
    private SysViewMapper sysViewMapper;

    public int install(SysView sysView) {
        return sysViewMapper.insert(sysView);
    }
}
