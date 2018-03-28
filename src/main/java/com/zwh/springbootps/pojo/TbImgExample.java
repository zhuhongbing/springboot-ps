package com.zwh.springbootps.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbImgExample() {
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

        public Criteria andImgidIsNull() {
            addCriterion("imgid is null");
            return (Criteria) this;
        }

        public Criteria andImgidIsNotNull() {
            addCriterion("imgid is not null");
            return (Criteria) this;
        }

        public Criteria andImgidEqualTo(Integer value) {
            addCriterion("imgid =", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotEqualTo(Integer value) {
            addCriterion("imgid <>", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidGreaterThan(Integer value) {
            addCriterion("imgid >", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imgid >=", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidLessThan(Integer value) {
            addCriterion("imgid <", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidLessThanOrEqualTo(Integer value) {
            addCriterion("imgid <=", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidIn(List<Integer> values) {
            addCriterion("imgid in", values, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotIn(List<Integer> values) {
            addCriterion("imgid not in", values, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidBetween(Integer value1, Integer value2) {
            addCriterion("imgid between", value1, value2, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotBetween(Integer value1, Integer value2) {
            addCriterion("imgid not between", value1, value2, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgpicIsNull() {
            addCriterion("imgpic is null");
            return (Criteria) this;
        }

        public Criteria andImgpicIsNotNull() {
            addCriterion("imgpic is not null");
            return (Criteria) this;
        }

        public Criteria andImgpicEqualTo(String value) {
            addCriterion("imgpic =", value, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicNotEqualTo(String value) {
            addCriterion("imgpic <>", value, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicGreaterThan(String value) {
            addCriterion("imgpic >", value, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicGreaterThanOrEqualTo(String value) {
            addCriterion("imgpic >=", value, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicLessThan(String value) {
            addCriterion("imgpic <", value, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicLessThanOrEqualTo(String value) {
            addCriterion("imgpic <=", value, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicLike(String value) {
            addCriterion("imgpic like", value, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicNotLike(String value) {
            addCriterion("imgpic not like", value, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicIn(List<String> values) {
            addCriterion("imgpic in", values, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicNotIn(List<String> values) {
            addCriterion("imgpic not in", values, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicBetween(String value1, String value2) {
            addCriterion("imgpic between", value1, value2, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgpicNotBetween(String value1, String value2) {
            addCriterion("imgpic not between", value1, value2, "imgpic");
            return (Criteria) this;
        }

        public Criteria andImgcateIsNull() {
            addCriterion("imgcate is null");
            return (Criteria) this;
        }

        public Criteria andImgcateIsNotNull() {
            addCriterion("imgcate is not null");
            return (Criteria) this;
        }

        public Criteria andImgcateEqualTo(String value) {
            addCriterion("imgcate =", value, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateNotEqualTo(String value) {
            addCriterion("imgcate <>", value, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateGreaterThan(String value) {
            addCriterion("imgcate >", value, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateGreaterThanOrEqualTo(String value) {
            addCriterion("imgcate >=", value, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateLessThan(String value) {
            addCriterion("imgcate <", value, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateLessThanOrEqualTo(String value) {
            addCriterion("imgcate <=", value, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateLike(String value) {
            addCriterion("imgcate like", value, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateNotLike(String value) {
            addCriterion("imgcate not like", value, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateIn(List<String> values) {
            addCriterion("imgcate in", values, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateNotIn(List<String> values) {
            addCriterion("imgcate not in", values, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateBetween(String value1, String value2) {
            addCriterion("imgcate between", value1, value2, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgcateNotBetween(String value1, String value2) {
            addCriterion("imgcate not between", value1, value2, "imgcate");
            return (Criteria) this;
        }

        public Criteria andImgtitleIsNull() {
            addCriterion("imgtitle is null");
            return (Criteria) this;
        }

        public Criteria andImgtitleIsNotNull() {
            addCriterion("imgtitle is not null");
            return (Criteria) this;
        }

        public Criteria andImgtitleEqualTo(String value) {
            addCriterion("imgtitle =", value, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleNotEqualTo(String value) {
            addCriterion("imgtitle <>", value, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleGreaterThan(String value) {
            addCriterion("imgtitle >", value, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleGreaterThanOrEqualTo(String value) {
            addCriterion("imgtitle >=", value, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleLessThan(String value) {
            addCriterion("imgtitle <", value, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleLessThanOrEqualTo(String value) {
            addCriterion("imgtitle <=", value, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleLike(String value) {
            addCriterion("imgtitle like", value, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleNotLike(String value) {
            addCriterion("imgtitle not like", value, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleIn(List<String> values) {
            addCriterion("imgtitle in", values, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleNotIn(List<String> values) {
            addCriterion("imgtitle not in", values, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleBetween(String value1, String value2) {
            addCriterion("imgtitle between", value1, value2, "imgtitle");
            return (Criteria) this;
        }

        public Criteria andImgtitleNotBetween(String value1, String value2) {
            addCriterion("imgtitle not between", value1, value2, "imgtitle");
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