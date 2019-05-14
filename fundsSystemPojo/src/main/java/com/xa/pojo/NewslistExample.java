package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewslistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewslistExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andNstausIsNull() {
            addCriterion("nstaus is null");
            return (Criteria) this;
        }

        public Criteria andNstausIsNotNull() {
            addCriterion("nstaus is not null");
            return (Criteria) this;
        }

        public Criteria andNstausEqualTo(String value) {
            addCriterion("nstaus =", value, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausNotEqualTo(String value) {
            addCriterion("nstaus <>", value, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausGreaterThan(String value) {
            addCriterion("nstaus >", value, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausGreaterThanOrEqualTo(String value) {
            addCriterion("nstaus >=", value, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausLessThan(String value) {
            addCriterion("nstaus <", value, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausLessThanOrEqualTo(String value) {
            addCriterion("nstaus <=", value, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausLike(String value) {
            addCriterion("nstaus like", value, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausNotLike(String value) {
            addCriterion("nstaus not like", value, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausIn(List<String> values) {
            addCriterion("nstaus in", values, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausNotIn(List<String> values) {
            addCriterion("nstaus not in", values, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausBetween(String value1, String value2) {
            addCriterion("nstaus between", value1, value2, "nstaus");
            return (Criteria) this;
        }

        public Criteria andNstausNotBetween(String value1, String value2) {
            addCriterion("nstaus not between", value1, value2, "nstaus");
            return (Criteria) this;
        }

        public Criteria andServeIsNull() {
            addCriterion("serve is null");
            return (Criteria) this;
        }

        public Criteria andServeIsNotNull() {
            addCriterion("serve is not null");
            return (Criteria) this;
        }

        public Criteria andServeEqualTo(String value) {
            addCriterion("serve =", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeNotEqualTo(String value) {
            addCriterion("serve <>", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeGreaterThan(String value) {
            addCriterion("serve >", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeGreaterThanOrEqualTo(String value) {
            addCriterion("serve >=", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeLessThan(String value) {
            addCriterion("serve <", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeLessThanOrEqualTo(String value) {
            addCriterion("serve <=", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeLike(String value) {
            addCriterion("serve like", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeNotLike(String value) {
            addCriterion("serve not like", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeIn(List<String> values) {
            addCriterion("serve in", values, "serve");
            return (Criteria) this;
        }

        public Criteria andServeNotIn(List<String> values) {
            addCriterion("serve not in", values, "serve");
            return (Criteria) this;
        }

        public Criteria andServeBetween(String value1, String value2) {
            addCriterion("serve between", value1, value2, "serve");
            return (Criteria) this;
        }

        public Criteria andServeNotBetween(String value1, String value2) {
            addCriterion("serve not between", value1, value2, "serve");
            return (Criteria) this;
        }

        public Criteria andNtimeIsNull() {
            addCriterion("ntime is null");
            return (Criteria) this;
        }

        public Criteria andNtimeIsNotNull() {
            addCriterion("ntime is not null");
            return (Criteria) this;
        }

        public Criteria andNtimeEqualTo(String value) {
            addCriterion("ntime =", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotEqualTo(String value) {
            addCriterion("ntime <>", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeGreaterThan(String value) {
            addCriterion("ntime >", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ntime >=", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeLessThan(String value) {
            addCriterion("ntime <", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeLessThanOrEqualTo(String value) {
            addCriterion("ntime <=", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeLike(String value) {
            addCriterion("ntime like", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotLike(String value) {
            addCriterion("ntime not like", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeIn(List<String> values) {
            addCriterion("ntime in", values, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotIn(List<String> values) {
            addCriterion("ntime not in", values, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeBetween(String value1, String value2) {
            addCriterion("ntime between", value1, value2, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotBetween(String value1, String value2) {
            addCriterion("ntime not between", value1, value2, "ntime");
            return (Criteria) this;
        }

        public Criteria andNdeleteIsNull() {
            addCriterion("ndelete is null");
            return (Criteria) this;
        }

        public Criteria andNdeleteIsNotNull() {
            addCriterion("ndelete is not null");
            return (Criteria) this;
        }

        public Criteria andNdeleteEqualTo(Integer value) {
            addCriterion("ndelete =", value, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteNotEqualTo(Integer value) {
            addCriterion("ndelete <>", value, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteGreaterThan(Integer value) {
            addCriterion("ndelete >", value, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("ndelete >=", value, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteLessThan(Integer value) {
            addCriterion("ndelete <", value, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("ndelete <=", value, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteIn(List<Integer> values) {
            addCriterion("ndelete in", values, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteNotIn(List<Integer> values) {
            addCriterion("ndelete not in", values, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteBetween(Integer value1, Integer value2) {
            addCriterion("ndelete between", value1, value2, "ndelete");
            return (Criteria) this;
        }

        public Criteria andNdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("ndelete not between", value1, value2, "ndelete");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoIsNull() {
            addCriterion("redundancytwo is null");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoIsNotNull() {
            addCriterion("redundancytwo is not null");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoEqualTo(String value) {
            addCriterion("redundancytwo =", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoNotEqualTo(String value) {
            addCriterion("redundancytwo <>", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoGreaterThan(String value) {
            addCriterion("redundancytwo >", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoGreaterThanOrEqualTo(String value) {
            addCriterion("redundancytwo >=", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoLessThan(String value) {
            addCriterion("redundancytwo <", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoLessThanOrEqualTo(String value) {
            addCriterion("redundancytwo <=", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoLike(String value) {
            addCriterion("redundancytwo like", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoNotLike(String value) {
            addCriterion("redundancytwo not like", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoIn(List<String> values) {
            addCriterion("redundancytwo in", values, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoNotIn(List<String> values) {
            addCriterion("redundancytwo not in", values, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoBetween(String value1, String value2) {
            addCriterion("redundancytwo between", value1, value2, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoNotBetween(String value1, String value2) {
            addCriterion("redundancytwo not between", value1, value2, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancythrIsNull() {
            addCriterion("redundancythr is null");
            return (Criteria) this;
        }

        public Criteria andRedundancythrIsNotNull() {
            addCriterion("redundancythr is not null");
            return (Criteria) this;
        }

        public Criteria andRedundancythrEqualTo(String value) {
            addCriterion("redundancythr =", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrNotEqualTo(String value) {
            addCriterion("redundancythr <>", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrGreaterThan(String value) {
            addCriterion("redundancythr >", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrGreaterThanOrEqualTo(String value) {
            addCriterion("redundancythr >=", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrLessThan(String value) {
            addCriterion("redundancythr <", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrLessThanOrEqualTo(String value) {
            addCriterion("redundancythr <=", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrLike(String value) {
            addCriterion("redundancythr like", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrNotLike(String value) {
            addCriterion("redundancythr not like", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrIn(List<String> values) {
            addCriterion("redundancythr in", values, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrNotIn(List<String> values) {
            addCriterion("redundancythr not in", values, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrBetween(String value1, String value2) {
            addCriterion("redundancythr between", value1, value2, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrNotBetween(String value1, String value2) {
            addCriterion("redundancythr not between", value1, value2, "redundancythr");
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