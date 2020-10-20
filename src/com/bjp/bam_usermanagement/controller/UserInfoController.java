package com.bjp.bam_usermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bjp.bam_basemanagement.vo.ResponseEntity;
import com.bjp.bam_usermanagement.service.UserInfoService;
import com.bjp.pojo.UserInfo;

@Controller
@RequestMapping("")
public class UserInfoController {
	@Autowired
	UserInfoService userService;
	
	@RequestMapping("user")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping("findUserList")
	public @ResponseBody List<UserInfo> findUserList(){
		List<UserInfo> userList = userService.list();
		return userList;
	}
	@RequestMapping("userLogin")
	public @ResponseBody ResponseEntity userLogin(@RequestBody UserInfo userInput){
		ResponseEntity response= new ResponseEntity();
		if(userInput==null){
			response.setSuccess(0);
			response.setErrorMsg("user==null");
			return response;
		}

		//通过电话号码查询
		UserInfo user = userService.findByUserPhone(userInput.getPhone());
		if(user==null){
			response.setSuccess(0);
			response.setErrorMsg("user is not exist!!!");
			return response;
		}
		if(!user.getPassword().equals(userInput.getPassword())){
			response.setSuccess(0);
			response.setErrorMsg("user password is wrong!!!");
			return response;
		}
		return response;
	}
	@RequestMapping("userRegister")
	public @ResponseBody ResponseEntity userRegister(@RequestBody UserInfo user){
		ResponseEntity response= new ResponseEntity();
		if(user==null){
			response.setSuccess(0);
			response.setErrorMsg("user==null");
			return response;
		}
		userService.add(user);
		
		return response;
	}	
	@RequestMapping("deleteUserById")
	public @ResponseBody ResponseEntity deleteUserById(@RequestBody int userId){
		ResponseEntity response= new ResponseEntity();
		if(userId==0){
			response.setSuccess(0);
			response.setErrorMsg("userId==0");
			return response;
		}
		userService.delete(userId);
		return response;
	}	
	@RequestMapping("findUserById")
	public @ResponseBody UserInfo findUserById(@RequestBody UserInfo userInput){
		UserInfo user= userService.get(userInput.getUserId());
		return user;
	}	
	@RequestMapping("updateUser")
	public @ResponseBody ResponseEntity updateUser(@RequestBody UserInfo user){
		ResponseEntity response= new ResponseEntity();
		if(user==null){
			response.setSuccess(0);
			response.setErrorMsg("user==null");
			return response;
		}
		userService.update(user);
		return response;
	}	
}
