package com.ty;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Teacher extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String name = req.getParameter("name");
		String subject = req.getParameter("subject");

		PrintWriter printWrite = res.getWriter();
		String htmlCode = ("<html><body><h1>Name is " + name + "</h1><h1>Subject is :" + subject + "</h1></body></html>");
		printWrite.write(htmlCode);
		
		
	}
}
