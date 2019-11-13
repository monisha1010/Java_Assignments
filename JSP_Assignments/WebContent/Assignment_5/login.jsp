<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int Number=Integer.parseInt(request.getParameter("num"));
if(Number<10)
{
	response.sendRedirect("page1.jsp");
}
else if(Number>10 && Number<99 )
{
	response.sendRedirect("page2.jsp");
}
else {
	response.sendRedirect("error.jsp");
}
%>
</body>
</html>