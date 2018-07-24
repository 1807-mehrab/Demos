package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/hello")
public class HelloController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		//Creates or retrieves current session
		HttpSession session = req.getSession();
		session.setAttribute("favColor", "blue");
		
		
		String jsonString = "{\"name\":\"Mehrab Rahman\"}";
		
		//setting headers
		resp.setContentType("application/json");
		
		//Mapper takes incoming json string and parsing it into an object
		ObjectMapper mapper = new ObjectMapper();
		Object obj = mapper.readValue(jsonString, Object.class);
		
		//Mapper here writes the Java object back to json
		mapper.writeValue(resp.getOutputStream(), obj);
	}
}
