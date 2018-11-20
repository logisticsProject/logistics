package com.sixbang.logistics.domain;

public class Car {
    private String numberring;

    private Integer id;

    private String licensePlate;

    private String routeId;

    public String getNumberring() {
        return numberring;
    }

    public void setNumberring(String numberring) {
        this.numberring = numberring == null ? null : numberring.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}