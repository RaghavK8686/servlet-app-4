package com.ty;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Car extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	ServletConfig servletConfig=getServletConfig();
	String rt=servletConfig.getInitParameter("RoadTax");
	System.out.println("Road tax is :"+rt);
	
	ServletContext servletContext=getServletContext();
	String rt1=servletConfig.getInitParameter("SeatBelt");
	System.out.println("SeatBelt is :"+rt1);
	}
}
