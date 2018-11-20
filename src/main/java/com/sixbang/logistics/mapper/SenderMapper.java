package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Sender;
import com.sixbang.logistics.domain.SenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SenderMapper {
    long countByExample(SenderExample example);

    int deleteByExample(SenderExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Sender record);

    int insertSelective(Sender record);

    List<Sender> selectByExample(SenderExample example);

    Sender selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Sender record, @Param("example") SenderExample example);

    int updateByExample(@Param("record") Sender record, @Param("example") SenderExample example);

    int updateByPrimaryKeySelective(Sender record);

    int updateByPrimaryKey(Sender record);
}