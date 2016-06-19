package com.snowfog.code.service;

import java.util.List;
import java.util.Map;

/*
 * @description: 菜单功能的业务逻辑接口
 * @author SJ
 */
public interface MenuService {
	
	/**
	 * @description 根据角色查询panel
	 * @author SJ
	 * @param params
	 * @return 返回List结果
	 */
	public List<Map<String, Object>> getAccordionByRole(Map<String, Object> params);
}
