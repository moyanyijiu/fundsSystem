package com.xa.pojo;

import java.io.Serializable;

public class Verificationtable implements Serializable {
    private Integer vid;

    private String name;

    private String identitycardnumber;

    private String identitycardphoto;

    private Integer authenticationstatus;

    private String cellphonenumber;

    private Integer phonestaus;

    private String emile;

    private Integer emilestaus;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private Integer verdel;

    private static final long serialVersionUID = 1L;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentitycardnumber() {
        return identitycardnumber;
    }

    public void setIdentitycardnumber(String identitycardnumber) {
        this.identitycardnumber = identitycardnumber == null ? null : identitycardnumber.trim();
    }

    public String getIdentitycardphoto() {
        return identitycardphoto;
    }

    public void setIdentitycardphoto(String identitycardphoto) {
        this.identitycardphoto = identitycardphoto == null ? null : identitycardphoto.trim();
    }

    public Integer getAuthenticationstatus() {
        return authenticationstatus;
    }

    public void setAuthenticationstatus(Integer authenticationstatus) {
        this.authenticationstatus = authenticationstatus;
    }

    public String getCellphonenumber() {
        return cellphonenumber;
    }

    public void setCellphonenumber(String cellphonenumber) {
        this.cellphonenumber = cellphonenumber == null ? null : cellphonenumber.trim();
    }

    public Integer getPhonestaus() {
        return phonestaus;
    }

    public void setPhonestaus(Integer phonestaus) {
        this.phonestaus = phonestaus;
    }

    public String getEmile() {
        return emile;
    }

    public void setEmile(String emile) {
        this.emile = emile == null ? null : emile.trim();
    }

    public Integer getEmilestaus() {
        return emilestaus;
    }

    public void setEmilestaus(Integer emilestaus) {
        this.emilestaus = emilestaus;
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

    public Integer getVerdel() {
        return verdel;
    }

    public void setVerdel(Integer verdel) {
        this.verdel = verdel;
    }
}