package com.rajan.rai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("Hi ");

		ServletContext context = getServletContext();
		String name = context.getInitParameter("name");
		writer.print(name+" ");

		String phone = context.getInitParameter("phone");
		writer.print(phone);
	}
}
