package com.snowfog.code.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/*
 * @description: 功能菜单持久层dao接口
* @author: SJ
 */
@Repository
public interface MenuDao {
	
	public List<Map<String,Object>> getAccordion(Map<String,Object> paramsMap);
}
