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
            List<SysLog> sysLogList = sysLogMapper.getAll();
            logger.info("1" + JSONObject.toJSONString(sysLogList));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        try {
            List<SysLog> sysList = sysLogMapper.all();
            logger.info("2" + JSONObject.toJSONString(sysList));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        try {
            List<SysLog> sysLogs = sysLogMapper.selectAll();
            logger.info("3" + JSONObject.toJSONString(sysLogs));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return sysLogMapper.selectAll();

    }

}
