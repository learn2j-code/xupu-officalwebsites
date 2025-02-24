package com.bjp.bam_xupumanagement.service;


import java.util.List;
import java.util.Map;

import com.bjp.bam_xupumanagement.vo.ArticleInfo;
import com.bjp.bam_xupumanagement.vo.WebInfo;
import com.bjp.pojo.SEntry;
import com.bjp.util.jpinyin.PinyinException;

public interface XuPuService {
	WebInfo findWebInfoByWebsite(WebInfo webInfo);
	List<SEntry> findArticalListByModuleId(Integer moduleId);
	ArticleInfo findArticleInfoByEntryId(Integer entryId);
	
	Map<String,List<SEntry>> findBJXArticalListByModuleName(String moduleName) throws PinyinException;
}
