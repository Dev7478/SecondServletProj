<%@ page import="java.time.LocalTime" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Greetings from JSP</title>
</head>
<body>
	<h1>Hello from Greet JSP</h1>
	
	<%
	String name = (String)request.getAttribute("name");
	LocalTime currentTime = LocalTime.now();
	%>
	<h2>Hello <%=name %></h2>
	<h3>It is now <%=currentTime %></h3>
</body>
</html>