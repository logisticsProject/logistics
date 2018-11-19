package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Path;
import java.util.List;

public interface PathMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Path record);

    Path selectByPrimaryKey(Integer id);

    List<Path> selectAll();

    int updateByPrimaryKey(Path record);
}