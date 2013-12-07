<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="headerClient.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	</div>
<br><br><br>
<div align="center">
	<form action="../locationAction" method="post" name="getFlights" id="getFlights">
		<input type="hidden" value="listAllFlights" name="listAllFlights" id="listAllFlights" />
		<input type="submit" value="Shedule Flight"/>
	</form>
</div>
</body>
</html>