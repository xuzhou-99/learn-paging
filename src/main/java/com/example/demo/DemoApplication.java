package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.mapper.StaffManagementMapper;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author xuzhou
 */
@MapperScan(basePackageClasses = StaffManagementMapper.class)
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
