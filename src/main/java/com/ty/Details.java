package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Details extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1 = req.getParameter("myPersonName");
		String n2 = req.getParameter("myEmailName");
		String n3 = req.getParameter("myPhoneNumber");
		String n4 = req.getParameter("myPassword");

		PrintWriter printWriter = res.getWriter();
		String htmlCode1 = "<html><body><h1>Name is : " + n1 + "</h1> <h1>Email is : " + n2
				+ "</h1><h1>Phone Number is : " + n3 + "</h1> <h1>Password  is : " + n4 + "</h1> </body></html>";

		printWriter.write(htmlCode1);

	}

}
