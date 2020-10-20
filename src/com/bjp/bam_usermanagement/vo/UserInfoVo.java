package com.bjp.bam_usermanagement.vo;

import com.bjp.pojo.UserInfo;

public class UserInfoVo {
	private UserInfo user;
	private Integer userId;
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
