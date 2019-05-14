package com.xa.pojo;

import java.io.Serializable;

public class Collectlist implements Serializable {
    private Integer cid;

    private Integer uid;

    private Integer productsid;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private Integer coldel;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getProductsid() {
        return productsid;
    }

    public void setProductsid(Integer productsid) {
        this.productsid = productsid;
    }

    public String getRedundancyone() {
        return redundancyone;
    }

    public void setRedundancyone(String redundancyone) {
        this.redundancyone = redundancyone == null ? null : redundancyone.trim();
    }

    public String getRedundancytwo() {
        return redundancytwo;
    }

    public void setRedundancytwo(String redundancytwo) {
        this.redundancytwo = redundancytwo == null ? null : redundancytwo.trim();
    }

    public String getRedundancythr() {
        return redundancythr;
    }

    public void setRedundancythr(String redundancythr) {
        this.redundancythr = redundancythr == null ? null : redundancythr.trim();
    }

    public Integer getColdel() {
        return coldel;
    }

    public void setColdel(Integer coldel) {
        this.coldel = coldel;
    }
}