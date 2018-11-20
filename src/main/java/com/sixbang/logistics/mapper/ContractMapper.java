package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Contract;
import com.sixbang.logistics.domain.ContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractMapper {
    long countByExample(ContractExample example);

    int deleteByExample(ContractExample example);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);
}