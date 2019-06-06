package org.meiling.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscussExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscussExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(String value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(String value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(String value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(String value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(String value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(String value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLike(String value) {
            addCriterion("d_id like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotLike(String value) {
            addCriterion("d_id not like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<String> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<String> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(String value1, String value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(String value1, String value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
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

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDContentIsNull() {
            addCriterion("d_content is null");
            return (Criteria) this;
        }

        public Criteria andDContentIsNotNull() {
            addCriterion("d_content is not null");
            return (Criteria) this;
        }

        public Criteria andDContentEqualTo(String value) {
            addCriterion("d_content =", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotEqualTo(String value) {
            addCriterion("d_content <>", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentGreaterThan(String value) {
            addCriterion("d_content >", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentGreaterThanOrEqualTo(String value) {
            addCriterion("d_content >=", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLessThan(String value) {
            addCriterion("d_content <", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLessThanOrEqualTo(String value) {
            addCriterion("d_content <=", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLike(String value) {
            addCriterion("d_content like", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotLike(String value) {
            addCriterion("d_content not like", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentIn(List<String> values) {
            addCriterion("d_content in", values, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotIn(List<String> values) {
            addCriterion("d_content not in", values, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentBetween(String value1, String value2) {
            addCriterion("d_content between", value1, value2, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotBetween(String value1, String value2) {
            addCriterion("d_content not between", value1, value2, "dContent");
            return (Criteria) this;
        }

        public Criteria andDTimeIsNull() {
            addCriterion("d_time is null");
            return (Criteria) this;
        }

        public Criteria andDTimeIsNotNull() {
            addCriterion("d_time is not null");
            return (Criteria) this;
        }

        public Criteria andDTimeEqualTo(Date value) {
            addCriterion("d_time =", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotEqualTo(Date value) {
            addCriterion("d_time <>", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeGreaterThan(Date value) {
            addCriterion("d_time >", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_time >=", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLessThan(Date value) {
            addCriterion("d_time <", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_time <=", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeIn(List<Date> values) {
            addCriterion("d_time in", values, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotIn(List<Date> values) {
            addCriterion("d_time not in", values, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeBetween(Date value1, Date value2) {
            addCriterion("d_time between", value1, value2, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_time not between", value1, value2, "dTime");
            return (Criteria) this;
        }

        public Criteria andDStateIsNull() {
            addCriterion("d_state is null");
            return (Criteria) this;
        }

        public Criteria andDStateIsNotNull() {
            addCriterion("d_state is not null");
            return (Criteria) this;
        }

        public Criteria andDStateEqualTo(String value) {
            addCriterion("d_state =", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotEqualTo(String value) {
            addCriterion("d_state <>", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateGreaterThan(String value) {
            addCriterion("d_state >", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateGreaterThanOrEqualTo(String value) {
            addCriterion("d_state >=", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLessThan(String value) {
            addCriterion("d_state <", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLessThanOrEqualTo(String value) {
            addCriterion("d_state <=", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLike(String value) {
            addCriterion("d_state like", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotLike(String value) {
            addCriterion("d_state not like", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateIn(List<String> values) {
            addCriterion("d_state in", values, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotIn(List<String> values) {
            addCriterion("d_state not in", values, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateBetween(String value1, String value2) {
            addCriterion("d_state between", value1, value2, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotBetween(String value1, String value2) {
            addCriterion("d_state not between", value1, value2, "dState");
            return (Criteria) this;
        }

        public Criteria andDLevelIsNull() {
            addCriterion("d_level is null");
            return (Criteria) this;
        }

        public Criteria andDLevelIsNotNull() {
            addCriterion("d_level is not null");
            return (Criteria) this;
        }

        public Criteria andDLevelEqualTo(Long value) {
            addCriterion("d_level =", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelNotEqualTo(Long value) {
            addCriterion("d_level <>", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelGreaterThan(Long value) {
            addCriterion("d_level >", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("d_level >=", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelLessThan(Long value) {
            addCriterion("d_level <", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelLessThanOrEqualTo(Long value) {
            addCriterion("d_level <=", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelIn(List<Long> values) {
            addCriterion("d_level in", values, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelNotIn(List<Long> values) {
            addCriterion("d_level not in", values, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelBetween(Long value1, Long value2) {
            addCriterion("d_level between", value1, value2, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelNotBetween(Long value1, Long value2) {
            addCriterion("d_level not between", value1, value2, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDPidIsNull() {
            addCriterion("d_pId is null");
            return (Criteria) this;
        }

        public Criteria andDPidIsNotNull() {
            addCriterion("d_pId is not null");
            return (Criteria) this;
        }

        public Criteria andDPidEqualTo(String value) {
            addCriterion("d_pId =", value, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidNotEqualTo(String value) {
            addCriterion("d_pId <>", value, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidGreaterThan(String value) {
            addCriterion("d_pId >", value, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidGreaterThanOrEqualTo(String value) {
            addCriterion("d_pId >=", value, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidLessThan(String value) {
            addCriterion("d_pId <", value, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidLessThanOrEqualTo(String value) {
            addCriterion("d_pId <=", value, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidLike(String value) {
            addCriterion("d_pId like", value, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidNotLike(String value) {
            addCriterion("d_pId not like", value, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidIn(List<String> values) {
            addCriterion("d_pId in", values, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidNotIn(List<String> values) {
            addCriterion("d_pId not in", values, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidBetween(String value1, String value2) {
            addCriterion("d_pId between", value1, value2, "dPid");
            return (Criteria) this;
        }

        public Criteria andDPidNotBetween(String value1, String value2) {
            addCriterion("d_pId not between", value1, value2, "dPid");
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