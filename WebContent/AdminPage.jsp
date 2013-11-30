<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<div align="center">
<h1>** Admiin Page **</h1>
<%
	String flightAdded = (String)request.getAttribute("FlightAdded");
	if(flightAdded != null) {
		%>
		<h3><%= flightAdded %></h3>
		<%
	}
%>
</div>
<br><br><br>
<div align="center">
	<form action="adminAction" method="post" name="getFlights" id="getFlights">
		<input type="hidden" value="listAllFlights" name="listAllFlights" id="listAllFlights" />
		<input type="submit" value="Shedule Flight"/>
	</form>
</div>
</body>
</html>