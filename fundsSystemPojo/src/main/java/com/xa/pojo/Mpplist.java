package com.xa.pojo;

import java.io.Serializable;

public class Mpplist implements Serializable {
    private Integer mpPid;

    private Integer pid;

    private Integer mpid;

    private String number;

    private Integer mppdel;

    private String redundancytwo;

    private String redundancythr;

    private static final long serialVersionUID = 1L;

    public Integer getMpPid() {
        return mpPid;
    }

    public void setMpPid(Integer mpPid) {
        this.mpPid = mpPid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getMpid() {
        return mpid;
    }

    public void setMpid(Integer mpid) {
        this.mpid = mpid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getMppdel() {
        return mppdel;
    }

    public void setMppdel(Integer mppdel) {
        this.mppdel = mppdel;
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
}