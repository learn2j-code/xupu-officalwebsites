package com.bjp.bam_rolemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bjp.bam_basemanagement.vo.ResponseEntity;
import com.bjp.bam_rolemanagement.service.RoleInfoService;
import com.bjp.pojo.RoleInfo;

@Controller
@RequestMapping("")
public class RoleInfoController {
	@Autowired
	RoleInfoService roleService;
	
	@RequestMapping("role")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView("role");
		return mav;
	}
	
	@RequestMapping("findRoleList")
	public @ResponseBody List<RoleInfo> findRoleList(){
		List<RoleInfo> roleList = roleService.list();
		return roleList;
	}
	
	@RequestMapping("addRole")
	public @ResponseBody ResponseEntity addRole(@RequestBody RoleInfo role){
		ResponseEntity response= new ResponseEntity();
		if(role==null){
			response.setSuccess(0);
			response.setErrorMsg("role==null");
			return response;
		}
		roleService.add(role);
		
		return response;
	}	
	@RequestMapping("deleteRole")
	public @ResponseBody ResponseEntity deleteRole(@RequestBody int roleId){
		ResponseEntity response= new ResponseEntity();
		if(roleId==0){
			response.setSuccess(0);
			response.setErrorMsg("roleId==0");
			return response;
		}
		roleService.delete(roleId);
		return response;
	}	
	@RequestMapping("findRoleById")
	public @ResponseBody RoleInfo findRoleById(@RequestBody RoleInfo roleInput){
		RoleInfo role= roleService.get(roleInput.getRoleId());
		return role;
	}	
	@RequestMapping("updateRole")
	public @ResponseBody ResponseEntity updateRole(@RequestBody RoleInfo roleInput){
		ResponseEntity response= new ResponseEntity();
		if(roleInput==null){
			response.setSuccess(0);
			response.setErrorMsg("user==null");
			return response;
		}
		roleService.update(roleInput);
		return response;
	}	
}
