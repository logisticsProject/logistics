package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.ReceiptOrder;
import java.util.List;

public interface ReceiptOrderMapper {
    int deleteByPrimaryKey(String rcId);

    int insert(ReceiptOrder record);

    ReceiptOrder selectByPrimaryKey(String rcId);

    List<ReceiptOrder> selectAll();

    int updateByPrimaryKey(ReceiptOrder record);
}