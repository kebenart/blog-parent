package org.meiling.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EssayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EssayExample() {
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

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(String value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(String value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(String value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(String value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(String value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(String value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLike(String value) {
            addCriterion("e_id like", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotLike(String value) {
            addCriterion("e_id not like", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<String> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<String> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(String value1, String value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(String value1, String value2) {
            addCriterion("e_id not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andETitleIsNull() {
            addCriterion("e_title is null");
            return (Criteria) this;
        }

        public Criteria andETitleIsNotNull() {
            addCriterion("e_title is not null");
            return (Criteria) this;
        }

        public Criteria andETitleEqualTo(String value) {
            addCriterion("e_title =", value, "eTitle");
            return (Criteria) this;
        }
        


        public Criteria andETitleNotEqualTo(String value) {
            addCriterion("e_title <>", value, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleGreaterThan(String value) {
            addCriterion("e_title >", value, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleGreaterThanOrEqualTo(String value) {
            addCriterion("e_title >=", value, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleLessThan(String value) {
            addCriterion("e_title <", value, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleLessThanOrEqualTo(String value) {
            addCriterion("e_title <=", value, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleLike(String value) {
            addCriterion("e_title like", value, "eTitle");
            return (Criteria) this;
        }
        
        public Criteria andEContentLike(String value) {
            addCriterion("e_content like", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andETitleNotLike(String value) {
            addCriterion("e_title not like", value, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleIn(List<String> values) {
            addCriterion("e_title in", values, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleNotIn(List<String> values) {
            addCriterion("e_title not in", values, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleBetween(String value1, String value2) {
            addCriterion("e_title between", value1, value2, "eTitle");
            return (Criteria) this;
        }

        public Criteria andETitleNotBetween(String value1, String value2) {
            addCriterion("e_title not between", value1, value2, "eTitle");
            return (Criteria) this;
        }

        public Criteria andEStateIsNull() {
            addCriterion("e_state is null");
            return (Criteria) this;
        }

        public Criteria andEStateIsNotNull() {
            addCriterion("e_state is not null");
            return (Criteria) this;
        }

        public Criteria andEStateEqualTo(String value) {
            addCriterion("e_state =", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateNotEqualTo(String value) {
            addCriterion("e_state <>", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateGreaterThan(String value) {
            addCriterion("e_state >", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateGreaterThanOrEqualTo(String value) {
            addCriterion("e_state >=", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateLessThan(String value) {
            addCriterion("e_state <", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateLessThanOrEqualTo(String value) {
            addCriterion("e_state <=", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateLike(String value) {
            addCriterion("e_state like", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateNotLike(String value) {
            addCriterion("e_state not like", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateIn(List<String> values) {
            addCriterion("e_state in", values, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateNotIn(List<String> values) {
            addCriterion("e_state not in", values, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateBetween(String value1, String value2) {
            addCriterion("e_state between", value1, value2, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateNotBetween(String value1, String value2) {
            addCriterion("e_state not between", value1, value2, "eState");
            return (Criteria) this;
        }

        public Criteria andEPageviewIsNull() {
            addCriterion("e_pageView is null");
            return (Criteria) this;
        }

        public Criteria andEPageviewIsNotNull() {
            addCriterion("e_pageView is not null");
            return (Criteria) this;
        }

        public Criteria andEPageviewEqualTo(Long value) {
            addCriterion("e_pageView =", value, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewNotEqualTo(Long value) {
            addCriterion("e_pageView <>", value, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewGreaterThan(Long value) {
            addCriterion("e_pageView >", value, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewGreaterThanOrEqualTo(Long value) {
            addCriterion("e_pageView >=", value, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewLessThan(Long value) {
            addCriterion("e_pageView <", value, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewLessThanOrEqualTo(Long value) {
            addCriterion("e_pageView <=", value, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewIn(List<Long> values) {
            addCriterion("e_pageView in", values, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewNotIn(List<Long> values) {
            addCriterion("e_pageView not in", values, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewBetween(Long value1, Long value2) {
            addCriterion("e_pageView between", value1, value2, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEPageviewNotBetween(Long value1, Long value2) {
            addCriterion("e_pageView not between", value1, value2, "ePageview");
            return (Criteria) this;
        }

        public Criteria andEGoodsIsNull() {
            addCriterion("e_goods is null");
            return (Criteria) this;
        }

        public Criteria andEGoodsIsNotNull() {
            addCriterion("e_goods is not null");
            return (Criteria) this;
        }

        public Criteria andEGoodsEqualTo(Long value) {
            addCriterion("e_goods =", value, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsNotEqualTo(Long value) {
            addCriterion("e_goods <>", value, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsGreaterThan(Long value) {
            addCriterion("e_goods >", value, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsGreaterThanOrEqualTo(Long value) {
            addCriterion("e_goods >=", value, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsLessThan(Long value) {
            addCriterion("e_goods <", value, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsLessThanOrEqualTo(Long value) {
            addCriterion("e_goods <=", value, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsIn(List<Long> values) {
            addCriterion("e_goods in", values, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsNotIn(List<Long> values) {
            addCriterion("e_goods not in", values, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsBetween(Long value1, Long value2) {
            addCriterion("e_goods between", value1, value2, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEGoodsNotBetween(Long value1, Long value2) {
            addCriterion("e_goods not between", value1, value2, "eGoods");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorIsNull() {
            addCriterion("e_promulgator is null");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorIsNotNull() {
            addCriterion("e_promulgator is not null");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorEqualTo(String value) {
            addCriterion("e_promulgator =", value, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorNotEqualTo(String value) {
            addCriterion("e_promulgator <>", value, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorGreaterThan(String value) {
            addCriterion("e_promulgator >", value, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorGreaterThanOrEqualTo(String value) {
            addCriterion("e_promulgator >=", value, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorLessThan(String value) {
            addCriterion("e_promulgator <", value, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorLessThanOrEqualTo(String value) {
            addCriterion("e_promulgator <=", value, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorLike(String value) {
            addCriterion("e_promulgator like", value, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorNotLike(String value) {
            addCriterion("e_promulgator not like", value, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorIn(List<String> values) {
            addCriterion("e_promulgator in", values, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorNotIn(List<String> values) {
            addCriterion("e_promulgator not in", values, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorBetween(String value1, String value2) {
            addCriterion("e_promulgator between", value1, value2, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andEPromulgatorNotBetween(String value1, String value2) {
            addCriterion("e_promulgator not between", value1, value2, "ePromulgator");
            return (Criteria) this;
        }

        public Criteria andECreatetimeIsNull() {
            addCriterion("e_createTime is null");
            return (Criteria) this;
        }

        public Criteria andECreatetimeIsNotNull() {
            addCriterion("e_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andECreatetimeEqualTo(Date value) {
            addCriterion("e_createTime =", value, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeNotEqualTo(Date value) {
            addCriterion("e_createTime <>", value, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeGreaterThan(Date value) {
            addCriterion("e_createTime >", value, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_createTime >=", value, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeLessThan(Date value) {
            addCriterion("e_createTime <", value, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("e_createTime <=", value, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeIn(List<Date> values) {
            addCriterion("e_createTime in", values, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeNotIn(List<Date> values) {
            addCriterion("e_createTime not in", values, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeBetween(Date value1, Date value2) {
            addCriterion("e_createTime between", value1, value2, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andECreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("e_createTime not between", value1, value2, "eCreatetime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeIsNull() {
            addCriterion("e_settingTime is null");
            return (Criteria) this;
        }

        public Criteria andESettingtimeIsNotNull() {
            addCriterion("e_settingTime is not null");
            return (Criteria) this;
        }

        public Criteria andESettingtimeEqualTo(Date value) {
            addCriterion("e_settingTime =", value, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeNotEqualTo(Date value) {
            addCriterion("e_settingTime <>", value, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeGreaterThan(Date value) {
            addCriterion("e_settingTime >", value, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_settingTime >=", value, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeLessThan(Date value) {
            addCriterion("e_settingTime <", value, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeLessThanOrEqualTo(Date value) {
            addCriterion("e_settingTime <=", value, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeIn(List<Date> values) {
            addCriterion("e_settingTime in", values, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeNotIn(List<Date> values) {
            addCriterion("e_settingTime not in", values, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeBetween(Date value1, Date value2) {
            addCriterion("e_settingTime between", value1, value2, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andESettingtimeNotBetween(Date value1, Date value2) {
            addCriterion("e_settingTime not between", value1, value2, "eSettingtime");
            return (Criteria) this;
        }

        public Criteria andEIssayIsNull() {
            addCriterion("e_isSay is null");
            return (Criteria) this;
        }

        public Criteria andEIssayIsNotNull() {
            addCriterion("e_isSay is not null");
            return (Criteria) this;
        }

        public Criteria andEIssayEqualTo(String value) {
            addCriterion("e_isSay =", value, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayNotEqualTo(String value) {
            addCriterion("e_isSay <>", value, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayGreaterThan(String value) {
            addCriterion("e_isSay >", value, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayGreaterThanOrEqualTo(String value) {
            addCriterion("e_isSay >=", value, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayLessThan(String value) {
            addCriterion("e_isSay <", value, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayLessThanOrEqualTo(String value) {
            addCriterion("e_isSay <=", value, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayLike(String value) {
            addCriterion("e_isSay like", value, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayNotLike(String value) {
            addCriterion("e_isSay not like", value, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayIn(List<String> values) {
            addCriterion("e_isSay in", values, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayNotIn(List<String> values) {
            addCriterion("e_isSay not in", values, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayBetween(String value1, String value2) {
            addCriterion("e_isSay between", value1, value2, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEIssayNotBetween(String value1, String value2) {
            addCriterion("e_isSay not between", value1, value2, "eIssay");
            return (Criteria) this;
        }

        public Criteria andEPhotoIsNull() {
            addCriterion("e_photo is null");
            return (Criteria) this;
        }

        public Criteria andEPhotoIsNotNull() {
            addCriterion("e_photo is not null");
            return (Criteria) this;
        }

        public Criteria andEPhotoEqualTo(String value) {
            addCriterion("e_photo =", value, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoNotEqualTo(String value) {
            addCriterion("e_photo <>", value, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoGreaterThan(String value) {
            addCriterion("e_photo >", value, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("e_photo >=", value, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoLessThan(String value) {
            addCriterion("e_photo <", value, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoLessThanOrEqualTo(String value) {
            addCriterion("e_photo <=", value, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoLike(String value) {
            addCriterion("e_photo like", value, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoNotLike(String value) {
            addCriterion("e_photo not like", value, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoIn(List<String> values) {
            addCriterion("e_photo in", values, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoNotIn(List<String> values) {
            addCriterion("e_photo not in", values, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoBetween(String value1, String value2) {
            addCriterion("e_photo between", value1, value2, "ePhoto");
            return (Criteria) this;
        }

        public Criteria andEPhotoNotBetween(String value1, String value2) {
            addCriterion("e_photo not between", value1, value2, "ePhoto");
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