package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n=req.getParameter("myPersonName");
		PrintWriter printWriter=res.getWriter();
		String htmlCode="<html><body><h1>Welcome "+n+"</h1></body></html>";
		printWriter.write(htmlCode);
	}

}
