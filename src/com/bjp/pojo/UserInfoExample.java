package com.bjp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andLastnameIsNull() {
            addCriterion("lastname is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("lastname is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("lastname =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("lastname <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("lastname >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("lastname >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("lastname <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("lastname <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("lastname like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("lastname not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("lastname in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("lastname not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("lastname between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("lastname not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("firstname is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("firstname is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("firstname =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("firstname <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("firstname >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("firstname >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("firstname <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("firstname <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("firstname like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("firstname not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("firstname in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("firstname not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("firstname between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("firstname not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameIsNull() {
            addCriterion("sec_personal_name is null");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameIsNotNull() {
            addCriterion("sec_personal_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameEqualTo(String value) {
            addCriterion("sec_personal_name =", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameNotEqualTo(String value) {
            addCriterion("sec_personal_name <>", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameGreaterThan(String value) {
            addCriterion("sec_personal_name >", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameGreaterThanOrEqualTo(String value) {
            addCriterion("sec_personal_name >=", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameLessThan(String value) {
            addCriterion("sec_personal_name <", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameLessThanOrEqualTo(String value) {
            addCriterion("sec_personal_name <=", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameLike(String value) {
            addCriterion("sec_personal_name like", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameNotLike(String value) {
            addCriterion("sec_personal_name not like", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameIn(List<String> values) {
            addCriterion("sec_personal_name in", values, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameNotIn(List<String> values) {
            addCriterion("sec_personal_name not in", values, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameBetween(String value1, String value2) {
            addCriterion("sec_personal_name between", value1, value2, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameNotBetween(String value1, String value2) {
            addCriterion("sec_personal_name not between", value1, value2, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeIsNull() {
            addCriterion("birthday_time is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeIsNotNull() {
            addCriterion("birthday_time is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeEqualTo(Date value) {
            addCriterion("birthday_time =", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeNotEqualTo(Date value) {
            addCriterion("birthday_time <>", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeGreaterThan(Date value) {
            addCriterion("birthday_time >", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday_time >=", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeLessThan(Date value) {
            addCriterion("birthday_time <", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeLessThanOrEqualTo(Date value) {
            addCriterion("birthday_time <=", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeIn(List<Date> values) {
            addCriterion("birthday_time in", values, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeNotIn(List<Date> values) {
            addCriterion("birthday_time not in", values, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeBetween(Date value1, Date value2) {
            addCriterion("birthday_time between", value1, value2, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeNotBetween(Date value1, Date value2) {
            addCriterion("birthday_time not between", value1, value2, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andNativeIdIsNull() {
            addCriterion("native_id is null");
            return (Criteria) this;
        }

        public Criteria andNativeIdIsNotNull() {
            addCriterion("native_id is not null");
            return (Criteria) this;
        }

        public Criteria andNativeIdEqualTo(Integer value) {
            addCriterion("native_id =", value, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdNotEqualTo(Integer value) {
            addCriterion("native_id <>", value, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdGreaterThan(Integer value) {
            addCriterion("native_id >", value, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("native_id >=", value, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdLessThan(Integer value) {
            addCriterion("native_id <", value, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdLessThanOrEqualTo(Integer value) {
            addCriterion("native_id <=", value, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdIn(List<Integer> values) {
            addCriterion("native_id in", values, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdNotIn(List<Integer> values) {
            addCriterion("native_id not in", values, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdBetween(Integer value1, Integer value2) {
            addCriterion("native_id between", value1, value2, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("native_id not between", value1, value2, "nativeId");
            return (Criteria) this;
        }

        public Criteria andNativeNameIsNull() {
            addCriterion("native_name is null");
            return (Criteria) this;
        }

        public Criteria andNativeNameIsNotNull() {
            addCriterion("native_name is not null");
            return (Criteria) this;
        }

        public Criteria andNativeNameEqualTo(String value) {
            addCriterion("native_name =", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameNotEqualTo(String value) {
            addCriterion("native_name <>", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameGreaterThan(String value) {
            addCriterion("native_name >", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameGreaterThanOrEqualTo(String value) {
            addCriterion("native_name >=", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameLessThan(String value) {
            addCriterion("native_name <", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameLessThanOrEqualTo(String value) {
            addCriterion("native_name <=", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameLike(String value) {
            addCriterion("native_name like", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameNotLike(String value) {
            addCriterion("native_name not like", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameIn(List<String> values) {
            addCriterion("native_name in", values, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameNotIn(List<String> values) {
            addCriterion("native_name not in", values, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameBetween(String value1, String value2) {
            addCriterion("native_name between", value1, value2, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameNotBetween(String value1, String value2) {
            addCriterion("native_name not between", value1, value2, "nativeName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andInviterIdIsNull() {
            addCriterion("inviter_id is null");
            return (Criteria) this;
        }

        public Criteria andInviterIdIsNotNull() {
            addCriterion("inviter_id is not null");
            return (Criteria) this;
        }

        public Criteria andInviterIdEqualTo(Integer value) {
            addCriterion("inviter_id =", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotEqualTo(Integer value) {
            addCriterion("inviter_id <>", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdGreaterThan(Integer value) {
            addCriterion("inviter_id >", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inviter_id >=", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdLessThan(Integer value) {
            addCriterion("inviter_id <", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdLessThanOrEqualTo(Integer value) {
            addCriterion("inviter_id <=", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdIn(List<Integer> values) {
            addCriterion("inviter_id in", values, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotIn(List<Integer> values) {
            addCriterion("inviter_id not in", values, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdBetween(Integer value1, Integer value2) {
            addCriterion("inviter_id between", value1, value2, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inviter_id not between", value1, value2, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterNameIsNull() {
            addCriterion("inviter_name is null");
            return (Criteria) this;
        }

        public Criteria andInviterNameIsNotNull() {
            addCriterion("inviter_name is not null");
            return (Criteria) this;
        }

        public Criteria andInviterNameEqualTo(String value) {
            addCriterion("inviter_name =", value, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameNotEqualTo(String value) {
            addCriterion("inviter_name <>", value, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameGreaterThan(String value) {
            addCriterion("inviter_name >", value, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameGreaterThanOrEqualTo(String value) {
            addCriterion("inviter_name >=", value, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameLessThan(String value) {
            addCriterion("inviter_name <", value, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameLessThanOrEqualTo(String value) {
            addCriterion("inviter_name <=", value, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameLike(String value) {
            addCriterion("inviter_name like", value, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameNotLike(String value) {
            addCriterion("inviter_name not like", value, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameIn(List<String> values) {
            addCriterion("inviter_name in", values, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameNotIn(List<String> values) {
            addCriterion("inviter_name not in", values, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameBetween(String value1, String value2) {
            addCriterion("inviter_name between", value1, value2, "inviterName");
            return (Criteria) this;
        }

        public Criteria andInviterNameNotBetween(String value1, String value2) {
            addCriterion("inviter_name not between", value1, value2, "inviterName");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlIsNull() {
            addCriterion("background_image_url is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlIsNotNull() {
            addCriterion("background_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlEqualTo(String value) {
            addCriterion("background_image_url =", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlNotEqualTo(String value) {
            addCriterion("background_image_url <>", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlGreaterThan(String value) {
            addCriterion("background_image_url >", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("background_image_url >=", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlLessThan(String value) {
            addCriterion("background_image_url <", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlLessThanOrEqualTo(String value) {
            addCriterion("background_image_url <=", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlLike(String value) {
            addCriterion("background_image_url like", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlNotLike(String value) {
            addCriterion("background_image_url not like", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlIn(List<String> values) {
            addCriterion("background_image_url in", values, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlNotIn(List<String> values) {
            addCriterion("background_image_url not in", values, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlBetween(String value1, String value2) {
            addCriterion("background_image_url between", value1, value2, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlNotBetween(String value1, String value2) {
            addCriterion("background_image_url not between", value1, value2, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNull() {
            addCriterion("invitation_code is null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNotNull() {
            addCriterion("invitation_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeEqualTo(String value) {
            addCriterion("invitation_code =", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotEqualTo(String value) {
            addCriterion("invitation_code <>", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThan(String value) {
            addCriterion("invitation_code >", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invitation_code >=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThan(String value) {
            addCriterion("invitation_code <", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThanOrEqualTo(String value) {
            addCriterion("invitation_code <=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLike(String value) {
            addCriterion("invitation_code like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotLike(String value) {
            addCriterion("invitation_code not like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIn(List<String> values) {
            addCriterion("invitation_code in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotIn(List<String> values) {
            addCriterion("invitation_code not in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeBetween(String value1, String value2) {
            addCriterion("invitation_code between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotBetween(String value1, String value2) {
            addCriterion("invitation_code not between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsIsNull() {
            addCriterion("surname_initials is null");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsIsNotNull() {
            addCriterion("surname_initials is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsEqualTo(String value) {
            addCriterion("surname_initials =", value, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsNotEqualTo(String value) {
            addCriterion("surname_initials <>", value, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsGreaterThan(String value) {
            addCriterion("surname_initials >", value, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsGreaterThanOrEqualTo(String value) {
            addCriterion("surname_initials >=", value, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsLessThan(String value) {
            addCriterion("surname_initials <", value, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsLessThanOrEqualTo(String value) {
            addCriterion("surname_initials <=", value, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsLike(String value) {
            addCriterion("surname_initials like", value, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsNotLike(String value) {
            addCriterion("surname_initials not like", value, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsIn(List<String> values) {
            addCriterion("surname_initials in", values, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsNotIn(List<String> values) {
            addCriterion("surname_initials not in", values, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsBetween(String value1, String value2) {
            addCriterion("surname_initials between", value1, value2, "surnameInitials");
            return (Criteria) this;
        }

        public Criteria andSurnameInitialsNotBetween(String value1, String value2) {
            addCriterion("surname_initials not between", value1, value2, "surnameInitials");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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