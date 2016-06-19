package com.snowfog.code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.snowfog.code.service.MenuService;

/*
 * @description:菜单控制器，负责功能菜单的内容
 * @author: 邵静 
 */
@Controller
@RequestMapping("menu")
public class MenuController {
	@Resource
	private MenuService menuService;

	/**
	 * 查询角色的功能菜单accordion
	 * 
	 * @param request
	 * @param response
	 * @return 返回json数据
	 * @throws ServletRequestBindingException
	 * @throws JsonProcessingException
	 */
	@RequestMapping(value = "accordion", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String getAccordion(HttpServletRequest request, HttpServletResponse response)
			throws ServletRequestBindingException, JsonProcessingException {
		String roleid = ServletRequestUtils.getStringParameter(request, "role");
		System.out.println("角色id:\t" + roleid);
		Map<String, Object> params = new HashMap<>();
		params.put("role", roleid);
		List<Map<String, Object>> list = menuService.getAccordionByRole(params);
		Map<String,Object> result = new HashMap<>();
		result.put("data", list);
		result.put("success", true);
		ObjectMapper om = new ObjectMapper();
		String str = om.writeValueAsString(result);
		return str;
	}
}
