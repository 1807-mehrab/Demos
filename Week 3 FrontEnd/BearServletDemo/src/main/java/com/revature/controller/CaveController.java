package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.CaveDao;
import com.revature.model.Cave;

@WebServlet("/CaveController")
public class CaveController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String favColor = (String) session.getAttribute("favColor");
		
		System.out.println(favColor);
		
		CaveDao dao = new CaveDao();
		List<Cave> caves = dao.getAllCaves();
		
		PrintWriter pw = resp.getWriter();
		for (Cave c : caves) {
			pw.println(c.toString());
		}
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Cave c = mapper.readValue(req.getInputStream(), Cave.class);
		
		System.out.println(c.toString());
		

		HttpSession session = req.getSession();
		session.invalidate();
	}

}
