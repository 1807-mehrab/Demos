package com.revature.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Cave;

@Transactional
public class CaveDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Cave> getCaves() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Cave").list();
	}
}
