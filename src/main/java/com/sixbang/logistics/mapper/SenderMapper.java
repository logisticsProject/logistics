package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Sender;
import com.sixbang.logistics.domain.SenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SenderMapper {
    long countByExample(SenderExample example);

    int deleteByExample(SenderExample example);

    int insert(Sender record);

    int insertSelective(Sender record);

    List<Sender> selectByExample(SenderExample example);

    int updateByExampleSelective(@Param("record") Sender record, @Param("example") SenderExample example);

    int updateByExample(@Param("record") Sender record, @Param("example") SenderExample example);
}