package org.hsiang.free.modular.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExecutorConfigsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExecutorConfigsExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCronIsNull() {
            addCriterion("cron is null");
            return (Criteria) this;
        }

        public Criteria andCronIsNotNull() {
            addCriterion("cron is not null");
            return (Criteria) this;
        }

        public Criteria andCronEqualTo(String value) {
            addCriterion("cron =", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotEqualTo(String value) {
            addCriterion("cron <>", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThan(String value) {
            addCriterion("cron >", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThanOrEqualTo(String value) {
            addCriterion("cron >=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThan(String value) {
            addCriterion("cron <", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThanOrEqualTo(String value) {
            addCriterion("cron <=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLike(String value) {
            addCriterion("cron like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotLike(String value) {
            addCriterion("cron not like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronIn(List<String> values) {
            addCriterion("cron in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotIn(List<String> values) {
            addCriterion("cron not in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronBetween(String value1, String value2) {
            addCriterion("cron between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotBetween(String value1, String value2) {
            addCriterion("cron not between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andJobMethodIsNull() {
            addCriterion("job_method is null");
            return (Criteria) this;
        }

        public Criteria andJobMethodIsNotNull() {
            addCriterion("job_method is not null");
            return (Criteria) this;
        }

        public Criteria andJobMethodEqualTo(String value) {
            addCriterion("job_method =", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodNotEqualTo(String value) {
            addCriterion("job_method <>", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodGreaterThan(String value) {
            addCriterion("job_method >", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodGreaterThanOrEqualTo(String value) {
            addCriterion("job_method >=", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodLessThan(String value) {
            addCriterion("job_method <", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodLessThanOrEqualTo(String value) {
            addCriterion("job_method <=", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodLike(String value) {
            addCriterion("job_method like", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodNotLike(String value) {
            addCriterion("job_method not like", value, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodIn(List<String> values) {
            addCriterion("job_method in", values, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodNotIn(List<String> values) {
            addCriterion("job_method not in", values, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodBetween(String value1, String value2) {
            addCriterion("job_method between", value1, value2, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andJobMethodNotBetween(String value1, String value2) {
            addCriterion("job_method not between", value1, value2, "jobMethod");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andLazyLoadIsNull() {
            addCriterion("lazy_load is null");
            return (Criteria) this;
        }

        public Criteria andLazyLoadIsNotNull() {
            addCriterion("lazy_load is not null");
            return (Criteria) this;
        }

        public Criteria andLazyLoadEqualTo(String value) {
            addCriterion("lazy_load =", value, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadNotEqualTo(String value) {
            addCriterion("lazy_load <>", value, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadGreaterThan(String value) {
            addCriterion("lazy_load >", value, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadGreaterThanOrEqualTo(String value) {
            addCriterion("lazy_load >=", value, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadLessThan(String value) {
            addCriterion("lazy_load <", value, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadLessThanOrEqualTo(String value) {
            addCriterion("lazy_load <=", value, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadLike(String value) {
            addCriterion("lazy_load like", value, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadNotLike(String value) {
            addCriterion("lazy_load not like", value, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadIn(List<String> values) {
            addCriterion("lazy_load in", values, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadNotIn(List<String> values) {
            addCriterion("lazy_load not in", values, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadBetween(String value1, String value2) {
            addCriterion("lazy_load between", value1, value2, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyLoadNotBetween(String value1, String value2) {
            addCriterion("lazy_load not between", value1, value2, "lazyLoad");
            return (Criteria) this;
        }

        public Criteria andLazyTimeIsNull() {
            addCriterion("lazy_time is null");
            return (Criteria) this;
        }

        public Criteria andLazyTimeIsNotNull() {
            addCriterion("lazy_time is not null");
            return (Criteria) this;
        }

        public Criteria andLazyTimeEqualTo(Long value) {
            addCriterion("lazy_time =", value, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeNotEqualTo(Long value) {
            addCriterion("lazy_time <>", value, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeGreaterThan(Long value) {
            addCriterion("lazy_time >", value, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("lazy_time >=", value, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeLessThan(Long value) {
            addCriterion("lazy_time <", value, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeLessThanOrEqualTo(Long value) {
            addCriterion("lazy_time <=", value, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeIn(List<Long> values) {
            addCriterion("lazy_time in", values, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeNotIn(List<Long> values) {
            addCriterion("lazy_time not in", values, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeBetween(Long value1, Long value2) {
            addCriterion("lazy_time between", value1, value2, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andLazyTimeNotBetween(Long value1, Long value2) {
            addCriterion("lazy_time not between", value1, value2, "lazyTime");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberIsNull() {
            addCriterion("execute_number is null");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberIsNotNull() {
            addCriterion("execute_number is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberEqualTo(Integer value) {
            addCriterion("execute_number =", value, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberNotEqualTo(Integer value) {
            addCriterion("execute_number <>", value, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberGreaterThan(Integer value) {
            addCriterion("execute_number >", value, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("execute_number >=", value, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberLessThan(Integer value) {
            addCriterion("execute_number <", value, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberLessThanOrEqualTo(Integer value) {
            addCriterion("execute_number <=", value, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberIn(List<Integer> values) {
            addCriterion("execute_number in", values, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberNotIn(List<Integer> values) {
            addCriterion("execute_number not in", values, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberBetween(Integer value1, Integer value2) {
            addCriterion("execute_number between", value1, value2, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("execute_number not between", value1, value2, "executeNumber");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNull() {
            addCriterion("execute_time is null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNotNull() {
            addCriterion("execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeEqualTo(Date value) {
            addCriterion("execute_time =", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotEqualTo(Date value) {
            addCriterion("execute_time <>", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThan(Date value) {
            addCriterion("execute_time >", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("execute_time >=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThan(Date value) {
            addCriterion("execute_time <", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterion("execute_time <=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIn(List<Date> values) {
            addCriterion("execute_time in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotIn(List<Date> values) {
            addCriterion("execute_time not in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeBetween(Date value1, Date value2) {
            addCriterion("execute_time between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterion("execute_time not between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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