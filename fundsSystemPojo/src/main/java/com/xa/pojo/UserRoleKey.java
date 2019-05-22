package com.xa.pojo;

import java.io.Serializable;
import java.util.List;

public class UserRoleKey implements Serializable {
    private Integer uid;

    private Integer rid;

    private List<Roles> rll;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "UserRoleKey{" +
                "uid=" + uid +
                ", rid=" + rid +
                ", rll=" + rll +
                '}';
    }
}