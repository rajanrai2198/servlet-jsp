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

@WebFilter("/addAlien")
public class NameFilter extends HttpFilter implements Filter {

	public void destroy() {
		System.out.println("In destroy of Namefilter");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = response.getWriter();
		System.out.println("In do Filter of NameFilter");
		String name = req.getParameter("aname");
		if (name.length() > 3)
			chain.doFilter(request, response);
		else {
			out.print("Invalid Name");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("In init of Namefilter");
	}

}
