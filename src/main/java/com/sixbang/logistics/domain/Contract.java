package com.sixbang.logistics.domain;

public class Contract {
    private Integer cId;

    private String numbering;

    private String state;

    private String orderId;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering == null ? null : numbering.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}