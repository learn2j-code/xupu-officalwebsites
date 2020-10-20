package com.bjp.bam_usermanagement.service;

import java.util.List;

import com.bjp.pojo.UserInfo;

public interface UserInfoService {
	List<UserInfo> list();
	void add(UserInfo user);
	void update(UserInfo user);
	void delete(int userId);
	UserInfo get(int userId);
	UserInfo findByUserPhone(String phone);
	
	List<UserInfo> findUserInfoByLastnameAndPhone(String lastName, String phone);
}
