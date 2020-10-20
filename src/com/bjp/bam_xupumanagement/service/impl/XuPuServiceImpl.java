package com.bjp.bam_xupumanagement.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjp.bam_basemanagement.service.SContentService;
import com.bjp.bam_basemanagement.service.SEntryService;
import com.bjp.bam_basemanagement.service.SLinkurlService;
import com.bjp.bam_basemanagement.service.SModuleService;
import com.bjp.bam_basemanagement.service.SSystemService;
import com.bjp.bam_basemanagement.service.SWebsiteService;
import com.bjp.bam_basemanagement.service.SWmRelationService;
import com.bjp.bam_xupumanagement.service.XuPuService;
import com.bjp.bam_xupumanagement.vo.ArticleInfo;
import com.bjp.bam_xupumanagement.vo.WebInfo;
import com.bjp.pojo.SContent;
import com.bjp.pojo.SEntry;
import com.bjp.pojo.SLinkurl;
import com.bjp.pojo.SModule;
import com.bjp.pojo.SSystem;
import com.bjp.pojo.SWebsite;
import com.bjp.pojo.SWmRelation;
import com.bjp.util.jpinyin.PinyinException;
import com.bjp.util.jpinyin.PinyinHelper;
import com.github.pagehelper.util.StringUtil;
@Service
public class XuPuServiceImpl implements XuPuService {

	@Autowired
	SWmRelationService swmRelationService;
	
	@Autowired
	SLinkurlService slinkurlService;
	
	@Autowired
	SWebsiteService swebsiteService;
	@Autowired
	SSystemService ssystemService;
	
	@Autowired
	SEntryService sentryService;
	@Autowired
	SContentService scontentService;
	
	@Autowired
	SModuleService smoduleService;
	@Override
	public WebInfo findWebInfoByWebsite(WebInfo webInfo) {
		SWebsite swebsite = swebsiteService.findWebsiteByName(webInfo.getWebsite());
		Integer websiteId = swebsite.getId();
		
		
		List<SWmRelation> swmRelationList = swmRelationService.findModuleIdListByWebsiteId(websiteId);
		
		List<SLinkurl> slinkurlList = slinkurlService.findSLinkurlListByWebsiteId(websiteId);
		
		webInfo.setSwebsite(swebsite);
		webInfo.setSwmRelationList(swmRelationList);
		webInfo.setSlinkurlList(slinkurlList);
		return webInfo;
	}

	@Override
	public List<SEntry> findArticalListByModuleId(Integer moduleId) {
		return sentryService.findSEntryListByModuleId(moduleId);
	}

	@Override
	public ArticleInfo findArticleInfoByEntryId(Integer entryId) {
		SContent scontent = scontentService.findArticalContentBySEntryId(entryId);
    	SEntry sentry = sentryService.get(entryId);
    	ArticleInfo article = new ArticleInfo();
    	article.setArticalAbstract(sentry.getArticalAbstract());
    	article.setContent(scontent.getContent());
    	article.setId(entryId);
    	article.setKeyword(sentry.getKeyword());
    	article.setImageUrl(sentry.getImageUrl());
    	article.setTitle(sentry.getTitle());
    	article.setArticleTime(sentry.getReleaseDate());
		return article;
	}

	@Override
	public Map<String,List<SEntry>> findBJXArticalListByModuleName(String moduleName) throws PinyinException {
		SModule smodule = smoduleService.findSModuleByName(moduleName);
		if(smodule==null){
			return null;
		}
		List<SEntry> sentryList = sentryService.findSEntryListByModuleIdAndPYIsNone(smodule.getId());
		for(SEntry entry:sentryList){
			String title = entry.getTitle();
			if(StringUtil.isEmpty(title)){
				continue;
			}
			
			String firstA = PinyinHelper.getShortPinyin(title).substring(0, 1);
			entry.setDef1(firstA);
			sentryService.update(entry);
		}
		Map<String,List<SEntry>> entryMap = new HashMap<String,List<SEntry>>();
		//26字母
		for(int i=(int)'a';i<'a'+26;i++)
		{
			String alpha = (char)i+"";
			List<SEntry> outputEntryList = sentryService.findSEntryListByModuleIdAndPYNotNone(smodule.getId(), alpha);
			if(!outputEntryList.isEmpty()){
				entryMap.put(alpha, outputEntryList);
			}
		}
		
		return entryMap;
	}
	
}
