package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Contract;
import java.util.List;

public interface ContractMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Contract record);

    Contract selectByPrimaryKey(String cId);

    List<Contract> selectAll();

    int updateByPrimaryKey(Contract record);
}