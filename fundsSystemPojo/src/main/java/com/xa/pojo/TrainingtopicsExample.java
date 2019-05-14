package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class TrainingtopicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainingtopicsExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andTopicsIsNull() {
            addCriterion("topics is null");
            return (Criteria) this;
        }

        public Criteria andTopicsIsNotNull() {
            addCriterion("topics is not null");
            return (Criteria) this;
        }

        public Criteria andTopicsEqualTo(String value) {
            addCriterion("topics =", value, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsNotEqualTo(String value) {
            addCriterion("topics <>", value, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsGreaterThan(String value) {
            addCriterion("topics >", value, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsGreaterThanOrEqualTo(String value) {
            addCriterion("topics >=", value, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsLessThan(String value) {
            addCriterion("topics <", value, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsLessThanOrEqualTo(String value) {
            addCriterion("topics <=", value, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsLike(String value) {
            addCriterion("topics like", value, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsNotLike(String value) {
            addCriterion("topics not like", value, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsIn(List<String> values) {
            addCriterion("topics in", values, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsNotIn(List<String> values) {
            addCriterion("topics not in", values, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsBetween(String value1, String value2) {
            addCriterion("topics between", value1, value2, "topics");
            return (Criteria) this;
        }

        public Criteria andTopicsNotBetween(String value1, String value2) {
            addCriterion("topics not between", value1, value2, "topics");
            return (Criteria) this;
        }

        public Criteria andCoursewareIsNull() {
            addCriterion("courseware is null");
            return (Criteria) this;
        }

        public Criteria andCoursewareIsNotNull() {
            addCriterion("courseware is not null");
            return (Criteria) this;
        }

        public Criteria andCoursewareEqualTo(String value) {
            addCriterion("courseware =", value, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareNotEqualTo(String value) {
            addCriterion("courseware <>", value, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareGreaterThan(String value) {
            addCriterion("courseware >", value, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareGreaterThanOrEqualTo(String value) {
            addCriterion("courseware >=", value, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareLessThan(String value) {
            addCriterion("courseware <", value, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareLessThanOrEqualTo(String value) {
            addCriterion("courseware <=", value, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareLike(String value) {
            addCriterion("courseware like", value, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareNotLike(String value) {
            addCriterion("courseware not like", value, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareIn(List<String> values) {
            addCriterion("courseware in", values, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareNotIn(List<String> values) {
            addCriterion("courseware not in", values, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareBetween(String value1, String value2) {
            addCriterion("courseware between", value1, value2, "courseware");
            return (Criteria) this;
        }

        public Criteria andCoursewareNotBetween(String value1, String value2) {
            addCriterion("courseware not between", value1, value2, "courseware");
            return (Criteria) this;
        }

        public Criteria andTurlIsNull() {
            addCriterion("turl is null");
            return (Criteria) this;
        }

        public Criteria andTurlIsNotNull() {
            addCriterion("turl is not null");
            return (Criteria) this;
        }

        public Criteria andTurlEqualTo(String value) {
            addCriterion("turl =", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotEqualTo(String value) {
            addCriterion("turl <>", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlGreaterThan(String value) {
            addCriterion("turl >", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlGreaterThanOrEqualTo(String value) {
            addCriterion("turl >=", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLessThan(String value) {
            addCriterion("turl <", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLessThanOrEqualTo(String value) {
            addCriterion("turl <=", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLike(String value) {
            addCriterion("turl like", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotLike(String value) {
            addCriterion("turl not like", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlIn(List<String> values) {
            addCriterion("turl in", values, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotIn(List<String> values) {
            addCriterion("turl not in", values, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlBetween(String value1, String value2) {
            addCriterion("turl between", value1, value2, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotBetween(String value1, String value2) {
            addCriterion("turl not between", value1, value2, "turl");
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

        public Criteria andTdeleteIsNull() {
            addCriterion("tdelete is null");
            return (Criteria) this;
        }

        public Criteria andTdeleteIsNotNull() {
            addCriterion("tdelete is not null");
            return (Criteria) this;
        }

        public Criteria andTdeleteEqualTo(Integer value) {
            addCriterion("tdelete =", value, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteNotEqualTo(Integer value) {
            addCriterion("tdelete <>", value, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteGreaterThan(Integer value) {
            addCriterion("tdelete >", value, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("tdelete >=", value, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteLessThan(Integer value) {
            addCriterion("tdelete <", value, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("tdelete <=", value, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteIn(List<Integer> values) {
            addCriterion("tdelete in", values, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteNotIn(List<Integer> values) {
            addCriterion("tdelete not in", values, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteBetween(Integer value1, Integer value2) {
            addCriterion("tdelete between", value1, value2, "tdelete");
            return (Criteria) this;
        }

        public Criteria andTdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("tdelete not between", value1, value2, "tdelete");
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