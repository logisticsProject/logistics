package com.sixbang.logistics.domain;

import java.io.Serializable;

public class ReceiptOrder implements Serializable {
    private String rcId;

    private String state;

    private String contractId;

    private static final long serialVersionUID = 1L;

    public String getRcId() {
        return rcId;
    }

    public void setRcId(String rcId) {
        this.rcId = rcId == null ? null : rcId.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rcId=").append(rcId);
        sb.append(", state=").append(state);
        sb.append(", contractId=").append(contractId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}