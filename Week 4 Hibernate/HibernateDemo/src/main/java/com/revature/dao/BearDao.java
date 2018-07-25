package com.revature.dao;

import org.hibernate.Session;

import com.revature.domain.Bear;
import com.revature.util.HibernateUtil;

public class BearDao {
	public void saveBear(Bear b) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(b);
		session.getTransaction().commit();
	}
}
