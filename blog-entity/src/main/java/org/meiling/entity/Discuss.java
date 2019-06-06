package org.meiling.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Discuss {
    private String dId;

    private String eId;

    private String dName;

    private String dContent;

    private Date dTime;

    private String dState;

    private Long dLevel;

    private String dPid;
    
    private List<Discuss> childDiscuss = new ArrayList<Discuss>();

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId == null ? null : eId.trim();
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdContent() {
        return dContent;
    }

    public void setdContent(String dContent) {
        this.dContent = dContent == null ? null : dContent.trim();
    }

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date dTime) {
        this.dTime = dTime;
    }

    public String getdState() {
        return dState;
    }

    public void setdState(String dState) {
        this.dState = dState == null ? null : dState.trim();
    }

    public Long getdLevel() {
        return dLevel;
    }

    public void setdLevel(Long dLevel) {
        this.dLevel = dLevel;
    }

    public String getdPid() {
        return dPid;
    }

    public void setdPid(String dPid) {
        this.dPid = dPid == null ? null : dPid.trim();
    }

	public List<Discuss> getChildDiscuss() {
		return childDiscuss;
	}

	public void setChildDiscuss(List<Discuss> childDiscuss) {
		this.childDiscuss = childDiscuss;
	}
    
    
}