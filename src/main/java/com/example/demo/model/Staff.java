package com.example.demo.model;

import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 员工
 *
 * @author xuzhou
 * @version 1.0.0
 * @title Staff
 * @date 2020/12/18 15:10
 */
@ApiModel(value = "员工信息")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "db_wam_sys.t_staffs")
public class Staff {

    @ApiModelProperty("员工编号")
    private Integer id;

    @ApiModelProperty("员工姓名")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("单位")
    private String corp;

    @ApiModelProperty("部门")
    private String dept;

    @ApiModelProperty("职务")
    private String position;
}
