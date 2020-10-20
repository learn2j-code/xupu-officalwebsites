package com.bjp.bam_usermanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjp.bam_rolemanagement.service.RoleInfoService;
import com.bjp.bam_usermanagement.service.UserInfoService;
import com.bjp.mapper.UserInfoMapper;
import com.bjp.pojo.UserInfo;
import com.bjp.pojo.UserInfoExample;
@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	UserInfoMapper userMapper;
	@Autowired
	RoleInfoService roleInfoService;
	@Override
	public List<UserInfo> list() {
		UserInfoExample example = new UserInfoExample();
		example.setOrderByClause("user_id desc");
		return userMapper.selectByExample(example);
	}

	@Override
	public void add(UserInfo user) {
		userMapper.insertSelective(user);
	}

	@Override
	public void update(UserInfo user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void delete(int userId) {
		userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public UserInfo get(int userId) {
		UserInfo userInfo = userMapper.selectByPrimaryKey(userId);
//		userInfo.setRole(roleInfoService.get(userInfo.getRoleId()));
		return userInfo;
	}

	@Override
	public UserInfo findByUserPhone(String phone) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andPhoneEqualTo(phone);
		List<UserInfo> result = userMapper.selectByExample(example);
		if(result.isEmpty())
			return null;
		return result.get(0);
	}

	@Override
	public List<UserInfo> findUserInfoByLastnameAndPhone(String lastName, String phone) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andLastnameEqualTo(lastName).andPhoneEqualTo(phone);
		return userMapper.selectByExample(example);
	}

}
