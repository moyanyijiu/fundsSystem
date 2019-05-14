package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
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

        public Criteria andOrdertimeIsNull() {
            addCriterion("ordertime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ordertime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(String value) {
            addCriterion("ordertime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(String value) {
            addCriterion("ordertime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(String value) {
            addCriterion("ordertime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(String value) {
            addCriterion("ordertime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(String value) {
            addCriterion("ordertime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(String value) {
            addCriterion("ordertime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLike(String value) {
            addCriterion("ordertime like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotLike(String value) {
            addCriterion("ordertime not like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<String> values) {
            addCriterion("ordertime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<String> values) {
            addCriterion("ordertime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(String value1, String value2) {
            addCriterion("ordertime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(String value1, String value2) {
            addCriterion("ordertime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldIsNull() {
            addCriterion("expectedyield is null");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldIsNotNull() {
            addCriterion("expectedyield is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldEqualTo(String value) {
            addCriterion("expectedyield =", value, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldNotEqualTo(String value) {
            addCriterion("expectedyield <>", value, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldGreaterThan(String value) {
            addCriterion("expectedyield >", value, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldGreaterThanOrEqualTo(String value) {
            addCriterion("expectedyield >=", value, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldLessThan(String value) {
            addCriterion("expectedyield <", value, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldLessThanOrEqualTo(String value) {
            addCriterion("expectedyield <=", value, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldLike(String value) {
            addCriterion("expectedyield like", value, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldNotLike(String value) {
            addCriterion("expectedyield not like", value, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldIn(List<String> values) {
            addCriterion("expectedyield in", values, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldNotIn(List<String> values) {
            addCriterion("expectedyield not in", values, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldBetween(String value1, String value2) {
            addCriterion("expectedyield between", value1, value2, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andExpectedyieldNotBetween(String value1, String value2) {
            addCriterion("expectedyield not between", value1, value2, "expectedyield");
            return (Criteria) this;
        }

        public Criteria andReservationamountIsNull() {
            addCriterion("reservationamount is null");
            return (Criteria) this;
        }

        public Criteria andReservationamountIsNotNull() {
            addCriterion("reservationamount is not null");
            return (Criteria) this;
        }

        public Criteria andReservationamountEqualTo(String value) {
            addCriterion("reservationamount =", value, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountNotEqualTo(String value) {
            addCriterion("reservationamount <>", value, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountGreaterThan(String value) {
            addCriterion("reservationamount >", value, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountGreaterThanOrEqualTo(String value) {
            addCriterion("reservationamount >=", value, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountLessThan(String value) {
            addCriterion("reservationamount <", value, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountLessThanOrEqualTo(String value) {
            addCriterion("reservationamount <=", value, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountLike(String value) {
            addCriterion("reservationamount like", value, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountNotLike(String value) {
            addCriterion("reservationamount not like", value, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountIn(List<String> values) {
            addCriterion("reservationamount in", values, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountNotIn(List<String> values) {
            addCriterion("reservationamount not in", values, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountBetween(String value1, String value2) {
            addCriterion("reservationamount between", value1, value2, "reservationamount");
            return (Criteria) this;
        }

        public Criteria andReservationamountNotBetween(String value1, String value2) {
            addCriterion("reservationamount not between", value1, value2, "reservationamount");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateIsNull() {
            addCriterion("appointmentdate is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateIsNotNull() {
            addCriterion("appointmentdate is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateEqualTo(String value) {
            addCriterion("appointmentdate =", value, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateNotEqualTo(String value) {
            addCriterion("appointmentdate <>", value, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateGreaterThan(String value) {
            addCriterion("appointmentdate >", value, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateGreaterThanOrEqualTo(String value) {
            addCriterion("appointmentdate >=", value, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateLessThan(String value) {
            addCriterion("appointmentdate <", value, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateLessThanOrEqualTo(String value) {
            addCriterion("appointmentdate <=", value, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateLike(String value) {
            addCriterion("appointmentdate like", value, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateNotLike(String value) {
            addCriterion("appointmentdate not like", value, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateIn(List<String> values) {
            addCriterion("appointmentdate in", values, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateNotIn(List<String> values) {
            addCriterion("appointmentdate not in", values, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateBetween(String value1, String value2) {
            addCriterion("appointmentdate between", value1, value2, "appointmentdate");
            return (Criteria) this;
        }

        public Criteria andAppointmentdateNotBetween(String value1, String value2) {
            addCriterion("appointmentdate not between", value1, value2, "appointmentdate");
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