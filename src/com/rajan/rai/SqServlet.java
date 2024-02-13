package com.rajan.rai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
//		int k = (int) req.getAttribute("k");
//		k = k * k;
//		out.println("Square is :: " + k)
//		int k = Integer.parseInt(req.getParameter("k"));
//		System.out.println("I am Sq servlet");

		HttpSession httpSession = req.getSession();
//		httpSession.removeAttribute("k");
		int k = (int) httpSession.getAttribute("k");
		k = k * k;
		out.println("Square is :: " + k);
	}
}
