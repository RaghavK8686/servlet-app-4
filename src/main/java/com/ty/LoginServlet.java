package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		PrintWriter printWrite = resp.getWriter();

		if (email.equals("kanharrk@gmail.com") && password.equals("1234")) {

			RequestDispatcher dispatcher = req.getRequestDispatcher("home.html");
			dispatcher.forward(req, resp);
		} else {
			printWrite.write("<html><body>Invalid credentials<body><html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}
}
