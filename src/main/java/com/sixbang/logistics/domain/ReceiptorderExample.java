package com.sixbang.logistics.domain;

import java.util.ArrayList;
import java.util.List;

public class ReceiptorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiptorderExample() {
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

        public Criteria andNumberingIsNull() {
            addCriterion("numbering is null");
            return (Criteria) this;
        }

        public Criteria andNumberingIsNotNull() {
            addCriterion("numbering is not null");
            return (Criteria) this;
        }

        public Criteria andNumberingEqualTo(String value) {
            addCriterion("numbering =", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingNotEqualTo(String value) {
            addCriterion("numbering <>", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingGreaterThan(String value) {
            addCriterion("numbering >", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingGreaterThanOrEqualTo(String value) {
            addCriterion("numbering >=", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingLessThan(String value) {
            addCriterion("numbering <", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingLessThanOrEqualTo(String value) {
            addCriterion("numbering <=", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingLike(String value) {
            addCriterion("numbering like", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingNotLike(String value) {
            addCriterion("numbering not like", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingIn(List<String> values) {
            addCriterion("numbering in", values, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingNotIn(List<String> values) {
            addCriterion("numbering not in", values, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingBetween(String value1, String value2) {
            addCriterion("numbering between", value1, value2, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingNotBetween(String value1, String value2) {
            addCriterion("numbering not between", value1, value2, "numbering");
            return (Criteria) this;
        }

        public Criteria andRcIdIsNull() {
            addCriterion("rc_id is null");
            return (Criteria) this;
        }

        public Criteria andRcIdIsNotNull() {
            addCriterion("rc_id is not null");
            return (Criteria) this;
        }

        public Criteria andRcIdEqualTo(Integer value) {
            addCriterion("rc_id =", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdNotEqualTo(Integer value) {
            addCriterion("rc_id <>", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdGreaterThan(Integer value) {
            addCriterion("rc_id >", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rc_id >=", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdLessThan(Integer value) {
            addCriterion("rc_id <", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdLessThanOrEqualTo(Integer value) {
            addCriterion("rc_id <=", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdIn(List<Integer> values) {
            addCriterion("rc_id in", values, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdNotIn(List<Integer> values) {
            addCriterion("rc_id not in", values, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdBetween(Integer value1, Integer value2) {
            addCriterion("rc_id between", value1, value2, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rc_id not between", value1, value2, "rcId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("contract_id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("contract_id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
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