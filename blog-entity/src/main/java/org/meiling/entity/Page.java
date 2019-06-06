package org.meiling.entity;

import java.util.Date;

public class Page {
    private String pId;

    private String pName;

    private String pPath;

    private Date pCreatetime;

    private String pState;

    private String pIssay;

    private String pContent;
    
    public static final String PAGE_STATE_SEND = "0";
    public static final String PAGE_STATE_ROUGH = "1";

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpPath() {
        return pPath;
    }

    public void setpPath(String pPath) {
        this.pPath = pPath == null ? null : pPath.trim();
    }

    public Date getpCreatetime() {
        return pCreatetime;
    }

    public void setpCreatetime(Date pCreatetime) {
        this.pCreatetime = pCreatetime;
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState == null ? null : pState.trim();
    }

    public String getpIssay() {
        return pIssay;
    }

    public void setpIssay(String pIssay) {
        this.pIssay = pIssay == null ? null : pIssay.trim();
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent == null ? null : pContent.trim();
    }
}