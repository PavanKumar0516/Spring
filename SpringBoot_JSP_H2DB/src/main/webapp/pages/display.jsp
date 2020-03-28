<%@ page language="java" import="com.capg.SpringJSP.*" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:fuchsia;">WELCOME TO JSP</h1>
<% 
	String uname = (String) session.getAttribute("uname");
	out.print("Welcome "+uname); 
	/* Employee emp=(Employee) session.getAttribute("emp");
	out.print(emp); */
%>
<!-- JSP pages -->
<!-- EL expression isELIgnored="false" ${uname}-->
WELCOME Again: ${uname}
Emp Data : ${empObj}
</body>
</html>