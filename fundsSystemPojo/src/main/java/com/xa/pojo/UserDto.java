package com.xa.pojo;

import java.io.Serializable;

public class UserDto implements Serializable {
    private int uid;
    private String username;
    private String upassword;
    private String identitycardnumber;
    private String cellphonenumber;
    private String emile;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getIdentitycardnumber() {
        return identitycardnumber;
    }

    public void setIdentitycardnumber(String identitycardnumber) {
        this.identitycardnumber = identitycardnumber;
    }

    public String getCellphonenumber() {
        return cellphonenumber;
    }

    public void setCellphonenumber(String cellphonenumber) {
        this.cellphonenumber = cellphonenumber;
    }

    public String getEmile() {
        return emile;
    }

    public void setEmile(String emile) {
        this.emile = emile;
    }
}
