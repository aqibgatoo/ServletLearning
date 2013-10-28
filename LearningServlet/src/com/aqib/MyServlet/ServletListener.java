package com.aqib.MyServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		ServletContext context=(ServletContext) arg0.getServletContext();
		String breed=context.getInitParameter("breed");
		Dog dog=new Dog(breed);
		context.setAttribute("dogBreed", dog);
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
	}

}
