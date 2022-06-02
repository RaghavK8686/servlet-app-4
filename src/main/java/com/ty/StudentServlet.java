package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		super.doGet(req, res);

		String name = req.getParameter("name");
		String email = req.getParameter("email");

		PrintWriter printWrite = res.getWriter();
		String htmlCode = ("<html><body><h1>Name is " + name + "</h1><h1>Email is :" + email + "</h1></body></html>");
		printWrite.write(htmlCode);
	}
}
