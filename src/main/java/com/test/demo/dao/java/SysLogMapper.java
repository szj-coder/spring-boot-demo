package com.test.demo.dao.java;

import com.test.demo.model.SysLog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Thu Mar 14 17:33:02 CST 2019
     */
    int insert(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Thu Mar 14 17:33:02 CST 2019
     */
    List<SysLog> selectAll();

    @Select("select * from sys_log;")
    List<SysLog> getAll();

    List<SysLog> all();
}