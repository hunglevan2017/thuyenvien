package com.saigonbpo.dc.Model;

import java.util.ArrayList;
import java.util.List;

public class SeaTrinhDoNgoaiNguExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeaTrinhDoNgoaiNguExample() {
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

        public Criteria andLoaingoainguIsNull() {
            addCriterion("loaingoaingu is null");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguIsNotNull() {
            addCriterion("loaingoaingu is not null");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguEqualTo(Integer value) {
            addCriterion("loaingoaingu =", value, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguNotEqualTo(Integer value) {
            addCriterion("loaingoaingu <>", value, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguGreaterThan(Integer value) {
            addCriterion("loaingoaingu >", value, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguGreaterThanOrEqualTo(Integer value) {
            addCriterion("loaingoaingu >=", value, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguLessThan(Integer value) {
            addCriterion("loaingoaingu <", value, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguLessThanOrEqualTo(Integer value) {
            addCriterion("loaingoaingu <=", value, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguIn(List<Integer> values) {
            addCriterion("loaingoaingu in", values, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguNotIn(List<Integer> values) {
            addCriterion("loaingoaingu not in", values, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguBetween(Integer value1, Integer value2) {
            addCriterion("loaingoaingu between", value1, value2, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andLoaingoainguNotBetween(Integer value1, Integer value2) {
            addCriterion("loaingoaingu not between", value1, value2, "loaingoaingu");
            return (Criteria) this;
        }

        public Criteria andNgheIsNull() {
            addCriterion("nghe is null");
            return (Criteria) this;
        }

        public Criteria andNgheIsNotNull() {
            addCriterion("nghe is not null");
            return (Criteria) this;
        }

        public Criteria andNgheEqualTo(String value) {
            addCriterion("nghe =", value, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheNotEqualTo(String value) {
            addCriterion("nghe <>", value, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheGreaterThan(String value) {
            addCriterion("nghe >", value, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheGreaterThanOrEqualTo(String value) {
            addCriterion("nghe >=", value, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheLessThan(String value) {
            addCriterion("nghe <", value, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheLessThanOrEqualTo(String value) {
            addCriterion("nghe <=", value, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheLike(String value) {
            addCriterion("nghe like", value, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheNotLike(String value) {
            addCriterion("nghe not like", value, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheIn(List<String> values) {
            addCriterion("nghe in", values, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheNotIn(List<String> values) {
            addCriterion("nghe not in", values, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheBetween(String value1, String value2) {
            addCriterion("nghe between", value1, value2, "nghe");
            return (Criteria) this;
        }

        public Criteria andNgheNotBetween(String value1, String value2) {
            addCriterion("nghe not between", value1, value2, "nghe");
            return (Criteria) this;
        }

        public Criteria andNoiIsNull() {
            addCriterion("noi is null");
            return (Criteria) this;
        }

        public Criteria andNoiIsNotNull() {
            addCriterion("noi is not null");
            return (Criteria) this;
        }

        public Criteria andNoiEqualTo(String value) {
            addCriterion("noi =", value, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiNotEqualTo(String value) {
            addCriterion("noi <>", value, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiGreaterThan(String value) {
            addCriterion("noi >", value, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiGreaterThanOrEqualTo(String value) {
            addCriterion("noi >=", value, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiLessThan(String value) {
            addCriterion("noi <", value, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiLessThanOrEqualTo(String value) {
            addCriterion("noi <=", value, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiLike(String value) {
            addCriterion("noi like", value, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiNotLike(String value) {
            addCriterion("noi not like", value, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiIn(List<String> values) {
            addCriterion("noi in", values, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiNotIn(List<String> values) {
            addCriterion("noi not in", values, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiBetween(String value1, String value2) {
            addCriterion("noi between", value1, value2, "noi");
            return (Criteria) this;
        }

        public Criteria andNoiNotBetween(String value1, String value2) {
            addCriterion("noi not between", value1, value2, "noi");
            return (Criteria) this;
        }

        public Criteria andDocIsNull() {
            addCriterion("doc is null");
            return (Criteria) this;
        }

        public Criteria andDocIsNotNull() {
            addCriterion("doc is not null");
            return (Criteria) this;
        }

        public Criteria andDocEqualTo(String value) {
            addCriterion("doc =", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocNotEqualTo(String value) {
            addCriterion("doc <>", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocGreaterThan(String value) {
            addCriterion("doc >", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocGreaterThanOrEqualTo(String value) {
            addCriterion("doc >=", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocLessThan(String value) {
            addCriterion("doc <", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocLessThanOrEqualTo(String value) {
            addCriterion("doc <=", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocLike(String value) {
            addCriterion("doc like", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocNotLike(String value) {
            addCriterion("doc not like", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocIn(List<String> values) {
            addCriterion("doc in", values, "doc");
            return (Criteria) this;
        }

        public Criteria andDocNotIn(List<String> values) {
            addCriterion("doc not in", values, "doc");
            return (Criteria) this;
        }

        public Criteria andDocBetween(String value1, String value2) {
            addCriterion("doc between", value1, value2, "doc");
            return (Criteria) this;
        }

        public Criteria andDocNotBetween(String value1, String value2) {
            addCriterion("doc not between", value1, value2, "doc");
            return (Criteria) this;
        }

        public Criteria andVietIsNull() {
            addCriterion("viet is null");
            return (Criteria) this;
        }

        public Criteria andVietIsNotNull() {
            addCriterion("viet is not null");
            return (Criteria) this;
        }

        public Criteria andVietEqualTo(String value) {
            addCriterion("viet =", value, "viet");
            return (Criteria) this;
        }

        public Criteria andVietNotEqualTo(String value) {
            addCriterion("viet <>", value, "viet");
            return (Criteria) this;
        }

        public Criteria andVietGreaterThan(String value) {
            addCriterion("viet >", value, "viet");
            return (Criteria) this;
        }

        public Criteria andVietGreaterThanOrEqualTo(String value) {
            addCriterion("viet >=", value, "viet");
            return (Criteria) this;
        }

        public Criteria andVietLessThan(String value) {
            addCriterion("viet <", value, "viet");
            return (Criteria) this;
        }

        public Criteria andVietLessThanOrEqualTo(String value) {
            addCriterion("viet <=", value, "viet");
            return (Criteria) this;
        }

        public Criteria andVietLike(String value) {
            addCriterion("viet like", value, "viet");
            return (Criteria) this;
        }

        public Criteria andVietNotLike(String value) {
            addCriterion("viet not like", value, "viet");
            return (Criteria) this;
        }

        public Criteria andVietIn(List<String> values) {
            addCriterion("viet in", values, "viet");
            return (Criteria) this;
        }

        public Criteria andVietNotIn(List<String> values) {
            addCriterion("viet not in", values, "viet");
            return (Criteria) this;
        }

        public Criteria andVietBetween(String value1, String value2) {
            addCriterion("viet between", value1, value2, "viet");
            return (Criteria) this;
        }

        public Criteria andVietNotBetween(String value1, String value2) {
            addCriterion("viet not between", value1, value2, "viet");
            return (Criteria) this;
        }

        public Criteria andGhichuIsNull() {
            addCriterion("ghichu is null");
            return (Criteria) this;
        }

        public Criteria andGhichuIsNotNull() {
            addCriterion("ghichu is not null");
            return (Criteria) this;
        }

        public Criteria andGhichuEqualTo(String value) {
            addCriterion("ghichu =", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuNotEqualTo(String value) {
            addCriterion("ghichu <>", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuGreaterThan(String value) {
            addCriterion("ghichu >", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuGreaterThanOrEqualTo(String value) {
            addCriterion("ghichu >=", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuLessThan(String value) {
            addCriterion("ghichu <", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuLessThanOrEqualTo(String value) {
            addCriterion("ghichu <=", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuLike(String value) {
            addCriterion("ghichu like", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuNotLike(String value) {
            addCriterion("ghichu not like", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuIn(List<String> values) {
            addCriterion("ghichu in", values, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuNotIn(List<String> values) {
            addCriterion("ghichu not in", values, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuBetween(String value1, String value2) {
            addCriterion("ghichu between", value1, value2, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuNotBetween(String value1, String value2) {
            addCriterion("ghichu not between", value1, value2, "ghichu");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIsNull() {
            addCriterion("thuyenvienId is null");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIsNotNull() {
            addCriterion("thuyenvienId is not null");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidEqualTo(Integer value) {
            addCriterion("thuyenvienId =", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotEqualTo(Integer value) {
            addCriterion("thuyenvienId <>", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidGreaterThan(Integer value) {
            addCriterion("thuyenvienId >", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidGreaterThanOrEqualTo(Integer value) {
            addCriterion("thuyenvienId >=", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidLessThan(Integer value) {
            addCriterion("thuyenvienId <", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidLessThanOrEqualTo(Integer value) {
            addCriterion("thuyenvienId <=", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIn(List<Integer> values) {
            addCriterion("thuyenvienId in", values, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotIn(List<Integer> values) {
            addCriterion("thuyenvienId not in", values, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidBetween(Integer value1, Integer value2) {
            addCriterion("thuyenvienId between", value1, value2, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotBetween(Integer value1, Integer value2) {
            addCriterion("thuyenvienId not between", value1, value2, "thuyenvienid");
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