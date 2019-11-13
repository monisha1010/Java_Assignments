<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="employeeinfo" class="com.jsp.employeebean.Employee" ></jsp:useBean>
<jsp:setProperty property="*" name="employeeinfo"/>
You have entered the below details:<br>
<jsp:getProperty property="id" name="employeeinfo"/><br>
<jsp:getProperty property="name" name="employeeinfo"/><br>
</body>
</html>