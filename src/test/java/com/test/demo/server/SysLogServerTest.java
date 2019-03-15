package com.test.demo.server;

import com.alibaba.fastjson.JSONObject;
import com.test.demo.model.SysLog;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysLogServerTest {

    @Autowired
    private SysLogServer sysLogServer;

    @Test
    public void getAll() {
        List<SysLog> all = sysLogServer.getAll();
        log.info(JSONObject.toJSONString(all));
        assertNotNull(all);
    }

    @Test
    public void all() {
        List<SysLog> all = sysLogServer.all();
        log.info(JSONObject.toJSONString(all));
        assertNotNull(all);
    }
}