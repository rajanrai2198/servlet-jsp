package com.rajan.rai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddSevlet extends HttpServlet {

	public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException {
		int i = Integer.parseInt(httpServletRequest.getParameter("num1"));
		int j = Integer.parseInt(httpServletRequest.getParameter("num2"));
		int k = i + j;
//		System.out.println("Result is :: " + k);
		PrintWriter out = httpServletResponse.getWriter();
		out.println("Result is :: " + k);
	}
}
