package com.revature.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.repository.CaveDao;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CaveDao dao = context.getBean("caveDao", CaveDao.class);
		
		System.out.println(dao.getCaves());
		
		context.close();
	}

}
