<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

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

	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/db_2024" user="root" password="root" />

	<sql:query var="rs" dataSource="${db}">select * from student</sql:query>

	<c:forEach items="${rs.rows}" var="student">
		<br>
		<c:out value="${student.roll_no }"></c:out> : <c:out
			value="${student.marks }"></c:out> : <c:out value="${student.name }"></c:out>
	</c:forEach>

	<c:set var="data" value="I am Rajan Rai from Panipat No" />

	<br>Length :
	<c:out value="${fn:length(data)}"></c:out>
	<c:forEach items="${fn:split(data, 'Ra')}" var="s">
	<br>
	${s }
	</c:forEach>
	
	${fn:toUpperCase(data) }
	
	<c:if test="${fn:endsWith(data, 'Panipat') }" >
	 I am in Panipat
	</c:if>

</body>
</html>