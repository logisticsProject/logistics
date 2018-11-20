package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Car;
import java.util.List;

public interface CarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Car record);

    Car selectByPrimaryKey(Integer id);

    List<Car> selectAll();

    int updateByPrimaryKey(Car record);
}