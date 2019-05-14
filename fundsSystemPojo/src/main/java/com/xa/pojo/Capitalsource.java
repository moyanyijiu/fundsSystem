package com.xa.pojo;

import java.io.Serializable;

public class Capitalsource implements Serializable {
    private Integer capid;

    private Integer salary;

    private Integer thecompanyaprofit;

    private Integer thefamilyproperty;

    private Integer investmentincome;

    private Integer otherz;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private Integer capdel;

    private static final long serialVersionUID = 1L;

    public Integer getCapid() {
        return capid;
    }

    public void setCapid(Integer capid) {
        this.capid = capid;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getThecompanyaprofit() {
        return thecompanyaprofit;
    }

    public void setThecompanyaprofit(Integer thecompanyaprofit) {
        this.thecompanyaprofit = thecompanyaprofit;
    }

    public Integer getThefamilyproperty() {
        return thefamilyproperty;
    }

    public void setThefamilyproperty(Integer thefamilyproperty) {
        this.thefamilyproperty = thefamilyproperty;
    }

    public Integer getInvestmentincome() {
        return investmentincome;
    }

    public void setInvestmentincome(Integer investmentincome) {
        this.investmentincome = investmentincome;
    }

    public Integer getOtherz() {
        return otherz;
    }

    public void setOtherz(Integer otherz) {
        this.otherz = otherz;
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

    public Integer getCapdel() {
        return capdel;
    }

    public void setCapdel(Integer capdel) {
        this.capdel = capdel;
    }
}