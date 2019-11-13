<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%
String Id=request.getParameter("id");
String Name=request.getParameter("name");
String Designation=request.getParameter("designation");

session.setAttribute("ID", Id);
session.setAttribute("NAME", Name);
session.setAttribute("DESIGNATION",Designation);
if(Name!=" "){
response.sendRedirect("Connection");
}
%>
</body>
</html>