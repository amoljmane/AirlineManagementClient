<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="header.jsp"%>
<%
	UserBean emply = (UserBean) hs.getAttribute("customer");
%>
<body>

	<div class="container">

		<div style="padding-top: 30px">
			<h1>Customer Detail</h1>
			<hr>
		</div>
		<%if(emply!=null) {%>
		<div>
			<div><label>LastName---</label><%=emply.getPerson().getLast_name() %></div>
			<div><label>FirstName---</label><%=emply.getPerson().getFirst_name()%></div>
			<div><label>Birthday---</label><%=emply.getPerson().getDob() %> </div>
			<div><label>SSN---</label><%=emply.getTraveler().getSsn() %> </div>
			<div><label>passport---</label> <%= emply.getPerson().getPassport_number()%></div>
			<div><label>email---</label><%=emply.getPerson().getEmail_address()%></div>
			<div><label>address 1---</label><%=emply.getPerson().getAddress_line1() %> </div>
			<div><label>address 2---</label><%=emply.getPerson().getAddress_line2() %> </div>
			<div><label>ZipCode---</label><%=emply.getPerson().getZip_code()%></div>
			<div><label>City---</label><%=emply.getPerson().getCity() %> </div>
			<div><label>State---</label> <%=emply.getPerson().getState()%></div>
			<div><label>Country---</label><%=emply.getPerson().getCountry()%></div>
		</div>
		<%}else{ %>
			<div> <p>Error - Can not find any information about Customer in system, please contact Project 273 - Team 4 - <strong>Shibai Lee</strong></p></div>
		<%} %>
</body>
</html>