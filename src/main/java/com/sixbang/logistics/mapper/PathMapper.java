package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Path;
import com.sixbang.logistics.domain.PathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathMapper {
    long countByExample(PathExample example);

    int deleteByExample(PathExample example);

    int insert(Path record);

    int insertSelective(Path record);

    List<Path> selectByExample(PathExample example);

    int updateByExampleSelective(@Param("record") Path record, @Param("example") PathExample example);

    int updateByExample(@Param("record") Path record, @Param("example") PathExample example);
}