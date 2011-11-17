package com.example.model ;
import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent event){

		ServletContext servletcontext = event.getServletContext();
		String temp = servletcontext.getInitParameter("report");

		Direct direct = new Direct(temp);

		servletcontext.setAttribute("direct",direct);
	}
	public void contextDestroyed(ServletContextEvent event){}
}

