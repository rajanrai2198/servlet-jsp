package com.rajan.rai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")
public class Alien extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In servlet");
		PrintWriter out = resp.getWriter();
		int aid = Integer.parseInt(req.getParameter("aid"));
		String alienName = req.getParameter("aname");
		out.print("Hi " + alienName);
	}

}
