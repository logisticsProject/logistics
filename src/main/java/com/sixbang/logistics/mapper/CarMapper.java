package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Car;
import java.util.List;

public interface CarMapper {

    long countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Car record);

    Car selectByPrimaryKey(Integer id);

    List<Car> selectAll();

    int updateByPrimaryKey(Car record);
}