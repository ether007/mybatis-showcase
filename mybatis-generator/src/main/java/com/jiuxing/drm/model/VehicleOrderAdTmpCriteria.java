package com.jiuxing.drm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VehicleOrderAdTmpCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public VehicleOrderAdTmpCriteria() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitLength(int limitLength) {
        this.limitLength=limitLength;
    }

    public int getLimitLength() {
        return limitLength;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNull() {
            addCriterion("ad_type is null");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNotNull() {
            addCriterion("ad_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdTypeEqualTo(Byte value) {
            addCriterion("ad_type =", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotEqualTo(Byte value) {
            addCriterion("ad_type <>", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThan(Byte value) {
            addCriterion("ad_type >", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ad_type >=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThan(Byte value) {
            addCriterion("ad_type <", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThanOrEqualTo(Byte value) {
            addCriterion("ad_type <=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeIn(List<Byte> values) {
            addCriterion("ad_type in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotIn(List<Byte> values) {
            addCriterion("ad_type not in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeBetween(Byte value1, Byte value2) {
            addCriterion("ad_type between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ad_type not between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_id like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_id not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateIsNull() {
            addCriterion("schedule_start_date is null");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateIsNotNull() {
            addCriterion("schedule_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("schedule_start_date =", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("schedule_start_date <>", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("schedule_start_date >", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedule_start_date >=", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateLessThan(Date value) {
            addCriterionForJDBCDate("schedule_start_date <", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedule_start_date <=", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("schedule_start_date in", values, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("schedule_start_date not in", values, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedule_start_date between", value1, value2, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedule_start_date not between", value1, value2, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateIsNull() {
            addCriterion("schedule_end_date is null");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateIsNotNull() {
            addCriterion("schedule_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("schedule_end_date =", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("schedule_end_date <>", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("schedule_end_date >", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedule_end_date >=", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateLessThan(Date value) {
            addCriterionForJDBCDate("schedule_end_date <", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedule_end_date <=", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("schedule_end_date in", values, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("schedule_end_date not in", values, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedule_end_date between", value1, value2, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedule_end_date not between", value1, value2, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeIsNull() {
            addCriterion("real_start_time is null");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeIsNotNull() {
            addCriterion("real_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeEqualTo(Date value) {
            addCriterion("real_start_time =", value, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeNotEqualTo(Date value) {
            addCriterion("real_start_time <>", value, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeGreaterThan(Date value) {
            addCriterion("real_start_time >", value, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_start_time >=", value, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeLessThan(Date value) {
            addCriterion("real_start_time <", value, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_start_time <=", value, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeIn(List<Date> values) {
            addCriterion("real_start_time in", values, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeNotIn(List<Date> values) {
            addCriterion("real_start_time not in", values, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeBetween(Date value1, Date value2) {
            addCriterion("real_start_time between", value1, value2, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_start_time not between", value1, value2, "realStartTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeIsNull() {
            addCriterion("real_end_time is null");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeIsNotNull() {
            addCriterion("real_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeEqualTo(Date value) {
            addCriterion("real_end_time =", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeNotEqualTo(Date value) {
            addCriterion("real_end_time <>", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeGreaterThan(Date value) {
            addCriterion("real_end_time >", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_end_time >=", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeLessThan(Date value) {
            addCriterion("real_end_time <", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_end_time <=", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeIn(List<Date> values) {
            addCriterion("real_end_time in", values, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeNotIn(List<Date> values) {
            addCriterion("real_end_time not in", values, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeBetween(Date value1, Date value2) {
            addCriterion("real_end_time between", value1, value2, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_end_time not between", value1, value2, "realEndTime");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlIsNull() {
            addCriterion("smallpic_url is null");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlIsNotNull() {
            addCriterion("smallpic_url is not null");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlEqualTo(String value) {
            addCriterion("smallpic_url =", value, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlNotEqualTo(String value) {
            addCriterion("smallpic_url <>", value, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlGreaterThan(String value) {
            addCriterion("smallpic_url >", value, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("smallpic_url >=", value, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlLessThan(String value) {
            addCriterion("smallpic_url <", value, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlLessThanOrEqualTo(String value) {
            addCriterion("smallpic_url <=", value, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlLike(String value) {
            addCriterion("smallpic_url like", value, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlNotLike(String value) {
            addCriterion("smallpic_url not like", value, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlIn(List<String> values) {
            addCriterion("smallpic_url in", values, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlNotIn(List<String> values) {
            addCriterion("smallpic_url not in", values, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlBetween(String value1, String value2) {
            addCriterion("smallpic_url between", value1, value2, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallpicUrlNotBetween(String value1, String value2) {
            addCriterion("smallpic_url not between", value1, value2, "smallpicUrl");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Short value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Short value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Short value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Short value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Short value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Short value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Short> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Short> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Short value1, Short value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Short value1, Short value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Short value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Short value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Short value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Short value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Short value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Short value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Short> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Short> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Short value1, Short value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Short value1, Short value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdIsNull() {
            addCriterion("modelchild_id is null");
            return (Criteria) this;
        }

        public Criteria andModelchildIdIsNotNull() {
            addCriterion("modelchild_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelchildIdEqualTo(Short value) {
            addCriterion("modelchild_id =", value, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdNotEqualTo(Short value) {
            addCriterion("modelchild_id <>", value, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdGreaterThan(Short value) {
            addCriterion("modelchild_id >", value, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdGreaterThanOrEqualTo(Short value) {
            addCriterion("modelchild_id >=", value, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdLessThan(Short value) {
            addCriterion("modelchild_id <", value, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdLessThanOrEqualTo(Short value) {
            addCriterion("modelchild_id <=", value, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdIn(List<Short> values) {
            addCriterion("modelchild_id in", values, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdNotIn(List<Short> values) {
            addCriterion("modelchild_id not in", values, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdBetween(Short value1, Short value2) {
            addCriterion("modelchild_id between", value1, value2, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andModelchildIdNotBetween(Short value1, Short value2) {
            addCriterion("modelchild_id not between", value1, value2, "modelchildId");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(Byte value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(Byte value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(Byte value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(Byte value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(Byte value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(Byte value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<Byte> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<Byte> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(Byte value1, Byte value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(Byte value1, Byte value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeExtIsNull() {
            addCriterion("type_ext is null");
            return (Criteria) this;
        }

        public Criteria andTypeExtIsNotNull() {
            addCriterion("type_ext is not null");
            return (Criteria) this;
        }

        public Criteria andTypeExtEqualTo(Byte value) {
            addCriterion("type_ext =", value, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtNotEqualTo(Byte value) {
            addCriterion("type_ext <>", value, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtGreaterThan(Byte value) {
            addCriterion("type_ext >", value, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_ext >=", value, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtLessThan(Byte value) {
            addCriterion("type_ext <", value, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtLessThanOrEqualTo(Byte value) {
            addCriterion("type_ext <=", value, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtIn(List<Byte> values) {
            addCriterion("type_ext in", values, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtNotIn(List<Byte> values) {
            addCriterion("type_ext not in", values, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtBetween(Byte value1, Byte value2) {
            addCriterion("type_ext between", value1, value2, "typeExt");
            return (Criteria) this;
        }

        public Criteria andTypeExtNotBetween(Byte value1, Byte value2) {
            addCriterion("type_ext not between", value1, value2, "typeExt");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameIsNull() {
            addCriterion("other_brand_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameIsNotNull() {
            addCriterion("other_brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameEqualTo(String value) {
            addCriterion("other_brand_name =", value, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameNotEqualTo(String value) {
            addCriterion("other_brand_name <>", value, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameGreaterThan(String value) {
            addCriterion("other_brand_name >", value, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_brand_name >=", value, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameLessThan(String value) {
            addCriterion("other_brand_name <", value, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameLessThanOrEqualTo(String value) {
            addCriterion("other_brand_name <=", value, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameLike(String value) {
            addCriterion("other_brand_name like", value, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameNotLike(String value) {
            addCriterion("other_brand_name not like", value, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameIn(List<String> values) {
            addCriterion("other_brand_name in", values, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameNotIn(List<String> values) {
            addCriterion("other_brand_name not in", values, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameBetween(String value1, String value2) {
            addCriterion("other_brand_name between", value1, value2, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherBrandNameNotBetween(String value1, String value2) {
            addCriterion("other_brand_name not between", value1, value2, "otherBrandName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameIsNull() {
            addCriterion("other_model_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameIsNotNull() {
            addCriterion("other_model_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameEqualTo(String value) {
            addCriterion("other_model_name =", value, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameNotEqualTo(String value) {
            addCriterion("other_model_name <>", value, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameGreaterThan(String value) {
            addCriterion("other_model_name >", value, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_model_name >=", value, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameLessThan(String value) {
            addCriterion("other_model_name <", value, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameLessThanOrEqualTo(String value) {
            addCriterion("other_model_name <=", value, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameLike(String value) {
            addCriterion("other_model_name like", value, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameNotLike(String value) {
            addCriterion("other_model_name not like", value, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameIn(List<String> values) {
            addCriterion("other_model_name in", values, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameNotIn(List<String> values) {
            addCriterion("other_model_name not in", values, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameBetween(String value1, String value2) {
            addCriterion("other_model_name between", value1, value2, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andOtherModelNameNotBetween(String value1, String value2) {
            addCriterion("other_model_name not between", value1, value2, "otherModelName");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNull() {
            addCriterion("zone_id is null");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNotNull() {
            addCriterion("zone_id is not null");
            return (Criteria) this;
        }

        public Criteria andZoneIdEqualTo(Short value) {
            addCriterion("zone_id =", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotEqualTo(Short value) {
            addCriterion("zone_id <>", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThan(Short value) {
            addCriterion("zone_id >", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThanOrEqualTo(Short value) {
            addCriterion("zone_id >=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThan(Short value) {
            addCriterion("zone_id <", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThanOrEqualTo(Short value) {
            addCriterion("zone_id <=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIn(List<Short> values) {
            addCriterion("zone_id in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotIn(List<Short> values) {
            addCriterion("zone_id not in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdBetween(Short value1, Short value2) {
            addCriterion("zone_id between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotBetween(Short value1, Short value2) {
            addCriterion("zone_id not between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdIsNull() {
            addCriterion("markprovince_id is null");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdIsNotNull() {
            addCriterion("markprovince_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdEqualTo(String value) {
            addCriterion("markprovince_id =", value, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdNotEqualTo(String value) {
            addCriterion("markprovince_id <>", value, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdGreaterThan(String value) {
            addCriterion("markprovince_id >", value, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("markprovince_id >=", value, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdLessThan(String value) {
            addCriterion("markprovince_id <", value, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdLessThanOrEqualTo(String value) {
            addCriterion("markprovince_id <=", value, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdLike(String value) {
            addCriterion("markprovince_id like", value, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdNotLike(String value) {
            addCriterion("markprovince_id not like", value, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdIn(List<String> values) {
            addCriterion("markprovince_id in", values, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdNotIn(List<String> values) {
            addCriterion("markprovince_id not in", values, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdBetween(String value1, String value2) {
            addCriterion("markprovince_id between", value1, value2, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkprovinceIdNotBetween(String value1, String value2) {
            addCriterion("markprovince_id not between", value1, value2, "markprovinceId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdIsNull() {
            addCriterion("markzone_id is null");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdIsNotNull() {
            addCriterion("markzone_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdEqualTo(Short value) {
            addCriterion("markzone_id =", value, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdNotEqualTo(Short value) {
            addCriterion("markzone_id <>", value, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdGreaterThan(Short value) {
            addCriterion("markzone_id >", value, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdGreaterThanOrEqualTo(Short value) {
            addCriterion("markzone_id >=", value, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdLessThan(Short value) {
            addCriterion("markzone_id <", value, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdLessThanOrEqualTo(Short value) {
            addCriterion("markzone_id <=", value, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdIn(List<Short> values) {
            addCriterion("markzone_id in", values, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdNotIn(List<Short> values) {
            addCriterion("markzone_id not in", values, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdBetween(Short value1, Short value2) {
            addCriterion("markzone_id between", value1, value2, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andMarkzoneIdNotBetween(Short value1, Short value2) {
            addCriterion("markzone_id not between", value1, value2, "markzoneId");
            return (Criteria) this;
        }

        public Criteria andBuyYearIsNull() {
            addCriterion("buy_year is null");
            return (Criteria) this;
        }

        public Criteria andBuyYearIsNotNull() {
            addCriterion("buy_year is not null");
            return (Criteria) this;
        }

        public Criteria andBuyYearEqualTo(Short value) {
            addCriterion("buy_year =", value, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearNotEqualTo(Short value) {
            addCriterion("buy_year <>", value, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearGreaterThan(Short value) {
            addCriterion("buy_year >", value, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearGreaterThanOrEqualTo(Short value) {
            addCriterion("buy_year >=", value, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearLessThan(Short value) {
            addCriterion("buy_year <", value, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearLessThanOrEqualTo(Short value) {
            addCriterion("buy_year <=", value, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearIn(List<Short> values) {
            addCriterion("buy_year in", values, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearNotIn(List<Short> values) {
            addCriterion("buy_year not in", values, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearBetween(Short value1, Short value2) {
            addCriterion("buy_year between", value1, value2, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyYearNotBetween(Short value1, Short value2) {
            addCriterion("buy_year not between", value1, value2, "buyYear");
            return (Criteria) this;
        }

        public Criteria andBuyMonthIsNull() {
            addCriterion("buy_month is null");
            return (Criteria) this;
        }

        public Criteria andBuyMonthIsNotNull() {
            addCriterion("buy_month is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMonthEqualTo(Byte value) {
            addCriterion("buy_month =", value, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthNotEqualTo(Byte value) {
            addCriterion("buy_month <>", value, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthGreaterThan(Byte value) {
            addCriterion("buy_month >", value, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("buy_month >=", value, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthLessThan(Byte value) {
            addCriterion("buy_month <", value, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthLessThanOrEqualTo(Byte value) {
            addCriterion("buy_month <=", value, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthIn(List<Byte> values) {
            addCriterion("buy_month in", values, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthNotIn(List<Byte> values) {
            addCriterion("buy_month not in", values, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthBetween(Byte value1, Byte value2) {
            addCriterion("buy_month between", value1, value2, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("buy_month not between", value1, value2, "buyMonth");
            return (Criteria) this;
        }

        public Criteria andBuyDayIsNull() {
            addCriterion("buy_day is null");
            return (Criteria) this;
        }

        public Criteria andBuyDayIsNotNull() {
            addCriterion("buy_day is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDayEqualTo(Byte value) {
            addCriterion("buy_day =", value, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayNotEqualTo(Byte value) {
            addCriterion("buy_day <>", value, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayGreaterThan(Byte value) {
            addCriterion("buy_day >", value, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayGreaterThanOrEqualTo(Byte value) {
            addCriterion("buy_day >=", value, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayLessThan(Byte value) {
            addCriterion("buy_day <", value, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayLessThanOrEqualTo(Byte value) {
            addCriterion("buy_day <=", value, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayIn(List<Byte> values) {
            addCriterion("buy_day in", values, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayNotIn(List<Byte> values) {
            addCriterion("buy_day not in", values, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayBetween(Byte value1, Byte value2) {
            addCriterion("buy_day between", value1, value2, "buyDay");
            return (Criteria) this;
        }

        public Criteria andBuyDayNotBetween(Byte value1, Byte value2) {
            addCriterion("buy_day not between", value1, value2, "buyDay");
            return (Criteria) this;
        }

        public Criteria andRegYearIsNull() {
            addCriterion("reg_year is null");
            return (Criteria) this;
        }

        public Criteria andRegYearIsNotNull() {
            addCriterion("reg_year is not null");
            return (Criteria) this;
        }

        public Criteria andRegYearEqualTo(Short value) {
            addCriterion("reg_year =", value, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearNotEqualTo(Short value) {
            addCriterion("reg_year <>", value, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearGreaterThan(Short value) {
            addCriterion("reg_year >", value, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearGreaterThanOrEqualTo(Short value) {
            addCriterion("reg_year >=", value, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearLessThan(Short value) {
            addCriterion("reg_year <", value, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearLessThanOrEqualTo(Short value) {
            addCriterion("reg_year <=", value, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearIn(List<Short> values) {
            addCriterion("reg_year in", values, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearNotIn(List<Short> values) {
            addCriterion("reg_year not in", values, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearBetween(Short value1, Short value2) {
            addCriterion("reg_year between", value1, value2, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegYearNotBetween(Short value1, Short value2) {
            addCriterion("reg_year not between", value1, value2, "regYear");
            return (Criteria) this;
        }

        public Criteria andRegMonthIsNull() {
            addCriterion("reg_month is null");
            return (Criteria) this;
        }

        public Criteria andRegMonthIsNotNull() {
            addCriterion("reg_month is not null");
            return (Criteria) this;
        }

        public Criteria andRegMonthEqualTo(Byte value) {
            addCriterion("reg_month =", value, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthNotEqualTo(Byte value) {
            addCriterion("reg_month <>", value, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthGreaterThan(Byte value) {
            addCriterion("reg_month >", value, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("reg_month >=", value, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthLessThan(Byte value) {
            addCriterion("reg_month <", value, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthLessThanOrEqualTo(Byte value) {
            addCriterion("reg_month <=", value, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthIn(List<Byte> values) {
            addCriterion("reg_month in", values, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthNotIn(List<Byte> values) {
            addCriterion("reg_month not in", values, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthBetween(Byte value1, Byte value2) {
            addCriterion("reg_month between", value1, value2, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("reg_month not between", value1, value2, "regMonth");
            return (Criteria) this;
        }

        public Criteria andRegDayIsNull() {
            addCriterion("reg_day is null");
            return (Criteria) this;
        }

        public Criteria andRegDayIsNotNull() {
            addCriterion("reg_day is not null");
            return (Criteria) this;
        }

        public Criteria andRegDayEqualTo(Byte value) {
            addCriterion("reg_day =", value, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayNotEqualTo(Byte value) {
            addCriterion("reg_day <>", value, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayGreaterThan(Byte value) {
            addCriterion("reg_day >", value, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayGreaterThanOrEqualTo(Byte value) {
            addCriterion("reg_day >=", value, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayLessThan(Byte value) {
            addCriterion("reg_day <", value, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayLessThanOrEqualTo(Byte value) {
            addCriterion("reg_day <=", value, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayIn(List<Byte> values) {
            addCriterion("reg_day in", values, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayNotIn(List<Byte> values) {
            addCriterion("reg_day not in", values, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayBetween(Byte value1, Byte value2) {
            addCriterion("reg_day between", value1, value2, "regDay");
            return (Criteria) this;
        }

        public Criteria andRegDayNotBetween(Byte value1, Byte value2) {
            addCriterion("reg_day not between", value1, value2, "regDay");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdIsNull() {
            addCriterion("dealzone_id is null");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdIsNotNull() {
            addCriterion("dealzone_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdEqualTo(Short value) {
            addCriterion("dealzone_id =", value, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdNotEqualTo(Short value) {
            addCriterion("dealzone_id <>", value, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdGreaterThan(Short value) {
            addCriterion("dealzone_id >", value, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdGreaterThanOrEqualTo(Short value) {
            addCriterion("dealzone_id >=", value, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdLessThan(Short value) {
            addCriterion("dealzone_id <", value, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdLessThanOrEqualTo(Short value) {
            addCriterion("dealzone_id <=", value, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdIn(List<Short> values) {
            addCriterion("dealzone_id in", values, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdNotIn(List<Short> values) {
            addCriterion("dealzone_id not in", values, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdBetween(Short value1, Short value2) {
            addCriterion("dealzone_id between", value1, value2, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andDealzoneIdNotBetween(Short value1, Short value2) {
            addCriterion("dealzone_id not between", value1, value2, "dealzoneId");
            return (Criteria) this;
        }

        public Criteria andValiddaysIsNull() {
            addCriterion("validdays is null");
            return (Criteria) this;
        }

        public Criteria andValiddaysIsNotNull() {
            addCriterion("validdays is not null");
            return (Criteria) this;
        }

        public Criteria andValiddaysEqualTo(Integer value) {
            addCriterion("validdays =", value, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysNotEqualTo(Integer value) {
            addCriterion("validdays <>", value, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysGreaterThan(Integer value) {
            addCriterion("validdays >", value, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("validdays >=", value, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysLessThan(Integer value) {
            addCriterion("validdays <", value, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysLessThanOrEqualTo(Integer value) {
            addCriterion("validdays <=", value, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysIn(List<Integer> values) {
            addCriterion("validdays in", values, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysNotIn(List<Integer> values) {
            addCriterion("validdays not in", values, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysBetween(Integer value1, Integer value2) {
            addCriterion("validdays between", value1, value2, "validdays");
            return (Criteria) this;
        }

        public Criteria andValiddaysNotBetween(Integer value1, Integer value2) {
            addCriterion("validdays not between", value1, value2, "validdays");
            return (Criteria) this;
        }

        public Criteria andGearboxIsNull() {
            addCriterion("gearbox is null");
            return (Criteria) this;
        }

        public Criteria andGearboxIsNotNull() {
            addCriterion("gearbox is not null");
            return (Criteria) this;
        }

        public Criteria andGearboxEqualTo(Byte value) {
            addCriterion("gearbox =", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotEqualTo(Byte value) {
            addCriterion("gearbox <>", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxGreaterThan(Byte value) {
            addCriterion("gearbox >", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxGreaterThanOrEqualTo(Byte value) {
            addCriterion("gearbox >=", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxLessThan(Byte value) {
            addCriterion("gearbox <", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxLessThanOrEqualTo(Byte value) {
            addCriterion("gearbox <=", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxIn(List<Byte> values) {
            addCriterion("gearbox in", values, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotIn(List<Byte> values) {
            addCriterion("gearbox not in", values, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxBetween(Byte value1, Byte value2) {
            addCriterion("gearbox between", value1, value2, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotBetween(Byte value1, Byte value2) {
            addCriterion("gearbox not between", value1, value2, "gearbox");
            return (Criteria) this;
        }

        public Criteria andAirIsNull() {
            addCriterion("air is null");
            return (Criteria) this;
        }

        public Criteria andAirIsNotNull() {
            addCriterion("air is not null");
            return (Criteria) this;
        }

        public Criteria andAirEqualTo(Byte value) {
            addCriterion("air =", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirNotEqualTo(Byte value) {
            addCriterion("air <>", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirGreaterThan(Byte value) {
            addCriterion("air >", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirGreaterThanOrEqualTo(Byte value) {
            addCriterion("air >=", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirLessThan(Byte value) {
            addCriterion("air <", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirLessThanOrEqualTo(Byte value) {
            addCriterion("air <=", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirIn(List<Byte> values) {
            addCriterion("air in", values, "air");
            return (Criteria) this;
        }

        public Criteria andAirNotIn(List<Byte> values) {
            addCriterion("air not in", values, "air");
            return (Criteria) this;
        }

        public Criteria andAirBetween(Byte value1, Byte value2) {
            addCriterion("air between", value1, value2, "air");
            return (Criteria) this;
        }

        public Criteria andAirNotBetween(Byte value1, Byte value2) {
            addCriterion("air not between", value1, value2, "air");
            return (Criteria) this;
        }

        public Criteria andCylinderIsNull() {
            addCriterion("cylinder is null");
            return (Criteria) this;
        }

        public Criteria andCylinderIsNotNull() {
            addCriterion("cylinder is not null");
            return (Criteria) this;
        }

        public Criteria andCylinderEqualTo(Byte value) {
            addCriterion("cylinder =", value, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderNotEqualTo(Byte value) {
            addCriterion("cylinder <>", value, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderGreaterThan(Byte value) {
            addCriterion("cylinder >", value, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderGreaterThanOrEqualTo(Byte value) {
            addCriterion("cylinder >=", value, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderLessThan(Byte value) {
            addCriterion("cylinder <", value, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderLessThanOrEqualTo(Byte value) {
            addCriterion("cylinder <=", value, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderIn(List<Byte> values) {
            addCriterion("cylinder in", values, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderNotIn(List<Byte> values) {
            addCriterion("cylinder not in", values, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderBetween(Byte value1, Byte value2) {
            addCriterion("cylinder between", value1, value2, "cylinder");
            return (Criteria) this;
        }

        public Criteria andCylinderNotBetween(Byte value1, Byte value2) {
            addCriterion("cylinder not between", value1, value2, "cylinder");
            return (Criteria) this;
        }

        public Criteria andSeatingIsNull() {
            addCriterion("seating is null");
            return (Criteria) this;
        }

        public Criteria andSeatingIsNotNull() {
            addCriterion("seating is not null");
            return (Criteria) this;
        }

        public Criteria andSeatingEqualTo(Short value) {
            addCriterion("seating =", value, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingNotEqualTo(Short value) {
            addCriterion("seating <>", value, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingGreaterThan(Short value) {
            addCriterion("seating >", value, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingGreaterThanOrEqualTo(Short value) {
            addCriterion("seating >=", value, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingLessThan(Short value) {
            addCriterion("seating <", value, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingLessThanOrEqualTo(Short value) {
            addCriterion("seating <=", value, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingIn(List<Short> values) {
            addCriterion("seating in", values, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingNotIn(List<Short> values) {
            addCriterion("seating not in", values, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingBetween(Short value1, Short value2) {
            addCriterion("seating between", value1, value2, "seating");
            return (Criteria) this;
        }

        public Criteria andSeatingNotBetween(Short value1, Short value2) {
            addCriterion("seating not between", value1, value2, "seating");
            return (Criteria) this;
        }

        public Criteria andLoadsIsNull() {
            addCriterion("loads is null");
            return (Criteria) this;
        }

        public Criteria andLoadsIsNotNull() {
            addCriterion("loads is not null");
            return (Criteria) this;
        }

        public Criteria andLoadsEqualTo(String value) {
            addCriterion("loads =", value, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsNotEqualTo(String value) {
            addCriterion("loads <>", value, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsGreaterThan(String value) {
            addCriterion("loads >", value, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsGreaterThanOrEqualTo(String value) {
            addCriterion("loads >=", value, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsLessThan(String value) {
            addCriterion("loads <", value, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsLessThanOrEqualTo(String value) {
            addCriterion("loads <=", value, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsLike(String value) {
            addCriterion("loads like", value, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsNotLike(String value) {
            addCriterion("loads not like", value, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsIn(List<String> values) {
            addCriterion("loads in", values, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsNotIn(List<String> values) {
            addCriterion("loads not in", values, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsBetween(String value1, String value2) {
            addCriterion("loads between", value1, value2, "loads");
            return (Criteria) this;
        }

        public Criteria andLoadsNotBetween(String value1, String value2) {
            addCriterion("loads not between", value1, value2, "loads");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementIsNull() {
            addCriterion("airdisplacement is null");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementIsNotNull() {
            addCriterion("airdisplacement is not null");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementEqualTo(String value) {
            addCriterion("airdisplacement =", value, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementNotEqualTo(String value) {
            addCriterion("airdisplacement <>", value, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementGreaterThan(String value) {
            addCriterion("airdisplacement >", value, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementGreaterThanOrEqualTo(String value) {
            addCriterion("airdisplacement >=", value, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementLessThan(String value) {
            addCriterion("airdisplacement <", value, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementLessThanOrEqualTo(String value) {
            addCriterion("airdisplacement <=", value, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementLike(String value) {
            addCriterion("airdisplacement like", value, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementNotLike(String value) {
            addCriterion("airdisplacement not like", value, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementIn(List<String> values) {
            addCriterion("airdisplacement in", values, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementNotIn(List<String> values) {
            addCriterion("airdisplacement not in", values, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementBetween(String value1, String value2) {
            addCriterion("airdisplacement between", value1, value2, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andAirdisplacementNotBetween(String value1, String value2) {
            addCriterion("airdisplacement not between", value1, value2, "airdisplacement");
            return (Criteria) this;
        }

        public Criteria andQhcpIsNull() {
            addCriterion("qhcp is null");
            return (Criteria) this;
        }

        public Criteria andQhcpIsNotNull() {
            addCriterion("qhcp is not null");
            return (Criteria) this;
        }

        public Criteria andQhcpEqualTo(Byte value) {
            addCriterion("qhcp =", value, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpNotEqualTo(Byte value) {
            addCriterion("qhcp <>", value, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpGreaterThan(Byte value) {
            addCriterion("qhcp >", value, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpGreaterThanOrEqualTo(Byte value) {
            addCriterion("qhcp >=", value, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpLessThan(Byte value) {
            addCriterion("qhcp <", value, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpLessThanOrEqualTo(Byte value) {
            addCriterion("qhcp <=", value, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpIn(List<Byte> values) {
            addCriterion("qhcp in", values, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpNotIn(List<Byte> values) {
            addCriterion("qhcp not in", values, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpBetween(Byte value1, Byte value2) {
            addCriterion("qhcp between", value1, value2, "qhcp");
            return (Criteria) this;
        }

        public Criteria andQhcpNotBetween(Byte value1, Byte value2) {
            addCriterion("qhcp not between", value1, value2, "qhcp");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIsNull() {
            addCriterion("driving_license is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIsNotNull() {
            addCriterion("driving_license is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEqualTo(Byte value) {
            addCriterion("driving_license =", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNotEqualTo(Byte value) {
            addCriterion("driving_license <>", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseGreaterThan(Byte value) {
            addCriterion("driving_license >", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseGreaterThanOrEqualTo(Byte value) {
            addCriterion("driving_license >=", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseLessThan(Byte value) {
            addCriterion("driving_license <", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseLessThanOrEqualTo(Byte value) {
            addCriterion("driving_license <=", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIn(List<Byte> values) {
            addCriterion("driving_license in", values, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNotIn(List<Byte> values) {
            addCriterion("driving_license not in", values, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseBetween(Byte value1, Byte value2) {
            addCriterion("driving_license between", value1, value2, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNotBetween(Byte value1, Byte value2) {
            addCriterion("driving_license not between", value1, value2, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Byte value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Byte value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Byte value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Byte value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Byte value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Byte value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Byte> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Byte> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Byte value1, Byte value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Byte value1, Byte value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andSurtaxIsNull() {
            addCriterion("surtax is null");
            return (Criteria) this;
        }

        public Criteria andSurtaxIsNotNull() {
            addCriterion("surtax is not null");
            return (Criteria) this;
        }

        public Criteria andSurtaxEqualTo(Byte value) {
            addCriterion("surtax =", value, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxNotEqualTo(Byte value) {
            addCriterion("surtax <>", value, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxGreaterThan(Byte value) {
            addCriterion("surtax >", value, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxGreaterThanOrEqualTo(Byte value) {
            addCriterion("surtax >=", value, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxLessThan(Byte value) {
            addCriterion("surtax <", value, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxLessThanOrEqualTo(Byte value) {
            addCriterion("surtax <=", value, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxIn(List<Byte> values) {
            addCriterion("surtax in", values, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxNotIn(List<Byte> values) {
            addCriterion("surtax not in", values, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxBetween(Byte value1, Byte value2) {
            addCriterion("surtax between", value1, value2, "surtax");
            return (Criteria) this;
        }

        public Criteria andSurtaxNotBetween(Byte value1, Byte value2) {
            addCriterion("surtax not between", value1, value2, "surtax");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearIsNull() {
            addCriterion("roadtoll_year is null");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearIsNotNull() {
            addCriterion("roadtoll_year is not null");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearEqualTo(Short value) {
            addCriterion("roadtoll_year =", value, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearNotEqualTo(Short value) {
            addCriterion("roadtoll_year <>", value, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearGreaterThan(Short value) {
            addCriterion("roadtoll_year >", value, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearGreaterThanOrEqualTo(Short value) {
            addCriterion("roadtoll_year >=", value, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearLessThan(Short value) {
            addCriterion("roadtoll_year <", value, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearLessThanOrEqualTo(Short value) {
            addCriterion("roadtoll_year <=", value, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearIn(List<Short> values) {
            addCriterion("roadtoll_year in", values, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearNotIn(List<Short> values) {
            addCriterion("roadtoll_year not in", values, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearBetween(Short value1, Short value2) {
            addCriterion("roadtoll_year between", value1, value2, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollYearNotBetween(Short value1, Short value2) {
            addCriterion("roadtoll_year not between", value1, value2, "roadtollYear");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthIsNull() {
            addCriterion("roadtoll_month is null");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthIsNotNull() {
            addCriterion("roadtoll_month is not null");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthEqualTo(Byte value) {
            addCriterion("roadtoll_month =", value, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthNotEqualTo(Byte value) {
            addCriterion("roadtoll_month <>", value, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthGreaterThan(Byte value) {
            addCriterion("roadtoll_month >", value, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("roadtoll_month >=", value, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthLessThan(Byte value) {
            addCriterion("roadtoll_month <", value, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthLessThanOrEqualTo(Byte value) {
            addCriterion("roadtoll_month <=", value, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthIn(List<Byte> values) {
            addCriterion("roadtoll_month in", values, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthNotIn(List<Byte> values) {
            addCriterion("roadtoll_month not in", values, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthBetween(Byte value1, Byte value2) {
            addCriterion("roadtoll_month between", value1, value2, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andRoadtollMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("roadtoll_month not between", value1, value2, "roadtollMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearIsNull() {
            addCriterion("usetax_year is null");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearIsNotNull() {
            addCriterion("usetax_year is not null");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearEqualTo(Short value) {
            addCriterion("usetax_year =", value, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearNotEqualTo(Short value) {
            addCriterion("usetax_year <>", value, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearGreaterThan(Short value) {
            addCriterion("usetax_year >", value, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearGreaterThanOrEqualTo(Short value) {
            addCriterion("usetax_year >=", value, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearLessThan(Short value) {
            addCriterion("usetax_year <", value, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearLessThanOrEqualTo(Short value) {
            addCriterion("usetax_year <=", value, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearIn(List<Short> values) {
            addCriterion("usetax_year in", values, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearNotIn(List<Short> values) {
            addCriterion("usetax_year not in", values, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearBetween(Short value1, Short value2) {
            addCriterion("usetax_year between", value1, value2, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxYearNotBetween(Short value1, Short value2) {
            addCriterion("usetax_year not between", value1, value2, "usetaxYear");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthIsNull() {
            addCriterion("usetax_month is null");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthIsNotNull() {
            addCriterion("usetax_month is not null");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthEqualTo(Byte value) {
            addCriterion("usetax_month =", value, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthNotEqualTo(Byte value) {
            addCriterion("usetax_month <>", value, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthGreaterThan(Byte value) {
            addCriterion("usetax_month >", value, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("usetax_month >=", value, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthLessThan(Byte value) {
            addCriterion("usetax_month <", value, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthLessThanOrEqualTo(Byte value) {
            addCriterion("usetax_month <=", value, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthIn(List<Byte> values) {
            addCriterion("usetax_month in", values, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthNotIn(List<Byte> values) {
            addCriterion("usetax_month not in", values, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthBetween(Byte value1, Byte value2) {
            addCriterion("usetax_month between", value1, value2, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andUsetaxMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("usetax_month not between", value1, value2, "usetaxMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearIsNull() {
            addCriterion("insurance_year is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearIsNotNull() {
            addCriterion("insurance_year is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearEqualTo(Short value) {
            addCriterion("insurance_year =", value, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearNotEqualTo(Short value) {
            addCriterion("insurance_year <>", value, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearGreaterThan(Short value) {
            addCriterion("insurance_year >", value, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearGreaterThanOrEqualTo(Short value) {
            addCriterion("insurance_year >=", value, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearLessThan(Short value) {
            addCriterion("insurance_year <", value, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearLessThanOrEqualTo(Short value) {
            addCriterion("insurance_year <=", value, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearIn(List<Short> values) {
            addCriterion("insurance_year in", values, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearNotIn(List<Short> values) {
            addCriterion("insurance_year not in", values, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearBetween(Short value1, Short value2) {
            addCriterion("insurance_year between", value1, value2, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceYearNotBetween(Short value1, Short value2) {
            addCriterion("insurance_year not between", value1, value2, "insuranceYear");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthIsNull() {
            addCriterion("insurance_month is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthIsNotNull() {
            addCriterion("insurance_month is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthEqualTo(Byte value) {
            addCriterion("insurance_month =", value, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthNotEqualTo(Byte value) {
            addCriterion("insurance_month <>", value, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthGreaterThan(Byte value) {
            addCriterion("insurance_month >", value, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("insurance_month >=", value, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthLessThan(Byte value) {
            addCriterion("insurance_month <", value, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthLessThanOrEqualTo(Byte value) {
            addCriterion("insurance_month <=", value, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthIn(List<Byte> values) {
            addCriterion("insurance_month in", values, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthNotIn(List<Byte> values) {
            addCriterion("insurance_month not in", values, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthBetween(Byte value1, Byte value2) {
            addCriterion("insurance_month between", value1, value2, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andInsuranceMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("insurance_month not between", value1, value2, "insuranceMonth");
            return (Criteria) this;
        }

        public Criteria andMotYearIsNull() {
            addCriterion("mot_year is null");
            return (Criteria) this;
        }

        public Criteria andMotYearIsNotNull() {
            addCriterion("mot_year is not null");
            return (Criteria) this;
        }

        public Criteria andMotYearEqualTo(Short value) {
            addCriterion("mot_year =", value, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearNotEqualTo(Short value) {
            addCriterion("mot_year <>", value, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearGreaterThan(Short value) {
            addCriterion("mot_year >", value, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearGreaterThanOrEqualTo(Short value) {
            addCriterion("mot_year >=", value, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearLessThan(Short value) {
            addCriterion("mot_year <", value, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearLessThanOrEqualTo(Short value) {
            addCriterion("mot_year <=", value, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearIn(List<Short> values) {
            addCriterion("mot_year in", values, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearNotIn(List<Short> values) {
            addCriterion("mot_year not in", values, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearBetween(Short value1, Short value2) {
            addCriterion("mot_year between", value1, value2, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotYearNotBetween(Short value1, Short value2) {
            addCriterion("mot_year not between", value1, value2, "motYear");
            return (Criteria) this;
        }

        public Criteria andMotMonthIsNull() {
            addCriterion("mot_month is null");
            return (Criteria) this;
        }

        public Criteria andMotMonthIsNotNull() {
            addCriterion("mot_month is not null");
            return (Criteria) this;
        }

        public Criteria andMotMonthEqualTo(Byte value) {
            addCriterion("mot_month =", value, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthNotEqualTo(Byte value) {
            addCriterion("mot_month <>", value, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthGreaterThan(Byte value) {
            addCriterion("mot_month >", value, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("mot_month >=", value, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthLessThan(Byte value) {
            addCriterion("mot_month <", value, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthLessThanOrEqualTo(Byte value) {
            addCriterion("mot_month <=", value, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthIn(List<Byte> values) {
            addCriterion("mot_month in", values, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthNotIn(List<Byte> values) {
            addCriterion("mot_month not in", values, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthBetween(Byte value1, Byte value2) {
            addCriterion("mot_month between", value1, value2, "motMonth");
            return (Criteria) this;
        }

        public Criteria andMotMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("mot_month not between", value1, value2, "motMonth");
            return (Criteria) this;
        }

        public Criteria andInstalmentIsNull() {
            addCriterion("instalment is null");
            return (Criteria) this;
        }

        public Criteria andInstalmentIsNotNull() {
            addCriterion("instalment is not null");
            return (Criteria) this;
        }

        public Criteria andInstalmentEqualTo(Byte value) {
            addCriterion("instalment =", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentNotEqualTo(Byte value) {
            addCriterion("instalment <>", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentGreaterThan(Byte value) {
            addCriterion("instalment >", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentGreaterThanOrEqualTo(Byte value) {
            addCriterion("instalment >=", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentLessThan(Byte value) {
            addCriterion("instalment <", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentLessThanOrEqualTo(Byte value) {
            addCriterion("instalment <=", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentIn(List<Byte> values) {
            addCriterion("instalment in", values, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentNotIn(List<Byte> values) {
            addCriterion("instalment not in", values, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentBetween(Byte value1, Byte value2) {
            addCriterion("instalment between", value1, value2, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentNotBetween(Byte value1, Byte value2) {
            addCriterion("instalment not between", value1, value2, "instalment");
            return (Criteria) this;
        }

        public Criteria andConfigIsNull() {
            addCriterion("config is null");
            return (Criteria) this;
        }

        public Criteria andConfigIsNotNull() {
            addCriterion("config is not null");
            return (Criteria) this;
        }

        public Criteria andConfigEqualTo(String value) {
            addCriterion("config =", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotEqualTo(String value) {
            addCriterion("config <>", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThan(String value) {
            addCriterion("config >", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThanOrEqualTo(String value) {
            addCriterion("config >=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThan(String value) {
            addCriterion("config <", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThanOrEqualTo(String value) {
            addCriterion("config <=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLike(String value) {
            addCriterion("config like", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotLike(String value) {
            addCriterion("config not like", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigIn(List<String> values) {
            addCriterion("config in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotIn(List<String> values) {
            addCriterion("config not in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigBetween(String value1, String value2) {
            addCriterion("config between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotBetween(String value1, String value2) {
            addCriterion("config not between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(Byte value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(Byte value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(Byte value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(Byte value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(Byte value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(Byte value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<Byte> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<Byte> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(Byte value1, Byte value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(Byte value1, Byte value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColourIsNull() {
            addCriterion("colour is null");
            return (Criteria) this;
        }

        public Criteria andColourIsNotNull() {
            addCriterion("colour is not null");
            return (Criteria) this;
        }

        public Criteria andColourEqualTo(String value) {
            addCriterion("colour =", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotEqualTo(String value) {
            addCriterion("colour <>", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourGreaterThan(String value) {
            addCriterion("colour >", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourGreaterThanOrEqualTo(String value) {
            addCriterion("colour >=", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLessThan(String value) {
            addCriterion("colour <", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLessThanOrEqualTo(String value) {
            addCriterion("colour <=", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLike(String value) {
            addCriterion("colour like", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotLike(String value) {
            addCriterion("colour not like", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourIn(List<String> values) {
            addCriterion("colour in", values, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotIn(List<String> values) {
            addCriterion("colour not in", values, "colour");
            return (Criteria) this;
        }

        public Criteria andColourBetween(String value1, String value2) {
            addCriterion("colour between", value1, value2, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotBetween(String value1, String value2) {
            addCriterion("colour not between", value1, value2, "colour");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Integer value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Integer value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Integer value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Integer value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Integer> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Integer> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Integer value1, Integer value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkIsNull() {
            addCriterion("registration_mark is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkIsNotNull() {
            addCriterion("registration_mark is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkEqualTo(Byte value) {
            addCriterion("registration_mark =", value, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkNotEqualTo(Byte value) {
            addCriterion("registration_mark <>", value, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkGreaterThan(Byte value) {
            addCriterion("registration_mark >", value, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkGreaterThanOrEqualTo(Byte value) {
            addCriterion("registration_mark >=", value, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkLessThan(Byte value) {
            addCriterion("registration_mark <", value, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkLessThanOrEqualTo(Byte value) {
            addCriterion("registration_mark <=", value, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkIn(List<Byte> values) {
            addCriterion("registration_mark in", values, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkNotIn(List<Byte> values) {
            addCriterion("registration_mark not in", values, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkBetween(Byte value1, Byte value2) {
            addCriterion("registration_mark between", value1, value2, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarkNotBetween(Byte value1, Byte value2) {
            addCriterion("registration_mark not between", value1, value2, "registrationMark");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andContactmanIsNull() {
            addCriterion("contactman is null");
            return (Criteria) this;
        }

        public Criteria andContactmanIsNotNull() {
            addCriterion("contactman is not null");
            return (Criteria) this;
        }

        public Criteria andContactmanEqualTo(String value) {
            addCriterion("contactman =", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotEqualTo(String value) {
            addCriterion("contactman <>", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanGreaterThan(String value) {
            addCriterion("contactman >", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanGreaterThanOrEqualTo(String value) {
            addCriterion("contactman >=", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLessThan(String value) {
            addCriterion("contactman <", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLessThanOrEqualTo(String value) {
            addCriterion("contactman <=", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLike(String value) {
            addCriterion("contactman like", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotLike(String value) {
            addCriterion("contactman not like", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanIn(List<String> values) {
            addCriterion("contactman in", values, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotIn(List<String> values) {
            addCriterion("contactman not in", values, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanBetween(String value1, String value2) {
            addCriterion("contactman between", value1, value2, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotBetween(String value1, String value2) {
            addCriterion("contactman not between", value1, value2, "contactman");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdIsNull() {
            addCriterion("collector_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdIsNotNull() {
            addCriterion("collector_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdEqualTo(String value) {
            addCriterion("collector_admin_id =", value, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdNotEqualTo(String value) {
            addCriterion("collector_admin_id <>", value, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdGreaterThan(String value) {
            addCriterion("collector_admin_id >", value, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("collector_admin_id >=", value, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdLessThan(String value) {
            addCriterion("collector_admin_id <", value, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdLessThanOrEqualTo(String value) {
            addCriterion("collector_admin_id <=", value, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdLike(String value) {
            addCriterion("collector_admin_id like", value, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdNotLike(String value) {
            addCriterion("collector_admin_id not like", value, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdIn(List<String> values) {
            addCriterion("collector_admin_id in", values, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdNotIn(List<String> values) {
            addCriterion("collector_admin_id not in", values, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdBetween(String value1, String value2) {
            addCriterion("collector_admin_id between", value1, value2, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andCollectorAdminIdNotBetween(String value1, String value2) {
            addCriterion("collector_admin_id not between", value1, value2, "collectorAdminId");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdIsNull() {
            addCriterion("status_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdIsNotNull() {
            addCriterion("status_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdEqualTo(String value) {
            addCriterion("status_admin_id =", value, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdNotEqualTo(String value) {
            addCriterion("status_admin_id <>", value, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdGreaterThan(String value) {
            addCriterion("status_admin_id >", value, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("status_admin_id >=", value, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdLessThan(String value) {
            addCriterion("status_admin_id <", value, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdLessThanOrEqualTo(String value) {
            addCriterion("status_admin_id <=", value, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdLike(String value) {
            addCriterion("status_admin_id like", value, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdNotLike(String value) {
            addCriterion("status_admin_id not like", value, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdIn(List<String> values) {
            addCriterion("status_admin_id in", values, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdNotIn(List<String> values) {
            addCriterion("status_admin_id not in", values, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdBetween(String value1, String value2) {
            addCriterion("status_admin_id between", value1, value2, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusAdminIdNotBetween(String value1, String value2) {
            addCriterion("status_admin_id not between", value1, value2, "statusAdminId");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIsNull() {
            addCriterion("status_time is null");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIsNotNull() {
            addCriterion("status_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatusTimeEqualTo(Date value) {
            addCriterion("status_time =", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotEqualTo(Date value) {
            addCriterion("status_time <>", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeGreaterThan(Date value) {
            addCriterion("status_time >", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("status_time >=", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeLessThan(Date value) {
            addCriterion("status_time <", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeLessThanOrEqualTo(Date value) {
            addCriterion("status_time <=", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIn(List<Date> values) {
            addCriterion("status_time in", values, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotIn(List<Date> values) {
            addCriterion("status_time not in", values, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeBetween(Date value1, Date value2) {
            addCriterion("status_time between", value1, value2, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotBetween(Date value1, Date value2) {
            addCriterion("status_time not between", value1, value2, "statusTime");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdIsNull() {
            addCriterion("company_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdIsNotNull() {
            addCriterion("company_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdEqualTo(Byte value) {
            addCriterion("company_branch_id =", value, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdNotEqualTo(Byte value) {
            addCriterion("company_branch_id <>", value, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdGreaterThan(Byte value) {
            addCriterion("company_branch_id >", value, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("company_branch_id >=", value, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdLessThan(Byte value) {
            addCriterion("company_branch_id <", value, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdLessThanOrEqualTo(Byte value) {
            addCriterion("company_branch_id <=", value, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdIn(List<Byte> values) {
            addCriterion("company_branch_id in", values, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdNotIn(List<Byte> values) {
            addCriterion("company_branch_id not in", values, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdBetween(Byte value1, Byte value2) {
            addCriterion("company_branch_id between", value1, value2, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIdNotBetween(Byte value1, Byte value2) {
            addCriterion("company_branch_id not between", value1, value2, "companyBranchId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(String value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(String value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(String value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(String value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(String value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLike(String value) {
            addCriterion("collection_id like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotLike(String value) {
            addCriterion("collection_id not like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<String> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<String> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(String value1, String value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(String value1, String value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andComboIsNull() {
            addCriterion("combo is null");
            return (Criteria) this;
        }

        public Criteria andComboIsNotNull() {
            addCriterion("combo is not null");
            return (Criteria) this;
        }

        public Criteria andComboEqualTo(Byte value) {
            addCriterion("combo =", value, "combo");
            return (Criteria) this;
        }

        public Criteria andComboNotEqualTo(Byte value) {
            addCriterion("combo <>", value, "combo");
            return (Criteria) this;
        }

        public Criteria andComboGreaterThan(Byte value) {
            addCriterion("combo >", value, "combo");
            return (Criteria) this;
        }

        public Criteria andComboGreaterThanOrEqualTo(Byte value) {
            addCriterion("combo >=", value, "combo");
            return (Criteria) this;
        }

        public Criteria andComboLessThan(Byte value) {
            addCriterion("combo <", value, "combo");
            return (Criteria) this;
        }

        public Criteria andComboLessThanOrEqualTo(Byte value) {
            addCriterion("combo <=", value, "combo");
            return (Criteria) this;
        }

        public Criteria andComboIn(List<Byte> values) {
            addCriterion("combo in", values, "combo");
            return (Criteria) this;
        }

        public Criteria andComboNotIn(List<Byte> values) {
            addCriterion("combo not in", values, "combo");
            return (Criteria) this;
        }

        public Criteria andComboBetween(Byte value1, Byte value2) {
            addCriterion("combo between", value1, value2, "combo");
            return (Criteria) this;
        }

        public Criteria andComboNotBetween(Byte value1, Byte value2) {
            addCriterion("combo not between", value1, value2, "combo");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Byte value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Byte value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Byte value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Byte value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Byte value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Byte> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Byte> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Byte value1, Byte value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Byte value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Byte value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Byte value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Byte value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Byte value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Byte value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Byte> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Byte> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Byte value1, Byte value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Byte value1, Byte value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionIsNull() {
            addCriterion("vehicle_condition is null");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionIsNotNull() {
            addCriterion("vehicle_condition is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionEqualTo(Integer value) {
            addCriterion("vehicle_condition =", value, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionNotEqualTo(Integer value) {
            addCriterion("vehicle_condition <>", value, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionGreaterThan(Integer value) {
            addCriterion("vehicle_condition >", value, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_condition >=", value, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionLessThan(Integer value) {
            addCriterion("vehicle_condition <", value, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_condition <=", value, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionIn(List<Integer> values) {
            addCriterion("vehicle_condition in", values, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionNotIn(List<Integer> values) {
            addCriterion("vehicle_condition not in", values, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_condition between", value1, value2, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVehicleConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_condition not between", value1, value2, "vehicleCondition");
            return (Criteria) this;
        }

        public Criteria andVctypebelongIsNull() {
            addCriterion("vctypebelong is null");
            return (Criteria) this;
        }

        public Criteria andVctypebelongIsNotNull() {
            addCriterion("vctypebelong is not null");
            return (Criteria) this;
        }

        public Criteria andVctypebelongEqualTo(Integer value) {
            addCriterion("vctypebelong =", value, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongNotEqualTo(Integer value) {
            addCriterion("vctypebelong <>", value, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongGreaterThan(Integer value) {
            addCriterion("vctypebelong >", value, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongGreaterThanOrEqualTo(Integer value) {
            addCriterion("vctypebelong >=", value, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongLessThan(Integer value) {
            addCriterion("vctypebelong <", value, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongLessThanOrEqualTo(Integer value) {
            addCriterion("vctypebelong <=", value, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongIn(List<Integer> values) {
            addCriterion("vctypebelong in", values, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongNotIn(List<Integer> values) {
            addCriterion("vctypebelong not in", values, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongBetween(Integer value1, Integer value2) {
            addCriterion("vctypebelong between", value1, value2, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andVctypebelongNotBetween(Integer value1, Integer value2) {
            addCriterion("vctypebelong not between", value1, value2, "vctypebelong");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeIsNull() {
            addCriterion("rb_makecode is null");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeIsNotNull() {
            addCriterion("rb_makecode is not null");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeEqualTo(String value) {
            addCriterion("rb_makecode =", value, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeNotEqualTo(String value) {
            addCriterion("rb_makecode <>", value, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeGreaterThan(String value) {
            addCriterion("rb_makecode >", value, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeGreaterThanOrEqualTo(String value) {
            addCriterion("rb_makecode >=", value, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeLessThan(String value) {
            addCriterion("rb_makecode <", value, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeLessThanOrEqualTo(String value) {
            addCriterion("rb_makecode <=", value, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeLike(String value) {
            addCriterion("rb_makecode like", value, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeNotLike(String value) {
            addCriterion("rb_makecode not like", value, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeIn(List<String> values) {
            addCriterion("rb_makecode in", values, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeNotIn(List<String> values) {
            addCriterion("rb_makecode not in", values, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeBetween(String value1, String value2) {
            addCriterion("rb_makecode between", value1, value2, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbMakecodeNotBetween(String value1, String value2) {
            addCriterion("rb_makecode not between", value1, value2, "rbMakecode");
            return (Criteria) this;
        }

        public Criteria andRbFamilyIsNull() {
            addCriterion("rb_family is null");
            return (Criteria) this;
        }

        public Criteria andRbFamilyIsNotNull() {
            addCriterion("rb_family is not null");
            return (Criteria) this;
        }

        public Criteria andRbFamilyEqualTo(String value) {
            addCriterion("rb_family =", value, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyNotEqualTo(String value) {
            addCriterion("rb_family <>", value, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyGreaterThan(String value) {
            addCriterion("rb_family >", value, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("rb_family >=", value, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyLessThan(String value) {
            addCriterion("rb_family <", value, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyLessThanOrEqualTo(String value) {
            addCriterion("rb_family <=", value, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyLike(String value) {
            addCriterion("rb_family like", value, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyNotLike(String value) {
            addCriterion("rb_family not like", value, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyIn(List<String> values) {
            addCriterion("rb_family in", values, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyNotIn(List<String> values) {
            addCriterion("rb_family not in", values, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyBetween(String value1, String value2) {
            addCriterion("rb_family between", value1, value2, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbFamilyNotBetween(String value1, String value2) {
            addCriterion("rb_family not between", value1, value2, "rbFamily");
            return (Criteria) this;
        }

        public Criteria andRbYearIsNull() {
            addCriterion("rb_year is null");
            return (Criteria) this;
        }

        public Criteria andRbYearIsNotNull() {
            addCriterion("rb_year is not null");
            return (Criteria) this;
        }

        public Criteria andRbYearEqualTo(String value) {
            addCriterion("rb_year =", value, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearNotEqualTo(String value) {
            addCriterion("rb_year <>", value, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearGreaterThan(String value) {
            addCriterion("rb_year >", value, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearGreaterThanOrEqualTo(String value) {
            addCriterion("rb_year >=", value, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearLessThan(String value) {
            addCriterion("rb_year <", value, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearLessThanOrEqualTo(String value) {
            addCriterion("rb_year <=", value, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearLike(String value) {
            addCriterion("rb_year like", value, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearNotLike(String value) {
            addCriterion("rb_year not like", value, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearIn(List<String> values) {
            addCriterion("rb_year in", values, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearNotIn(List<String> values) {
            addCriterion("rb_year not in", values, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearBetween(String value1, String value2) {
            addCriterion("rb_year between", value1, value2, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbYearNotBetween(String value1, String value2) {
            addCriterion("rb_year not between", value1, value2, "rbYear");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyIsNull() {
            addCriterion("rb_vehiclekey is null");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyIsNotNull() {
            addCriterion("rb_vehiclekey is not null");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyEqualTo(String value) {
            addCriterion("rb_vehiclekey =", value, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyNotEqualTo(String value) {
            addCriterion("rb_vehiclekey <>", value, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyGreaterThan(String value) {
            addCriterion("rb_vehiclekey >", value, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyGreaterThanOrEqualTo(String value) {
            addCriterion("rb_vehiclekey >=", value, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyLessThan(String value) {
            addCriterion("rb_vehiclekey <", value, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyLessThanOrEqualTo(String value) {
            addCriterion("rb_vehiclekey <=", value, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyLike(String value) {
            addCriterion("rb_vehiclekey like", value, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyNotLike(String value) {
            addCriterion("rb_vehiclekey not like", value, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyIn(List<String> values) {
            addCriterion("rb_vehiclekey in", values, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyNotIn(List<String> values) {
            addCriterion("rb_vehiclekey not in", values, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyBetween(String value1, String value2) {
            addCriterion("rb_vehiclekey between", value1, value2, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andRbVehiclekeyNotBetween(String value1, String value2) {
            addCriterion("rb_vehiclekey not between", value1, value2, "rbVehiclekey");
            return (Criteria) this;
        }

        public Criteria andQaIsNull() {
            addCriterion("qa is null");
            return (Criteria) this;
        }

        public Criteria andQaIsNotNull() {
            addCriterion("qa is not null");
            return (Criteria) this;
        }

        public Criteria andQaEqualTo(String value) {
            addCriterion("qa =", value, "qa");
            return (Criteria) this;
        }

        public Criteria andQaNotEqualTo(String value) {
            addCriterion("qa <>", value, "qa");
            return (Criteria) this;
        }

        public Criteria andQaGreaterThan(String value) {
            addCriterion("qa >", value, "qa");
            return (Criteria) this;
        }

        public Criteria andQaGreaterThanOrEqualTo(String value) {
            addCriterion("qa >=", value, "qa");
            return (Criteria) this;
        }

        public Criteria andQaLessThan(String value) {
            addCriterion("qa <", value, "qa");
            return (Criteria) this;
        }

        public Criteria andQaLessThanOrEqualTo(String value) {
            addCriterion("qa <=", value, "qa");
            return (Criteria) this;
        }

        public Criteria andQaLike(String value) {
            addCriterion("qa like", value, "qa");
            return (Criteria) this;
        }

        public Criteria andQaNotLike(String value) {
            addCriterion("qa not like", value, "qa");
            return (Criteria) this;
        }

        public Criteria andQaIn(List<String> values) {
            addCriterion("qa in", values, "qa");
            return (Criteria) this;
        }

        public Criteria andQaNotIn(List<String> values) {
            addCriterion("qa not in", values, "qa");
            return (Criteria) this;
        }

        public Criteria andQaBetween(String value1, String value2) {
            addCriterion("qa between", value1, value2, "qa");
            return (Criteria) this;
        }

        public Criteria andQaNotBetween(String value1, String value2) {
            addCriterion("qa not between", value1, value2, "qa");
            return (Criteria) this;
        }

        public Criteria andAuthcodeIsNull() {
            addCriterion("authcode is null");
            return (Criteria) this;
        }

        public Criteria andAuthcodeIsNotNull() {
            addCriterion("authcode is not null");
            return (Criteria) this;
        }

        public Criteria andAuthcodeEqualTo(String value) {
            addCriterion("authcode =", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotEqualTo(String value) {
            addCriterion("authcode <>", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeGreaterThan(String value) {
            addCriterion("authcode >", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeGreaterThanOrEqualTo(String value) {
            addCriterion("authcode >=", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLessThan(String value) {
            addCriterion("authcode <", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLessThanOrEqualTo(String value) {
            addCriterion("authcode <=", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLike(String value) {
            addCriterion("authcode like", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotLike(String value) {
            addCriterion("authcode not like", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeIn(List<String> values) {
            addCriterion("authcode in", values, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotIn(List<String> values) {
            addCriterion("authcode not in", values, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeBetween(String value1, String value2) {
            addCriterion("authcode between", value1, value2, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotBetween(String value1, String value2) {
            addCriterion("authcode not between", value1, value2, "authcode");
            return (Criteria) this;
        }

        public Criteria andIsqaIsNull() {
            addCriterion("isqa is null");
            return (Criteria) this;
        }

        public Criteria andIsqaIsNotNull() {
            addCriterion("isqa is not null");
            return (Criteria) this;
        }

        public Criteria andIsqaEqualTo(Integer value) {
            addCriterion("isqa =", value, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaNotEqualTo(Integer value) {
            addCriterion("isqa <>", value, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaGreaterThan(Integer value) {
            addCriterion("isqa >", value, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaGreaterThanOrEqualTo(Integer value) {
            addCriterion("isqa >=", value, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaLessThan(Integer value) {
            addCriterion("isqa <", value, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaLessThanOrEqualTo(Integer value) {
            addCriterion("isqa <=", value, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaIn(List<Integer> values) {
            addCriterion("isqa in", values, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaNotIn(List<Integer> values) {
            addCriterion("isqa not in", values, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaBetween(Integer value1, Integer value2) {
            addCriterion("isqa between", value1, value2, "isqa");
            return (Criteria) this;
        }

        public Criteria andIsqaNotBetween(Integer value1, Integer value2) {
            addCriterion("isqa not between", value1, value2, "isqa");
            return (Criteria) this;
        }

        public Criteria andQasnIsNull() {
            addCriterion("qasn is null");
            return (Criteria) this;
        }

        public Criteria andQasnIsNotNull() {
            addCriterion("qasn is not null");
            return (Criteria) this;
        }

        public Criteria andQasnEqualTo(String value) {
            addCriterion("qasn =", value, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnNotEqualTo(String value) {
            addCriterion("qasn <>", value, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnGreaterThan(String value) {
            addCriterion("qasn >", value, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnGreaterThanOrEqualTo(String value) {
            addCriterion("qasn >=", value, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnLessThan(String value) {
            addCriterion("qasn <", value, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnLessThanOrEqualTo(String value) {
            addCriterion("qasn <=", value, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnLike(String value) {
            addCriterion("qasn like", value, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnNotLike(String value) {
            addCriterion("qasn not like", value, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnIn(List<String> values) {
            addCriterion("qasn in", values, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnNotIn(List<String> values) {
            addCriterion("qasn not in", values, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnBetween(String value1, String value2) {
            addCriterion("qasn between", value1, value2, "qasn");
            return (Criteria) this;
        }

        public Criteria andQasnNotBetween(String value1, String value2) {
            addCriterion("qasn not between", value1, value2, "qasn");
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

        public Criteria andPayWayEqualTo(Byte value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Byte value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Byte value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Byte value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Byte value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Byte> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Byte> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Byte value1, Byte value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("price_type is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("price_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(Byte value) {
            addCriterion("price_type =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(Byte value) {
            addCriterion("price_type <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(Byte value) {
            addCriterion("price_type >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("price_type >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(Byte value) {
            addCriterion("price_type <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("price_type <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<Byte> values) {
            addCriterion("price_type in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<Byte> values) {
            addCriterion("price_type not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(Byte value1, Byte value2) {
            addCriterion("price_type between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("price_type not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andIsCrestIsNull() {
            addCriterion("is_crest is null");
            return (Criteria) this;
        }

        public Criteria andIsCrestIsNotNull() {
            addCriterion("is_crest is not null");
            return (Criteria) this;
        }

        public Criteria andIsCrestEqualTo(Byte value) {
            addCriterion("is_crest =", value, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestNotEqualTo(Byte value) {
            addCriterion("is_crest <>", value, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestGreaterThan(Byte value) {
            addCriterion("is_crest >", value, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_crest >=", value, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestLessThan(Byte value) {
            addCriterion("is_crest <", value, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestLessThanOrEqualTo(Byte value) {
            addCriterion("is_crest <=", value, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestIn(List<Byte> values) {
            addCriterion("is_crest in", values, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestNotIn(List<Byte> values) {
            addCriterion("is_crest not in", values, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestBetween(Byte value1, Byte value2) {
            addCriterion("is_crest between", value1, value2, "isCrest");
            return (Criteria) this;
        }

        public Criteria andIsCrestNotBetween(Byte value1, Byte value2) {
            addCriterion("is_crest not between", value1, value2, "isCrest");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeIsNull() {
            addCriterion("crest_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeIsNotNull() {
            addCriterion("crest_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeEqualTo(Date value) {
            addCriterion("crest_create_time =", value, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeNotEqualTo(Date value) {
            addCriterion("crest_create_time <>", value, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeGreaterThan(Date value) {
            addCriterion("crest_create_time >", value, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crest_create_time >=", value, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeLessThan(Date value) {
            addCriterion("crest_create_time <", value, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("crest_create_time <=", value, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeIn(List<Date> values) {
            addCriterion("crest_create_time in", values, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeNotIn(List<Date> values) {
            addCriterion("crest_create_time not in", values, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeBetween(Date value1, Date value2) {
            addCriterion("crest_create_time between", value1, value2, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("crest_create_time not between", value1, value2, "crestCreateTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeIsNull() {
            addCriterion("crest_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeIsNotNull() {
            addCriterion("crest_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeEqualTo(Date value) {
            addCriterion("crest_start_time =", value, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeNotEqualTo(Date value) {
            addCriterion("crest_start_time <>", value, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeGreaterThan(Date value) {
            addCriterion("crest_start_time >", value, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crest_start_time >=", value, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeLessThan(Date value) {
            addCriterion("crest_start_time <", value, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("crest_start_time <=", value, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeIn(List<Date> values) {
            addCriterion("crest_start_time in", values, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeNotIn(List<Date> values) {
            addCriterion("crest_start_time not in", values, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeBetween(Date value1, Date value2) {
            addCriterion("crest_start_time between", value1, value2, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("crest_start_time not between", value1, value2, "crestStartTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeIsNull() {
            addCriterion("crest_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeIsNotNull() {
            addCriterion("crest_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeEqualTo(Date value) {
            addCriterion("crest_end_time =", value, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeNotEqualTo(Date value) {
            addCriterion("crest_end_time <>", value, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeGreaterThan(Date value) {
            addCriterion("crest_end_time >", value, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crest_end_time >=", value, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeLessThan(Date value) {
            addCriterion("crest_end_time <", value, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("crest_end_time <=", value, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeIn(List<Date> values) {
            addCriterion("crest_end_time in", values, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeNotIn(List<Date> values) {
            addCriterion("crest_end_time not in", values, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeBetween(Date value1, Date value2) {
            addCriterion("crest_end_time between", value1, value2, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("crest_end_time not between", value1, value2, "crestEndTime");
            return (Criteria) this;
        }

        public Criteria andCrestStatusIsNull() {
            addCriterion("crest_status is null");
            return (Criteria) this;
        }

        public Criteria andCrestStatusIsNotNull() {
            addCriterion("crest_status is not null");
            return (Criteria) this;
        }

        public Criteria andCrestStatusEqualTo(Byte value) {
            addCriterion("crest_status =", value, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusNotEqualTo(Byte value) {
            addCriterion("crest_status <>", value, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusGreaterThan(Byte value) {
            addCriterion("crest_status >", value, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("crest_status >=", value, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusLessThan(Byte value) {
            addCriterion("crest_status <", value, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusLessThanOrEqualTo(Byte value) {
            addCriterion("crest_status <=", value, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusIn(List<Byte> values) {
            addCriterion("crest_status in", values, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusNotIn(List<Byte> values) {
            addCriterion("crest_status not in", values, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusBetween(Byte value1, Byte value2) {
            addCriterion("crest_status between", value1, value2, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andCrestStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("crest_status not between", value1, value2, "crestStatus");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundIsNull() {
            addCriterion("has_background is null");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundIsNotNull() {
            addCriterion("has_background is not null");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundEqualTo(Byte value) {
            addCriterion("has_background =", value, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundNotEqualTo(Byte value) {
            addCriterion("has_background <>", value, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundGreaterThan(Byte value) {
            addCriterion("has_background >", value, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundGreaterThanOrEqualTo(Byte value) {
            addCriterion("has_background >=", value, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundLessThan(Byte value) {
            addCriterion("has_background <", value, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundLessThanOrEqualTo(Byte value) {
            addCriterion("has_background <=", value, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundIn(List<Byte> values) {
            addCriterion("has_background in", values, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundNotIn(List<Byte> values) {
            addCriterion("has_background not in", values, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundBetween(Byte value1, Byte value2) {
            addCriterion("has_background between", value1, value2, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andHasBackgroundNotBetween(Byte value1, Byte value2) {
            addCriterion("has_background not between", value1, value2, "hasBackground");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeIsNull() {
            addCriterion("background_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeIsNotNull() {
            addCriterion("background_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeEqualTo(Date value) {
            addCriterion("background_create_time =", value, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeNotEqualTo(Date value) {
            addCriterion("background_create_time <>", value, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeGreaterThan(Date value) {
            addCriterion("background_create_time >", value, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("background_create_time >=", value, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeLessThan(Date value) {
            addCriterion("background_create_time <", value, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("background_create_time <=", value, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeIn(List<Date> values) {
            addCriterion("background_create_time in", values, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeNotIn(List<Date> values) {
            addCriterion("background_create_time not in", values, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeBetween(Date value1, Date value2) {
            addCriterion("background_create_time between", value1, value2, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("background_create_time not between", value1, value2, "backgroundCreateTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeIsNull() {
            addCriterion("background_start_time is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeIsNotNull() {
            addCriterion("background_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeEqualTo(Date value) {
            addCriterion("background_start_time =", value, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeNotEqualTo(Date value) {
            addCriterion("background_start_time <>", value, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeGreaterThan(Date value) {
            addCriterion("background_start_time >", value, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("background_start_time >=", value, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeLessThan(Date value) {
            addCriterion("background_start_time <", value, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("background_start_time <=", value, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeIn(List<Date> values) {
            addCriterion("background_start_time in", values, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeNotIn(List<Date> values) {
            addCriterion("background_start_time not in", values, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeBetween(Date value1, Date value2) {
            addCriterion("background_start_time between", value1, value2, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("background_start_time not between", value1, value2, "backgroundStartTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeIsNull() {
            addCriterion("background_end_time is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeIsNotNull() {
            addCriterion("background_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeEqualTo(Date value) {
            addCriterion("background_end_time =", value, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeNotEqualTo(Date value) {
            addCriterion("background_end_time <>", value, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeGreaterThan(Date value) {
            addCriterion("background_end_time >", value, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("background_end_time >=", value, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeLessThan(Date value) {
            addCriterion("background_end_time <", value, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("background_end_time <=", value, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeIn(List<Date> values) {
            addCriterion("background_end_time in", values, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeNotIn(List<Date> values) {
            addCriterion("background_end_time not in", values, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeBetween(Date value1, Date value2) {
            addCriterion("background_end_time between", value1, value2, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("background_end_time not between", value1, value2, "backgroundEndTime");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusIsNull() {
            addCriterion("background_status is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusIsNotNull() {
            addCriterion("background_status is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusEqualTo(Byte value) {
            addCriterion("background_status =", value, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusNotEqualTo(Byte value) {
            addCriterion("background_status <>", value, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusGreaterThan(Byte value) {
            addCriterion("background_status >", value, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("background_status >=", value, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusLessThan(Byte value) {
            addCriterion("background_status <", value, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusLessThanOrEqualTo(Byte value) {
            addCriterion("background_status <=", value, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusIn(List<Byte> values) {
            addCriterion("background_status in", values, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusNotIn(List<Byte> values) {
            addCriterion("background_status not in", values, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusBetween(Byte value1, Byte value2) {
            addCriterion("background_status between", value1, value2, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andBackgroundStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("background_status not between", value1, value2, "backgroundStatus");
            return (Criteria) this;
        }

        public Criteria andPromotionStateIsNull() {
            addCriterion("promotion_state is null");
            return (Criteria) this;
        }

        public Criteria andPromotionStateIsNotNull() {
            addCriterion("promotion_state is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionStateEqualTo(Integer value) {
            addCriterion("promotion_state =", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateNotEqualTo(Integer value) {
            addCriterion("promotion_state <>", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateGreaterThan(Integer value) {
            addCriterion("promotion_state >", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_state >=", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateLessThan(Integer value) {
            addCriterion("promotion_state <", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_state <=", value, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateIn(List<Integer> values) {
            addCriterion("promotion_state in", values, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateNotIn(List<Integer> values) {
            addCriterion("promotion_state not in", values, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateBetween(Integer value1, Integer value2) {
            addCriterion("promotion_state between", value1, value2, "promotionState");
            return (Criteria) this;
        }

        public Criteria andPromotionStateNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_state not between", value1, value2, "promotionState");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusIsNull() {
            addCriterion("consume_status is null");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusIsNotNull() {
            addCriterion("consume_status is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusEqualTo(Byte value) {
            addCriterion("consume_status =", value, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusNotEqualTo(Byte value) {
            addCriterion("consume_status <>", value, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusGreaterThan(Byte value) {
            addCriterion("consume_status >", value, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("consume_status >=", value, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusLessThan(Byte value) {
            addCriterion("consume_status <", value, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("consume_status <=", value, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusIn(List<Byte> values) {
            addCriterion("consume_status in", values, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusNotIn(List<Byte> values) {
            addCriterion("consume_status not in", values, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusBetween(Byte value1, Byte value2) {
            addCriterion("consume_status between", value1, value2, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("consume_status not between", value1, value2, "consumeStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("fuel_type is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("fuel_type is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(Integer value) {
            addCriterion("fuel_type =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(Integer value) {
            addCriterion("fuel_type <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(Integer value) {
            addCriterion("fuel_type >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuel_type >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(Integer value) {
            addCriterion("fuel_type <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fuel_type <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<Integer> values) {
            addCriterion("fuel_type in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<Integer> values) {
            addCriterion("fuel_type not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(Integer value1, Integer value2) {
            addCriterion("fuel_type between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fuel_type not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andInnerColorIsNull() {
            addCriterion("inner_color is null");
            return (Criteria) this;
        }

        public Criteria andInnerColorIsNotNull() {
            addCriterion("inner_color is not null");
            return (Criteria) this;
        }

        public Criteria andInnerColorEqualTo(Integer value) {
            addCriterion("inner_color =", value, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorNotEqualTo(Integer value) {
            addCriterion("inner_color <>", value, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorGreaterThan(Integer value) {
            addCriterion("inner_color >", value, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorGreaterThanOrEqualTo(Integer value) {
            addCriterion("inner_color >=", value, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorLessThan(Integer value) {
            addCriterion("inner_color <", value, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorLessThanOrEqualTo(Integer value) {
            addCriterion("inner_color <=", value, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorIn(List<Integer> values) {
            addCriterion("inner_color in", values, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorNotIn(List<Integer> values) {
            addCriterion("inner_color not in", values, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorBetween(Integer value1, Integer value2) {
            addCriterion("inner_color between", value1, value2, "innerColor");
            return (Criteria) this;
        }

        public Criteria andInnerColorNotBetween(Integer value1, Integer value2) {
            addCriterion("inner_color not between", value1, value2, "innerColor");
            return (Criteria) this;
        }

        public Criteria andEngineSizeIsNull() {
            addCriterion("engine_size is null");
            return (Criteria) this;
        }

        public Criteria andEngineSizeIsNotNull() {
            addCriterion("engine_size is not null");
            return (Criteria) this;
        }

        public Criteria andEngineSizeEqualTo(Integer value) {
            addCriterion("engine_size =", value, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeNotEqualTo(Integer value) {
            addCriterion("engine_size <>", value, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeGreaterThan(Integer value) {
            addCriterion("engine_size >", value, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("engine_size >=", value, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeLessThan(Integer value) {
            addCriterion("engine_size <", value, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeLessThanOrEqualTo(Integer value) {
            addCriterion("engine_size <=", value, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeIn(List<Integer> values) {
            addCriterion("engine_size in", values, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeNotIn(List<Integer> values) {
            addCriterion("engine_size not in", values, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeBetween(Integer value1, Integer value2) {
            addCriterion("engine_size between", value1, value2, "engineSize");
            return (Criteria) this;
        }

        public Criteria andEngineSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("engine_size not between", value1, value2, "engineSize");
            return (Criteria) this;
        }

        public Criteria andMd5codeIsNull() {
            addCriterion("md5code is null");
            return (Criteria) this;
        }

        public Criteria andMd5codeIsNotNull() {
            addCriterion("md5code is not null");
            return (Criteria) this;
        }

        public Criteria andMd5codeEqualTo(String value) {
            addCriterion("md5code =", value, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeNotEqualTo(String value) {
            addCriterion("md5code <>", value, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeGreaterThan(String value) {
            addCriterion("md5code >", value, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeGreaterThanOrEqualTo(String value) {
            addCriterion("md5code >=", value, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeLessThan(String value) {
            addCriterion("md5code <", value, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeLessThanOrEqualTo(String value) {
            addCriterion("md5code <=", value, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeLike(String value) {
            addCriterion("md5code like", value, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeNotLike(String value) {
            addCriterion("md5code not like", value, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeIn(List<String> values) {
            addCriterion("md5code in", values, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeNotIn(List<String> values) {
            addCriterion("md5code not in", values, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeBetween(String value1, String value2) {
            addCriterion("md5code between", value1, value2, "md5code");
            return (Criteria) this;
        }

        public Criteria andMd5codeNotBetween(String value1, String value2) {
            addCriterion("md5code not between", value1, value2, "md5code");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(Short value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(Short value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(Short value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(Short value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(Short value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(Short value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<Short> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<Short> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(Short value1, Short value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(Short value1, Short value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdIsNull() {
            addCriterion("markcounty_id is null");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdIsNotNull() {
            addCriterion("markcounty_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdEqualTo(Short value) {
            addCriterion("markcounty_id =", value, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdNotEqualTo(Short value) {
            addCriterion("markcounty_id <>", value, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdGreaterThan(Short value) {
            addCriterion("markcounty_id >", value, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdGreaterThanOrEqualTo(Short value) {
            addCriterion("markcounty_id >=", value, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdLessThan(Short value) {
            addCriterion("markcounty_id <", value, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdLessThanOrEqualTo(Short value) {
            addCriterion("markcounty_id <=", value, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdIn(List<Short> values) {
            addCriterion("markcounty_id in", values, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdNotIn(List<Short> values) {
            addCriterion("markcounty_id not in", values, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdBetween(Short value1, Short value2) {
            addCriterion("markcounty_id between", value1, value2, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andMarkcountyIdNotBetween(Short value1, Short value2) {
            addCriterion("markcounty_id not between", value1, value2, "markcountyId");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUsagesIsNull() {
            addCriterion("usages is null");
            return (Criteria) this;
        }

        public Criteria andUsagesIsNotNull() {
            addCriterion("usages is not null");
            return (Criteria) this;
        }

        public Criteria andUsagesEqualTo(Integer value) {
            addCriterion("usages =", value, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesNotEqualTo(Integer value) {
            addCriterion("usages <>", value, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesGreaterThan(Integer value) {
            addCriterion("usages >", value, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("usages >=", value, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesLessThan(Integer value) {
            addCriterion("usages <", value, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesLessThanOrEqualTo(Integer value) {
            addCriterion("usages <=", value, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesIn(List<Integer> values) {
            addCriterion("usages in", values, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesNotIn(List<Integer> values) {
            addCriterion("usages not in", values, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesBetween(Integer value1, Integer value2) {
            addCriterion("usages between", value1, value2, "usages");
            return (Criteria) this;
        }

        public Criteria andUsagesNotBetween(Integer value1, Integer value2) {
            addCriterion("usages not between", value1, value2, "usages");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderIsNull() {
            addCriterion("repair_recorder is null");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderIsNotNull() {
            addCriterion("repair_recorder is not null");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderEqualTo(Byte value) {
            addCriterion("repair_recorder =", value, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderNotEqualTo(Byte value) {
            addCriterion("repair_recorder <>", value, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderGreaterThan(Byte value) {
            addCriterion("repair_recorder >", value, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderGreaterThanOrEqualTo(Byte value) {
            addCriterion("repair_recorder >=", value, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderLessThan(Byte value) {
            addCriterion("repair_recorder <", value, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderLessThanOrEqualTo(Byte value) {
            addCriterion("repair_recorder <=", value, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderIn(List<Byte> values) {
            addCriterion("repair_recorder in", values, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderNotIn(List<Byte> values) {
            addCriterion("repair_recorder not in", values, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderBetween(Byte value1, Byte value2) {
            addCriterion("repair_recorder between", value1, value2, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andRepairRecorderNotBetween(Byte value1, Byte value2) {
            addCriterion("repair_recorder not between", value1, value2, "repairRecorder");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Boolean value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Boolean value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Boolean value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Boolean value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Boolean value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Boolean> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Boolean> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Boolean value1, Boolean value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Short value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Short value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Short value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Short value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Short value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Short> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Short> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Short value1, Short value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Short value1, Short value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andIscoreIsNull() {
            addCriterion("iscore is null");
            return (Criteria) this;
        }

        public Criteria andIscoreIsNotNull() {
            addCriterion("iscore is not null");
            return (Criteria) this;
        }

        public Criteria andIscoreEqualTo(Integer value) {
            addCriterion("iscore =", value, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreNotEqualTo(Integer value) {
            addCriterion("iscore <>", value, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreGreaterThan(Integer value) {
            addCriterion("iscore >", value, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("iscore >=", value, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreLessThan(Integer value) {
            addCriterion("iscore <", value, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreLessThanOrEqualTo(Integer value) {
            addCriterion("iscore <=", value, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreIn(List<Integer> values) {
            addCriterion("iscore in", values, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreNotIn(List<Integer> values) {
            addCriterion("iscore not in", values, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreBetween(Integer value1, Integer value2) {
            addCriterion("iscore between", value1, value2, "iscore");
            return (Criteria) this;
        }

        public Criteria andIscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("iscore not between", value1, value2, "iscore");
            return (Criteria) this;
        }

        public Criteria andTransferIsNull() {
            addCriterion("transfer is null");
            return (Criteria) this;
        }

        public Criteria andTransferIsNotNull() {
            addCriterion("transfer is not null");
            return (Criteria) this;
        }

        public Criteria andTransferEqualTo(Byte value) {
            addCriterion("transfer =", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotEqualTo(Byte value) {
            addCriterion("transfer <>", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThan(Byte value) {
            addCriterion("transfer >", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThanOrEqualTo(Byte value) {
            addCriterion("transfer >=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThan(Byte value) {
            addCriterion("transfer <", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThanOrEqualTo(Byte value) {
            addCriterion("transfer <=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferIn(List<Byte> values) {
            addCriterion("transfer in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotIn(List<Byte> values) {
            addCriterion("transfer not in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferBetween(Byte value1, Byte value2) {
            addCriterion("transfer between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotBetween(Byte value1, Byte value2) {
            addCriterion("transfer not between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("service like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("service not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<String> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<String> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andSubstatusIsNull() {
            addCriterion("substatus is null");
            return (Criteria) this;
        }

        public Criteria andSubstatusIsNotNull() {
            addCriterion("substatus is not null");
            return (Criteria) this;
        }

        public Criteria andSubstatusEqualTo(Byte value) {
            addCriterion("substatus =", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotEqualTo(Byte value) {
            addCriterion("substatus <>", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusGreaterThan(Byte value) {
            addCriterion("substatus >", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("substatus >=", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusLessThan(Byte value) {
            addCriterion("substatus <", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusLessThanOrEqualTo(Byte value) {
            addCriterion("substatus <=", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusIn(List<Byte> values) {
            addCriterion("substatus in", values, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotIn(List<Byte> values) {
            addCriterion("substatus not in", values, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusBetween(Byte value1, Byte value2) {
            addCriterion("substatus between", value1, value2, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("substatus not between", value1, value2, "substatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusIsNull() {
            addCriterion("bargains_status is null");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusIsNotNull() {
            addCriterion("bargains_status is not null");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusEqualTo(Byte value) {
            addCriterion("bargains_status =", value, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusNotEqualTo(Byte value) {
            addCriterion("bargains_status <>", value, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusGreaterThan(Byte value) {
            addCriterion("bargains_status >", value, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("bargains_status >=", value, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusLessThan(Byte value) {
            addCriterion("bargains_status <", value, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("bargains_status <=", value, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusIn(List<Byte> values) {
            addCriterion("bargains_status in", values, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusNotIn(List<Byte> values) {
            addCriterion("bargains_status not in", values, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusBetween(Byte value1, Byte value2) {
            addCriterion("bargains_status between", value1, value2, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBargainsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("bargains_status not between", value1, value2, "bargainsStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStyleIsNull() {
            addCriterion("body_style is null");
            return (Criteria) this;
        }

        public Criteria andBodyStyleIsNotNull() {
            addCriterion("body_style is not null");
            return (Criteria) this;
        }

        public Criteria andBodyStyleEqualTo(Byte value) {
            addCriterion("body_style =", value, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleNotEqualTo(Byte value) {
            addCriterion("body_style <>", value, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleGreaterThan(Byte value) {
            addCriterion("body_style >", value, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleGreaterThanOrEqualTo(Byte value) {
            addCriterion("body_style >=", value, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleLessThan(Byte value) {
            addCriterion("body_style <", value, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleLessThanOrEqualTo(Byte value) {
            addCriterion("body_style <=", value, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleIn(List<Byte> values) {
            addCriterion("body_style in", values, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleNotIn(List<Byte> values) {
            addCriterion("body_style not in", values, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleBetween(Byte value1, Byte value2) {
            addCriterion("body_style between", value1, value2, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andBodyStyleNotBetween(Byte value1, Byte value2) {
            addCriterion("body_style not between", value1, value2, "bodyStyle");
            return (Criteria) this;
        }

        public Criteria andDriveTypeIsNull() {
            addCriterion("drive_type is null");
            return (Criteria) this;
        }

        public Criteria andDriveTypeIsNotNull() {
            addCriterion("drive_type is not null");
            return (Criteria) this;
        }

        public Criteria andDriveTypeEqualTo(Byte value) {
            addCriterion("drive_type =", value, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeNotEqualTo(Byte value) {
            addCriterion("drive_type <>", value, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeGreaterThan(Byte value) {
            addCriterion("drive_type >", value, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("drive_type >=", value, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeLessThan(Byte value) {
            addCriterion("drive_type <", value, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeLessThanOrEqualTo(Byte value) {
            addCriterion("drive_type <=", value, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeIn(List<Byte> values) {
            addCriterion("drive_type in", values, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeNotIn(List<Byte> values) {
            addCriterion("drive_type not in", values, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeBetween(Byte value1, Byte value2) {
            addCriterion("drive_type between", value1, value2, "driveType");
            return (Criteria) this;
        }

        public Criteria andDriveTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("drive_type not between", value1, value2, "driveType");
            return (Criteria) this;
        }

        public Criteria andBadgeIsNull() {
            addCriterion("badge is null");
            return (Criteria) this;
        }

        public Criteria andBadgeIsNotNull() {
            addCriterion("badge is not null");
            return (Criteria) this;
        }

        public Criteria andBadgeEqualTo(String value) {
            addCriterion("badge =", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotEqualTo(String value) {
            addCriterion("badge <>", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeGreaterThan(String value) {
            addCriterion("badge >", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeGreaterThanOrEqualTo(String value) {
            addCriterion("badge >=", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeLessThan(String value) {
            addCriterion("badge <", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeLessThanOrEqualTo(String value) {
            addCriterion("badge <=", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeLike(String value) {
            addCriterion("badge like", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotLike(String value) {
            addCriterion("badge not like", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeIn(List<String> values) {
            addCriterion("badge in", values, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotIn(List<String> values) {
            addCriterion("badge not in", values, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeBetween(String value1, String value2) {
            addCriterion("badge between", value1, value2, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotBetween(String value1, String value2) {
            addCriterion("badge not between", value1, value2, "badge");
            return (Criteria) this;
        }

        public Criteria andMakeYearIsNull() {
            addCriterion("make_year is null");
            return (Criteria) this;
        }

        public Criteria andMakeYearIsNotNull() {
            addCriterion("make_year is not null");
            return (Criteria) this;
        }

        public Criteria andMakeYearEqualTo(Short value) {
            addCriterion("make_year =", value, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearNotEqualTo(Short value) {
            addCriterion("make_year <>", value, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearGreaterThan(Short value) {
            addCriterion("make_year >", value, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearGreaterThanOrEqualTo(Short value) {
            addCriterion("make_year >=", value, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearLessThan(Short value) {
            addCriterion("make_year <", value, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearLessThanOrEqualTo(Short value) {
            addCriterion("make_year <=", value, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearIn(List<Short> values) {
            addCriterion("make_year in", values, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearNotIn(List<Short> values) {
            addCriterion("make_year not in", values, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearBetween(Short value1, Short value2) {
            addCriterion("make_year between", value1, value2, "makeYear");
            return (Criteria) this;
        }

        public Criteria andMakeYearNotBetween(Short value1, Short value2) {
            addCriterion("make_year not between", value1, value2, "makeYear");
            return (Criteria) this;
        }

        public Criteria andServiceCountIsNull() {
            addCriterion("service_count is null");
            return (Criteria) this;
        }

        public Criteria andServiceCountIsNotNull() {
            addCriterion("service_count is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCountEqualTo(Byte value) {
            addCriterion("service_count =", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotEqualTo(Byte value) {
            addCriterion("service_count <>", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountGreaterThan(Byte value) {
            addCriterion("service_count >", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("service_count >=", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLessThan(Byte value) {
            addCriterion("service_count <", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLessThanOrEqualTo(Byte value) {
            addCriterion("service_count <=", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountIn(List<Byte> values) {
            addCriterion("service_count in", values, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotIn(List<Byte> values) {
            addCriterion("service_count not in", values, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountBetween(Byte value1, Byte value2) {
            addCriterion("service_count between", value1, value2, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotBetween(Byte value1, Byte value2) {
            addCriterion("service_count not between", value1, value2, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andSellingPointIsNull() {
            addCriterion("selling_point is null");
            return (Criteria) this;
        }

        public Criteria andSellingPointIsNotNull() {
            addCriterion("selling_point is not null");
            return (Criteria) this;
        }

        public Criteria andSellingPointEqualTo(String value) {
            addCriterion("selling_point =", value, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointNotEqualTo(String value) {
            addCriterion("selling_point <>", value, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointGreaterThan(String value) {
            addCriterion("selling_point >", value, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointGreaterThanOrEqualTo(String value) {
            addCriterion("selling_point >=", value, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointLessThan(String value) {
            addCriterion("selling_point <", value, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointLessThanOrEqualTo(String value) {
            addCriterion("selling_point <=", value, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointLike(String value) {
            addCriterion("selling_point like", value, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointNotLike(String value) {
            addCriterion("selling_point not like", value, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointIn(List<String> values) {
            addCriterion("selling_point in", values, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointNotIn(List<String> values) {
            addCriterion("selling_point not in", values, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointBetween(String value1, String value2) {
            addCriterion("selling_point between", value1, value2, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andSellingPointNotBetween(String value1, String value2) {
            addCriterion("selling_point not between", value1, value2, "sellingPoint");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdIsNull() {
            addCriterion("emission_standard_id is null");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdIsNotNull() {
            addCriterion("emission_standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdEqualTo(Byte value) {
            addCriterion("emission_standard_id =", value, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdNotEqualTo(Byte value) {
            addCriterion("emission_standard_id <>", value, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdGreaterThan(Byte value) {
            addCriterion("emission_standard_id >", value, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("emission_standard_id >=", value, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdLessThan(Byte value) {
            addCriterion("emission_standard_id <", value, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdLessThanOrEqualTo(Byte value) {
            addCriterion("emission_standard_id <=", value, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdIn(List<Byte> values) {
            addCriterion("emission_standard_id in", values, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdNotIn(List<Byte> values) {
            addCriterion("emission_standard_id not in", values, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdBetween(Byte value1, Byte value2) {
            addCriterion("emission_standard_id between", value1, value2, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andEmissionStandardIdNotBetween(Byte value1, Byte value2) {
            addCriterion("emission_standard_id not between", value1, value2, "emissionStandardId");
            return (Criteria) this;
        }

        public Criteria andServicebitIsNull() {
            addCriterion("servicebit is null");
            return (Criteria) this;
        }

        public Criteria andServicebitIsNotNull() {
            addCriterion("servicebit is not null");
            return (Criteria) this;
        }

        public Criteria andServicebitEqualTo(Integer value) {
            addCriterion("servicebit =", value, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitNotEqualTo(Integer value) {
            addCriterion("servicebit <>", value, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitGreaterThan(Integer value) {
            addCriterion("servicebit >", value, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicebit >=", value, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitLessThan(Integer value) {
            addCriterion("servicebit <", value, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitLessThanOrEqualTo(Integer value) {
            addCriterion("servicebit <=", value, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitIn(List<Integer> values) {
            addCriterion("servicebit in", values, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitNotIn(List<Integer> values) {
            addCriterion("servicebit not in", values, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitBetween(Integer value1, Integer value2) {
            addCriterion("servicebit between", value1, value2, "servicebit");
            return (Criteria) this;
        }

        public Criteria andServicebitNotBetween(Integer value1, Integer value2) {
            addCriterion("servicebit not between", value1, value2, "servicebit");
            return (Criteria) this;
        }

        public Criteria andSalesIdIsNull() {
            addCriterion("sales_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesIdIsNotNull() {
            addCriterion("sales_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesIdEqualTo(Integer value) {
            addCriterion("sales_id =", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotEqualTo(Integer value) {
            addCriterion("sales_id <>", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdGreaterThan(Integer value) {
            addCriterion("sales_id >", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_id >=", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLessThan(Integer value) {
            addCriterion("sales_id <", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLessThanOrEqualTo(Integer value) {
            addCriterion("sales_id <=", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdIn(List<Integer> values) {
            addCriterion("sales_id in", values, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotIn(List<Integer> values) {
            addCriterion("sales_id not in", values, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdBetween(Integer value1, Integer value2) {
            addCriterion("sales_id between", value1, value2, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_id not between", value1, value2, "salesId");
            return (Criteria) this;
        }

        public Criteria andCustomCodeIsNull() {
            addCriterion("custom_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomCodeIsNotNull() {
            addCriterion("custom_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomCodeEqualTo(String value) {
            addCriterion("custom_code =", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeNotEqualTo(String value) {
            addCriterion("custom_code <>", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeGreaterThan(String value) {
            addCriterion("custom_code >", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("custom_code >=", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeLessThan(String value) {
            addCriterion("custom_code <", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeLessThanOrEqualTo(String value) {
            addCriterion("custom_code <=", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeLike(String value) {
            addCriterion("custom_code like", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeNotLike(String value) {
            addCriterion("custom_code not like", value, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeIn(List<String> values) {
            addCriterion("custom_code in", values, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeNotIn(List<String> values) {
            addCriterion("custom_code not in", values, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeBetween(String value1, String value2) {
            addCriterion("custom_code between", value1, value2, "customCode");
            return (Criteria) this;
        }

        public Criteria andCustomCodeNotBetween(String value1, String value2) {
            addCriterion("custom_code not between", value1, value2, "customCode");
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