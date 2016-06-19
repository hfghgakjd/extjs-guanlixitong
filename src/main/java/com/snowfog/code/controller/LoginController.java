package com.snowfog.code.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 登录的控制器
 * @author SJ
 */
@Controller
public class LoginController {
	
	/**
	 * 登录的方法
	 * @author SJ
	 * @param request
	 * @param response
	 * @return 返回主页视图
	 * @throws Exception
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+":"+password);
		return "home";
	}
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login2(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		return "home";
	}
}
