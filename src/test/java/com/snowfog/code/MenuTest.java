package com.snowfog.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.snowfog.code.dao.MenuDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml" })
public class MenuTest {
	@Resource
	private MenuDao menuDao;

	@Test
	public void testMenuAccordion() {
		Map<String, Object> paramsMap = new HashMap<>();
		List list = menuDao.getAccordion(paramsMap);
		System.out.println(list.toString());
	}
}
