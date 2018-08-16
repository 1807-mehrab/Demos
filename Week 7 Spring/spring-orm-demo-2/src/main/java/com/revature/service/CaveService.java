package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Cave;
import com.revature.repository.CaveDao;

@Service
public class CaveService {
	@Autowired
	CaveDao dao;

	public void setDao(CaveDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public List<Cave> getAll() {
		return dao.getCaves();
	}
}
