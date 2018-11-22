package com.sixbang.logistics.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 接货单填写页面  司机合同
 */
public class ShowDetail implements Serializable {

    private static final long serialVersionUID = -4092446816372146717L;


    private String Msg;

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

    private Integer pathId;

    private String numbering;

    private Integer id;

    private Integer sendorId;

    private Integer receiverId;

    private Integer stateId;

    private Integer ispayed;

    private String payWay;

    private Double payment;

    private Double weight;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GTM+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GTM+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date fillDate;
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GTM+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date forwardArriveTime;
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GTM+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date endTime;

    private Integer driverId;

    private Double receivablesRate;

    private Double receivables;

    private Double subtraction;

    private Integer staffId;

    private Double deliveryFee;

    private String remark;

    private Double insurance;

    private Integer by1;

    private String by2;

    private Integer amount;

    private Double volume;

    private Double goodsValue;
    //回执单
    //订单表 装态
    private String state;
    //回执单  订单
    private String contractId;

    @Override
    public String toString() {
        return "ShowDetail{" + "Msg='" + Msg + '\'' + ", sid=" + sid + ", sname='" + sname + '\'' + ", sphone='" + sphone + '\'' + ", saddress='" + saddress + '\'' + ", rid=" + rid + ", rname='" + rname + '\'' + ", rphone='" + rphone + '\'' + ", raddress='" + raddress + '\'' + ", pathId=" + pathId + ", numbering='" + numbering + '\'' + ", id=" + id + ", sendorId=" + sendorId + ", receiverId=" + receiverId + ", stateId=" + stateId + ", ispayed=" + ispayed + ", payWay='" + payWay + '\'' + ", payment=" + payment + ", weight=" + weight + ", startTime=" + startTime + ", fillDate=" + fillDate + ", forwardArriveTime=" + forwardArriveTime + ", endTime=" + endTime + ", driverId=" + driverId + ", receivablesRate=" + receivablesRate + ", receivables=" + receivables + ", subtraction=" + subtraction + ", staffId=" + staffId + ", deliveryFee=" + deliveryFee + ", remark='" + remark + '\'' + ", insurance=" + insurance + ", by1=" + by1 + ", by2='" + by2 + '\'' + ", amount=" + amount + ", volume=" + volume + ", goodsValue=" + goodsValue + '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRphone() {
        return rphone;
    }

    public void setRphone(String rphone) {
        this.rphone = rphone;
    }

    public String getRaddress() {
        return raddress;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSendorId() {
        return sendorId;
    }

    public void setSendorId(Integer sendorId) {
        this.sendorId = sendorId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getIspayed() {
        return ispayed;
    }

    public void setIspayed(Integer ispayed) {
        this.ispayed = ispayed;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFillDate() {
        return fillDate;
    }

    public void setFillDate(Date fillDate) {
        this.fillDate = fillDate;
    }

    public Date getForwardArriveTime() {
        return forwardArriveTime;
    }

    public void setForwardArriveTime(Date forwardArriveTime) {
        this.forwardArriveTime = forwardArriveTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Double getReceivablesRate() {
        return receivablesRate;
    }

    public void setReceivablesRate(Double receivablesRate) {
        this.receivablesRate = receivablesRate;
    }

    public Double getReceivables() {
        return receivables;
    }

    public void setReceivables(Double receivables) {
        this.receivables = receivables;
    }

    public Double getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(Double subtraction) {
        this.subtraction = subtraction;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Integer getBy1() {
        return by1;
    }

    public void setBy1(Integer by1) {
        this.by1 = by1;
    }

    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(Double goodsValue) {
        this.goodsValue = goodsValue;
    }
}