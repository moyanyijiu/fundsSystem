package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUiidIsNull() {
            addCriterion("uiid is null");
            return (Criteria) this;
        }

        public Criteria andUiidIsNotNull() {
            addCriterion("uiid is not null");
            return (Criteria) this;
        }

        public Criteria andUiidEqualTo(Integer value) {
            addCriterion("uiid =", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotEqualTo(Integer value) {
            addCriterion("uiid <>", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidGreaterThan(Integer value) {
            addCriterion("uiid >", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uiid >=", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidLessThan(Integer value) {
            addCriterion("uiid <", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidLessThanOrEqualTo(Integer value) {
            addCriterion("uiid <=", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidIn(List<Integer> values) {
            addCriterion("uiid in", values, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotIn(List<Integer> values) {
            addCriterion("uiid not in", values, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidBetween(Integer value1, Integer value2) {
            addCriterion("uiid between", value1, value2, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotBetween(Integer value1, Integer value2) {
            addCriterion("uiid not between", value1, value2, "uiid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactIsNull() {
            addCriterion("preferredcontact is null");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactIsNotNull() {
            addCriterion("preferredcontact is not null");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactEqualTo(String value) {
            addCriterion("preferredcontact =", value, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactNotEqualTo(String value) {
            addCriterion("preferredcontact <>", value, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactGreaterThan(String value) {
            addCriterion("preferredcontact >", value, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactGreaterThanOrEqualTo(String value) {
            addCriterion("preferredcontact >=", value, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactLessThan(String value) {
            addCriterion("preferredcontact <", value, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactLessThanOrEqualTo(String value) {
            addCriterion("preferredcontact <=", value, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactLike(String value) {
            addCriterion("preferredcontact like", value, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactNotLike(String value) {
            addCriterion("preferredcontact not like", value, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactIn(List<String> values) {
            addCriterion("preferredcontact in", values, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactNotIn(List<String> values) {
            addCriterion("preferredcontact not in", values, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactBetween(String value1, String value2) {
            addCriterion("preferredcontact between", value1, value2, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactNotBetween(String value1, String value2) {
            addCriterion("preferredcontact not between", value1, value2, "preferredcontact");
            return (Criteria) this;
        }

        public Criteria andContacttimeIsNull() {
            addCriterion("contacttime is null");
            return (Criteria) this;
        }

        public Criteria andContacttimeIsNotNull() {
            addCriterion("contacttime is not null");
            return (Criteria) this;
        }

        public Criteria andContacttimeEqualTo(String value) {
            addCriterion("contacttime =", value, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeNotEqualTo(String value) {
            addCriterion("contacttime <>", value, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeGreaterThan(String value) {
            addCriterion("contacttime >", value, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeGreaterThanOrEqualTo(String value) {
            addCriterion("contacttime >=", value, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeLessThan(String value) {
            addCriterion("contacttime <", value, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeLessThanOrEqualTo(String value) {
            addCriterion("contacttime <=", value, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeLike(String value) {
            addCriterion("contacttime like", value, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeNotLike(String value) {
            addCriterion("contacttime not like", value, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeIn(List<String> values) {
            addCriterion("contacttime in", values, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeNotIn(List<String> values) {
            addCriterion("contacttime not in", values, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeBetween(String value1, String value2) {
            addCriterion("contacttime between", value1, value2, "contacttime");
            return (Criteria) this;
        }

        public Criteria andContacttimeNotBetween(String value1, String value2) {
            addCriterion("contacttime not between", value1, value2, "contacttime");
            return (Criteria) this;
        }

        public Criteria andIsonethousandIsNull() {
            addCriterion("isonethousand is null");
            return (Criteria) this;
        }

        public Criteria andIsonethousandIsNotNull() {
            addCriterion("isonethousand is not null");
            return (Criteria) this;
        }

        public Criteria andIsonethousandEqualTo(Integer value) {
            addCriterion("isonethousand =", value, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandNotEqualTo(Integer value) {
            addCriterion("isonethousand <>", value, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandGreaterThan(Integer value) {
            addCriterion("isonethousand >", value, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandGreaterThanOrEqualTo(Integer value) {
            addCriterion("isonethousand >=", value, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandLessThan(Integer value) {
            addCriterion("isonethousand <", value, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandLessThanOrEqualTo(Integer value) {
            addCriterion("isonethousand <=", value, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandIn(List<Integer> values) {
            addCriterion("isonethousand in", values, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandNotIn(List<Integer> values) {
            addCriterion("isonethousand not in", values, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandBetween(Integer value1, Integer value2) {
            addCriterion("isonethousand between", value1, value2, "isonethousand");
            return (Criteria) this;
        }

        public Criteria andIsonethousandNotBetween(Integer value1, Integer value2) {
            addCriterion("isonethousand not between", value1, value2, "isonethousand");
            return (Criteria) this;
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

        public Criteria andVocationalstatusIsNull() {
            addCriterion("vocationalstatus is null");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusIsNotNull() {
            addCriterion("vocationalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusEqualTo(String value) {
            addCriterion("vocationalstatus =", value, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusNotEqualTo(String value) {
            addCriterion("vocationalstatus <>", value, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusGreaterThan(String value) {
            addCriterion("vocationalstatus >", value, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("vocationalstatus >=", value, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusLessThan(String value) {
            addCriterion("vocationalstatus <", value, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusLessThanOrEqualTo(String value) {
            addCriterion("vocationalstatus <=", value, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusLike(String value) {
            addCriterion("vocationalstatus like", value, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusNotLike(String value) {
            addCriterion("vocationalstatus not like", value, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusIn(List<String> values) {
            addCriterion("vocationalstatus in", values, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusNotIn(List<String> values) {
            addCriterion("vocationalstatus not in", values, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusBetween(String value1, String value2) {
            addCriterion("vocationalstatus between", value1, value2, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andVocationalstatusNotBetween(String value1, String value2) {
            addCriterion("vocationalstatus not between", value1, value2, "vocationalstatus");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseIsNull() {
            addCriterion("fortheenterprise is null");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseIsNotNull() {
            addCriterion("fortheenterprise is not null");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseEqualTo(String value) {
            addCriterion("fortheenterprise =", value, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseNotEqualTo(String value) {
            addCriterion("fortheenterprise <>", value, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseGreaterThan(String value) {
            addCriterion("fortheenterprise >", value, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("fortheenterprise >=", value, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseLessThan(String value) {
            addCriterion("fortheenterprise <", value, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseLessThanOrEqualTo(String value) {
            addCriterion("fortheenterprise <=", value, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseLike(String value) {
            addCriterion("fortheenterprise like", value, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseNotLike(String value) {
            addCriterion("fortheenterprise not like", value, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseIn(List<String> values) {
            addCriterion("fortheenterprise in", values, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseNotIn(List<String> values) {
            addCriterion("fortheenterprise not in", values, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseBetween(String value1, String value2) {
            addCriterion("fortheenterprise between", value1, value2, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andFortheenterpriseNotBetween(String value1, String value2) {
            addCriterion("fortheenterprise not between", value1, value2, "fortheenterprise");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIsNull() {
            addCriterion("companytype is null");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIsNotNull() {
            addCriterion("companytype is not null");
            return (Criteria) this;
        }

        public Criteria andCompanytypeEqualTo(String value) {
            addCriterion("companytype =", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotEqualTo(String value) {
            addCriterion("companytype <>", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeGreaterThan(String value) {
            addCriterion("companytype >", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeGreaterThanOrEqualTo(String value) {
            addCriterion("companytype >=", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLessThan(String value) {
            addCriterion("companytype <", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLessThanOrEqualTo(String value) {
            addCriterion("companytype <=", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLike(String value) {
            addCriterion("companytype like", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotLike(String value) {
            addCriterion("companytype not like", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIn(List<String> values) {
            addCriterion("companytype in", values, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotIn(List<String> values) {
            addCriterion("companytype not in", values, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeBetween(String value1, String value2) {
            addCriterion("companytype between", value1, value2, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotBetween(String value1, String value2) {
            addCriterion("companytype not between", value1, value2, "companytype");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNull() {
            addCriterion("revenue is null");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNotNull() {
            addCriterion("revenue is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueEqualTo(String value) {
            addCriterion("revenue =", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotEqualTo(String value) {
            addCriterion("revenue <>", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThan(String value) {
            addCriterion("revenue >", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThanOrEqualTo(String value) {
            addCriterion("revenue >=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThan(String value) {
            addCriterion("revenue <", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThanOrEqualTo(String value) {
            addCriterion("revenue <=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLike(String value) {
            addCriterion("revenue like", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotLike(String value) {
            addCriterion("revenue not like", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueIn(List<String> values) {
            addCriterion("revenue in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotIn(List<String> values) {
            addCriterion("revenue not in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueBetween(String value1, String value2) {
            addCriterion("revenue between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotBetween(String value1, String value2) {
            addCriterion("revenue not between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusIsNull() {
            addCriterion("educationalstatus is null");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusIsNotNull() {
            addCriterion("educationalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusEqualTo(String value) {
            addCriterion("educationalstatus =", value, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusNotEqualTo(String value) {
            addCriterion("educationalstatus <>", value, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusGreaterThan(String value) {
            addCriterion("educationalstatus >", value, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("educationalstatus >=", value, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusLessThan(String value) {
            addCriterion("educationalstatus <", value, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusLessThanOrEqualTo(String value) {
            addCriterion("educationalstatus <=", value, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusLike(String value) {
            addCriterion("educationalstatus like", value, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusNotLike(String value) {
            addCriterion("educationalstatus not like", value, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusIn(List<String> values) {
            addCriterion("educationalstatus in", values, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusNotIn(List<String> values) {
            addCriterion("educationalstatus not in", values, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusBetween(String value1, String value2) {
            addCriterion("educationalstatus between", value1, value2, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationalstatusNotBetween(String value1, String value2) {
            addCriterion("educationalstatus not between", value1, value2, "educationalstatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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