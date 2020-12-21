package com.example.demo.web.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 页面展示员工VO
 *
 * @author xuzhou
 * @version 1.0.0
 * @title StaffVO
 * @date 2020/12/18 15:31
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "员工信息")
public class StaffVO {

    @ApiModelProperty("员工编号")
    private Integer id;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("职位")
    private String position;
}
