package com.revature.driver;

import java.util.List;

import com.revature.dao.CaveDao;
import com.revature.domain.Cave;

public class Driver {
	public static void main(String[] args) {
		CaveDao dao = new CaveDao();
		
		List<Cave> caves = dao.getCaves();
		
		for(Cave c : caves) {
			System.out.println(c.toString());
		}
		
	}
}
