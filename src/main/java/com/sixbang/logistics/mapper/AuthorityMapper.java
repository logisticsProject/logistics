package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.Authority;
import java.util.List;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Authority record);

    Authority selectByPrimaryKey(Long id);

    List<Authority> selectAll();

    int updateByPrimaryKey(Authority record);
}