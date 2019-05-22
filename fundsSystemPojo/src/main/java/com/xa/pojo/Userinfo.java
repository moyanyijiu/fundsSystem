package com.xa.pojo;

import java.io.Serializable;

public class Userinfo implements Serializable {
    private Integer uiid;

    private Integer uid;

    private String preferredcontact;

    private String contacttime;

    private Integer isonethousand;

    private Integer capid;

    private String vocationalstatus;

    private String fortheenterprise;

    private String companytype;

    private String revenue;

    private String educationalstatus;

    private Integer status;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private static final long serialVersionUID = 1L;

    public Integer getUiid() {
        return uiid;
    }

    public void setUiid(Integer uiid) {
        this.uiid = uiid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPreferredcontact() {
        return preferredcontact;
    }

    public void setPreferredcontact(String preferredcontact) {
        this.preferredcontact = preferredcontact == null ? null : preferredcontact.trim();
    }

    public String getContacttime() {
        return contacttime;
    }

    public void setContacttime(String contacttime) {
        this.contacttime = contacttime == null ? null : contacttime.trim();
    }

    public Integer getIsonethousand() {
        return isonethousand;
    }

    public void setIsonethousand(Integer isonethousand) {
        this.isonethousand = isonethousand;
    }

    public Integer getCapid() {
        return capid;
    }

    public void setCapid(Integer capid) {
        this.capid = capid;
    }

    public String getVocationalstatus() {
        return vocationalstatus;
    }

    public void setVocationalstatus(String vocationalstatus) {
        this.vocationalstatus = vocationalstatus == null ? null : vocationalstatus.trim();
    }

    public String getFortheenterprise() {
        return fortheenterprise;
    }

    public void setFortheenterprise(String fortheenterprise) {
        this.fortheenterprise = fortheenterprise == null ? null : fortheenterprise.trim();
    }

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype == null ? null : companytype.trim();
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue == null ? null : revenue.trim();
    }

    public String getEducationalstatus() {
        return educationalstatus;
    }

    public void setEducationalstatus(String educationalstatus) {
        this.educationalstatus = educationalstatus == null ? null : educationalstatus.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "Userinfo{" +
                "uiid=" + uiid +
                ", uid=" + uid +
                ", preferredcontact='" + preferredcontact + '\'' +
                ", contacttime='" + contacttime + '\'' +
                ", isonethousand=" + isonethousand +
                ", capid=" + capid +
                ", vocationalstatus='" + vocationalstatus + '\'' +
                ", fortheenterprise='" + fortheenterprise + '\'' +
                ", companytype='" + companytype + '\'' +
                ", revenue='" + revenue + '\'' +
                ", educationalstatus='" + educationalstatus + '\'' +
                ", status=" + status +
                ", redundancyone='" + redundancyone + '\'' +
                ", redundancytwo='" + redundancytwo + '\'' +
                ", redundancythr='" + redundancythr + '\'' +
                '}';
    }
}