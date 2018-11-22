package com.sixbang.logistics.mapper;

import com.sixbang.logistics.domain.ShowDetail;
import org.apache.ibatis.annotations.*;

public interface ShowDetailMapper {


    @Results/*({
            @Result(property = "payWay",column = "pay_way"),
            @Result
    })*/
    @Select("select * from orders o LEFT JOIN recipient r on o.receiver_id = r.rid LEFT JOIN sender s on o.sendor_id = s.sid " +
            "LEFT JOIN employee e on o.driver_id = e.id WHERE o.numbering = #{numbering}")
    ShowDetail selectForNum(String numbering);

    @Update("update orders set state_id = # {stateId},isPayed = #{isPayed} where numbering = #{numbering}")
    int updForNumber(ShowDetail showDetail);

    @Insert("insert into receipt_order(numbering,state,contract_id) value (#{numbering},#{state},#{contractId})")
    int addReceiptOrder(ShowDetail showDetail);

}
