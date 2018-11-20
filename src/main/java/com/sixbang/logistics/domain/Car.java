package com.sixbang.logistics.domain;

import java.io.Serializable;

public class Car implements Serializable {
    private Integer id;

    private String numberring;

    private String licensePlate;

    private String routeId;

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

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate == null ? null : licensePlate.trim();
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", numberring=").append(numberring);
        sb.append(", licensePlate=").append(licensePlate);
        sb.append(", routeId=").append(routeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}