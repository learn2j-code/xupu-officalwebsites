package com.bjp.pojo;

import java.util.Date;

public class RoleInfo {
    /** 角色id*/
    private Integer roleId;

    /** 角色名称：平台、客服、主编、编委会、普通用户*/
    private String roleName;

    /** 状态*/
    private Integer status;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}