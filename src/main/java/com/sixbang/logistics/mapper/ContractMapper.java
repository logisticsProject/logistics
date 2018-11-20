package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Contract;
import java.util.List;

public interface ContractMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Contract record);

    Contract selectByPrimaryKey(Integer cId);

    List<Contract> selectAll();

    int updateByPrimaryKey(Contract record);
}