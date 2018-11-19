package com.sixbang.logistics.domain;

import java.util.Date;

public class Orders {
    private Integer id;

    private Integer sendorId;

    private Integer receiverId;

    private Integer stateId;

    private Integer ispayed;

    private String payWay;

    private Double payment;

    private Double weight;

    private Date startTime;

    private Date forwardArriveTime;

    private Date endTime;

    private Integer transferStaffId1;

    private Integer transferStaffId2;

    private Integer transferStaffId3;

    private Integer driverId;

    private Integer pickerId;

    private Integer couierId;

    private String remark;

    private Integer by1;

    private String by2;

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
        this.payWay = payWay == null ? null : payWay.trim();
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

    public Integer getTransferStaffId1() {
        return transferStaffId1;
    }

    public void setTransferStaffId1(Integer transferStaffId1) {
        this.transferStaffId1 = transferStaffId1;
    }

    public Integer getTransferStaffId2() {
        return transferStaffId2;
    }

    public void setTransferStaffId2(Integer transferStaffId2) {
        this.transferStaffId2 = transferStaffId2;
    }

    public Integer getTransferStaffId3() {
        return transferStaffId3;
    }

    public void setTransferStaffId3(Integer transferStaffId3) {
        this.transferStaffId3 = transferStaffId3;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getPickerId() {
        return pickerId;
    }

    public void setPickerId(Integer pickerId) {
        this.pickerId = pickerId;
    }

    public Integer getCouierId() {
        return couierId;
    }

    public void setCouierId(Integer couierId) {
        this.couierId = couierId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        this.by2 = by2 == null ? null : by2.trim();
    }
}