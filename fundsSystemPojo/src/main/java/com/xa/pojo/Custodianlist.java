package com.xa.pojo;

import java.io.Serializable;

public class Custodianlist implements Serializable {
    private Integer mpid;

    private String position;

    private String synopsis;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private Integer cusdel;

    private static final long serialVersionUID = 1L;

    public Integer getMpid() {
        return mpid;
    }

    public void setMpid(Integer mpid) {
        this.mpid = mpid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
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

    public Integer getCusdel() {
        return cusdel;
    }

    public void setCusdel(Integer cusdel) {
        this.cusdel = cusdel;
    }

    @Override
    public String toString() {
        return "Custodianlist{" +
                "mpid=" + mpid +
                ", position='" + position + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", redundancyone='" + redundancyone + '\'' +
                ", redundancytwo='" + redundancytwo + '\'' +
                ", redundancythr='" + redundancythr + '\'' +
                ", cusdel=" + cusdel +
                '}';
    }
}