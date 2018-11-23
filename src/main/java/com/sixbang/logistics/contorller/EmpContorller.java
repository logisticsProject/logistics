package com.sixbang.logistics.contorller;

import com.sixbang.logistics.domain.CarEmp;
import com.sixbang.logistics.domain.Emp;
import com.sixbang.logistics.service.CarEmpService;
import com.sixbang.logistics.service.EmpSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CarEmp")
public class EmpContorller {

    @Autowired
    private EmpSeriver empSeriver;
    @Autowired
    private CarEmpService carEmpService;

    @RequestMapping(value = "selEmpAll" , method = RequestMethod.GET)
    public ResponseEntity<?> selectAll(){
        List<Emp> empList = empSeriver.selectAll();
        if (empList != null){
            return new ResponseEntity<>(empList, HttpStatus.OK);
        }
         return new ResponseEntity<>("",HttpStatus.OK);
    }

    /**
     * 前端传入 角色类型 和 id
     * 3为司机 2为职员
     * @param id  角色id
     * @param roleId   角色类型
     * @return
     */
    @RequestMapping(value = "selfornum" ,method = RequestMethod.POST)
    public ResponseEntity<?> selectForNumber(@RequestParam("id")String id,
            @RequestParam("roleId")String roleId){
        //3为司机 2为职员
        if (roleId.equals("3")){
            CarEmp carEmp = carEmpService.selectForNumber(id);
            if (carEmp!=null){
                return new ResponseEntity<>(carEmp,HttpStatus.OK);
            }else {
                return new ResponseEntity<>("未查询结果",HttpStatus.OK);
            }
        }else if (roleId.equals("2")){
        Emp emp = empSeriver.selectForNumber(id);
            if (emp!=null){
                return new ResponseEntity<>(emp,HttpStatus.OK);
            }else {
                return new ResponseEntity<>("未查询结果",HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("查询有误",HttpStatus.OK);
    }

}
