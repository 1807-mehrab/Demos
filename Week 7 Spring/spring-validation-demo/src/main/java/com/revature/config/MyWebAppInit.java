package com.revature.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebAppInit implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webcontext =
				new AnnotationConfigWebApplicationContext();
		webcontext.register(SpringConfig.class);
		webcontext.setServletContext(servletContext);
		
		ServletRegistration.Dynamic dispatcherServlet = 
				servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webcontext));
		
		dispatcherServlet.setLoadOnStartup(1);
		dispatcherServlet.addMapping("/");
		
	}
	
}
