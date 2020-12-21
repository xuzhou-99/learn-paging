package com.example.demo.service.impl;

import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.convert.StaffConvert;
import com.example.demo.mapper.StaffManagementMapper;
import com.example.demo.model.Staff;
import com.example.demo.page.PageParameter;
import com.example.demo.page.PageResult;
import com.example.demo.page.PageResultUtils;
import com.example.demo.service.StaffManageMentService;
import com.example.demo.web.vo.StaffVO;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title StaffManageMentServiceImpl
 * @date 2020/12/18 15:43
 */
@Service
public class StaffManageMentServiceImpl implements StaffManageMentService {

    @Resource
    private StaffManagementMapper staffManagementMapper;

    @Override
    public PageResult<StaffVO> queryStaffByConditions(Integer pageNum, Integer pageSize) {
        Integer totalRow = countStaff();
        PageParameter parameter = PageParameter.create(pageNum, pageSize, totalRow);
        return PageResultUtils.buildPageResult(parameter,() -> staffManagementMapper.queryStaffByConditions(parameter)
                .stream()
                .map(StaffConvert.INSTANCE::conver)
                .collect(Collectors.toList()));
    }

    @Override
    public String addStaff(Staff staff) {
        return staffManagementMapper.insert(staff) == 1 ? "添加成功！" : "添加失败";
    }

    @Override
    public String addStaff(String name, Integer age, Integer sex, String corp, String dept, String position) {
        Staff staff = Staff.builder()
                .name(name)
                .age(age)
                .corp(corp)
                .dept(dept)
                .sex(sex)
                .position(position)
                .id(null)
                .build();
        return staffManagementMapper.insert(staff) == 1 ? "添加成功！" : "添加失败";


    }

    @Override
    public Integer countStaff() {
        return staffManagementMapper.countStaff();
    }
}
