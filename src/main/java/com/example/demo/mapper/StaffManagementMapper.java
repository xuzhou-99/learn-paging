package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.Staff;
import com.example.demo.page.PageParameter;

import tk.mybatis.mapper.common.Mapper;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title StaffManagementMapper
 * @date 2020/12/18 15:35
 */
@org.apache.ibatis.annotations.Mapper
public interface StaffManagementMapper extends Mapper<Staff> {

    List<Staff> queryStaffByConditions(@Param("parameter") PageParameter parameter);

    Integer countStaff();
}
