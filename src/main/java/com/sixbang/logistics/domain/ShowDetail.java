package com.sixbang.logistics.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 接货单填写页面  司机界面
 */
public class ShowDetail implements Serializable{

    //发货客户编号
    private Integer sid;
    //发货客户
    private String sname;
    //发货客户的电话
    private String sphone;
    //发货客户的地址
    private String saddress;
    //收货人编号
    private Integer rid;
    //收货人姓名
    private String rname;
    //收货人电话
    private String rphone;
    //收货人地址
    private String raddress;

    private Integer id;

    private Integer sendorId;

    private Integer receiverId;

    private Integer stateId;
    //是否已经支付
    private Integer ispayed;
    //支付方式
    private String payWay;
    //支付多少钱
    private Double payment;
//重量
    private Double weight;
//发货时间
    private Date startTime;
//实际时间
    private Date forwardArriveTime;
//收货时间
    private Date endTime;
//司机ID
    private Integer driverId;

    private Integer pickerId;

    private Integer couierId;

    private String remark;

    private Integer by1;

    private String by2;


}
