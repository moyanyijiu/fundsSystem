package com.xa.pojo;

import java.io.Serializable;

public class Trainingtopics implements Serializable {
    private Integer tid;

    private String company;

    private String topics;

    private String courseware;

    private String turl;

    private String content;

    private Integer tdelete;

    private String redundancythr;

    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics == null ? null : topics.trim();
    }

    public String getCourseware() {
        return courseware;
    }

    public void setCourseware(String courseware) {
        this.courseware = courseware == null ? null : courseware.trim();
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl == null ? null : turl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getTdelete() {
        return tdelete;
    }

    public void setTdelete(Integer tdelete) {
        this.tdelete = tdelete;
    }

    public String getRedundancythr() {
        return redundancythr;
    }

    public void setRedundancythr(String redundancythr) {
        this.redundancythr = redundancythr == null ? null : redundancythr.trim();
    }
}