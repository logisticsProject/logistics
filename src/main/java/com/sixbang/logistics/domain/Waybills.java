package com.sixbang.logistics.domain;

public class Waybills {
    private Integer wId;

    private String state;

    private String byte1;

    private Integer byte2;

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
}