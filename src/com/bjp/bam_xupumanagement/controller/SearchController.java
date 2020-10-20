package com.bjp.bam_xupumanagement.controller;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bjp.bam_basemanagement.service.SEntryService;
import com.bjp.bam_basemanagement.service.SLinkurlService;
import com.bjp.bam_xupumanagement.service.XuPuService;
import com.bjp.bam_xupumanagement.vo.ArticleInfo;
import com.bjp.bam_xupumanagement.vo.ArticlePage;
import com.bjp.bam_xupumanagement.vo.WebInfo;
import com.bjp.pojo.SEntry;
import com.bjp.pojo.SLinkurl;
import com.bjp.pojo.SModule;
import com.bjp.util.Page;
import com.bjp.util.jpinyin.PinyinException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class SearchController {
	
	@Autowired
	XuPuService xupuService;

	@Autowired
	SLinkurlService slinkurlService;
	@RequestMapping("findArticalListByModuleId")
	public @ResponseBody List<SEntry> findArticalListByModuleId(@RequestBody WebInfo webInfo){
		List<SEntry> tempList = xupuService.findArticalListByModuleId(webInfo.getModuleId());
		return tempList;
	}
	
	@RequestMapping("findWebInfoByWebsite")
	public @ResponseBody WebInfo findWebInfoByWebsite(@RequestBody WebInfo webInfo){
		return xupuService.findWebInfoByWebsite(webInfo);
	}
	
	@RequestMapping("findArticalContentByArticalId")
	public @ResponseBody ArticleInfo findArticalContentByArticalId(@RequestBody ArticleInfo articleInfo){
		return xupuService.findArticleInfoByEntryId(articleInfo.getId());
	}
	
	@RequestMapping("findBJXArticalListByModuleName")
	public @ResponseBody Map<String,List<SEntry>> findBJXArticalListByModuleName(@RequestBody SModule smodule){
		try {
//			smodule.setModuleName("百家姓");
			return xupuService.findBJXArticalListByModuleName(smodule.getModuleName());
		} catch (PinyinException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("/findArticalPageByModuleId")
    public @ResponseBody ArticlePage findArticalPageByModuleId(@RequestBody WebInfo webInfo){
		//分页参数设置
    	Page page = webInfo.getPage();
    	int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
    	List<SEntry> entryList = xupuService.findArticalListByModuleId(webInfo.getModuleId());//
		int total = (int)new PageInfo<>(entryList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		ArticlePage articlePage = new ArticlePage();
		articlePage.setEntryList(entryList);
		articlePage.setPage(page);
        return articlePage;
    }
	
	@RequestMapping("/findSLinkurlListByWebsiteId")
    public @ResponseBody List<SLinkurl> findSLinkurlListByWebsiteId(@RequestBody WebInfo webInfo){
        return slinkurlService.findSLinkurlListByWebsiteId(webInfo.getWebsiteId());
    }
//	@RequestMapping("/")
//    public String redirect(){
//		 return "redirect:/index"; 
//	}
    @RequestMapping("/")
    public String list(Model model,WebInfo webInfo){
    	//请求首页数据
    	webInfo.setWebsite("叙谱官网");
    	webInfo = xupuService.findWebInfoByWebsite(webInfo);
    	Integer bjxModuleId = 1;
    	Integer xszxModuleId = 2;
    	Integer xzzxModuleId = 3;
    	
    	webInfo.setBjxModuleId(bjxModuleId);
    	webInfo.setXszxModuleId(xszxModuleId);
    	webInfo.setXzzxModuleId(xzzxModuleId);
    	//分页参数设置
    	Page page = new Page();
		int pageNum = 0;
		//默认70个姓氏
		page.setCount(70);
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
    	List<SEntry> bjxList = xupuService.findArticalListByModuleId(1);
		new PageInfo<>(bjxList).getTotal();
//		page.setTotal(total);
//        page.caculateLast(total);
    	
		//姓氏资讯和寻租资讯
		page.setCount(5);
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
    	List<SEntry> xszyList = xupuService.findArticalListByModuleId(2);
    	new PageInfo<>(xszyList).getTotal();
    	
    	page.setCount(5);
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
    	List<SEntry> xzzxList = xupuService.findArticalListByModuleId(3);
    	new PageInfo<>(xzzxList).getTotal();
    	
    	model.addAttribute("webInfo", webInfo);
        model.addAttribute("bjxList", bjxList);
        model.addAttribute("xszyList",xszyList);
        model.addAttribute("xzzxList",xzzxList);
        return "index";
    }
    
    @RequestMapping("articleDetail")
    public String surnameDetail(Model model,Integer id){
    	ArticleInfo article = xupuService.findArticleInfoByEntryId(id);
        model.addAttribute("article",article);
        model.addAttribute("id",id);
        return "articleDetail";
    }
    
    @RequestMapping("news/articleDetail")
    public String newsArticleDetail(Model model,Integer id,WebInfo webInfo){
    	//请求首页数据
    	webInfo.setWebsite("叙谱官网");
    	webInfo = xupuService.findWebInfoByWebsite(webInfo);
    	model.addAttribute("webInfo", webInfo);
    	ArticleInfo article = xupuService.findArticleInfoByEntryId(id);
        model.addAttribute("article",article);
        model.addAttribute("id",id);
        return "news/articleDetail";
    }
    
    @RequestMapping("baijiaxing/articleDetail")
    public String bjxArticleDetail(Model model,Integer id,WebInfo webInfo){
    	//请求首页数据
    	webInfo.setWebsite("叙谱官网");
    	webInfo = xupuService.findWebInfoByWebsite(webInfo);
    	model.addAttribute("webInfo", webInfo);
    	ArticleInfo article = xupuService.findArticleInfoByEntryId(id);
        model.addAttribute("article",article);
        model.addAttribute("id",id);
        return "baijiaxing/articleDetail";
    }
    
	@RequestMapping("baijiaxing")
	public ModelAndView  baijiaxing(){
	    ModelAndView mv = new ModelAndView("/baijiaxing");
	    return mv;  
	}
	
    
	@RequestMapping("news")
	public ModelAndView  news(){
	    ModelAndView mv = new ModelAndView("/news");
	    return mv;  
	}
	
	@RequestMapping("about")
	public ModelAndView  about(){
	    ModelAndView mv = new ModelAndView("/about");
	    return mv;  
	}
	@RequestMapping("clanBookShow")
	public ModelAndView  clanBookShow(){
	    ModelAndView mv = new ModelAndView("/clanBookShow");
	    return mv;  
	}
}
