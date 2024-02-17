<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String url = "jdbc:mysql://localhost:3306/db_2024";
	String username = "root";
	String password = "****";
	String sql = "select * from student where roll_no=103";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, username, password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	rs.next();
	%>

	Roll Number :
	<%=rs.getString(1)%>
	<br> Marks :
	<%=rs.getString(2)%>
	<br> Name :
	<%=rs.getString(3)%>
</body>
</html>