package com.bjp.bam_rolemanagement.service;

import java.util.List;

import com.bjp.pojo.RoleInfo;

public interface RoleInfoService {
	List<RoleInfo> list();
	void add(RoleInfo role);
	void update(RoleInfo role);
	void delete(int roleId);
	RoleInfo get(int roleId);
}
