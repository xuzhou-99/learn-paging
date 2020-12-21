package com.example.demo.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.common.ApiDataResponse;
import com.example.demo.common.ApiResponse;
import com.example.demo.model.Staff;
import com.example.demo.page.PageResult;
import com.example.demo.service.StaffManageMentService;
import com.example.demo.web.vo.StaffVO;

import io.swagger.annotations.Api;

/**
 * 员工管理
 *
 * @author xuzhou
 * @version 1.0.0
 * @title StaffManageController
 * @date 2020/12/18 15:27
 */
@Api("员工管理")
@Controller
@RequestMapping(value = "/api/staffManagement")
public class StaffManagementController {

    @Resource
    private StaffManageMentService staffManageMentService;

    @GetMapping("query/list/staffs")
    @ResponseBody
    public ApiDataResponse<PageResult<StaffVO>> queryStaffByConditions(@RequestParam("pageNum") final Integer pageNum,
                                                                       @RequestParam("pageSize") final Integer pageSize){
        return ApiDataResponse.ofSuccess(staffManageMentService.queryStaffByConditions(pageNum,pageSize));
    }
    @PostMapping("manage/add")
    @ResponseBody
    public ApiResponse addStaff(final Staff staff){
        return ApiResponse.ofSuccess(staffManageMentService.addStaff(staff));
    }

    @PostMapping("manage/addStaff")
    @ResponseBody
    public ApiResponse addUser(@RequestParam("name") final String name,
                               @RequestParam("age") final Integer age,
                               @RequestParam("sex") final Integer sex,
                               @RequestParam("corp") final String corp,
                               @RequestParam("dept") final String dept,
                               @RequestParam("position") final String position){
        return ApiResponse.ofSuccess(staffManageMentService.addStaff(name, age, sex, corp, dept, position));
    }

    @GetMapping("manage/count")
    @ResponseBody
    public ApiDataResponse<Integer> countStaff(){
        return ApiDataResponse.ofSuccess(staffManageMentService.countStaff());
    }

}
