package com.sixbang.logistics.domain;

public class Authority {
    private Long id;

    private String name;

    private String descr;

    private String by1;

    private Long by2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1 == null ? null : by1.trim();
    }

    public Long getBy2() {
        return by2;
    }

    public void setBy2(Long by2) {
        this.by2 = by2;
    }
}