package com.aqib.MyServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		
		ServletContext context=(ServletContext) event.getServletContext();
		String breed=context.getInitParameter("breed");
		Dog dog=new Dog(breed);
		context.setAttribute("dog", dog);
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
	}

}
