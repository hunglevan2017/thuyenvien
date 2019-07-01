package com.saigonbpo.dc.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeaTauExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeaTauExample() {
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

        public Criteria andTenIsNull() {
            addCriterion("ten is null");
            return (Criteria) this;
        }

        public Criteria andTenIsNotNull() {
            addCriterion("ten is not null");
            return (Criteria) this;
        }

        public Criteria andTenEqualTo(String value) {
            addCriterion("ten =", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotEqualTo(String value) {
            addCriterion("ten <>", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThan(String value) {
            addCriterion("ten >", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThanOrEqualTo(String value) {
            addCriterion("ten >=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThan(String value) {
            addCriterion("ten <", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThanOrEqualTo(String value) {
            addCriterion("ten <=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLike(String value) {
            addCriterion("ten like", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotLike(String value) {
            addCriterion("ten not like", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenIn(List<String> values) {
            addCriterion("ten in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotIn(List<String> values) {
            addCriterion("ten not in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenBetween(String value1, String value2) {
            addCriterion("ten between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotBetween(String value1, String value2) {
            addCriterion("ten not between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andImoIsNull() {
            addCriterion("IMO is null");
            return (Criteria) this;
        }

        public Criteria andImoIsNotNull() {
            addCriterion("IMO is not null");
            return (Criteria) this;
        }

        public Criteria andImoEqualTo(String value) {
            addCriterion("IMO =", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoNotEqualTo(String value) {
            addCriterion("IMO <>", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoGreaterThan(String value) {
            addCriterion("IMO >", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoGreaterThanOrEqualTo(String value) {
            addCriterion("IMO >=", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoLessThan(String value) {
            addCriterion("IMO <", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoLessThanOrEqualTo(String value) {
            addCriterion("IMO <=", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoLike(String value) {
            addCriterion("IMO like", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoNotLike(String value) {
            addCriterion("IMO not like", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoIn(List<String> values) {
            addCriterion("IMO in", values, "imo");
            return (Criteria) this;
        }

        public Criteria andImoNotIn(List<String> values) {
            addCriterion("IMO not in", values, "imo");
            return (Criteria) this;
        }

        public Criteria andImoBetween(String value1, String value2) {
            addCriterion("IMO between", value1, value2, "imo");
            return (Criteria) this;
        }

        public Criteria andImoNotBetween(String value1, String value2) {
            addCriterion("IMO not between", value1, value2, "imo");
            return (Criteria) this;
        }

        public Criteria andCallsignIsNull() {
            addCriterion("callsign is null");
            return (Criteria) this;
        }

        public Criteria andCallsignIsNotNull() {
            addCriterion("callsign is not null");
            return (Criteria) this;
        }

        public Criteria andCallsignEqualTo(String value) {
            addCriterion("callsign =", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotEqualTo(String value) {
            addCriterion("callsign <>", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignGreaterThan(String value) {
            addCriterion("callsign >", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignGreaterThanOrEqualTo(String value) {
            addCriterion("callsign >=", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLessThan(String value) {
            addCriterion("callsign <", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLessThanOrEqualTo(String value) {
            addCriterion("callsign <=", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLike(String value) {
            addCriterion("callsign like", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotLike(String value) {
            addCriterion("callsign not like", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignIn(List<String> values) {
            addCriterion("callsign in", values, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotIn(List<String> values) {
            addCriterion("callsign not in", values, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignBetween(String value1, String value2) {
            addCriterion("callsign between", value1, value2, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotBetween(String value1, String value2) {
            addCriterion("callsign not between", value1, value2, "callsign");
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

        public Criteria andLoaitauidIsNull() {
            addCriterion("loaitauID is null");
            return (Criteria) this;
        }

        public Criteria andLoaitauidIsNotNull() {
            addCriterion("loaitauID is not null");
            return (Criteria) this;
        }

        public Criteria andLoaitauidEqualTo(String value) {
            addCriterion("loaitauID =", value, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidNotEqualTo(String value) {
            addCriterion("loaitauID <>", value, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidGreaterThan(String value) {
            addCriterion("loaitauID >", value, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidGreaterThanOrEqualTo(String value) {
            addCriterion("loaitauID >=", value, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidLessThan(String value) {
            addCriterion("loaitauID <", value, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidLessThanOrEqualTo(String value) {
            addCriterion("loaitauID <=", value, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidLike(String value) {
            addCriterion("loaitauID like", value, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidNotLike(String value) {
            addCriterion("loaitauID not like", value, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidIn(List<String> values) {
            addCriterion("loaitauID in", values, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidNotIn(List<String> values) {
            addCriterion("loaitauID not in", values, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidBetween(String value1, String value2) {
            addCriterion("loaitauID between", value1, value2, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andLoaitauidNotBetween(String value1, String value2) {
            addCriterion("loaitauID not between", value1, value2, "loaitauid");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIsNull() {
            addCriterion("ngaytao is null");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIsNotNull() {
            addCriterion("ngaytao is not null");
            return (Criteria) this;
        }

        public Criteria andNgaytaoEqualTo(Date value) {
            addCriterion("ngaytao =", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotEqualTo(Date value) {
            addCriterion("ngaytao <>", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoGreaterThan(Date value) {
            addCriterion("ngaytao >", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoGreaterThanOrEqualTo(Date value) {
            addCriterion("ngaytao >=", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoLessThan(Date value) {
            addCriterion("ngaytao <", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoLessThanOrEqualTo(Date value) {
            addCriterion("ngaytao <=", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIn(List<Date> values) {
            addCriterion("ngaytao in", values, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotIn(List<Date> values) {
            addCriterion("ngaytao not in", values, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoBetween(Date value1, Date value2) {
            addCriterion("ngaytao between", value1, value2, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotBetween(Date value1, Date value2) {
            addCriterion("ngaytao not between", value1, value2, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidIsNull() {
            addCriterion("nguoitaoID is null");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidIsNotNull() {
            addCriterion("nguoitaoID is not null");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidEqualTo(Integer value) {
            addCriterion("nguoitaoID =", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidNotEqualTo(Integer value) {
            addCriterion("nguoitaoID <>", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidGreaterThan(Integer value) {
            addCriterion("nguoitaoID >", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nguoitaoID >=", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidLessThan(Integer value) {
            addCriterion("nguoitaoID <", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidLessThanOrEqualTo(Integer value) {
            addCriterion("nguoitaoID <=", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidIn(List<Integer> values) {
            addCriterion("nguoitaoID in", values, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidNotIn(List<Integer> values) {
            addCriterion("nguoitaoID not in", values, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidBetween(Integer value1, Integer value2) {
            addCriterion("nguoitaoID between", value1, value2, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("nguoitaoID not between", value1, value2, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatIsNull() {
            addCriterion("ngaycapnhat is null");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatIsNotNull() {
            addCriterion("ngaycapnhat is not null");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatEqualTo(Date value) {
            addCriterion("ngaycapnhat =", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotEqualTo(Date value) {
            addCriterion("ngaycapnhat <>", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatGreaterThan(Date value) {
            addCriterion("ngaycapnhat >", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatGreaterThanOrEqualTo(Date value) {
            addCriterion("ngaycapnhat >=", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatLessThan(Date value) {
            addCriterion("ngaycapnhat <", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatLessThanOrEqualTo(Date value) {
            addCriterion("ngaycapnhat <=", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatIn(List<Date> values) {
            addCriterion("ngaycapnhat in", values, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotIn(List<Date> values) {
            addCriterion("ngaycapnhat not in", values, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatBetween(Date value1, Date value2) {
            addCriterion("ngaycapnhat between", value1, value2, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotBetween(Date value1, Date value2) {
            addCriterion("ngaycapnhat not between", value1, value2, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidIsNull() {
            addCriterion("nguoicapnhatID is null");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidIsNotNull() {
            addCriterion("nguoicapnhatID is not null");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidEqualTo(Integer value) {
            addCriterion("nguoicapnhatID =", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidNotEqualTo(Integer value) {
            addCriterion("nguoicapnhatID <>", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidGreaterThan(Integer value) {
            addCriterion("nguoicapnhatID >", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nguoicapnhatID >=", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidLessThan(Integer value) {
            addCriterion("nguoicapnhatID <", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidLessThanOrEqualTo(Integer value) {
            addCriterion("nguoicapnhatID <=", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidIn(List<Integer> values) {
            addCriterion("nguoicapnhatID in", values, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidNotIn(List<Integer> values) {
            addCriterion("nguoicapnhatID not in", values, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidBetween(Integer value1, Integer value2) {
            addCriterion("nguoicapnhatID between", value1, value2, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidNotBetween(Integer value1, Integer value2) {
            addCriterion("nguoicapnhatID not between", value1, value2, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isActive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Boolean value) {
            addCriterion("isActive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Boolean value) {
            addCriterion("isActive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Boolean value) {
            addCriterion("isActive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isActive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Boolean value) {
            addCriterion("isActive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Boolean value) {
            addCriterion("isActive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Boolean> values) {
            addCriterion("isActive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Boolean> values) {
            addCriterion("isActive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Boolean value1, Boolean value2) {
            addCriterion("isActive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isActive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andTrongtaiIsNull() {
            addCriterion("trongtai is null");
            return (Criteria) this;
        }

        public Criteria andTrongtaiIsNotNull() {
            addCriterion("trongtai is not null");
            return (Criteria) this;
        }

        public Criteria andTrongtaiEqualTo(Integer value) {
            addCriterion("trongtai =", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiNotEqualTo(Integer value) {
            addCriterion("trongtai <>", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiGreaterThan(Integer value) {
            addCriterion("trongtai >", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("trongtai >=", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiLessThan(Integer value) {
            addCriterion("trongtai <", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiLessThanOrEqualTo(Integer value) {
            addCriterion("trongtai <=", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiIn(List<Integer> values) {
            addCriterion("trongtai in", values, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiNotIn(List<Integer> values) {
            addCriterion("trongtai not in", values, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiBetween(Integer value1, Integer value2) {
            addCriterion("trongtai between", value1, value2, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("trongtai not between", value1, value2, "trongtai");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayIsNull() {
            addCriterion("congsuatmay is null");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayIsNotNull() {
            addCriterion("congsuatmay is not null");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayEqualTo(Integer value) {
            addCriterion("congsuatmay =", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayNotEqualTo(Integer value) {
            addCriterion("congsuatmay <>", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayGreaterThan(Integer value) {
            addCriterion("congsuatmay >", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayGreaterThanOrEqualTo(Integer value) {
            addCriterion("congsuatmay >=", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayLessThan(Integer value) {
            addCriterion("congsuatmay <", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayLessThanOrEqualTo(Integer value) {
            addCriterion("congsuatmay <=", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayIn(List<Integer> values) {
            addCriterion("congsuatmay in", values, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayNotIn(List<Integer> values) {
            addCriterion("congsuatmay not in", values, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayBetween(Integer value1, Integer value2) {
            addCriterion("congsuatmay between", value1, value2, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayNotBetween(Integer value1, Integer value2) {
            addCriterion("congsuatmay not between", value1, value2, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
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