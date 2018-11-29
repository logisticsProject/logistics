package com.sixbang.logistics.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private Integer id;

    private String numberring;

    private Integer sendorId;

    private Integer receiverId;

    private Integer stateId;

    private Integer ispayed;

    private String payWay;

    private Double payment;

    private Double weight;

    private Date startTime;

    private Date fillDate;

    private Date forwardArriveTime;

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

    private Integer amouet;

    private Double volume;

    private Double goodsValue;

    private Integer pathId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberring() {
        return numberring;
    }

    public void setNumberring(String numberring) {
        this.numberring = numberring == null ? null : numberring.trim();
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
        this.remark = remark == null ? null : remark.trim();
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
        this.by2 = by2 == null ? null : by2.trim();
    }

    public Integer getAmouet() {
        return amouet;
    }

    public void setAmouet(Integer amouet) {
        this.amouet = amouet;
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

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", numberring=").append(numberring);
        sb.append(", sendorId=").append(sendorId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", stateId=").append(stateId);
        sb.append(", ispayed=").append(ispayed);
        sb.append(", payWay=").append(payWay);
        sb.append(", payment=").append(payment);
        sb.append(", weight=").append(weight);
        sb.append(", startTime=").append(startTime);
        sb.append(", fillDate=").append(fillDate);
        sb.append(", forwardArriveTime=").append(forwardArriveTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", driverId=").append(driverId);
        sb.append(", receivablesRate=").append(receivablesRate);
        sb.append(", receivables=").append(receivables);
        sb.append(", subtraction=").append(subtraction);
        sb.append(", staffId=").append(staffId);
        sb.append(", deliveryFee=").append(deliveryFee);
        sb.append(", remark=").append(remark);
        sb.append(", insurance=").append(insurance);
        sb.append(", by1=").append(by1);
        sb.append(", by2=").append(by2);
        sb.append(", amouet=").append(amouet);
        sb.append(", volume=").append(volume);
        sb.append(", goodsValue=").append(goodsValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}