package com.snowfog.code.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @description: 跳转的控制器
 * @author: SJ
 */
@Controller
@RequestMapping("/menu")
public class JumpController {
	/**
	 * 跳转的方法
	 * 
	 * @param request
	 * @param response
	 * @return 返回视图
	 * @throws Exception
	 */
	@RequestMapping(value="jump",method=RequestMethod.GET)
	public String jump(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = ServletRequestUtils.getStringParameter(request, "url");
		return url;
	}
}
