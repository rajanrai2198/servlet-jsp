<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
	String name = request.getAttribute("label").toString();
	out.print(name);
	%>

	${label} --%>
	
	<c:out value="Hello World"></c:out>
	
	<%-- <c:import url="https://github.com/rajanrai2198"></c:import> --%>
	
	<%-- ${student.name } --%>
	
	<c:forEach items="${students}" var="s">
	${s.name}
	</c:forEach>
</body>
</html>