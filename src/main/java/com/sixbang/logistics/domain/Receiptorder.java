package com.sixbang.logistics.domain;

public class Receiptorder {
    private Integer rcId;

    private String numbering;

    private String state;

    private String contractId;

    public Integer getRcId() {
        return rcId;
    }

    public void setRcId(Integer rcId) {
        this.rcId = rcId;
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

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }
}