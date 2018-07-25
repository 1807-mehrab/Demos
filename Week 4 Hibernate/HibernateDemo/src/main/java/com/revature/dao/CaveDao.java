package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.domain.Cave;
import com.revature.util.HibernateUtil;

public class CaveDao {
	public List<Cave> getCaves() {
		List<Cave> caves = new ArrayList<>();
		Session session = HibernateUtil.getSession();
		caves = session.createQuery("from Cave").list();
		return caves;
	}
	
	public Cave getCaveByName(String caveName) {
		Cave c = null;
		List<Cave> caves = new ArrayList<>();
		Session session = HibernateUtil.getSession();
		caves = session.createQuery("from Cave where cave_name = :nameVar")
				.setString("nameVar", caveName).list();
		if (!caves.isEmpty()) {
			c = caves.get(0);
		}
		return c;
	}
	
	public int saveCave(Cave c) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		int result = (int) session.save(c);
		tx.commit();
		return result;
	}
	
	public Cave findCave(int cave_id) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		Cave c = (Cave) session.load(Cave.class, cave_id);
		
		session.getTransaction().commit();
		return c;
	}
}
