package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Waybills;
import java.util.List;

public interface WaybillsMapper {
    int deleteByPrimaryKey(Integer wId);

    int insert(Waybills record);

    Waybills selectByPrimaryKey(Integer wId);

    List<Waybills> selectAll();

    int updateByPrimaryKey(Waybills record);
}