package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		String op1 = req.getParameter("op1");
		String op2 = req.getParameter("op2");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Hello World</h1>");
		pw.println(Integer.parseInt(op1) + Integer.parseInt(op2));
		pw.println(req.getParameter("FavoriteColor"));
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {

		String op1 = req.getParameter("op1");
		String op2 = req.getParameter("op2");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Hello World</h1>");
		pw.println(Integer.parseInt(op1) + Integer.parseInt(op2));
		pw.close();
	}
}
