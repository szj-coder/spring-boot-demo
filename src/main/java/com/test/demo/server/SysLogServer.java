package com.test.demo.server;

import com.alibaba.fastjson.JSONObject;
import com.test.demo.dao.java.SysLogMapper;
import com.test.demo.model.SysLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 测试server
 *
 * @author szj
 */
@Service
public class SysLogServer {
    private static final Logger logger = LoggerFactory.getLogger(SysLogServer.class);

    @Autowired
    private SysLogMapper sysLogMapper;

    public List<SysLog> selectAll() {

        try {
            List<SysLog> sysLogs = sysLogMapper.selectAll();
            logger.info("3" + JSONObject.toJSONString(sysLogs));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return sysLogMapper.selectAll();

    }

    public List<SysLog> all() {
        return sysLogMapper.all();
    }

    public List<SysLog> getAll() {
        return sysLogMapper.getAll();
    }

    public List<SysLog> accessLogin(Integer num) {
        if (null == num) {
            num = 5;
        }
        return sysLogMapper.accessLog(num);
    }


}
