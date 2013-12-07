<%@page import="sjsu.cmpe273.project.beans.UserBean"%>
<%@page import="sjsu.cmpe273.project.beans.JourneyDetailBean"%>
<%@page import="sjsu.cmpe273.project.beans.PersonBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	UserBean person = (UserBean)request.getAttribute("person");
	JourneyDetailBean journey =(JourneyDetailBean) request.getAttribute("journey");
	
	//request.setAttribute("person" , person);
	//request.setAttribute("journey",journey);
	
	HttpSession hs = request.getSession();
	hs.setAttribute("person" , person);
	hs.setAttribute("journey",journey);
	
	//System.out.println("price --->"+journey.getTicket_price());

%>
</head>
<body>
<h1> Payment Information</h1>
<form method="post" action="paymentAction" >
	Payment Method<input type="text" name="paymentMethod"><br>
	First Name<input type="text"  name="firstname"><br>
	Last Name<input type="text"  name="lastname"><br>
	Card Number<input type="text"  name="cardnumber"><br>
	CSV<input type="text"  name="csv"><br>
	
	<button type="submit">submit</button>
</form>
</body>
</html>