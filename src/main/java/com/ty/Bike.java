package com.ty;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Bike extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig servletConfig=getServletConfig();
		String st=servletConfig.getInitParameter("BikeTax");
		System.out.println("Bike tax is :"+st);
		
		ServletContext servletContext=getServletContext();
		String rt1=servletConfig.getInitParameter("Helmet");
		System.out.println("Helmet is :"+rt1);
		
	}
}
