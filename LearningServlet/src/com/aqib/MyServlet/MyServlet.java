package com.aqib.MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		String page = null;
		if (action.equals("login")) {
			page = "/login.jsp";
		} else if (action.equals("about")) {
			page = "/about.jsp";
		} else {
			page = "/error.jsp";

		}

		getServletContext().getRequestDispatcher(page).forward(request,
				response);
	}
}