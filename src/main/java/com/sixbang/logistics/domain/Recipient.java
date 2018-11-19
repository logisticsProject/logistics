package com.sixbang.logistics.domain;

import java.io.Serializable;

public class Recipient implements Serializable {
    private Integer rid;

    private String rname;

    private String rphone;

    private String raddress;

    private static final long serialVersionUID = 1L;

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
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRphone() {
        return rphone;
    }

    public void setRphone(String rphone) {
        this.rphone = rphone == null ? null : rphone.trim();
    }

    public String getRaddress() {
        return raddress;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress == null ? null : raddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", rname=").append(rname);
        sb.append(", rphone=").append(rphone);
        sb.append(", raddress=").append(raddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}