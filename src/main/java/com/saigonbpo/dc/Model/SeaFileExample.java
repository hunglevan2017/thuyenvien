package com.saigonbpo.dc.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeaFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeaFileExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUploadeddateIsNull() {
            addCriterion("uploadedDate is null");
            return (Criteria) this;
        }

        public Criteria andUploadeddateIsNotNull() {
            addCriterion("uploadedDate is not null");
            return (Criteria) this;
        }

        public Criteria andUploadeddateEqualTo(Date value) {
            addCriterion("uploadedDate =", value, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateNotEqualTo(Date value) {
            addCriterion("uploadedDate <>", value, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateGreaterThan(Date value) {
            addCriterion("uploadedDate >", value, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadedDate >=", value, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateLessThan(Date value) {
            addCriterion("uploadedDate <", value, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateLessThanOrEqualTo(Date value) {
            addCriterion("uploadedDate <=", value, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateIn(List<Date> values) {
            addCriterion("uploadedDate in", values, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateNotIn(List<Date> values) {
            addCriterion("uploadedDate not in", values, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateBetween(Date value1, Date value2) {
            addCriterion("uploadedDate between", value1, value2, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andUploadeddateNotBetween(Date value1, Date value2) {
            addCriterion("uploadedDate not between", value1, value2, "uploadeddate");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserIsNull() {
            addCriterion("idUploadedUser is null");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserIsNotNull() {
            addCriterion("idUploadedUser is not null");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserEqualTo(Integer value) {
            addCriterion("idUploadedUser =", value, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserNotEqualTo(Integer value) {
            addCriterion("idUploadedUser <>", value, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserGreaterThan(Integer value) {
            addCriterion("idUploadedUser >", value, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUploadedUser >=", value, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserLessThan(Integer value) {
            addCriterion("idUploadedUser <", value, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserLessThanOrEqualTo(Integer value) {
            addCriterion("idUploadedUser <=", value, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserIn(List<Integer> values) {
            addCriterion("idUploadedUser in", values, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserNotIn(List<Integer> values) {
            addCriterion("idUploadedUser not in", values, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserBetween(Integer value1, Integer value2) {
            addCriterion("idUploadedUser between", value1, value2, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andIduploadeduserNotBetween(Integer value1, Integer value2) {
            addCriterion("idUploadedUser not between", value1, value2, "iduploadeduser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNull() {
            addCriterion("lastModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNotNull() {
            addCriterion("lastModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateEqualTo(Date value) {
            addCriterion("lastModifiedDate =", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotEqualTo(Date value) {
            addCriterion("lastModifiedDate <>", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThan(Date value) {
            addCriterion("lastModifiedDate >", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastModifiedDate >=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThan(Date value) {
            addCriterion("lastModifiedDate <", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThanOrEqualTo(Date value) {
            addCriterion("lastModifiedDate <=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIn(List<Date> values) {
            addCriterion("lastModifiedDate in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotIn(List<Date> values) {
            addCriterion("lastModifiedDate not in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateBetween(Date value1, Date value2) {
            addCriterion("lastModifiedDate between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotBetween(Date value1, Date value2) {
            addCriterion("lastModifiedDate not between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserIsNull() {
            addCriterion("idLastModifiedUser is null");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserIsNotNull() {
            addCriterion("idLastModifiedUser is not null");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserEqualTo(Integer value) {
            addCriterion("idLastModifiedUser =", value, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserNotEqualTo(Integer value) {
            addCriterion("idLastModifiedUser <>", value, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserGreaterThan(Integer value) {
            addCriterion("idLastModifiedUser >", value, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserGreaterThanOrEqualTo(Integer value) {
            addCriterion("idLastModifiedUser >=", value, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserLessThan(Integer value) {
            addCriterion("idLastModifiedUser <", value, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserLessThanOrEqualTo(Integer value) {
            addCriterion("idLastModifiedUser <=", value, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserIn(List<Integer> values) {
            addCriterion("idLastModifiedUser in", values, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserNotIn(List<Integer> values) {
            addCriterion("idLastModifiedUser not in", values, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserBetween(Integer value1, Integer value2) {
            addCriterion("idLastModifiedUser between", value1, value2, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andIdlastmodifieduserNotBetween(Integer value1, Integer value2) {
            addCriterion("idLastModifiedUser not between", value1, value2, "idlastmodifieduser");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidIsNull() {
            addCriterion("WorkGroupId is null");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidIsNotNull() {
            addCriterion("WorkGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidEqualTo(Integer value) {
            addCriterion("WorkGroupId =", value, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidNotEqualTo(Integer value) {
            addCriterion("WorkGroupId <>", value, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidGreaterThan(Integer value) {
            addCriterion("WorkGroupId >", value, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WorkGroupId >=", value, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidLessThan(Integer value) {
            addCriterion("WorkGroupId <", value, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("WorkGroupId <=", value, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidIn(List<Integer> values) {
            addCriterion("WorkGroupId in", values, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidNotIn(List<Integer> values) {
            addCriterion("WorkGroupId not in", values, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidBetween(Integer value1, Integer value2) {
            addCriterion("WorkGroupId between", value1, value2, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andWorkgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("WorkGroupId not between", value1, value2, "workgroupid");
            return (Criteria) this;
        }

        public Criteria andFolderidIsNull() {
            addCriterion("FolderId is null");
            return (Criteria) this;
        }

        public Criteria andFolderidIsNotNull() {
            addCriterion("FolderId is not null");
            return (Criteria) this;
        }

        public Criteria andFolderidEqualTo(Integer value) {
            addCriterion("FolderId =", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidNotEqualTo(Integer value) {
            addCriterion("FolderId <>", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidGreaterThan(Integer value) {
            addCriterion("FolderId >", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FolderId >=", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidLessThan(Integer value) {
            addCriterion("FolderId <", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidLessThanOrEqualTo(Integer value) {
            addCriterion("FolderId <=", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidIn(List<Integer> values) {
            addCriterion("FolderId in", values, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidNotIn(List<Integer> values) {
            addCriterion("FolderId not in", values, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidBetween(Integer value1, Integer value2) {
            addCriterion("FolderId between", value1, value2, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("FolderId not between", value1, value2, "folderid");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Float value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Float value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Float value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Float value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Float value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Float value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Float> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Float> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Float value1, Float value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Float value1, Float value2) {
            addCriterion("Size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSignalfileIsNull() {
            addCriterion("SignalFile is null");
            return (Criteria) this;
        }

        public Criteria andSignalfileIsNotNull() {
            addCriterion("SignalFile is not null");
            return (Criteria) this;
        }

        public Criteria andSignalfileEqualTo(Boolean value) {
            addCriterion("SignalFile =", value, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileNotEqualTo(Boolean value) {
            addCriterion("SignalFile <>", value, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileGreaterThan(Boolean value) {
            addCriterion("SignalFile >", value, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SignalFile >=", value, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileLessThan(Boolean value) {
            addCriterion("SignalFile <", value, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileLessThanOrEqualTo(Boolean value) {
            addCriterion("SignalFile <=", value, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileIn(List<Boolean> values) {
            addCriterion("SignalFile in", values, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileNotIn(List<Boolean> values) {
            addCriterion("SignalFile not in", values, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileBetween(Boolean value1, Boolean value2) {
            addCriterion("SignalFile between", value1, value2, "signalfile");
            return (Criteria) this;
        }

        public Criteria andSignalfileNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SignalFile not between", value1, value2, "signalfile");
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