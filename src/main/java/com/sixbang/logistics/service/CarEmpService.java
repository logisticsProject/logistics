package com.sixbang.logistics.service;

import com.sixbang.logistics.domain.CarEmp;
import com.sixbang.logistics.mapper.CarEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarEmpService {

    @Autowired
    private CarEmpMapper carEmpMapper;

    /**
     * 查询所有的员工集合
     * @return
     */
    public List<CarEmp> selectAll(){
        return carEmpMapper.selectAll();
    }

    /**
     * 根据id 查询员工详细资料
     * @param id
     * @return
     */
    public CarEmp selectForNumber(String id){
        return carEmpMapper.selectForNumber(id);
    }

}
