<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String journey_id = request.getParameter("jid");
String price = request.getParameter("price");

System.out.println("Jourey_ID  "+journey_id);

%>
<body>
<form method="post" action="../ClientBookingServlet?journey_id=<%=journey_id%>&price=<%=price %>">
	<h1>Customer Information For booking </h1>
	<label>First Name</label><input name="firstname" type="text"> <br>
	<label>Last Name</label><input name="lastname"  type="text"><br>
	<label>Passport</label><input name="passport"  type="text"><br>
	<label>SSN</label><input name="ssn"  type="text"><br>
	<label>Email</label><input name="email"  type="text"><br>
	<label>Zip Code</label><input name="zipcode"  type="text"><br>
	<label>Address Line1</label><input name="address1"  type="text"><br>
	<label>Address Line2</label><input name="address2"  type="text"><br>
	<label>City</label><input name="city"  type="text"><br>
	<label>State</label><input name="state"  type="text"><br>
	<label>Country</label><input name="country"  type="text"><br>
	
	<button type="submit">Submit</button>
	</form>
</body>
</html>