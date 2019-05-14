package com.xa.pojo;

import java.io.Serializable;

public class Orderlist implements Serializable {
    private Integer oid;

    private Integer pid;

    private String ordertime;

    private String expectedyield;

    private String reservationamount;

    private String status;

    private String appointmentdate;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private static final long serialVersionUID = 1L;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getExpectedyield() {
        return expectedyield;
    }

    public void setExpectedyield(String expectedyield) {
        this.expectedyield = expectedyield == null ? null : expectedyield.trim();
    }

    public String getReservationamount() {
        return reservationamount;
    }

    public void setReservationamount(String reservationamount) {
        this.reservationamount = reservationamount == null ? null : reservationamount.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(String appointmentdate) {
        this.appointmentdate = appointmentdate == null ? null : appointmentdate.trim();
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