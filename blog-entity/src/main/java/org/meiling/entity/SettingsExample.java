package org.meiling.entity;

import java.util.ArrayList;
import java.util.List;

public class SettingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettingsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("s_id like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("s_id not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSRemarkIsNull() {
            addCriterion("s_remark is null");
            return (Criteria) this;
        }

        public Criteria andSRemarkIsNotNull() {
            addCriterion("s_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSRemarkEqualTo(String value) {
            addCriterion("s_remark =", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotEqualTo(String value) {
            addCriterion("s_remark <>", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkGreaterThan(String value) {
            addCriterion("s_remark >", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("s_remark >=", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLessThan(String value) {
            addCriterion("s_remark <", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLessThanOrEqualTo(String value) {
            addCriterion("s_remark <=", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLike(String value) {
            addCriterion("s_remark like", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotLike(String value) {
            addCriterion("s_remark not like", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkIn(List<String> values) {
            addCriterion("s_remark in", values, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotIn(List<String> values) {
            addCriterion("s_remark not in", values, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkBetween(String value1, String value2) {
            addCriterion("s_remark between", value1, value2, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotBetween(String value1, String value2) {
            addCriterion("s_remark not between", value1, value2, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSHeadimgIsNull() {
            addCriterion("s_headImg is null");
            return (Criteria) this;
        }

        public Criteria andSHeadimgIsNotNull() {
            addCriterion("s_headImg is not null");
            return (Criteria) this;
        }

        public Criteria andSHeadimgEqualTo(String value) {
            addCriterion("s_headImg =", value, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgNotEqualTo(String value) {
            addCriterion("s_headImg <>", value, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgGreaterThan(String value) {
            addCriterion("s_headImg >", value, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("s_headImg >=", value, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgLessThan(String value) {
            addCriterion("s_headImg <", value, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgLessThanOrEqualTo(String value) {
            addCriterion("s_headImg <=", value, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgLike(String value) {
            addCriterion("s_headImg like", value, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgNotLike(String value) {
            addCriterion("s_headImg not like", value, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgIn(List<String> values) {
            addCriterion("s_headImg in", values, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgNotIn(List<String> values) {
            addCriterion("s_headImg not in", values, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgBetween(String value1, String value2) {
            addCriterion("s_headImg between", value1, value2, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgNotBetween(String value1, String value2) {
            addCriterion("s_headImg not between", value1, value2, "sHeadimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgIsNull() {
            addCriterion("s_bgImg is null");
            return (Criteria) this;
        }

        public Criteria andSBgimgIsNotNull() {
            addCriterion("s_bgImg is not null");
            return (Criteria) this;
        }

        public Criteria andSBgimgEqualTo(String value) {
            addCriterion("s_bgImg =", value, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgNotEqualTo(String value) {
            addCriterion("s_bgImg <>", value, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgGreaterThan(String value) {
            addCriterion("s_bgImg >", value, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgGreaterThanOrEqualTo(String value) {
            addCriterion("s_bgImg >=", value, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgLessThan(String value) {
            addCriterion("s_bgImg <", value, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgLessThanOrEqualTo(String value) {
            addCriterion("s_bgImg <=", value, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgLike(String value) {
            addCriterion("s_bgImg like", value, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgNotLike(String value) {
            addCriterion("s_bgImg not like", value, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgIn(List<String> values) {
            addCriterion("s_bgImg in", values, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgNotIn(List<String> values) {
            addCriterion("s_bgImg not in", values, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgBetween(String value1, String value2) {
            addCriterion("s_bgImg between", value1, value2, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSBgimgNotBetween(String value1, String value2) {
            addCriterion("s_bgImg not between", value1, value2, "sBgimg");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNull() {
            addCriterion("s_title is null");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNotNull() {
            addCriterion("s_title is not null");
            return (Criteria) this;
        }

        public Criteria andSTitleEqualTo(String value) {
            addCriterion("s_title =", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotEqualTo(String value) {
            addCriterion("s_title <>", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThan(String value) {
            addCriterion("s_title >", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThanOrEqualTo(String value) {
            addCriterion("s_title >=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThan(String value) {
            addCriterion("s_title <", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThanOrEqualTo(String value) {
            addCriterion("s_title <=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLike(String value) {
            addCriterion("s_title like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotLike(String value) {
            addCriterion("s_title not like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleIn(List<String> values) {
            addCriterion("s_title in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotIn(List<String> values) {
            addCriterion("s_title not in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleBetween(String value1, String value2) {
            addCriterion("s_title between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotBetween(String value1, String value2) {
            addCriterion("s_title not between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkIsNull() {
            addCriterion("s_headRemark is null");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkIsNotNull() {
            addCriterion("s_headRemark is not null");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkEqualTo(String value) {
            addCriterion("s_headRemark =", value, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkNotEqualTo(String value) {
            addCriterion("s_headRemark <>", value, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkGreaterThan(String value) {
            addCriterion("s_headRemark >", value, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkGreaterThanOrEqualTo(String value) {
            addCriterion("s_headRemark >=", value, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkLessThan(String value) {
            addCriterion("s_headRemark <", value, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkLessThanOrEqualTo(String value) {
            addCriterion("s_headRemark <=", value, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkLike(String value) {
            addCriterion("s_headRemark like", value, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkNotLike(String value) {
            addCriterion("s_headRemark not like", value, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkIn(List<String> values) {
            addCriterion("s_headRemark in", values, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkNotIn(List<String> values) {
            addCriterion("s_headRemark not in", values, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkBetween(String value1, String value2) {
            addCriterion("s_headRemark between", value1, value2, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSHeadremarkNotBetween(String value1, String value2) {
            addCriterion("s_headRemark not between", value1, value2, "sHeadremark");
            return (Criteria) this;
        }

        public Criteria andSWeiboIsNull() {
            addCriterion("s_weibo is null");
            return (Criteria) this;
        }

        public Criteria andSWeiboIsNotNull() {
            addCriterion("s_weibo is not null");
            return (Criteria) this;
        }

        public Criteria andSWeiboEqualTo(String value) {
            addCriterion("s_weibo =", value, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboNotEqualTo(String value) {
            addCriterion("s_weibo <>", value, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboGreaterThan(String value) {
            addCriterion("s_weibo >", value, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboGreaterThanOrEqualTo(String value) {
            addCriterion("s_weibo >=", value, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboLessThan(String value) {
            addCriterion("s_weibo <", value, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboLessThanOrEqualTo(String value) {
            addCriterion("s_weibo <=", value, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboLike(String value) {
            addCriterion("s_weibo like", value, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboNotLike(String value) {
            addCriterion("s_weibo not like", value, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboIn(List<String> values) {
            addCriterion("s_weibo in", values, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboNotIn(List<String> values) {
            addCriterion("s_weibo not in", values, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboBetween(String value1, String value2) {
            addCriterion("s_weibo between", value1, value2, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeiboNotBetween(String value1, String value2) {
            addCriterion("s_weibo not between", value1, value2, "sWeibo");
            return (Criteria) this;
        }

        public Criteria andSWeixinIsNull() {
            addCriterion("s_weixin is null");
            return (Criteria) this;
        }

        public Criteria andSWeixinIsNotNull() {
            addCriterion("s_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andSWeixinEqualTo(String value) {
            addCriterion("s_weixin =", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinNotEqualTo(String value) {
            addCriterion("s_weixin <>", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinGreaterThan(String value) {
            addCriterion("s_weixin >", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("s_weixin >=", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinLessThan(String value) {
            addCriterion("s_weixin <", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinLessThanOrEqualTo(String value) {
            addCriterion("s_weixin <=", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinLike(String value) {
            addCriterion("s_weixin like", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinNotLike(String value) {
            addCriterion("s_weixin not like", value, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinIn(List<String> values) {
            addCriterion("s_weixin in", values, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinNotIn(List<String> values) {
            addCriterion("s_weixin not in", values, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinBetween(String value1, String value2) {
            addCriterion("s_weixin between", value1, value2, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSWeixinNotBetween(String value1, String value2) {
            addCriterion("s_weixin not between", value1, value2, "sWeixin");
            return (Criteria) this;
        }

        public Criteria andSQqIsNull() {
            addCriterion("s_qq is null");
            return (Criteria) this;
        }

        public Criteria andSQqIsNotNull() {
            addCriterion("s_qq is not null");
            return (Criteria) this;
        }

        public Criteria andSQqEqualTo(String value) {
            addCriterion("s_qq =", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqNotEqualTo(String value) {
            addCriterion("s_qq <>", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqGreaterThan(String value) {
            addCriterion("s_qq >", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqGreaterThanOrEqualTo(String value) {
            addCriterion("s_qq >=", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqLessThan(String value) {
            addCriterion("s_qq <", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqLessThanOrEqualTo(String value) {
            addCriterion("s_qq <=", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqLike(String value) {
            addCriterion("s_qq like", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqNotLike(String value) {
            addCriterion("s_qq not like", value, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqIn(List<String> values) {
            addCriterion("s_qq in", values, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqNotIn(List<String> values) {
            addCriterion("s_qq not in", values, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqBetween(String value1, String value2) {
            addCriterion("s_qq between", value1, value2, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqNotBetween(String value1, String value2) {
            addCriterion("s_qq not between", value1, value2, "sQq");
            return (Criteria) this;
        }

        public Criteria andSQqsIsNull() {
            addCriterion("s_qqs is null");
            return (Criteria) this;
        }

        public Criteria andSQqsIsNotNull() {
            addCriterion("s_qqs is not null");
            return (Criteria) this;
        }

        public Criteria andSQqsEqualTo(String value) {
            addCriterion("s_qqs =", value, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsNotEqualTo(String value) {
            addCriterion("s_qqs <>", value, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsGreaterThan(String value) {
            addCriterion("s_qqs >", value, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsGreaterThanOrEqualTo(String value) {
            addCriterion("s_qqs >=", value, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsLessThan(String value) {
            addCriterion("s_qqs <", value, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsLessThanOrEqualTo(String value) {
            addCriterion("s_qqs <=", value, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsLike(String value) {
            addCriterion("s_qqs like", value, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsNotLike(String value) {
            addCriterion("s_qqs not like", value, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsIn(List<String> values) {
            addCriterion("s_qqs in", values, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsNotIn(List<String> values) {
            addCriterion("s_qqs not in", values, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsBetween(String value1, String value2) {
            addCriterion("s_qqs between", value1, value2, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSQqsNotBetween(String value1, String value2) {
            addCriterion("s_qqs not between", value1, value2, "sQqs");
            return (Criteria) this;
        }

        public Criteria andSZfbpayIsNull() {
            addCriterion("s_zfbPay is null");
            return (Criteria) this;
        }

        public Criteria andSZfbpayIsNotNull() {
            addCriterion("s_zfbPay is not null");
            return (Criteria) this;
        }

        public Criteria andSZfbpayEqualTo(String value) {
            addCriterion("s_zfbPay =", value, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayNotEqualTo(String value) {
            addCriterion("s_zfbPay <>", value, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayGreaterThan(String value) {
            addCriterion("s_zfbPay >", value, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayGreaterThanOrEqualTo(String value) {
            addCriterion("s_zfbPay >=", value, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayLessThan(String value) {
            addCriterion("s_zfbPay <", value, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayLessThanOrEqualTo(String value) {
            addCriterion("s_zfbPay <=", value, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayLike(String value) {
            addCriterion("s_zfbPay like", value, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayNotLike(String value) {
            addCriterion("s_zfbPay not like", value, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayIn(List<String> values) {
            addCriterion("s_zfbPay in", values, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayNotIn(List<String> values) {
            addCriterion("s_zfbPay not in", values, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayBetween(String value1, String value2) {
            addCriterion("s_zfbPay between", value1, value2, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSZfbpayNotBetween(String value1, String value2) {
            addCriterion("s_zfbPay not between", value1, value2, "sZfbpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayIsNull() {
            addCriterion("s_wxPay is null");
            return (Criteria) this;
        }

        public Criteria andSWxpayIsNotNull() {
            addCriterion("s_wxPay is not null");
            return (Criteria) this;
        }

        public Criteria andSWxpayEqualTo(String value) {
            addCriterion("s_wxPay =", value, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayNotEqualTo(String value) {
            addCriterion("s_wxPay <>", value, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayGreaterThan(String value) {
            addCriterion("s_wxPay >", value, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayGreaterThanOrEqualTo(String value) {
            addCriterion("s_wxPay >=", value, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayLessThan(String value) {
            addCriterion("s_wxPay <", value, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayLessThanOrEqualTo(String value) {
            addCriterion("s_wxPay <=", value, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayLike(String value) {
            addCriterion("s_wxPay like", value, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayNotLike(String value) {
            addCriterion("s_wxPay not like", value, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayIn(List<String> values) {
            addCriterion("s_wxPay in", values, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayNotIn(List<String> values) {
            addCriterion("s_wxPay not in", values, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayBetween(String value1, String value2) {
            addCriterion("s_wxPay between", value1, value2, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSWxpayNotBetween(String value1, String value2) {
            addCriterion("s_wxPay not between", value1, value2, "sWxpay");
            return (Criteria) this;
        }

        public Criteria andSMywxIsNull() {
            addCriterion("s_mywx is null");
            return (Criteria) this;
        }

        public Criteria andSMywxIsNotNull() {
            addCriterion("s_mywx is not null");
            return (Criteria) this;
        }

        public Criteria andSMywxEqualTo(String value) {
            addCriterion("s_mywx =", value, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxNotEqualTo(String value) {
            addCriterion("s_mywx <>", value, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxGreaterThan(String value) {
            addCriterion("s_mywx >", value, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxGreaterThanOrEqualTo(String value) {
            addCriterion("s_mywx >=", value, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxLessThan(String value) {
            addCriterion("s_mywx <", value, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxLessThanOrEqualTo(String value) {
            addCriterion("s_mywx <=", value, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxLike(String value) {
            addCriterion("s_mywx like", value, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxNotLike(String value) {
            addCriterion("s_mywx not like", value, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxIn(List<String> values) {
            addCriterion("s_mywx in", values, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxNotIn(List<String> values) {
            addCriterion("s_mywx not in", values, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxBetween(String value1, String value2) {
            addCriterion("s_mywx between", value1, value2, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSMywxNotBetween(String value1, String value2) {
            addCriterion("s_mywx not between", value1, value2, "sMywx");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgIsNull() {
            addCriterion("s_headImgBg is null");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgIsNotNull() {
            addCriterion("s_headImgBg is not null");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgEqualTo(String value) {
            addCriterion("s_headImgBg =", value, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgNotEqualTo(String value) {
            addCriterion("s_headImgBg <>", value, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgGreaterThan(String value) {
            addCriterion("s_headImgBg >", value, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgGreaterThanOrEqualTo(String value) {
            addCriterion("s_headImgBg >=", value, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgLessThan(String value) {
            addCriterion("s_headImgBg <", value, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgLessThanOrEqualTo(String value) {
            addCriterion("s_headImgBg <=", value, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgLike(String value) {
            addCriterion("s_headImgBg like", value, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgNotLike(String value) {
            addCriterion("s_headImgBg not like", value, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgIn(List<String> values) {
            addCriterion("s_headImgBg in", values, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgNotIn(List<String> values) {
            addCriterion("s_headImgBg not in", values, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgBetween(String value1, String value2) {
            addCriterion("s_headImgBg between", value1, value2, "sHeadimgbg");
            return (Criteria) this;
        }

        public Criteria andSHeadimgbgNotBetween(String value1, String value2) {
            addCriterion("s_headImgBg not between", value1, value2, "sHeadimgbg");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}