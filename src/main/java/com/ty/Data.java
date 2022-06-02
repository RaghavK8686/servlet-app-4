package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Data extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String n1=req.getParameter("name");
		String n2=req.getParameter("name");
		String n3=req.getParameter("number");
		String n4=req.getParameter("Gender");
		String n5=req.getParameter("Password");
		String n6=req.getParameter("Country");
		
		PrintWriter printWriter = res.getWriter();
		String htmlCode = "<html><body><h1>Name is : " + n1 + "</h1><h1>Email is:" + n2 + "</h1><h1>Phone is :" + n3
				+ "</h1><h1>Gender is: "+n4+"</h1><h1>Password is :"+n5+"</h1><h1>Country is:"+n6+"</h1></body></html>";
		printWriter.write(htmlCode);
	}
}
