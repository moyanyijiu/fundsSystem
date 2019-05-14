package com.xa.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uid;

    private String username;

    private String upassword;

    private String status;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}