package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Emp;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper {

    @Results({
            @Result(property = "roleId" , column = "role_id"),
            @Result(property = "carId",column = "car_id")
    })
    //查询员工表
    @Select("select * from employee e LEFT JOIN authority a on a.id = e.role_id where a.id = 2 or a.id = 3")
    List<Emp> selectAll();


    @Results({
            @Result(property = "roleId" , column = "role_id"),
            @Result(property = "carId",column = "car_id")
    })
    //更具id查询员工详细信息
    @Select("select * from employee e LEFT JOIN authority a  on a.id = e.role_id where a.id = 2 or a.id = 3 and e.id = #{id}")
    Emp selectForNumbering(String id);




}
