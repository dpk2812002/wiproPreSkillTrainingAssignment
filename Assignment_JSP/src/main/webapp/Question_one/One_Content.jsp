<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String name, password;
name= request.getParameter("name");
password= request.getParameter("password");
%>

<h5 > Name: <%= name %> </h5>
<h5>Password: <%= password  %> </h5>
</body>
</html>