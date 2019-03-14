package com.test.demo.serverTest;


import com.test.demo.dao.java.SysViewMapper;
import com.test.demo.model.SysView;
import com.test.demo.server.SysViewServer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysViewServerTest {

    @Autowired
    private SysViewServer sysViewServer;

    private SysView sysView;
    @Before
    public void befor() {
        sysView = new SysView();
        sysView.setIp("111.111.111.111");
        sysView.setCreateBy(new Date());
    }

    @Test
    public void install() {
        System.out.println(sysViewServer.install(sysView));
    }
}
