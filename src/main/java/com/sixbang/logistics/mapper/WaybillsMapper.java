package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Waybills;
import com.sixbang.logistics.domain.WaybillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaybillsMapper {
    long countByExample(WaybillsExample example);

    int deleteByExample(WaybillsExample example);

    int deleteByPrimaryKey(Integer wId);

    int insert(Waybills record);

    int insertSelective(Waybills record);

    List<Waybills> selectByExample(WaybillsExample example);

    Waybills selectByPrimaryKey(Integer wId);

    int updateByExampleSelective(@Param("record") Waybills record, @Param("example") WaybillsExample example);

    int updateByExample(@Param("record") Waybills record, @Param("example") WaybillsExample example);

    int updateByPrimaryKeySelective(Waybills record);

    int updateByPrimaryKey(Waybills record);
}