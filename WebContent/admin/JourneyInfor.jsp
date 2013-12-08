<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<%
	PassengerBean passengerBeans =(PassengerBean)hs.getAttribute("passengerBean");
	//System.out.println(passengerBeans);
	PersonBean[] person = passengerBeans.getPassengers();
	JourneyDetailBean journey = (JourneyDetailBean)hs.getAttribute("journeyInfor");
	//hs.removeAttribute("passengerBean");
	//hs.removeAttribute("journey");
	
%>
<body>
	<div>
		<%if(journey != null){ %>
		<div>
			<h2><%=journey.getAirline_name() %></h2>
			<h2><%=journey.getSourceLocation().getLocation_name() %></h2>
			<h2><%=journey.getDestinationLocation().getLocation_name() %></h2>
			<h2><%=journey.getDeparture_time() %></h2>
			<h2><%=journey.getArrival_time() %></h2>
			<h2><%=journey.getFlight_name() %></h2>
			<h2><%=journey.getSeats_available() %></h2>
			<h2><%=journey.getSeats_booked() %></h2>
			<h2><%=journey.getSeats_booked() %></h2>
			<button id="shower">Show</button>
		</div>
		<div id="passeger">
			<table class="table">
			<%if(person != null || journey != null){ %>
				<tr>
					<th>First Name</th> 
					<th>Last Name</th> 
					<th>Email</th> 
					<th>Passport</th> 
					<th>City</th> 
					<th>State</th> 
					<th>Country</th>
				</tr>
				
				<%}for(PersonBean p : person){if(p != null){ %>
				<tr>
					<td><%=p.getFirst_name() %></td>
					<td><%=p.getLast_name() %></td>
					<td><%=p.getEmail_address() %></td>
					<td><%=p.getPassport_number() %></td>
					<td><%=p.getCity() %></td>
					<td><%=p.getState() %></td>
					<td><%=p.getCountry() %></td>
				</tr>
				<%}}}else{%>
				<tr>
					<td><p>Error - Can not find any information about in detail in system, please contact Project 273 - Team 4 - <strong>Richa</strong></p></td>
				</tr>
				<%} %>
			</table>
		</div>
	</div>
</body>
</html>