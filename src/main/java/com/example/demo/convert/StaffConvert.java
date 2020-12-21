package com.example.demo.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.model.Staff;
import com.example.demo.web.vo.StaffVO;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title StaffConvert
 * @date 2020/12/18 15:44
 */
@Mapper
public interface StaffConvert {
    StaffConvert INSTANCE = Mappers.getMapper(StaffConvert.class);

    /**
     * Entity TO VO
     *
     * @param staff {@linkplain Staff}
     * @return {@linkplain StaffVO}
     */
    StaffVO conver(final Staff staff);
}
