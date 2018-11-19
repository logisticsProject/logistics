package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Receiptorder;
import com.sixbang.logistics.domain.ReceiptorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiptorderMapper {
    long countByExample(ReceiptorderExample example);

    int deleteByExample(ReceiptorderExample example);

    int deleteByPrimaryKey(String rcId);

    int insert(Receiptorder record);

    int insertSelective(Receiptorder record);

    List<Receiptorder> selectByExample(ReceiptorderExample example);

    Receiptorder selectByPrimaryKey(String rcId);

    int updateByExampleSelective(@Param("record") Receiptorder record, @Param("example") ReceiptorderExample example);

    int updateByExample(@Param("record") Receiptorder record, @Param("example") ReceiptorderExample example);

    int updateByPrimaryKeySelective(Receiptorder record);

    int updateByPrimaryKey(Receiptorder record);
}