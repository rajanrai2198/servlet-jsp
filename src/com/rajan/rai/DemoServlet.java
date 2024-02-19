package com.rajan.rai;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = "Rajan";

		List<Student> students = Arrays.asList(new Student(1, "Rajan"), new Student(2, "Aman"), new Student(3, "Neha"));
		req.setAttribute("students", students);
		RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
		rd.forward(req, resp);
	}
}
