package vip.vmansus.cloud.vcloud.model;

import java.util.ArrayList;
import java.util.List;

public class FileStoreExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public FileStoreExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andFileStoreIdIsNull() {
            addCriterion("file_store_id is null");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdIsNotNull() {
            addCriterion("file_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdEqualTo(Integer value) {
            addCriterion("file_store_id =", value, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdNotEqualTo(Integer value) {
            addCriterion("file_store_id <>", value, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdGreaterThan(Integer value) {
            addCriterion("file_store_id >", value, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_store_id >=", value, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdLessThan(Integer value) {
            addCriterion("file_store_id <", value, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_store_id <=", value, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdIn(List<Integer> values) {
            addCriterion("file_store_id in", values, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdNotIn(List<Integer> values) {
            addCriterion("file_store_id not in", values, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("file_store_id between", value1, value2, "fileStoreId");
            return (Criteria) this;
        }

        public Criteria andFileStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_store_id not between", value1, value2, "fileStoreId");
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

        public Criteria andCurrentSizeIsNull() {
            addCriterion("current_size is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeIsNotNull() {
            addCriterion("current_size is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeEqualTo(Integer value) {
            addCriterion("current_size =", value, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeNotEqualTo(Integer value) {
            addCriterion("current_size <>", value, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeGreaterThan(Integer value) {
            addCriterion("current_size >", value, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_size >=", value, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeLessThan(Integer value) {
            addCriterion("current_size <", value, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeLessThanOrEqualTo(Integer value) {
            addCriterion("current_size <=", value, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeIn(List<Integer> values) {
            addCriterion("current_size in", values, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeNotIn(List<Integer> values) {
            addCriterion("current_size not in", values, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeBetween(Integer value1, Integer value2) {
            addCriterion("current_size between", value1, value2, "currentSize");
            return (Criteria) this;
        }

        public Criteria andCurrentSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("current_size not between", value1, value2, "currentSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIsNull() {
            addCriterion("max_size is null");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIsNotNull() {
            addCriterion("max_size is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSizeEqualTo(Integer value) {
            addCriterion("max_size =", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotEqualTo(Integer value) {
            addCriterion("max_size <>", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeGreaterThan(Integer value) {
            addCriterion("max_size >", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_size >=", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeLessThan(Integer value) {
            addCriterion("max_size <", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeLessThanOrEqualTo(Integer value) {
            addCriterion("max_size <=", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIn(List<Integer> values) {
            addCriterion("max_size in", values, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotIn(List<Integer> values) {
            addCriterion("max_size not in", values, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeBetween(Integer value1, Integer value2) {
            addCriterion("max_size between", value1, value2, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_size not between", value1, value2, "maxSize");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(Integer value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(Integer value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(Integer value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(Integer value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(Integer value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<Integer> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<Integer> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(Integer value1, Integer value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table file_store
     *
     * @mbg.generated do_not_delete_during_merge Wed Sep 16 18:39:48 HKT 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
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