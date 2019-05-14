package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class VerificationtableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VerificationtableExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberIsNull() {
            addCriterion("identitycardnumber is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberIsNotNull() {
            addCriterion("identitycardnumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberEqualTo(String value) {
            addCriterion("identitycardnumber =", value, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberNotEqualTo(String value) {
            addCriterion("identitycardnumber <>", value, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberGreaterThan(String value) {
            addCriterion("identitycardnumber >", value, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("identitycardnumber >=", value, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberLessThan(String value) {
            addCriterion("identitycardnumber <", value, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberLessThanOrEqualTo(String value) {
            addCriterion("identitycardnumber <=", value, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberLike(String value) {
            addCriterion("identitycardnumber like", value, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberNotLike(String value) {
            addCriterion("identitycardnumber not like", value, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberIn(List<String> values) {
            addCriterion("identitycardnumber in", values, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberNotIn(List<String> values) {
            addCriterion("identitycardnumber not in", values, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberBetween(String value1, String value2) {
            addCriterion("identitycardnumber between", value1, value2, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnumberNotBetween(String value1, String value2) {
            addCriterion("identitycardnumber not between", value1, value2, "identitycardnumber");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoIsNull() {
            addCriterion("Identitycardphoto is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoIsNotNull() {
            addCriterion("Identitycardphoto is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoEqualTo(String value) {
            addCriterion("Identitycardphoto =", value, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoNotEqualTo(String value) {
            addCriterion("Identitycardphoto <>", value, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoGreaterThan(String value) {
            addCriterion("Identitycardphoto >", value, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoGreaterThanOrEqualTo(String value) {
            addCriterion("Identitycardphoto >=", value, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoLessThan(String value) {
            addCriterion("Identitycardphoto <", value, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoLessThanOrEqualTo(String value) {
            addCriterion("Identitycardphoto <=", value, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoLike(String value) {
            addCriterion("Identitycardphoto like", value, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoNotLike(String value) {
            addCriterion("Identitycardphoto not like", value, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoIn(List<String> values) {
            addCriterion("Identitycardphoto in", values, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoNotIn(List<String> values) {
            addCriterion("Identitycardphoto not in", values, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoBetween(String value1, String value2) {
            addCriterion("Identitycardphoto between", value1, value2, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andIdentitycardphotoNotBetween(String value1, String value2) {
            addCriterion("Identitycardphoto not between", value1, value2, "identitycardphoto");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusIsNull() {
            addCriterion("authenticationstatus is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusIsNotNull() {
            addCriterion("authenticationstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusEqualTo(Integer value) {
            addCriterion("authenticationstatus =", value, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusNotEqualTo(Integer value) {
            addCriterion("authenticationstatus <>", value, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusGreaterThan(Integer value) {
            addCriterion("authenticationstatus >", value, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("authenticationstatus >=", value, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusLessThan(Integer value) {
            addCriterion("authenticationstatus <", value, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusLessThanOrEqualTo(Integer value) {
            addCriterion("authenticationstatus <=", value, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusIn(List<Integer> values) {
            addCriterion("authenticationstatus in", values, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusNotIn(List<Integer> values) {
            addCriterion("authenticationstatus not in", values, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusBetween(Integer value1, Integer value2) {
            addCriterion("authenticationstatus between", value1, value2, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticationstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("authenticationstatus not between", value1, value2, "authenticationstatus");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberIsNull() {
            addCriterion("cellphonenumber is null");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberIsNotNull() {
            addCriterion("cellphonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberEqualTo(String value) {
            addCriterion("cellphonenumber =", value, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberNotEqualTo(String value) {
            addCriterion("cellphonenumber <>", value, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberGreaterThan(String value) {
            addCriterion("cellphonenumber >", value, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("cellphonenumber >=", value, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberLessThan(String value) {
            addCriterion("cellphonenumber <", value, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberLessThanOrEqualTo(String value) {
            addCriterion("cellphonenumber <=", value, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberLike(String value) {
            addCriterion("cellphonenumber like", value, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberNotLike(String value) {
            addCriterion("cellphonenumber not like", value, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberIn(List<String> values) {
            addCriterion("cellphonenumber in", values, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberNotIn(List<String> values) {
            addCriterion("cellphonenumber not in", values, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberBetween(String value1, String value2) {
            addCriterion("cellphonenumber between", value1, value2, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andCellphonenumberNotBetween(String value1, String value2) {
            addCriterion("cellphonenumber not between", value1, value2, "cellphonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonestausIsNull() {
            addCriterion("phonestaus is null");
            return (Criteria) this;
        }

        public Criteria andPhonestausIsNotNull() {
            addCriterion("phonestaus is not null");
            return (Criteria) this;
        }

        public Criteria andPhonestausEqualTo(Integer value) {
            addCriterion("phonestaus =", value, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausNotEqualTo(Integer value) {
            addCriterion("phonestaus <>", value, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausGreaterThan(Integer value) {
            addCriterion("phonestaus >", value, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausGreaterThanOrEqualTo(Integer value) {
            addCriterion("phonestaus >=", value, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausLessThan(Integer value) {
            addCriterion("phonestaus <", value, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausLessThanOrEqualTo(Integer value) {
            addCriterion("phonestaus <=", value, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausIn(List<Integer> values) {
            addCriterion("phonestaus in", values, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausNotIn(List<Integer> values) {
            addCriterion("phonestaus not in", values, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausBetween(Integer value1, Integer value2) {
            addCriterion("phonestaus between", value1, value2, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andPhonestausNotBetween(Integer value1, Integer value2) {
            addCriterion("phonestaus not between", value1, value2, "phonestaus");
            return (Criteria) this;
        }

        public Criteria andEmileIsNull() {
            addCriterion("emile is null");
            return (Criteria) this;
        }

        public Criteria andEmileIsNotNull() {
            addCriterion("emile is not null");
            return (Criteria) this;
        }

        public Criteria andEmileEqualTo(String value) {
            addCriterion("emile =", value, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileNotEqualTo(String value) {
            addCriterion("emile <>", value, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileGreaterThan(String value) {
            addCriterion("emile >", value, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileGreaterThanOrEqualTo(String value) {
            addCriterion("emile >=", value, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileLessThan(String value) {
            addCriterion("emile <", value, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileLessThanOrEqualTo(String value) {
            addCriterion("emile <=", value, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileLike(String value) {
            addCriterion("emile like", value, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileNotLike(String value) {
            addCriterion("emile not like", value, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileIn(List<String> values) {
            addCriterion("emile in", values, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileNotIn(List<String> values) {
            addCriterion("emile not in", values, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileBetween(String value1, String value2) {
            addCriterion("emile between", value1, value2, "emile");
            return (Criteria) this;
        }

        public Criteria andEmileNotBetween(String value1, String value2) {
            addCriterion("emile not between", value1, value2, "emile");
            return (Criteria) this;
        }

        public Criteria andEmilestausIsNull() {
            addCriterion("emilestaus is null");
            return (Criteria) this;
        }

        public Criteria andEmilestausIsNotNull() {
            addCriterion("emilestaus is not null");
            return (Criteria) this;
        }

        public Criteria andEmilestausEqualTo(Integer value) {
            addCriterion("emilestaus =", value, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausNotEqualTo(Integer value) {
            addCriterion("emilestaus <>", value, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausGreaterThan(Integer value) {
            addCriterion("emilestaus >", value, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausGreaterThanOrEqualTo(Integer value) {
            addCriterion("emilestaus >=", value, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausLessThan(Integer value) {
            addCriterion("emilestaus <", value, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausLessThanOrEqualTo(Integer value) {
            addCriterion("emilestaus <=", value, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausIn(List<Integer> values) {
            addCriterion("emilestaus in", values, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausNotIn(List<Integer> values) {
            addCriterion("emilestaus not in", values, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausBetween(Integer value1, Integer value2) {
            addCriterion("emilestaus between", value1, value2, "emilestaus");
            return (Criteria) this;
        }

        public Criteria andEmilestausNotBetween(Integer value1, Integer value2) {
            addCriterion("emilestaus not between", value1, value2, "emilestaus");
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

        public Criteria andVerdelIsNull() {
            addCriterion("verdel is null");
            return (Criteria) this;
        }

        public Criteria andVerdelIsNotNull() {
            addCriterion("verdel is not null");
            return (Criteria) this;
        }

        public Criteria andVerdelEqualTo(Integer value) {
            addCriterion("verdel =", value, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelNotEqualTo(Integer value) {
            addCriterion("verdel <>", value, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelGreaterThan(Integer value) {
            addCriterion("verdel >", value, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("verdel >=", value, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelLessThan(Integer value) {
            addCriterion("verdel <", value, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelLessThanOrEqualTo(Integer value) {
            addCriterion("verdel <=", value, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelIn(List<Integer> values) {
            addCriterion("verdel in", values, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelNotIn(List<Integer> values) {
            addCriterion("verdel not in", values, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelBetween(Integer value1, Integer value2) {
            addCriterion("verdel between", value1, value2, "verdel");
            return (Criteria) this;
        }

        public Criteria andVerdelNotBetween(Integer value1, Integer value2) {
            addCriterion("verdel not between", value1, value2, "verdel");
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