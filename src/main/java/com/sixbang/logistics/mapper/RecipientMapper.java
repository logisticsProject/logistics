package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Recipient;
import com.sixbang.logistics.domain.RecipientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecipientMapper {
    long countByExample(RecipientExample example);

    int deleteByExample(RecipientExample example);

    int insert(Recipient record);

    int insertSelective(Recipient record);

    List<Recipient> selectByExample(RecipientExample example);

    int updateByExampleSelective(@Param("record") Recipient record, @Param("example") RecipientExample example);

    int updateByExample(@Param("record") Recipient record, @Param("example") RecipientExample example);
}