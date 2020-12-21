package com.example.demo.service;

import com.example.demo.model.Staff;
import com.example.demo.page.PageResult;
import com.example.demo.web.vo.StaffVO;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title StaffManageMentService
 * @date 2020/12/18 15:42
 */
public interface StaffManageMentService {


    PageResult<StaffVO> queryStaffByConditions(final Integer pageNum, final Integer pageSize);

    String addStaff(final Staff staff);


    String addStaff(String name, Integer age, Integer sex, String corp, String dept, String position);

    Integer countStaff();

}
