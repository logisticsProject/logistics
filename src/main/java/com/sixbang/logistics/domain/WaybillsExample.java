package com.sixbang.logistics.domain;

import java.util.ArrayList;
import java.util.List;

public class WaybillsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaybillsExample() {
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

        public Criteria andWIdIsNull() {
            addCriterion("w_id is null");
            return (Criteria) this;
        }

        public Criteria andWIdIsNotNull() {
            addCriterion("w_id is not null");
            return (Criteria) this;
        }

        public Criteria andWIdEqualTo(Integer value) {
            addCriterion("w_id =", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotEqualTo(Integer value) {
            addCriterion("w_id <>", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThan(Integer value) {
            addCriterion("w_id >", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_id >=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThan(Integer value) {
            addCriterion("w_id <", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThanOrEqualTo(Integer value) {
            addCriterion("w_id <=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdIn(List<Integer> values) {
            addCriterion("w_id in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotIn(List<Integer> values) {
            addCriterion("w_id not in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdBetween(Integer value1, Integer value2) {
            addCriterion("w_id between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotBetween(Integer value1, Integer value2) {
            addCriterion("w_id not between", value1, value2, "wId");
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

        public Criteria andByte1IsNull() {
            addCriterion("byte1 is null");
            return (Criteria) this;
        }

        public Criteria andByte1IsNotNull() {
            addCriterion("byte1 is not null");
            return (Criteria) this;
        }

        public Criteria andByte1EqualTo(String value) {
            addCriterion("byte1 =", value, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1NotEqualTo(String value) {
            addCriterion("byte1 <>", value, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1GreaterThan(String value) {
            addCriterion("byte1 >", value, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1GreaterThanOrEqualTo(String value) {
            addCriterion("byte1 >=", value, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1LessThan(String value) {
            addCriterion("byte1 <", value, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1LessThanOrEqualTo(String value) {
            addCriterion("byte1 <=", value, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1Like(String value) {
            addCriterion("byte1 like", value, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1NotLike(String value) {
            addCriterion("byte1 not like", value, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1In(List<String> values) {
            addCriterion("byte1 in", values, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1NotIn(List<String> values) {
            addCriterion("byte1 not in", values, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1Between(String value1, String value2) {
            addCriterion("byte1 between", value1, value2, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte1NotBetween(String value1, String value2) {
            addCriterion("byte1 not between", value1, value2, "byte1");
            return (Criteria) this;
        }

        public Criteria andByte2IsNull() {
            addCriterion("byte2 is null");
            return (Criteria) this;
        }

        public Criteria andByte2IsNotNull() {
            addCriterion("byte2 is not null");
            return (Criteria) this;
        }

        public Criteria andByte2EqualTo(Integer value) {
            addCriterion("byte2 =", value, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2NotEqualTo(Integer value) {
            addCriterion("byte2 <>", value, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2GreaterThan(Integer value) {
            addCriterion("byte2 >", value, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2GreaterThanOrEqualTo(Integer value) {
            addCriterion("byte2 >=", value, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2LessThan(Integer value) {
            addCriterion("byte2 <", value, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2LessThanOrEqualTo(Integer value) {
            addCriterion("byte2 <=", value, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2In(List<Integer> values) {
            addCriterion("byte2 in", values, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2NotIn(List<Integer> values) {
            addCriterion("byte2 not in", values, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2Between(Integer value1, Integer value2) {
            addCriterion("byte2 between", value1, value2, "byte2");
            return (Criteria) this;
        }

        public Criteria andByte2NotBetween(Integer value1, Integer value2) {
            addCriterion("byte2 not between", value1, value2, "byte2");
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