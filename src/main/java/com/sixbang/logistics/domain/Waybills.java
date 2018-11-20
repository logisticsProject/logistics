package com.sixbang.logistics.domain;

import java.io.Serializable;

public class Waybills implements Serializable {
    private Integer wId;

    private String state;

    private String byte1;

    private Integer byte2;

    private static final long serialVersionUID = 1L;

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getByte1() {
        return byte1;
    }

    public void setByte1(String byte1) {
        this.byte1 = byte1 == null ? null : byte1.trim();
    }

    public Integer getByte2() {
        return byte2;
    }

    public void setByte2(Integer byte2) {
        this.byte2 = byte2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wId=").append(wId);
        sb.append(", state=").append(state);
        sb.append(", byte1=").append(byte1);
        sb.append(", byte2=").append(byte2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}