package com.xa.pojo;

import java.io.Serializable;

public class Newslist implements Serializable {
    private Integer nid;

    private String content;

    private String nstaus;

    private String serve;

    private String ntime;

    private Integer ndelete;

    private String redundancytwo;

    private String redundancythr;

    private static final long serialVersionUID = 1L;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getNstaus() {
        return nstaus;
    }

    public void setNstaus(String nstaus) {
        this.nstaus = nstaus == null ? null : nstaus.trim();
    }

    public String getServe() {
        return serve;
    }

    public void setServe(String serve) {
        this.serve = serve == null ? null : serve.trim();
    }

    public String getNtime() {
        return ntime;
    }

    public void setNtime(String ntime) {
        this.ntime = ntime == null ? null : ntime.trim();
    }

    public Integer getNdelete() {
        return ndelete;
    }

    public void setNdelete(Integer ndelete) {
        this.ndelete = ndelete;
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