package com.test.demo.serverTest;

import com.alibaba.fastjson.JSONObject;
import com.test.demo.model.SysLog;
import com.test.demo.server.SysLogServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServerTest {
    private static final Logger log = LoggerFactory.getLogger(TestServerTest.class);

    @Autowired
    private SysLogServer sysLogServer;

    @Test
    public void selectAll() {
        try {
            List<SysLog> sysLogs = sysLogServer.selectAll();
            System.out.println(JSONObject.toJSONString(sysLogs));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
}
