package com.snowfog.code;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:root-context.xml"})
public class SpringTest {
	@Resource(name="dataSource")
	private DataSource dataSource;
	@Test
	public void test(){
		try {
			System.err.println(dataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
