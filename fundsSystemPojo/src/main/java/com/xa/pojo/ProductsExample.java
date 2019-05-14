package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductsExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andMpidIsNull() {
            addCriterion("mpid is null");
            return (Criteria) this;
        }

        public Criteria andMpidIsNotNull() {
            addCriterion("mpid is not null");
            return (Criteria) this;
        }

        public Criteria andMpidEqualTo(Integer value) {
            addCriterion("mpid =", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotEqualTo(Integer value) {
            addCriterion("mpid <>", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThan(Integer value) {
            addCriterion("mpid >", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mpid >=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThan(Integer value) {
            addCriterion("mpid <", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThanOrEqualTo(Integer value) {
            addCriterion("mpid <=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidIn(List<Integer> values) {
            addCriterion("mpid in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotIn(List<Integer> values) {
            addCriterion("mpid not in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidBetween(Integer value1, Integer value2) {
            addCriterion("mpid between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotBetween(Integer value1, Integer value2) {
            addCriterion("mpid not between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andPstartIsNull() {
            addCriterion("pstart is null");
            return (Criteria) this;
        }

        public Criteria andPstartIsNotNull() {
            addCriterion("pstart is not null");
            return (Criteria) this;
        }

        public Criteria andPstartEqualTo(String value) {
            addCriterion("pstart =", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartNotEqualTo(String value) {
            addCriterion("pstart <>", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartGreaterThan(String value) {
            addCriterion("pstart >", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartGreaterThanOrEqualTo(String value) {
            addCriterion("pstart >=", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartLessThan(String value) {
            addCriterion("pstart <", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartLessThanOrEqualTo(String value) {
            addCriterion("pstart <=", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartLike(String value) {
            addCriterion("pstart like", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartNotLike(String value) {
            addCriterion("pstart not like", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartIn(List<String> values) {
            addCriterion("pstart in", values, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartNotIn(List<String> values) {
            addCriterion("pstart not in", values, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartBetween(String value1, String value2) {
            addCriterion("pstart between", value1, value2, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartNotBetween(String value1, String value2) {
            addCriterion("pstart not between", value1, value2, "pstart");
            return (Criteria) this;
        }

        public Criteria andPlimitIsNull() {
            addCriterion("plimit is null");
            return (Criteria) this;
        }

        public Criteria andPlimitIsNotNull() {
            addCriterion("plimit is not null");
            return (Criteria) this;
        }

        public Criteria andPlimitEqualTo(String value) {
            addCriterion("plimit =", value, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitNotEqualTo(String value) {
            addCriterion("plimit <>", value, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitGreaterThan(String value) {
            addCriterion("plimit >", value, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitGreaterThanOrEqualTo(String value) {
            addCriterion("plimit >=", value, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitLessThan(String value) {
            addCriterion("plimit <", value, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitLessThanOrEqualTo(String value) {
            addCriterion("plimit <=", value, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitLike(String value) {
            addCriterion("plimit like", value, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitNotLike(String value) {
            addCriterion("plimit not like", value, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitIn(List<String> values) {
            addCriterion("plimit in", values, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitNotIn(List<String> values) {
            addCriterion("plimit not in", values, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitBetween(String value1, String value2) {
            addCriterion("plimit between", value1, value2, "plimit");
            return (Criteria) this;
        }

        public Criteria andPlimitNotBetween(String value1, String value2) {
            addCriterion("plimit not between", value1, value2, "plimit");
            return (Criteria) this;
        }

        public Criteria andPearningsIsNull() {
            addCriterion("pearnings is null");
            return (Criteria) this;
        }

        public Criteria andPearningsIsNotNull() {
            addCriterion("pearnings is not null");
            return (Criteria) this;
        }

        public Criteria andPearningsEqualTo(String value) {
            addCriterion("pearnings =", value, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsNotEqualTo(String value) {
            addCriterion("pearnings <>", value, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsGreaterThan(String value) {
            addCriterion("pearnings >", value, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsGreaterThanOrEqualTo(String value) {
            addCriterion("pearnings >=", value, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsLessThan(String value) {
            addCriterion("pearnings <", value, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsLessThanOrEqualTo(String value) {
            addCriterion("pearnings <=", value, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsLike(String value) {
            addCriterion("pearnings like", value, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsNotLike(String value) {
            addCriterion("pearnings not like", value, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsIn(List<String> values) {
            addCriterion("pearnings in", values, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsNotIn(List<String> values) {
            addCriterion("pearnings not in", values, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsBetween(String value1, String value2) {
            addCriterion("pearnings between", value1, value2, "pearnings");
            return (Criteria) this;
        }

        public Criteria andPearningsNotBetween(String value1, String value2) {
            addCriterion("pearnings not between", value1, value2, "pearnings");
            return (Criteria) this;
        }

        public Criteria andNetvalueIsNull() {
            addCriterion("netvalue is null");
            return (Criteria) this;
        }

        public Criteria andNetvalueIsNotNull() {
            addCriterion("netvalue is not null");
            return (Criteria) this;
        }

        public Criteria andNetvalueEqualTo(String value) {
            addCriterion("netvalue =", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotEqualTo(String value) {
            addCriterion("netvalue <>", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueGreaterThan(String value) {
            addCriterion("netvalue >", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueGreaterThanOrEqualTo(String value) {
            addCriterion("netvalue >=", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueLessThan(String value) {
            addCriterion("netvalue <", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueLessThanOrEqualTo(String value) {
            addCriterion("netvalue <=", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueLike(String value) {
            addCriterion("netvalue like", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotLike(String value) {
            addCriterion("netvalue not like", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueIn(List<String> values) {
            addCriterion("netvalue in", values, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotIn(List<String> values) {
            addCriterion("netvalue not in", values, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueBetween(String value1, String value2) {
            addCriterion("netvalue between", value1, value2, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotBetween(String value1, String value2) {
            addCriterion("netvalue not between", value1, value2, "netvalue");
            return (Criteria) this;
        }

        public Criteria andPstausIsNull() {
            addCriterion("pstaus is null");
            return (Criteria) this;
        }

        public Criteria andPstausIsNotNull() {
            addCriterion("pstaus is not null");
            return (Criteria) this;
        }

        public Criteria andPstausEqualTo(String value) {
            addCriterion("pstaus =", value, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausNotEqualTo(String value) {
            addCriterion("pstaus <>", value, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausGreaterThan(String value) {
            addCriterion("pstaus >", value, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausGreaterThanOrEqualTo(String value) {
            addCriterion("pstaus >=", value, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausLessThan(String value) {
            addCriterion("pstaus <", value, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausLessThanOrEqualTo(String value) {
            addCriterion("pstaus <=", value, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausLike(String value) {
            addCriterion("pstaus like", value, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausNotLike(String value) {
            addCriterion("pstaus not like", value, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausIn(List<String> values) {
            addCriterion("pstaus in", values, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausNotIn(List<String> values) {
            addCriterion("pstaus not in", values, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausBetween(String value1, String value2) {
            addCriterion("pstaus between", value1, value2, "pstaus");
            return (Criteria) this;
        }

        public Criteria andPstausNotBetween(String value1, String value2) {
            addCriterion("pstaus not between", value1, value2, "pstaus");
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andTrusteeIsNull() {
            addCriterion("trustee is null");
            return (Criteria) this;
        }

        public Criteria andTrusteeIsNotNull() {
            addCriterion("trustee is not null");
            return (Criteria) this;
        }

        public Criteria andTrusteeEqualTo(String value) {
            addCriterion("trustee =", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeNotEqualTo(String value) {
            addCriterion("trustee <>", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeGreaterThan(String value) {
            addCriterion("trustee >", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeGreaterThanOrEqualTo(String value) {
            addCriterion("trustee >=", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeLessThan(String value) {
            addCriterion("trustee <", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeLessThanOrEqualTo(String value) {
            addCriterion("trustee <=", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeLike(String value) {
            addCriterion("trustee like", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeNotLike(String value) {
            addCriterion("trustee not like", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeIn(List<String> values) {
            addCriterion("trustee in", values, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeNotIn(List<String> values) {
            addCriterion("trustee not in", values, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeBetween(String value1, String value2) {
            addCriterion("trustee between", value1, value2, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeNotBetween(String value1, String value2) {
            addCriterion("trustee not between", value1, value2, "trustee");
            return (Criteria) this;
        }

        public Criteria andAdviserIsNull() {
            addCriterion("adviser is null");
            return (Criteria) this;
        }

        public Criteria andAdviserIsNotNull() {
            addCriterion("adviser is not null");
            return (Criteria) this;
        }

        public Criteria andAdviserEqualTo(String value) {
            addCriterion("adviser =", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserNotEqualTo(String value) {
            addCriterion("adviser <>", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserGreaterThan(String value) {
            addCriterion("adviser >", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserGreaterThanOrEqualTo(String value) {
            addCriterion("adviser >=", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserLessThan(String value) {
            addCriterion("adviser <", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserLessThanOrEqualTo(String value) {
            addCriterion("adviser <=", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserLike(String value) {
            addCriterion("adviser like", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserNotLike(String value) {
            addCriterion("adviser not like", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserIn(List<String> values) {
            addCriterion("adviser in", values, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserNotIn(List<String> values) {
            addCriterion("adviser not in", values, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserBetween(String value1, String value2) {
            addCriterion("adviser between", value1, value2, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserNotBetween(String value1, String value2) {
            addCriterion("adviser not between", value1, value2, "adviser");
            return (Criteria) this;
        }

        public Criteria andBrokerIsNull() {
            addCriterion("broker is null");
            return (Criteria) this;
        }

        public Criteria andBrokerIsNotNull() {
            addCriterion("broker is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerEqualTo(String value) {
            addCriterion("broker =", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerNotEqualTo(String value) {
            addCriterion("broker <>", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerGreaterThan(String value) {
            addCriterion("broker >", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerGreaterThanOrEqualTo(String value) {
            addCriterion("broker >=", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerLessThan(String value) {
            addCriterion("broker <", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerLessThanOrEqualTo(String value) {
            addCriterion("broker <=", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerLike(String value) {
            addCriterion("broker like", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerNotLike(String value) {
            addCriterion("broker not like", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerIn(List<String> values) {
            addCriterion("broker in", values, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerNotIn(List<String> values) {
            addCriterion("broker not in", values, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerBetween(String value1, String value2) {
            addCriterion("broker between", value1, value2, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerNotBetween(String value1, String value2) {
            addCriterion("broker not between", value1, value2, "broker");
            return (Criteria) this;
        }

        public Criteria andPdeadlineIsNull() {
            addCriterion("pdeadline is null");
            return (Criteria) this;
        }

        public Criteria andPdeadlineIsNotNull() {
            addCriterion("pdeadline is not null");
            return (Criteria) this;
        }

        public Criteria andPdeadlineEqualTo(String value) {
            addCriterion("pdeadline =", value, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineNotEqualTo(String value) {
            addCriterion("pdeadline <>", value, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineGreaterThan(String value) {
            addCriterion("pdeadline >", value, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("pdeadline >=", value, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineLessThan(String value) {
            addCriterion("pdeadline <", value, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineLessThanOrEqualTo(String value) {
            addCriterion("pdeadline <=", value, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineLike(String value) {
            addCriterion("pdeadline like", value, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineNotLike(String value) {
            addCriterion("pdeadline not like", value, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineIn(List<String> values) {
            addCriterion("pdeadline in", values, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineNotIn(List<String> values) {
            addCriterion("pdeadline not in", values, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineBetween(String value1, String value2) {
            addCriterion("pdeadline between", value1, value2, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andPdeadlineNotBetween(String value1, String value2) {
            addCriterion("pdeadline not between", value1, value2, "pdeadline");
            return (Criteria) this;
        }

        public Criteria andLineofIsNull() {
            addCriterion("lineof is null");
            return (Criteria) this;
        }

        public Criteria andLineofIsNotNull() {
            addCriterion("lineof is not null");
            return (Criteria) this;
        }

        public Criteria andLineofEqualTo(String value) {
            addCriterion("lineof =", value, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofNotEqualTo(String value) {
            addCriterion("lineof <>", value, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofGreaterThan(String value) {
            addCriterion("lineof >", value, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofGreaterThanOrEqualTo(String value) {
            addCriterion("lineof >=", value, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofLessThan(String value) {
            addCriterion("lineof <", value, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofLessThanOrEqualTo(String value) {
            addCriterion("lineof <=", value, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofLike(String value) {
            addCriterion("lineof like", value, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofNotLike(String value) {
            addCriterion("lineof not like", value, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofIn(List<String> values) {
            addCriterion("lineof in", values, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofNotIn(List<String> values) {
            addCriterion("lineof not in", values, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofBetween(String value1, String value2) {
            addCriterion("lineof between", value1, value2, "lineof");
            return (Criteria) this;
        }

        public Criteria andLineofNotBetween(String value1, String value2) {
            addCriterion("lineof not between", value1, value2, "lineof");
            return (Criteria) this;
        }

        public Criteria andLosslineIsNull() {
            addCriterion("lossline is null");
            return (Criteria) this;
        }

        public Criteria andLosslineIsNotNull() {
            addCriterion("lossline is not null");
            return (Criteria) this;
        }

        public Criteria andLosslineEqualTo(String value) {
            addCriterion("lossline =", value, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineNotEqualTo(String value) {
            addCriterion("lossline <>", value, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineGreaterThan(String value) {
            addCriterion("lossline >", value, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineGreaterThanOrEqualTo(String value) {
            addCriterion("lossline >=", value, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineLessThan(String value) {
            addCriterion("lossline <", value, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineLessThanOrEqualTo(String value) {
            addCriterion("lossline <=", value, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineLike(String value) {
            addCriterion("lossline like", value, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineNotLike(String value) {
            addCriterion("lossline not like", value, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineIn(List<String> values) {
            addCriterion("lossline in", values, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineNotIn(List<String> values) {
            addCriterion("lossline not in", values, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineBetween(String value1, String value2) {
            addCriterion("lossline between", value1, value2, "lossline");
            return (Criteria) this;
        }

        public Criteria andLosslineNotBetween(String value1, String value2) {
            addCriterion("lossline not between", value1, value2, "lossline");
            return (Criteria) this;
        }

        public Criteria andSigningperiodIsNull() {
            addCriterion("signingperiod is null");
            return (Criteria) this;
        }

        public Criteria andSigningperiodIsNotNull() {
            addCriterion("signingperiod is not null");
            return (Criteria) this;
        }

        public Criteria andSigningperiodEqualTo(String value) {
            addCriterion("signingperiod =", value, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodNotEqualTo(String value) {
            addCriterion("signingperiod <>", value, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodGreaterThan(String value) {
            addCriterion("signingperiod >", value, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodGreaterThanOrEqualTo(String value) {
            addCriterion("signingperiod >=", value, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodLessThan(String value) {
            addCriterion("signingperiod <", value, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodLessThanOrEqualTo(String value) {
            addCriterion("signingperiod <=", value, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodLike(String value) {
            addCriterion("signingperiod like", value, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodNotLike(String value) {
            addCriterion("signingperiod not like", value, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodIn(List<String> values) {
            addCriterion("signingperiod in", values, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodNotIn(List<String> values) {
            addCriterion("signingperiod not in", values, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodBetween(String value1, String value2) {
            addCriterion("signingperiod between", value1, value2, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andSigningperiodNotBetween(String value1, String value2) {
            addCriterion("signingperiod not between", value1, value2, "signingperiod");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("enddate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("enddate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNull() {
            addCriterion("financing is null");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNotNull() {
            addCriterion("financing is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingEqualTo(String value) {
            addCriterion("financing =", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotEqualTo(String value) {
            addCriterion("financing <>", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThan(String value) {
            addCriterion("financing >", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThanOrEqualTo(String value) {
            addCriterion("financing >=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThan(String value) {
            addCriterion("financing <", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThanOrEqualTo(String value) {
            addCriterion("financing <=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLike(String value) {
            addCriterion("financing like", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotLike(String value) {
            addCriterion("financing not like", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingIn(List<String> values) {
            addCriterion("financing in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotIn(List<String> values) {
            addCriterion("financing not in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingBetween(String value1, String value2) {
            addCriterion("financing between", value1, value2, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotBetween(String value1, String value2) {
            addCriterion("financing not between", value1, value2, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingnameIsNull() {
            addCriterion("financingname is null");
            return (Criteria) this;
        }

        public Criteria andFinancingnameIsNotNull() {
            addCriterion("financingname is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingnameEqualTo(String value) {
            addCriterion("financingname =", value, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameNotEqualTo(String value) {
            addCriterion("financingname <>", value, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameGreaterThan(String value) {
            addCriterion("financingname >", value, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameGreaterThanOrEqualTo(String value) {
            addCriterion("financingname >=", value, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameLessThan(String value) {
            addCriterion("financingname <", value, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameLessThanOrEqualTo(String value) {
            addCriterion("financingname <=", value, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameLike(String value) {
            addCriterion("financingname like", value, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameNotLike(String value) {
            addCriterion("financingname not like", value, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameIn(List<String> values) {
            addCriterion("financingname in", values, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameNotIn(List<String> values) {
            addCriterion("financingname not in", values, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameBetween(String value1, String value2) {
            addCriterion("financingname between", value1, value2, "financingname");
            return (Criteria) this;
        }

        public Criteria andFinancingnameNotBetween(String value1, String value2) {
            addCriterion("financingname not between", value1, value2, "financingname");
            return (Criteria) this;
        }

        public Criteria andRaisewayIsNull() {
            addCriterion("raiseway is null");
            return (Criteria) this;
        }

        public Criteria andRaisewayIsNotNull() {
            addCriterion("raiseway is not null");
            return (Criteria) this;
        }

        public Criteria andRaisewayEqualTo(String value) {
            addCriterion("raiseway =", value, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayNotEqualTo(String value) {
            addCriterion("raiseway <>", value, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayGreaterThan(String value) {
            addCriterion("raiseway >", value, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayGreaterThanOrEqualTo(String value) {
            addCriterion("raiseway >=", value, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayLessThan(String value) {
            addCriterion("raiseway <", value, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayLessThanOrEqualTo(String value) {
            addCriterion("raiseway <=", value, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayLike(String value) {
            addCriterion("raiseway like", value, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayNotLike(String value) {
            addCriterion("raiseway not like", value, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayIn(List<String> values) {
            addCriterion("raiseway in", values, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayNotIn(List<String> values) {
            addCriterion("raiseway not in", values, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayBetween(String value1, String value2) {
            addCriterion("raiseway between", value1, value2, "raiseway");
            return (Criteria) this;
        }

        public Criteria andRaisewayNotBetween(String value1, String value2) {
            addCriterion("raiseway not between", value1, value2, "raiseway");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andReservationstartIsNull() {
            addCriterion("reservationstart is null");
            return (Criteria) this;
        }

        public Criteria andReservationstartIsNotNull() {
            addCriterion("reservationstart is not null");
            return (Criteria) this;
        }

        public Criteria andReservationstartEqualTo(String value) {
            addCriterion("reservationstart =", value, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartNotEqualTo(String value) {
            addCriterion("reservationstart <>", value, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartGreaterThan(String value) {
            addCriterion("reservationstart >", value, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartGreaterThanOrEqualTo(String value) {
            addCriterion("reservationstart >=", value, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartLessThan(String value) {
            addCriterion("reservationstart <", value, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartLessThanOrEqualTo(String value) {
            addCriterion("reservationstart <=", value, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartLike(String value) {
            addCriterion("reservationstart like", value, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartNotLike(String value) {
            addCriterion("reservationstart not like", value, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartIn(List<String> values) {
            addCriterion("reservationstart in", values, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartNotIn(List<String> values) {
            addCriterion("reservationstart not in", values, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartBetween(String value1, String value2) {
            addCriterion("reservationstart between", value1, value2, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationstartNotBetween(String value1, String value2) {
            addCriterion("reservationstart not between", value1, value2, "reservationstart");
            return (Criteria) this;
        }

        public Criteria andReservationendIsNull() {
            addCriterion("reservationend is null");
            return (Criteria) this;
        }

        public Criteria andReservationendIsNotNull() {
            addCriterion("reservationend is not null");
            return (Criteria) this;
        }

        public Criteria andReservationendEqualTo(String value) {
            addCriterion("reservationend =", value, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendNotEqualTo(String value) {
            addCriterion("reservationend <>", value, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendGreaterThan(String value) {
            addCriterion("reservationend >", value, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendGreaterThanOrEqualTo(String value) {
            addCriterion("reservationend >=", value, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendLessThan(String value) {
            addCriterion("reservationend <", value, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendLessThanOrEqualTo(String value) {
            addCriterion("reservationend <=", value, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendLike(String value) {
            addCriterion("reservationend like", value, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendNotLike(String value) {
            addCriterion("reservationend not like", value, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendIn(List<String> values) {
            addCriterion("reservationend in", values, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendNotIn(List<String> values) {
            addCriterion("reservationend not in", values, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendBetween(String value1, String value2) {
            addCriterion("reservationend between", value1, value2, "reservationend");
            return (Criteria) this;
        }

        public Criteria andReservationendNotBetween(String value1, String value2) {
            addCriterion("reservationend not between", value1, value2, "reservationend");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthIsNull() {
            addCriterion("currentnetworth is null");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthIsNotNull() {
            addCriterion("currentnetworth is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthEqualTo(String value) {
            addCriterion("currentnetworth =", value, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthNotEqualTo(String value) {
            addCriterion("currentnetworth <>", value, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthGreaterThan(String value) {
            addCriterion("currentnetworth >", value, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthGreaterThanOrEqualTo(String value) {
            addCriterion("currentnetworth >=", value, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthLessThan(String value) {
            addCriterion("currentnetworth <", value, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthLessThanOrEqualTo(String value) {
            addCriterion("currentnetworth <=", value, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthLike(String value) {
            addCriterion("currentnetworth like", value, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthNotLike(String value) {
            addCriterion("currentnetworth not like", value, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthIn(List<String> values) {
            addCriterion("currentnetworth in", values, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthNotIn(List<String> values) {
            addCriterion("currentnetworth not in", values, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthBetween(String value1, String value2) {
            addCriterion("currentnetworth between", value1, value2, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andCurrentnetworthNotBetween(String value1, String value2) {
            addCriterion("currentnetworth not between", value1, value2, "currentnetworth");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andPhighlightsIsNull() {
            addCriterion("phighlights is null");
            return (Criteria) this;
        }

        public Criteria andPhighlightsIsNotNull() {
            addCriterion("phighlights is not null");
            return (Criteria) this;
        }

        public Criteria andPhighlightsEqualTo(String value) {
            addCriterion("phighlights =", value, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsNotEqualTo(String value) {
            addCriterion("phighlights <>", value, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsGreaterThan(String value) {
            addCriterion("phighlights >", value, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsGreaterThanOrEqualTo(String value) {
            addCriterion("phighlights >=", value, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsLessThan(String value) {
            addCriterion("phighlights <", value, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsLessThanOrEqualTo(String value) {
            addCriterion("phighlights <=", value, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsLike(String value) {
            addCriterion("phighlights like", value, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsNotLike(String value) {
            addCriterion("phighlights not like", value, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsIn(List<String> values) {
            addCriterion("phighlights in", values, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsNotIn(List<String> values) {
            addCriterion("phighlights not in", values, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsBetween(String value1, String value2) {
            addCriterion("phighlights between", value1, value2, "phighlights");
            return (Criteria) this;
        }

        public Criteria andPhighlightsNotBetween(String value1, String value2) {
            addCriterion("phighlights not between", value1, value2, "phighlights");
            return (Criteria) this;
        }

        public Criteria andMobilityIsNull() {
            addCriterion("mobility is null");
            return (Criteria) this;
        }

        public Criteria andMobilityIsNotNull() {
            addCriterion("mobility is not null");
            return (Criteria) this;
        }

        public Criteria andMobilityEqualTo(String value) {
            addCriterion("mobility =", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityNotEqualTo(String value) {
            addCriterion("mobility <>", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityGreaterThan(String value) {
            addCriterion("mobility >", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityGreaterThanOrEqualTo(String value) {
            addCriterion("mobility >=", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityLessThan(String value) {
            addCriterion("mobility <", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityLessThanOrEqualTo(String value) {
            addCriterion("mobility <=", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityLike(String value) {
            addCriterion("mobility like", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityNotLike(String value) {
            addCriterion("mobility not like", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityIn(List<String> values) {
            addCriterion("mobility in", values, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityNotIn(List<String> values) {
            addCriterion("mobility not in", values, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityBetween(String value1, String value2) {
            addCriterion("mobility between", value1, value2, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityNotBetween(String value1, String value2) {
            addCriterion("mobility not between", value1, value2, "mobility");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyIsNull() {
            addCriterion("joinmoney is null");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyIsNotNull() {
            addCriterion("joinmoney is not null");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyEqualTo(String value) {
            addCriterion("joinmoney =", value, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyNotEqualTo(String value) {
            addCriterion("joinmoney <>", value, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyGreaterThan(String value) {
            addCriterion("joinmoney >", value, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("joinmoney >=", value, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyLessThan(String value) {
            addCriterion("joinmoney <", value, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyLessThanOrEqualTo(String value) {
            addCriterion("joinmoney <=", value, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyLike(String value) {
            addCriterion("joinmoney like", value, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyNotLike(String value) {
            addCriterion("joinmoney not like", value, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyIn(List<String> values) {
            addCriterion("joinmoney in", values, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyNotIn(List<String> values) {
            addCriterion("joinmoney not in", values, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyBetween(String value1, String value2) {
            addCriterion("joinmoney between", value1, value2, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andJoinmoneyNotBetween(String value1, String value2) {
            addCriterion("joinmoney not between", value1, value2, "joinmoney");
            return (Criteria) this;
        }

        public Criteria andCoststructureIsNull() {
            addCriterion("coststructure is null");
            return (Criteria) this;
        }

        public Criteria andCoststructureIsNotNull() {
            addCriterion("coststructure is not null");
            return (Criteria) this;
        }

        public Criteria andCoststructureEqualTo(String value) {
            addCriterion("coststructure =", value, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureNotEqualTo(String value) {
            addCriterion("coststructure <>", value, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureGreaterThan(String value) {
            addCriterion("coststructure >", value, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureGreaterThanOrEqualTo(String value) {
            addCriterion("coststructure >=", value, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureLessThan(String value) {
            addCriterion("coststructure <", value, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureLessThanOrEqualTo(String value) {
            addCriterion("coststructure <=", value, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureLike(String value) {
            addCriterion("coststructure like", value, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureNotLike(String value) {
            addCriterion("coststructure not like", value, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureIn(List<String> values) {
            addCriterion("coststructure in", values, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureNotIn(List<String> values) {
            addCriterion("coststructure not in", values, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureBetween(String value1, String value2) {
            addCriterion("coststructure between", value1, value2, "coststructure");
            return (Criteria) this;
        }

        public Criteria andCoststructureNotBetween(String value1, String value2) {
            addCriterion("coststructure not between", value1, value2, "coststructure");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNull() {
            addCriterion("distribution is null");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNotNull() {
            addCriterion("distribution is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionEqualTo(String value) {
            addCriterion("distribution =", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotEqualTo(String value) {
            addCriterion("distribution <>", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThan(String value) {
            addCriterion("distribution >", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThanOrEqualTo(String value) {
            addCriterion("distribution >=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThan(String value) {
            addCriterion("distribution <", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThanOrEqualTo(String value) {
            addCriterion("distribution <=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLike(String value) {
            addCriterion("distribution like", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotLike(String value) {
            addCriterion("distribution not like", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionIn(List<String> values) {
            addCriterion("distribution in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotIn(List<String> values) {
            addCriterion("distribution not in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionBetween(String value1, String value2) {
            addCriterion("distribution between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotBetween(String value1, String value2) {
            addCriterion("distribution not between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andPdetailIsNull() {
            addCriterion("pdetail is null");
            return (Criteria) this;
        }

        public Criteria andPdetailIsNotNull() {
            addCriterion("pdetail is not null");
            return (Criteria) this;
        }

        public Criteria andPdetailEqualTo(String value) {
            addCriterion("pdetail =", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotEqualTo(String value) {
            addCriterion("pdetail <>", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailGreaterThan(String value) {
            addCriterion("pdetail >", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailGreaterThanOrEqualTo(String value) {
            addCriterion("pdetail >=", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLessThan(String value) {
            addCriterion("pdetail <", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLessThanOrEqualTo(String value) {
            addCriterion("pdetail <=", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLike(String value) {
            addCriterion("pdetail like", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotLike(String value) {
            addCriterion("pdetail not like", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailIn(List<String> values) {
            addCriterion("pdetail in", values, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotIn(List<String> values) {
            addCriterion("pdetail not in", values, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailBetween(String value1, String value2) {
            addCriterion("pdetail between", value1, value2, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotBetween(String value1, String value2) {
            addCriterion("pdetail not between", value1, value2, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPevaluationIsNull() {
            addCriterion("pevaluation is null");
            return (Criteria) this;
        }

        public Criteria andPevaluationIsNotNull() {
            addCriterion("pevaluation is not null");
            return (Criteria) this;
        }

        public Criteria andPevaluationEqualTo(String value) {
            addCriterion("pevaluation =", value, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationNotEqualTo(String value) {
            addCriterion("pevaluation <>", value, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationGreaterThan(String value) {
            addCriterion("pevaluation >", value, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationGreaterThanOrEqualTo(String value) {
            addCriterion("pevaluation >=", value, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationLessThan(String value) {
            addCriterion("pevaluation <", value, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationLessThanOrEqualTo(String value) {
            addCriterion("pevaluation <=", value, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationLike(String value) {
            addCriterion("pevaluation like", value, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationNotLike(String value) {
            addCriterion("pevaluation not like", value, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationIn(List<String> values) {
            addCriterion("pevaluation in", values, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationNotIn(List<String> values) {
            addCriterion("pevaluation not in", values, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationBetween(String value1, String value2) {
            addCriterion("pevaluation between", value1, value2, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPevaluationNotBetween(String value1, String value2) {
            addCriterion("pevaluation not between", value1, value2, "pevaluation");
            return (Criteria) this;
        }

        public Criteria andPmaterialIsNull() {
            addCriterion("pmaterial is null");
            return (Criteria) this;
        }

        public Criteria andPmaterialIsNotNull() {
            addCriterion("pmaterial is not null");
            return (Criteria) this;
        }

        public Criteria andPmaterialEqualTo(String value) {
            addCriterion("pmaterial =", value, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialNotEqualTo(String value) {
            addCriterion("pmaterial <>", value, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialGreaterThan(String value) {
            addCriterion("pmaterial >", value, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialGreaterThanOrEqualTo(String value) {
            addCriterion("pmaterial >=", value, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialLessThan(String value) {
            addCriterion("pmaterial <", value, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialLessThanOrEqualTo(String value) {
            addCriterion("pmaterial <=", value, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialLike(String value) {
            addCriterion("pmaterial like", value, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialNotLike(String value) {
            addCriterion("pmaterial not like", value, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialIn(List<String> values) {
            addCriterion("pmaterial in", values, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialNotIn(List<String> values) {
            addCriterion("pmaterial not in", values, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialBetween(String value1, String value2) {
            addCriterion("pmaterial between", value1, value2, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andPmaterialNotBetween(String value1, String value2) {
            addCriterion("pmaterial not between", value1, value2, "pmaterial");
            return (Criteria) this;
        }

        public Criteria andGoalsIsNull() {
            addCriterion("goals is null");
            return (Criteria) this;
        }

        public Criteria andGoalsIsNotNull() {
            addCriterion("goals is not null");
            return (Criteria) this;
        }

        public Criteria andGoalsEqualTo(String value) {
            addCriterion("goals =", value, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsNotEqualTo(String value) {
            addCriterion("goals <>", value, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsGreaterThan(String value) {
            addCriterion("goals >", value, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsGreaterThanOrEqualTo(String value) {
            addCriterion("goals >=", value, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsLessThan(String value) {
            addCriterion("goals <", value, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsLessThanOrEqualTo(String value) {
            addCriterion("goals <=", value, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsLike(String value) {
            addCriterion("goals like", value, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsNotLike(String value) {
            addCriterion("goals not like", value, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsIn(List<String> values) {
            addCriterion("goals in", values, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsNotIn(List<String> values) {
            addCriterion("goals not in", values, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsBetween(String value1, String value2) {
            addCriterion("goals between", value1, value2, "goals");
            return (Criteria) this;
        }

        public Criteria andGoalsNotBetween(String value1, String value2) {
            addCriterion("goals not between", value1, value2, "goals");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeIsNull() {
            addCriterion("investmentscope is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeIsNotNull() {
            addCriterion("investmentscope is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeEqualTo(String value) {
            addCriterion("investmentscope =", value, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeNotEqualTo(String value) {
            addCriterion("investmentscope <>", value, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeGreaterThan(String value) {
            addCriterion("investmentscope >", value, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeGreaterThanOrEqualTo(String value) {
            addCriterion("investmentscope >=", value, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeLessThan(String value) {
            addCriterion("investmentscope <", value, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeLessThanOrEqualTo(String value) {
            addCriterion("investmentscope <=", value, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeLike(String value) {
            addCriterion("investmentscope like", value, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeNotLike(String value) {
            addCriterion("investmentscope not like", value, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeIn(List<String> values) {
            addCriterion("investmentscope in", values, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeNotIn(List<String> values) {
            addCriterion("investmentscope not in", values, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeBetween(String value1, String value2) {
            addCriterion("investmentscope between", value1, value2, "investmentscope");
            return (Criteria) this;
        }

        public Criteria andInvestmentscopeNotBetween(String value1, String value2) {
            addCriterion("investmentscope not between", value1, value2, "investmentscope");
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

        public Criteria andPtypeIsNull() {
            addCriterion("ptype is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("ptype is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(String value) {
            addCriterion("ptype =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(String value) {
            addCriterion("ptype <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(String value) {
            addCriterion("ptype >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ptype >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(String value) {
            addCriterion("ptype <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(String value) {
            addCriterion("ptype <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLike(String value) {
            addCriterion("ptype like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotLike(String value) {
            addCriterion("ptype not like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<String> values) {
            addCriterion("ptype in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<String> values) {
            addCriterion("ptype not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(String value1, String value2) {
            addCriterion("ptype between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(String value1, String value2) {
            addCriterion("ptype not between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andRiskgradeIsNull() {
            addCriterion("riskgrade is null");
            return (Criteria) this;
        }

        public Criteria andRiskgradeIsNotNull() {
            addCriterion("riskgrade is not null");
            return (Criteria) this;
        }

        public Criteria andRiskgradeEqualTo(String value) {
            addCriterion("riskgrade =", value, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeNotEqualTo(String value) {
            addCriterion("riskgrade <>", value, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeGreaterThan(String value) {
            addCriterion("riskgrade >", value, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeGreaterThanOrEqualTo(String value) {
            addCriterion("riskgrade >=", value, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeLessThan(String value) {
            addCriterion("riskgrade <", value, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeLessThanOrEqualTo(String value) {
            addCriterion("riskgrade <=", value, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeLike(String value) {
            addCriterion("riskgrade like", value, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeNotLike(String value) {
            addCriterion("riskgrade not like", value, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeIn(List<String> values) {
            addCriterion("riskgrade in", values, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeNotIn(List<String> values) {
            addCriterion("riskgrade not in", values, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeBetween(String value1, String value2) {
            addCriterion("riskgrade between", value1, value2, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andRiskgradeNotBetween(String value1, String value2) {
            addCriterion("riskgrade not between", value1, value2, "riskgrade");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineIsNull() {
            addCriterion("biddeadline is null");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineIsNotNull() {
            addCriterion("biddeadline is not null");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineEqualTo(String value) {
            addCriterion("biddeadline =", value, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineNotEqualTo(String value) {
            addCriterion("biddeadline <>", value, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineGreaterThan(String value) {
            addCriterion("biddeadline >", value, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("biddeadline >=", value, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineLessThan(String value) {
            addCriterion("biddeadline <", value, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineLessThanOrEqualTo(String value) {
            addCriterion("biddeadline <=", value, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineLike(String value) {
            addCriterion("biddeadline like", value, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineNotLike(String value) {
            addCriterion("biddeadline not like", value, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineIn(List<String> values) {
            addCriterion("biddeadline in", values, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineNotIn(List<String> values) {
            addCriterion("biddeadline not in", values, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineBetween(String value1, String value2) {
            addCriterion("biddeadline between", value1, value2, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andBiddeadlineNotBetween(String value1, String value2) {
            addCriterion("biddeadline not between", value1, value2, "biddeadline");
            return (Criteria) this;
        }

        public Criteria andProdelIsNull() {
            addCriterion("prodel is null");
            return (Criteria) this;
        }

        public Criteria andProdelIsNotNull() {
            addCriterion("prodel is not null");
            return (Criteria) this;
        }

        public Criteria andProdelEqualTo(Integer value) {
            addCriterion("prodel =", value, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelNotEqualTo(Integer value) {
            addCriterion("prodel <>", value, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelGreaterThan(Integer value) {
            addCriterion("prodel >", value, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("prodel >=", value, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelLessThan(Integer value) {
            addCriterion("prodel <", value, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelLessThanOrEqualTo(Integer value) {
            addCriterion("prodel <=", value, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelIn(List<Integer> values) {
            addCriterion("prodel in", values, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelNotIn(List<Integer> values) {
            addCriterion("prodel not in", values, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelBetween(Integer value1, Integer value2) {
            addCriterion("prodel between", value1, value2, "prodel");
            return (Criteria) this;
        }

        public Criteria andProdelNotBetween(Integer value1, Integer value2) {
            addCriterion("prodel not between", value1, value2, "prodel");
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