package com.revature.driver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.revature.dao.BearDao;
import com.revature.dao.CaveDao;
import com.revature.domain.Bat;
import com.revature.domain.Bear;
import com.revature.domain.Cave;
import com.revature.util.HibernateUtil;

public class Driver {
	public static void main(String[] args) {
		CaveDao dao = new CaveDao();
		BearDao bdao = new BearDao();
		
//		Cave newC = new Cave();
//		newC.setCave_name("A Black Cave");
//		newC.setMax_bears(2);
//		
//		dao.saveCave(newC);
		
//		List<Cave> caves = dao.getCaves();
//		
//		for(Cave c : caves) {
//			System.out.println(c.toString());
//		}
//		
//		System.out.println(dao.findCave(3).toString());
//		dao.saveCave(new Cave(0, "Red Cave", 5));
//		bdao.saveBear(
//			new Bear(0, "Boo Boo", 15, 200, dao.findCave(2))
//		);
//		
//		Session session = HibernateUtil.getSession();
//		Bat bat1 = new Bat("Manbat", 7, dao.findCave(6));
//		session.beginTransaction();
//		session.save(bat1);
//		session.getTransaction().commit();
//		
//		session.beginTransaction();
//		Cave c = (Cave) session.load(Cave.class, 2);
//		c.setCave_name("Mammoth");
//		session.getTransaction().commit();
		
		//Named query
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		List<Bear> bears = session.getNamedQuery("findBearByName").setString("nameVar", "Boo Boo").list();
		for (Bear b : bears) {
			System.out.println(b.toString());
		}
		
		//Criteria
		List<Cave> caves = session.createCriteria(Cave.class)
				.addOrder(Order.asc("max_bears"))
				.add(Restrictions.between("max_bears", 4, 6))
				.list();
		
		for (Cave c : caves) {
			System.out.println(c.toString());
		}
		
		session.getTransaction().commit();
		session.close();
		
		//Level 2 caching
		Session s1 = HibernateUtil.getSession();
		Session s2 = HibernateUtil.getSession();
		
		Bear b1 = (Bear) s1.load(Bear.class, 2);
		Bear b2 = (Bear) s2.load(Bear.class, 2);
		
		System.out.println(b1 + " " + b2);
		
		HibernateUtil.shutdown();
	}
}
