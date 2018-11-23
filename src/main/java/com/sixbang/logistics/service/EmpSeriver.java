package com.sixbang.logistics.service;


import com.sixbang.logistics.domain.Emp;
import com.sixbang.logistics.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpSeriver {

    @Autowired
    private EmpMapper empMapper;


    /**
     * 查询所有员工
     * @return
     */
    public List<Emp> selectAll(){
        return empMapper.selectAll();
    }

    /**
     * 根据员工编号查询职员
     * @param id
     * @return
     */
    public Emp selectForNumber(String id){
        return empMapper.selectForNumbering(id);
    }



}
