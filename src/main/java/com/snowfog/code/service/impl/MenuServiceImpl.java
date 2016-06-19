package com.snowfog.code.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.snowfog.code.dao.MenuDao;
import com.snowfog.code.service.MenuService;

/*
 * @desaction: 功能菜单的业务逻辑实现类
 * @author: SJ
 */
@Service
@Transactional
public class MenuServiceImpl implements MenuService {

	@Resource
	private MenuDao menuDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.snowfog.code.service.MenuService#getAccordionByRole(java.util.Map)
	 */
	@Override
	public List<Map<String, Object>> getAccordionByRole(Map<String, Object> params) {
		return menuDao.getAccordion(params);
	}

}
