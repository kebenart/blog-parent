package org.meiling.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PageExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPPathIsNull() {
            addCriterion("p_path is null");
            return (Criteria) this;
        }

        public Criteria andPPathIsNotNull() {
            addCriterion("p_path is not null");
            return (Criteria) this;
        }

        public Criteria andPPathEqualTo(String value) {
            addCriterion("p_path =", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathNotEqualTo(String value) {
            addCriterion("p_path <>", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathGreaterThan(String value) {
            addCriterion("p_path >", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathGreaterThanOrEqualTo(String value) {
            addCriterion("p_path >=", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathLessThan(String value) {
            addCriterion("p_path <", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathLessThanOrEqualTo(String value) {
            addCriterion("p_path <=", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathLike(String value) {
            addCriterion("p_path like", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathNotLike(String value) {
            addCriterion("p_path not like", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathIn(List<String> values) {
            addCriterion("p_path in", values, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathNotIn(List<String> values) {
            addCriterion("p_path not in", values, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathBetween(String value1, String value2) {
            addCriterion("p_path between", value1, value2, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathNotBetween(String value1, String value2) {
            addCriterion("p_path not between", value1, value2, "pPath");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeIsNull() {
            addCriterion("p_createTime is null");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeIsNotNull() {
            addCriterion("p_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeEqualTo(Date value) {
            addCriterion("p_createTime =", value, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeNotEqualTo(Date value) {
            addCriterion("p_createTime <>", value, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeGreaterThan(Date value) {
            addCriterion("p_createTime >", value, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_createTime >=", value, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeLessThan(Date value) {
            addCriterion("p_createTime <", value, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("p_createTime <=", value, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeIn(List<Date> values) {
            addCriterion("p_createTime in", values, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeNotIn(List<Date> values) {
            addCriterion("p_createTime not in", values, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeBetween(Date value1, Date value2) {
            addCriterion("p_createTime between", value1, value2, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("p_createTime not between", value1, value2, "pCreatetime");
            return (Criteria) this;
        }

        public Criteria andPStateIsNull() {
            addCriterion("p_state is null");
            return (Criteria) this;
        }

        public Criteria andPStateIsNotNull() {
            addCriterion("p_state is not null");
            return (Criteria) this;
        }

        public Criteria andPStateEqualTo(String value) {
            addCriterion("p_state =", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotEqualTo(String value) {
            addCriterion("p_state <>", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThan(String value) {
            addCriterion("p_state >", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThanOrEqualTo(String value) {
            addCriterion("p_state >=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThan(String value) {
            addCriterion("p_state <", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThanOrEqualTo(String value) {
            addCriterion("p_state <=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLike(String value) {
            addCriterion("p_state like", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotLike(String value) {
            addCriterion("p_state not like", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateIn(List<String> values) {
            addCriterion("p_state in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotIn(List<String> values) {
            addCriterion("p_state not in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateBetween(String value1, String value2) {
            addCriterion("p_state between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotBetween(String value1, String value2) {
            addCriterion("p_state not between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPIssayIsNull() {
            addCriterion("p_isSay is null");
            return (Criteria) this;
        }

        public Criteria andPIssayIsNotNull() {
            addCriterion("p_isSay is not null");
            return (Criteria) this;
        }

        public Criteria andPIssayEqualTo(String value) {
            addCriterion("p_isSay =", value, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayNotEqualTo(String value) {
            addCriterion("p_isSay <>", value, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayGreaterThan(String value) {
            addCriterion("p_isSay >", value, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayGreaterThanOrEqualTo(String value) {
            addCriterion("p_isSay >=", value, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayLessThan(String value) {
            addCriterion("p_isSay <", value, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayLessThanOrEqualTo(String value) {
            addCriterion("p_isSay <=", value, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayLike(String value) {
            addCriterion("p_isSay like", value, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayNotLike(String value) {
            addCriterion("p_isSay not like", value, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayIn(List<String> values) {
            addCriterion("p_isSay in", values, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayNotIn(List<String> values) {
            addCriterion("p_isSay not in", values, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayBetween(String value1, String value2) {
            addCriterion("p_isSay between", value1, value2, "pIssay");
            return (Criteria) this;
        }

        public Criteria andPIssayNotBetween(String value1, String value2) {
            addCriterion("p_isSay not between", value1, value2, "pIssay");
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