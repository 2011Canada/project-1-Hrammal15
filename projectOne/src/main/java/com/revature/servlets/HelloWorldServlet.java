package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			System.out.println("Get method on path " + req.getContextPath());
			resp.getWriter().write(
						"<h1> Hello World </h1>"
					);
			
		}
}
