package org.meiling.entity;

import java.util.Date;

public class Essay {
    private String eId;

    private String cId;

    private String eTitle;

    private String eState;

    private Long ePageview;

    private Long eGoods;

    private String ePromulgator;

    private Date eCreatetime;

    private Date eSettingtime;

    private String eIssay;		

    private String ePhoto;

    private String eContent;
    
    //状态 发布状态			
    public static final String ESSAY_STATE_SEND = "0";
    
    //状态	草稿状态
    public static final String ESSAY_STATE_ROUGH = "1";
    
    public static final String ISSAY_TRUE = "0";

    public static final String ISSAY_FALSE = "1";
    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId == null ? null : eId.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String geteTitle() {
        return eTitle;
    }

    public void seteTitle(String eTitle) {
        this.eTitle = eTitle == null ? null : eTitle.trim();
    }

    public String geteState() {
        return eState;
    }

    public void seteState(String eState) {
        this.eState = eState == null ? null : eState.trim();
    }

    public Long getePageview() {
        return ePageview;
    }

    public void setePageview(Long ePageview) {
        this.ePageview = ePageview;
    }

    public Long geteGoods() {
        return eGoods;
    }

    public void seteGoods(Long eGoods) {
        this.eGoods = eGoods;
    }

    public String getePromulgator() {
        return ePromulgator;
    }

    public void setePromulgator(String ePromulgator) {
        this.ePromulgator = ePromulgator == null ? null : ePromulgator.trim();
    }

    public Date geteCreatetime() {
        return eCreatetime;
    }

    public void seteCreatetime(Date eCreatetime) {
        this.eCreatetime = eCreatetime;
    }

    public Date geteSettingtime() {
        return eSettingtime;
    }

    public void seteSettingtime(Date eSettingtime) {
        this.eSettingtime = eSettingtime;
    }

    public String geteIssay() {
        return eIssay;
    }

    public void seteIssay(String eIssay) {
        this.eIssay = eIssay == null ? null : eIssay.trim();
    }

    public String getePhoto() {
        return ePhoto;
    }

    public void setePhoto(String ePhoto) {
        this.ePhoto = ePhoto == null ? null : ePhoto.trim();
    }

    public String geteContent() {
        return eContent;
    }

    public void seteContent(String eContent) {
        this.eContent = eContent == null ? null : eContent.trim();
    }
}