package com.revature.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.revature.beans.Cave;

@Repository
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
