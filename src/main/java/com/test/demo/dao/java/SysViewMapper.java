package com.test.demo.dao.java;

import com.test.demo.model.SysView;
import java.util.List;

public interface SysViewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbggenerated
     */
    int insert(SysView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbggenerated
     */
    List<SysView> selectAll();
}