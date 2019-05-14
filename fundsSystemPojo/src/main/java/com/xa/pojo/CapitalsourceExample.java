package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class CapitalsourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapitalsourceExample() {
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

        public Criteria andCapidIsNull() {
            addCriterion("capid is null");
            return (Criteria) this;
        }

        public Criteria andCapidIsNotNull() {
            addCriterion("capid is not null");
            return (Criteria) this;
        }

        public Criteria andCapidEqualTo(Integer value) {
            addCriterion("capid =", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidNotEqualTo(Integer value) {
            addCriterion("capid <>", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidGreaterThan(Integer value) {
            addCriterion("capid >", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidGreaterThanOrEqualTo(Integer value) {
            addCriterion("capid >=", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidLessThan(Integer value) {
            addCriterion("capid <", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidLessThanOrEqualTo(Integer value) {
            addCriterion("capid <=", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidIn(List<Integer> values) {
            addCriterion("capid in", values, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidNotIn(List<Integer> values) {
            addCriterion("capid not in", values, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidBetween(Integer value1, Integer value2) {
            addCriterion("capid between", value1, value2, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidNotBetween(Integer value1, Integer value2) {
            addCriterion("capid not between", value1, value2, "capid");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitIsNull() {
            addCriterion("thecompanyaprofit is null");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitIsNotNull() {
            addCriterion("thecompanyaprofit is not null");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitEqualTo(Integer value) {
            addCriterion("thecompanyaprofit =", value, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitNotEqualTo(Integer value) {
            addCriterion("thecompanyaprofit <>", value, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitGreaterThan(Integer value) {
            addCriterion("thecompanyaprofit >", value, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitGreaterThanOrEqualTo(Integer value) {
            addCriterion("thecompanyaprofit >=", value, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitLessThan(Integer value) {
            addCriterion("thecompanyaprofit <", value, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitLessThanOrEqualTo(Integer value) {
            addCriterion("thecompanyaprofit <=", value, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitIn(List<Integer> values) {
            addCriterion("thecompanyaprofit in", values, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitNotIn(List<Integer> values) {
            addCriterion("thecompanyaprofit not in", values, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitBetween(Integer value1, Integer value2) {
            addCriterion("thecompanyaprofit between", value1, value2, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThecompanyaprofitNotBetween(Integer value1, Integer value2) {
            addCriterion("thecompanyaprofit not between", value1, value2, "thecompanyaprofit");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyIsNull() {
            addCriterion("thefamilyproperty is null");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyIsNotNull() {
            addCriterion("thefamilyproperty is not null");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyEqualTo(Integer value) {
            addCriterion("thefamilyproperty =", value, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyNotEqualTo(Integer value) {
            addCriterion("thefamilyproperty <>", value, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyGreaterThan(Integer value) {
            addCriterion("thefamilyproperty >", value, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyGreaterThanOrEqualTo(Integer value) {
            addCriterion("thefamilyproperty >=", value, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyLessThan(Integer value) {
            addCriterion("thefamilyproperty <", value, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyLessThanOrEqualTo(Integer value) {
            addCriterion("thefamilyproperty <=", value, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyIn(List<Integer> values) {
            addCriterion("thefamilyproperty in", values, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyNotIn(List<Integer> values) {
            addCriterion("thefamilyproperty not in", values, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyBetween(Integer value1, Integer value2) {
            addCriterion("thefamilyproperty between", value1, value2, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andThefamilypropertyNotBetween(Integer value1, Integer value2) {
            addCriterion("thefamilyproperty not between", value1, value2, "thefamilyproperty");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeIsNull() {
            addCriterion("investmentincome is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeIsNotNull() {
            addCriterion("investmentincome is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeEqualTo(Integer value) {
            addCriterion("investmentincome =", value, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeNotEqualTo(Integer value) {
            addCriterion("investmentincome <>", value, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeGreaterThan(Integer value) {
            addCriterion("investmentincome >", value, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("investmentincome >=", value, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeLessThan(Integer value) {
            addCriterion("investmentincome <", value, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeLessThanOrEqualTo(Integer value) {
            addCriterion("investmentincome <=", value, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeIn(List<Integer> values) {
            addCriterion("investmentincome in", values, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeNotIn(List<Integer> values) {
            addCriterion("investmentincome not in", values, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeBetween(Integer value1, Integer value2) {
            addCriterion("investmentincome between", value1, value2, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andInvestmentincomeNotBetween(Integer value1, Integer value2) {
            addCriterion("investmentincome not between", value1, value2, "investmentincome");
            return (Criteria) this;
        }

        public Criteria andOtherzIsNull() {
            addCriterion("otherz is null");
            return (Criteria) this;
        }

        public Criteria andOtherzIsNotNull() {
            addCriterion("otherz is not null");
            return (Criteria) this;
        }

        public Criteria andOtherzEqualTo(Integer value) {
            addCriterion("otherz =", value, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzNotEqualTo(Integer value) {
            addCriterion("otherz <>", value, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzGreaterThan(Integer value) {
            addCriterion("otherz >", value, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzGreaterThanOrEqualTo(Integer value) {
            addCriterion("otherz >=", value, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzLessThan(Integer value) {
            addCriterion("otherz <", value, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzLessThanOrEqualTo(Integer value) {
            addCriterion("otherz <=", value, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzIn(List<Integer> values) {
            addCriterion("otherz in", values, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzNotIn(List<Integer> values) {
            addCriterion("otherz not in", values, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzBetween(Integer value1, Integer value2) {
            addCriterion("otherz between", value1, value2, "otherz");
            return (Criteria) this;
        }

        public Criteria andOtherzNotBetween(Integer value1, Integer value2) {
            addCriterion("otherz not between", value1, value2, "otherz");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneIsNull() {
            addCriterion("redundancyone is null");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneIsNotNull() {
            addCriterion("redundancyone is not null");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneEqualTo(String value) {
            addCriterion("redundancyone =", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneNotEqualTo(String value) {
            addCriterion("redundancyone <>", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneGreaterThan(String value) {
            addCriterion("redundancyone >", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneGreaterThanOrEqualTo(String value) {
            addCriterion("redundancyone >=", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneLessThan(String value) {
            addCriterion("redundancyone <", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneLessThanOrEqualTo(String value) {
            addCriterion("redundancyone <=", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneLike(String value) {
            addCriterion("redundancyone like", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneNotLike(String value) {
            addCriterion("redundancyone not like", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneIn(List<String> values) {
            addCriterion("redundancyone in", values, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneNotIn(List<String> values) {
            addCriterion("redundancyone not in", values, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneBetween(String value1, String value2) {
            addCriterion("redundancyone between", value1, value2, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneNotBetween(String value1, String value2) {
            addCriterion("redundancyone not between", value1, value2, "redundancyone");
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

        public Criteria andCapdelIsNull() {
            addCriterion("capdel is null");
            return (Criteria) this;
        }

        public Criteria andCapdelIsNotNull() {
            addCriterion("capdel is not null");
            return (Criteria) this;
        }

        public Criteria andCapdelEqualTo(Integer value) {
            addCriterion("capdel =", value, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelNotEqualTo(Integer value) {
            addCriterion("capdel <>", value, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelGreaterThan(Integer value) {
            addCriterion("capdel >", value, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("capdel >=", value, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelLessThan(Integer value) {
            addCriterion("capdel <", value, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelLessThanOrEqualTo(Integer value) {
            addCriterion("capdel <=", value, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelIn(List<Integer> values) {
            addCriterion("capdel in", values, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelNotIn(List<Integer> values) {
            addCriterion("capdel not in", values, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelBetween(Integer value1, Integer value2) {
            addCriterion("capdel between", value1, value2, "capdel");
            return (Criteria) this;
        }

        public Criteria andCapdelNotBetween(Integer value1, Integer value2) {
            addCriterion("capdel not between", value1, value2, "capdel");
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