package com.bjp.bam_basemanagement.service;

import java.util.List;

import com.bjp.pojo.SEntry;

public interface SEntryService {
	List<SEntry> list();
	void add(SEntry record);
	void update(SEntry record);
	void delete(int Id);
	SEntry get(int Id);
	
	List<SEntry> findSEntryListByModuleId(Integer moduleId);
	
	//根據字母查列表
	List<SEntry> findSEntryListByModuleIdAndPYNotNone(Integer moduleId,String alpha);
	List<SEntry> findSEntryListByModuleIdAndPYIsNone(Integer moduleId);
}
