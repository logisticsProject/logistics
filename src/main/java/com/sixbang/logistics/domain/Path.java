package com.sixbang.logistics.domain;

public class Path {
    private Integer id;

    private String startplace;

    private String endplace;

    private Double priceperunit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartplace() {
        return startplace;
    }

    public void setStartplace(String startplace) {
        this.startplace = startplace == null ? null : startplace.trim();
    }

    public String getEndplace() {
        return endplace;
    }

    public void setEndplace(String endplace) {
        this.endplace = endplace == null ? null : endplace.trim();
    }

    public Double getPriceperunit() {
        return priceperunit;
    }

    public void setPriceperunit(Double priceperunit) {
        this.priceperunit = priceperunit;
    }
}