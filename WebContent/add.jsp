<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	<%!int q = 6;%>
	
	<%@ page import="java.util.Scanner"%>

	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int k = i + j;
	out.print("Sum is ::" + q);
	%>
	<%
	out.print("down");
	%>
	<%
	out.print("Top");
	%>
	<%="rajan"%>
</body>
</html>