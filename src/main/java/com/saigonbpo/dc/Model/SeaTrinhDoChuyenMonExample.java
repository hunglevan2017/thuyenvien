package com.saigonbpo.dc.Model;

import java.util.ArrayList;
import java.util.List;

public class SeaTrinhDoChuyenMonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeaTrinhDoChuyenMonExample() {
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

        public Criteria andTungayIsNull() {
            addCriterion("tungay is null");
            return (Criteria) this;
        }

        public Criteria andTungayIsNotNull() {
            addCriterion("tungay is not null");
            return (Criteria) this;
        }

        public Criteria andTungayEqualTo(String value) {
            addCriterion("tungay =", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotEqualTo(String value) {
            addCriterion("tungay <>", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayGreaterThan(String value) {
            addCriterion("tungay >", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayGreaterThanOrEqualTo(String value) {
            addCriterion("tungay >=", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayLessThan(String value) {
            addCriterion("tungay <", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayLessThanOrEqualTo(String value) {
            addCriterion("tungay <=", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayLike(String value) {
            addCriterion("tungay like", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotLike(String value) {
            addCriterion("tungay not like", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayIn(List<String> values) {
            addCriterion("tungay in", values, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotIn(List<String> values) {
            addCriterion("tungay not in", values, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayBetween(String value1, String value2) {
            addCriterion("tungay between", value1, value2, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotBetween(String value1, String value2) {
            addCriterion("tungay not between", value1, value2, "tungay");
            return (Criteria) this;
        }

        public Criteria andDenngayIsNull() {
            addCriterion("denngay is null");
            return (Criteria) this;
        }

        public Criteria andDenngayIsNotNull() {
            addCriterion("denngay is not null");
            return (Criteria) this;
        }

        public Criteria andDenngayEqualTo(String value) {
            addCriterion("denngay =", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotEqualTo(String value) {
            addCriterion("denngay <>", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayGreaterThan(String value) {
            addCriterion("denngay >", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayGreaterThanOrEqualTo(String value) {
            addCriterion("denngay >=", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayLessThan(String value) {
            addCriterion("denngay <", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayLessThanOrEqualTo(String value) {
            addCriterion("denngay <=", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayLike(String value) {
            addCriterion("denngay like", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotLike(String value) {
            addCriterion("denngay not like", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayIn(List<String> values) {
            addCriterion("denngay in", values, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotIn(List<String> values) {
            addCriterion("denngay not in", values, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayBetween(String value1, String value2) {
            addCriterion("denngay between", value1, value2, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotBetween(String value1, String value2) {
            addCriterion("denngay not between", value1, value2, "denngay");
            return (Criteria) this;
        }

        public Criteria andBangcapIsNull() {
            addCriterion("bangcap is null");
            return (Criteria) this;
        }

        public Criteria andBangcapIsNotNull() {
            addCriterion("bangcap is not null");
            return (Criteria) this;
        }

        public Criteria andBangcapEqualTo(String value) {
            addCriterion("bangcap =", value, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapNotEqualTo(String value) {
            addCriterion("bangcap <>", value, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapGreaterThan(String value) {
            addCriterion("bangcap >", value, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapGreaterThanOrEqualTo(String value) {
            addCriterion("bangcap >=", value, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapLessThan(String value) {
            addCriterion("bangcap <", value, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapLessThanOrEqualTo(String value) {
            addCriterion("bangcap <=", value, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapLike(String value) {
            addCriterion("bangcap like", value, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapNotLike(String value) {
            addCriterion("bangcap not like", value, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapIn(List<String> values) {
            addCriterion("bangcap in", values, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapNotIn(List<String> values) {
            addCriterion("bangcap not in", values, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapBetween(String value1, String value2) {
            addCriterion("bangcap between", value1, value2, "bangcap");
            return (Criteria) this;
        }

        public Criteria andBangcapNotBetween(String value1, String value2) {
            addCriterion("bangcap not between", value1, value2, "bangcap");
            return (Criteria) this;
        }

        public Criteria andChuyennganhIsNull() {
            addCriterion("chuyennganh is null");
            return (Criteria) this;
        }

        public Criteria andChuyennganhIsNotNull() {
            addCriterion("chuyennganh is not null");
            return (Criteria) this;
        }

        public Criteria andChuyennganhEqualTo(String value) {
            addCriterion("chuyennganh =", value, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhNotEqualTo(String value) {
            addCriterion("chuyennganh <>", value, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhGreaterThan(String value) {
            addCriterion("chuyennganh >", value, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhGreaterThanOrEqualTo(String value) {
            addCriterion("chuyennganh >=", value, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhLessThan(String value) {
            addCriterion("chuyennganh <", value, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhLessThanOrEqualTo(String value) {
            addCriterion("chuyennganh <=", value, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhLike(String value) {
            addCriterion("chuyennganh like", value, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhNotLike(String value) {
            addCriterion("chuyennganh not like", value, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhIn(List<String> values) {
            addCriterion("chuyennganh in", values, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhNotIn(List<String> values) {
            addCriterion("chuyennganh not in", values, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhBetween(String value1, String value2) {
            addCriterion("chuyennganh between", value1, value2, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andChuyennganhNotBetween(String value1, String value2) {
            addCriterion("chuyennganh not between", value1, value2, "chuyennganh");
            return (Criteria) this;
        }

        public Criteria andTruongIsNull() {
            addCriterion("truong is null");
            return (Criteria) this;
        }

        public Criteria andTruongIsNotNull() {
            addCriterion("truong is not null");
            return (Criteria) this;
        }

        public Criteria andTruongEqualTo(String value) {
            addCriterion("truong =", value, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongNotEqualTo(String value) {
            addCriterion("truong <>", value, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongGreaterThan(String value) {
            addCriterion("truong >", value, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongGreaterThanOrEqualTo(String value) {
            addCriterion("truong >=", value, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongLessThan(String value) {
            addCriterion("truong <", value, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongLessThanOrEqualTo(String value) {
            addCriterion("truong <=", value, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongLike(String value) {
            addCriterion("truong like", value, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongNotLike(String value) {
            addCriterion("truong not like", value, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongIn(List<String> values) {
            addCriterion("truong in", values, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongNotIn(List<String> values) {
            addCriterion("truong not in", values, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongBetween(String value1, String value2) {
            addCriterion("truong between", value1, value2, "truong");
            return (Criteria) this;
        }

        public Criteria andTruongNotBetween(String value1, String value2) {
            addCriterion("truong not between", value1, value2, "truong");
            return (Criteria) this;
        }

        public Criteria andXeploaiIsNull() {
            addCriterion("xeploai is null");
            return (Criteria) this;
        }

        public Criteria andXeploaiIsNotNull() {
            addCriterion("xeploai is not null");
            return (Criteria) this;
        }

        public Criteria andXeploaiEqualTo(String value) {
            addCriterion("xeploai =", value, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiNotEqualTo(String value) {
            addCriterion("xeploai <>", value, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiGreaterThan(String value) {
            addCriterion("xeploai >", value, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiGreaterThanOrEqualTo(String value) {
            addCriterion("xeploai >=", value, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiLessThan(String value) {
            addCriterion("xeploai <", value, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiLessThanOrEqualTo(String value) {
            addCriterion("xeploai <=", value, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiLike(String value) {
            addCriterion("xeploai like", value, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiNotLike(String value) {
            addCriterion("xeploai not like", value, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiIn(List<String> values) {
            addCriterion("xeploai in", values, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiNotIn(List<String> values) {
            addCriterion("xeploai not in", values, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiBetween(String value1, String value2) {
            addCriterion("xeploai between", value1, value2, "xeploai");
            return (Criteria) this;
        }

        public Criteria andXeploaiNotBetween(String value1, String value2) {
            addCriterion("xeploai not between", value1, value2, "xeploai");
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