package com.rajan.rai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addAlien")
public class IdFilter extends HttpFilter implements Filter {

	public void destroy() {
		System.out.println("I will be called in end after do Filter");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = response.getWriter();
		System.out.println("In do Filter");
		int aid = Integer.parseInt(req.getParameter("aid"));
		if (aid > 0)
			chain.doFilter(request, response);
		else {
			out.print("Invalid id");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("I will be called first before do Filter");
	}

}
