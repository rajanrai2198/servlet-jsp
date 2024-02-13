package com.rajan.rai;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddSevlet extends HttpServlet {

	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException, ServletException {
		int i = Integer.parseInt(httpServletRequest.getParameter("num1"));
		int j = Integer.parseInt(httpServletRequest.getParameter("num2"));
		int k = i + j;
//
//		httpServletRequest.setAttribute("k", k);
//		RequestDispatcher rd = httpServletRequest.getRequestDispatcher("sq");
//		rd.forward(httpServletRequest, httpServletResponse);

		// URL Rewriting
//		httpServletResponse.sendRedirect("sq?k=" + k);

		// HTTP Session
//		HttpSession httpSession = httpServletRequest.getSession();
//		httpSession.setAttribute("k", k);
//		httpServletResponse.sendRedirect("sq");

		Cookie cookie = new Cookie("k", k + "");
		httpServletResponse.addCookie(cookie);
		httpServletResponse.sendRedirect("sq");
	}
}
