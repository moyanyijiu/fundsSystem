package com.xa.pojo;

import java.io.Serializable;
import java.util.List;

public class Users implements Serializable {
    private Integer uid;

    private String uname;

    private String upass;

    private Integer age;

    private String gender;

    private String udescr;

    private List<Roles> listRol;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUdescr() {
        return udescr;
    }

    public void setUdescr(String udescr) {
        this.udescr = udescr;
    }

    public List<Roles> getListRol() {
        return listRol;
    }

    public void setListRol(List<Roles> listRol) {
        this.listRol = listRol;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", udescr='" + udescr + '\'' +
                ", listRol=" + listRol +
                '}';
    }
}