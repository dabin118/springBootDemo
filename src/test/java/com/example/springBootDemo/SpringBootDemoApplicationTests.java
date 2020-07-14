package com.example.springBootDemo;

import com.example.springBootDemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


@SpringBootTest
class SpringBootDemoApplicationTests {


	@Autowired
	private User user;

	@Autowired
	DataSource dataSource;
	@Test
	void contextLoads() {

		System.out.println("==================");
		System.out.println(dataSource.getClass());
	}

}
