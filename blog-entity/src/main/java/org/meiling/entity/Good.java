package org.meiling.entity;

import java.util.Date;

public class Good {
    private String goodId;

    private String goodName;

    private Date goodDate;

    private String eId;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Date getGoodDate() {
        return goodDate;
    }

    public void setGoodDate(Date goodDate) {
        this.goodDate = goodDate;
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId == null ? null : eId.trim();
    }
}