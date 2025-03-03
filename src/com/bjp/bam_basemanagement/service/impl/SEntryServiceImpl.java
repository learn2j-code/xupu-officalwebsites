package com.bjp.bam_basemanagement.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjp.bam_basemanagement.service.SEntryService;
import com.bjp.mapper.SEntryMapper;
import com.bjp.pojo.SEntry;
import com.bjp.pojo.SEntryExample;
@Service
public class SEntryServiceImpl implements SEntryService {
	@Autowired
	SEntryMapper sentryMapper;
	@Override
	public List<SEntry> list() {
		SEntryExample example = new SEntryExample();
		example.setOrderByClause("id desc");
		return sentryMapper.selectByExampleWithBLOBs(example);
	}
	@Override
	public void add(SEntry record) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(SEntry record) {
		sentryMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public SEntry get(int id) {
		return sentryMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<SEntry> findSEntryListByModuleId(Integer moduleId) {
		SEntryExample example = new SEntryExample();
		example.setOrderByClause("release_date desc");
		example.createCriteria().andIssueEqualTo(1).andDelFlgEqualTo(0).andModuleIdEqualTo(moduleId).andReleaseDateLessThanOrEqualTo(new Date());
		return sentryMapper.selectByExampleWithBLOBs(example);
	}
	@Override
	public List<SEntry> findSEntryListByModuleIdAndPYNotNone(Integer moduleId,String alpha) {
		SEntryExample example = new SEntryExample();
		example.setOrderByClause("release_date desc");
		example.createCriteria().andIssueEqualTo(1).andDelFlgEqualTo(0).andDef1EqualTo(alpha).andModuleIdEqualTo(moduleId).andReleaseDateLessThanOrEqualTo(new Date());
		return sentryMapper.selectByExampleWithBLOBs(example);
	}
	@Override
	public List<SEntry> findSEntryListByModuleIdAndPYIsNone(Integer moduleId) {
		SEntryExample example = new SEntryExample();
		example.setOrderByClause("release_date desc");
		example.createCriteria().andIssueEqualTo(1).andDelFlgEqualTo(0).andDef1IsNull().andModuleIdEqualTo(moduleId).andReleaseDateLessThan(new Date());
		return sentryMapper.selectByExample(example);
	}
	

}
