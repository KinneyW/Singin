package com.lib.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lib.service.UserManager;

@Controller
public class LoginController {
	
	@Autowired
	public UserManager userManger;
	@RequestMapping(value="/login.do",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody
	public Object login(HttpServletRequest request,HttpSession session){
		int result;
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		//判断登录，result：-1账号错误；0密码错误；1登陆成功
		result=userManger.checkLogin(Integer.parseInt(userid),password);
		System.out.println(result+"登陆结果");
		
		userManger.getAllRecordsById(Integer.parseInt(userid));
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("status", "1");
		
		return map;
	}
}
