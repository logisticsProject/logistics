package com.sixbang.logistics.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSendorIdIsNull() {
            addCriterion("sendor_id is null");
            return (Criteria) this;
        }

        public Criteria andSendorIdIsNotNull() {
            addCriterion("sendor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendorIdEqualTo(Integer value) {
            addCriterion("sendor_id =", value, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdNotEqualTo(Integer value) {
            addCriterion("sendor_id <>", value, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdGreaterThan(Integer value) {
            addCriterion("sendor_id >", value, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendor_id >=", value, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdLessThan(Integer value) {
            addCriterion("sendor_id <", value, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdLessThanOrEqualTo(Integer value) {
            addCriterion("sendor_id <=", value, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdIn(List<Integer> values) {
            addCriterion("sendor_id in", values, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdNotIn(List<Integer> values) {
            addCriterion("sendor_id not in", values, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdBetween(Integer value1, Integer value2) {
            addCriterion("sendor_id between", value1, value2, "sendorId");
            return (Criteria) this;
        }

        public Criteria andSendorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sendor_id not between", value1, value2, "sendorId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Integer value) {
            addCriterion("receiver_id =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Integer value) {
            addCriterion("receiver_id <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Integer value) {
            addCriterion("receiver_id >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_id >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Integer value) {
            addCriterion("receiver_id <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_id <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Integer> values) {
            addCriterion("receiver_id in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Integer> values) {
            addCriterion("receiver_id not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Integer value1, Integer value2) {
            addCriterion("receiver_id between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_id not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andStateIdIsNull() {
            addCriterion("state_id is null");
            return (Criteria) this;
        }

        public Criteria andStateIdIsNotNull() {
            addCriterion("state_id is not null");
            return (Criteria) this;
        }

        public Criteria andStateIdEqualTo(Integer value) {
            addCriterion("state_id =", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotEqualTo(Integer value) {
            addCriterion("state_id <>", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThan(Integer value) {
            addCriterion("state_id >", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_id >=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThan(Integer value) {
            addCriterion("state_id <", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("state_id <=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdIn(List<Integer> values) {
            addCriterion("state_id in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotIn(List<Integer> values) {
            addCriterion("state_id not in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdBetween(Integer value1, Integer value2) {
            addCriterion("state_id between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("state_id not between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andIspayedIsNull() {
            addCriterion("isPayed is null");
            return (Criteria) this;
        }

        public Criteria andIspayedIsNotNull() {
            addCriterion("isPayed is not null");
            return (Criteria) this;
        }

        public Criteria andIspayedEqualTo(Integer value) {
            addCriterion("isPayed =", value, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedNotEqualTo(Integer value) {
            addCriterion("isPayed <>", value, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedGreaterThan(Integer value) {
            addCriterion("isPayed >", value, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPayed >=", value, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedLessThan(Integer value) {
            addCriterion("isPayed <", value, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedLessThanOrEqualTo(Integer value) {
            addCriterion("isPayed <=", value, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedIn(List<Integer> values) {
            addCriterion("isPayed in", values, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedNotIn(List<Integer> values) {
            addCriterion("isPayed not in", values, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedBetween(Integer value1, Integer value2) {
            addCriterion("isPayed between", value1, value2, "ispayed");
            return (Criteria) this;
        }

        public Criteria andIspayedNotBetween(Integer value1, Integer value2) {
            addCriterion("isPayed not between", value1, value2, "ispayed");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
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

        public Criteria andPaymentEqualTo(Double value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Double value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Double value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Double value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Double value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Double> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Double> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Double value1, Double value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Double value1, Double value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeIsNull() {
            addCriterion("forward_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeIsNotNull() {
            addCriterion("forward_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeEqualTo(Date value) {
            addCriterion("forward_arrive_time =", value, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeNotEqualTo(Date value) {
            addCriterion("forward_arrive_time <>", value, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeGreaterThan(Date value) {
            addCriterion("forward_arrive_time >", value, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("forward_arrive_time >=", value, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeLessThan(Date value) {
            addCriterion("forward_arrive_time <", value, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("forward_arrive_time <=", value, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeIn(List<Date> values) {
            addCriterion("forward_arrive_time in", values, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeNotIn(List<Date> values) {
            addCriterion("forward_arrive_time not in", values, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeBetween(Date value1, Date value2) {
            addCriterion("forward_arrive_time between", value1, value2, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andForwardArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("forward_arrive_time not between", value1, value2, "forwardArriveTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1IsNull() {
            addCriterion("transfer_staff_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1IsNotNull() {
            addCriterion("transfer_staff_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1EqualTo(Integer value) {
            addCriterion("transfer_staff_id_1 =", value, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1NotEqualTo(Integer value) {
            addCriterion("transfer_staff_id_1 <>", value, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1GreaterThan(Integer value) {
            addCriterion("transfer_staff_id_1 >", value, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_staff_id_1 >=", value, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1LessThan(Integer value) {
            addCriterion("transfer_staff_id_1 <", value, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1LessThanOrEqualTo(Integer value) {
            addCriterion("transfer_staff_id_1 <=", value, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1In(List<Integer> values) {
            addCriterion("transfer_staff_id_1 in", values, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1NotIn(List<Integer> values) {
            addCriterion("transfer_staff_id_1 not in", values, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1Between(Integer value1, Integer value2) {
            addCriterion("transfer_staff_id_1 between", value1, value2, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId1NotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_staff_id_1 not between", value1, value2, "transferStaffId1");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2IsNull() {
            addCriterion("transfer_staff_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2IsNotNull() {
            addCriterion("transfer_staff_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2EqualTo(Integer value) {
            addCriterion("transfer_staff_id_2 =", value, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2NotEqualTo(Integer value) {
            addCriterion("transfer_staff_id_2 <>", value, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2GreaterThan(Integer value) {
            addCriterion("transfer_staff_id_2 >", value, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_staff_id_2 >=", value, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2LessThan(Integer value) {
            addCriterion("transfer_staff_id_2 <", value, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2LessThanOrEqualTo(Integer value) {
            addCriterion("transfer_staff_id_2 <=", value, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2In(List<Integer> values) {
            addCriterion("transfer_staff_id_2 in", values, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2NotIn(List<Integer> values) {
            addCriterion("transfer_staff_id_2 not in", values, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2Between(Integer value1, Integer value2) {
            addCriterion("transfer_staff_id_2 between", value1, value2, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId2NotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_staff_id_2 not between", value1, value2, "transferStaffId2");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3IsNull() {
            addCriterion("transfer_staff_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3IsNotNull() {
            addCriterion("transfer_staff_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3EqualTo(Integer value) {
            addCriterion("transfer_staff_id_3 =", value, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3NotEqualTo(Integer value) {
            addCriterion("transfer_staff_id_3 <>", value, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3GreaterThan(Integer value) {
            addCriterion("transfer_staff_id_3 >", value, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_staff_id_3 >=", value, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3LessThan(Integer value) {
            addCriterion("transfer_staff_id_3 <", value, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3LessThanOrEqualTo(Integer value) {
            addCriterion("transfer_staff_id_3 <=", value, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3In(List<Integer> values) {
            addCriterion("transfer_staff_id_3 in", values, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3NotIn(List<Integer> values) {
            addCriterion("transfer_staff_id_3 not in", values, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3Between(Integer value1, Integer value2) {
            addCriterion("transfer_staff_id_3 between", value1, value2, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andTransferStaffId3NotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_staff_id_3 not between", value1, value2, "transferStaffId3");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(Integer value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(Integer value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(Integer value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(Integer value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(Integer value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<Integer> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<Integer> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(Integer value1, Integer value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andPickerIdIsNull() {
            addCriterion("picker_id is null");
            return (Criteria) this;
        }

        public Criteria andPickerIdIsNotNull() {
            addCriterion("picker_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickerIdEqualTo(Integer value) {
            addCriterion("picker_id =", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdNotEqualTo(Integer value) {
            addCriterion("picker_id <>", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdGreaterThan(Integer value) {
            addCriterion("picker_id >", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("picker_id >=", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdLessThan(Integer value) {
            addCriterion("picker_id <", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdLessThanOrEqualTo(Integer value) {
            addCriterion("picker_id <=", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdIn(List<Integer> values) {
            addCriterion("picker_id in", values, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdNotIn(List<Integer> values) {
            addCriterion("picker_id not in", values, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdBetween(Integer value1, Integer value2) {
            addCriterion("picker_id between", value1, value2, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("picker_id not between", value1, value2, "pickerId");
            return (Criteria) this;
        }

        public Criteria andCouierIdIsNull() {
            addCriterion("couier_id is null");
            return (Criteria) this;
        }

        public Criteria andCouierIdIsNotNull() {
            addCriterion("couier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouierIdEqualTo(Integer value) {
            addCriterion("couier_id =", value, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdNotEqualTo(Integer value) {
            addCriterion("couier_id <>", value, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdGreaterThan(Integer value) {
            addCriterion("couier_id >", value, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("couier_id >=", value, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdLessThan(Integer value) {
            addCriterion("couier_id <", value, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdLessThanOrEqualTo(Integer value) {
            addCriterion("couier_id <=", value, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdIn(List<Integer> values) {
            addCriterion("couier_id in", values, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdNotIn(List<Integer> values) {
            addCriterion("couier_id not in", values, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdBetween(Integer value1, Integer value2) {
            addCriterion("couier_id between", value1, value2, "couierId");
            return (Criteria) this;
        }

        public Criteria andCouierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("couier_id not between", value1, value2, "couierId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBy1IsNull() {
            addCriterion("by1 is null");
            return (Criteria) this;
        }

        public Criteria andBy1IsNotNull() {
            addCriterion("by1 is not null");
            return (Criteria) this;
        }

        public Criteria andBy1EqualTo(Integer value) {
            addCriterion("by1 =", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotEqualTo(Integer value) {
            addCriterion("by1 <>", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThan(Integer value) {
            addCriterion("by1 >", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThanOrEqualTo(Integer value) {
            addCriterion("by1 >=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThan(Integer value) {
            addCriterion("by1 <", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThanOrEqualTo(Integer value) {
            addCriterion("by1 <=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1In(List<Integer> values) {
            addCriterion("by1 in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotIn(List<Integer> values) {
            addCriterion("by1 not in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Between(Integer value1, Integer value2) {
            addCriterion("by1 between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotBetween(Integer value1, Integer value2) {
            addCriterion("by1 not between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy2IsNull() {
            addCriterion("by2 is null");
            return (Criteria) this;
        }

        public Criteria andBy2IsNotNull() {
            addCriterion("by2 is not null");
            return (Criteria) this;
        }

        public Criteria andBy2EqualTo(String value) {
            addCriterion("by2 =", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotEqualTo(String value) {
            addCriterion("by2 <>", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThan(String value) {
            addCriterion("by2 >", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThanOrEqualTo(String value) {
            addCriterion("by2 >=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThan(String value) {
            addCriterion("by2 <", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThanOrEqualTo(String value) {
            addCriterion("by2 <=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Like(String value) {
            addCriterion("by2 like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotLike(String value) {
            addCriterion("by2 not like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2In(List<String> values) {
            addCriterion("by2 in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotIn(List<String> values) {
            addCriterion("by2 not in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Between(String value1, String value2) {
            addCriterion("by2 between", value1, value2, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotBetween(String value1, String value2) {
            addCriterion("by2 not between", value1, value2, "by2");
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