package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Recipient;
import java.util.List;

public interface RecipientMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Recipient record);

    Recipient selectByPrimaryKey(Integer rid);

    List<Recipient> selectAll();

    int updateByPrimaryKey(Recipient record);
}