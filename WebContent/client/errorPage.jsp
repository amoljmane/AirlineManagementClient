<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	String message = request.getParameter("message");
	if(message.equals("error")){
		message = "booking unsuccessful";
	}else{
		message = "booking successful";
	}
%>
<body>
	<h1><%=message %></h1>
</body>
</html>