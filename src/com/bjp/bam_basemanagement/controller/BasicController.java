package com.bjp.bam_basemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bjp.bam_basemanagement.service.SModuleService;
import com.bjp.bam_basemanagement.service.SSystemService;
import com.bjp.bam_basemanagement.service.SWebsiteService;
import com.bjp.bam_basemanagement.service.SWmRelationService;
import com.bjp.bam_basemanagement.vo.ResponseEntity;
import com.bjp.bam_rolemanagement.service.RoleInfoService;
import com.bjp.bam_xupumanagement.service.XuPuService;
import com.bjp.bam_xupumanagement.vo.WebInfo;
import com.bjp.pojo.RoleInfo;


//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class BasicController {
	
//	@RequestMapping("/")
//	public ModelAndView  indexCore(){
//	    ModelAndView mv = new ModelAndView("/index");
//	    return mv;  
//	}
//	
//	@RequestMapping("")
//	public ModelAndView welcome2(){
//		ModelAndView mav = new ModelAndView("navigatebar");
//		return mav;
//	}
	
}
