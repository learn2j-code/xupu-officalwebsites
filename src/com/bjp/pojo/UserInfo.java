package com.bjp.pojo;

import java.util.Date;

public class UserInfo {
    /** 用户id*/
    private Integer userId;

    /** 姓*/
    private String lastname;

    /** 名*/
    private String firstname;

    /** 性别*/
    private String gender;

    /** 手机号码*/
    private String phone;

    /** 字*/
    private String secPersonalName;

    /** 出生日期*/
    private Date birthdayTime;

    /** 籍贯ID*/
    private Integer nativeId;

    /** 籍贯名称*/
    private String nativeName;

    /** 密码*/
    private String password;

    /** 角色ID*/
    private Integer roleId;

    /** 邀请人ID*/
    private Integer inviterId;

    /** 邀请人名称*/
    private String inviterName;

    /** logo的链接地址*/
    private String logo;

    /** 背景图片链接地址*/
    private String backgroundImageUrl;

    /** 邀请码*/
    private String invitationCode;

    /** 姓首字母*/
    private String surnameInitials;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;

    /** 状态*/
    private Integer status;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSecPersonalName() {
        return secPersonalName;
    }

    public void setSecPersonalName(String secPersonalName) {
        this.secPersonalName = secPersonalName == null ? null : secPersonalName.trim();
    }

    public Date getBirthdayTime() {
        return birthdayTime;
    }

    public void setBirthdayTime(Date birthdayTime) {
        this.birthdayTime = birthdayTime;
    }

    public Integer getNativeId() {
        return nativeId;
    }

    public void setNativeId(Integer nativeId) {
        this.nativeId = nativeId;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName == null ? null : nativeName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getInviterId() {
        return inviterId;
    }

    public void setInviterId(Integer inviterId) {
        this.inviterId = inviterId;
    }

    public String getInviterName() {
        return inviterName;
    }

    public void setInviterName(String inviterName) {
        this.inviterName = inviterName == null ? null : inviterName.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public void setBackgroundImageUrl(String backgroundImageUrl) {
        this.backgroundImageUrl = backgroundImageUrl == null ? null : backgroundImageUrl.trim();
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public String getSurnameInitials() {
        return surnameInitials;
    }

    public void setSurnameInitials(String surnameInitials) {
        this.surnameInitials = surnameInitials == null ? null : surnameInitials.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}