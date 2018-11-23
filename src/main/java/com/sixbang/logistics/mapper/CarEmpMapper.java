package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.CarEmp;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 关于司机模块编辑
 */
public interface CarEmpMapper {

    @Results({
            @Result(property = "roleId" , column = "role_id"),
            @Result(property = "carId",column = "car_id")
    })
    @Select("select * from employee e  LEFT JOIN authority a on a.id = e.role_id LEFT JOIN car c on e.car_id = c.id LEFT JOIN path P ON P.id = C.route_id where a.id = 3")
    List<CarEmp> selectAll();

    @Results({
            @Result(property = "roleId" , column = "role_id"),
            @Result(property = "carId",column = "car_id")
    })
    @Select("select * from employee e  LEFT JOIN authority a on a.id = e.role_id LEFT JOIN car c on e.car_id = c.id LEFT JOIN path P ON P.id = C.route_id where a.id = 3 and e.id = #{id}")
    CarEmp selectForNumber(String id);

}
