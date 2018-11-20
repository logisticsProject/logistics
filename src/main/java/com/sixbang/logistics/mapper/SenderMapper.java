package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Sender;
import java.util.List;

public interface SenderMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Sender record);

    Sender selectByPrimaryKey(Integer sid);

    List<Sender> selectAll();

    int updateByPrimaryKey(Sender record);
}