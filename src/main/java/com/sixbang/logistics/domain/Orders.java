package com.sixbang.logistics.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
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

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sendorId=").append(sendorId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", stateId=").append(stateId);
        sb.append(", ispayed=").append(ispayed);
        sb.append(", payWay=").append(payWay);
        sb.append(", payment=").append(payment);
        sb.append(", weight=").append(weight);
        sb.append(", startTime=").append(startTime);
        sb.append(", forwardArriveTime=").append(forwardArriveTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", transferStaffId1=").append(transferStaffId1);
        sb.append(", transferStaffId2=").append(transferStaffId2);
        sb.append(", transferStaffId3=").append(transferStaffId3);
        sb.append(", driverId=").append(driverId);
        sb.append(", pickerId=").append(pickerId);
        sb.append(", couierId=").append(couierId);
        sb.append(", remark=").append(remark);
        sb.append(", by1=").append(by1);
        sb.append(", by2=").append(by2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}