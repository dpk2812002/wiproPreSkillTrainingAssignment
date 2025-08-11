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
 name = request.getParameter("name");
 password = request.getParameter("password");
 
 if ("admin".equals(name) && "wipro".equals(password)) {
     response.sendRedirect("Two_success.jsp");
 } else {
     response.sendRedirect("Two_fail.jsp");
 }
 
%>

</body>
</html>