<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- Latest compiled and minified JavaScript -->
<%@ include file="header.jsp"%>
 <%
 	ReservationBean[] reservations = (ReservationBean[])hs.getAttribute("reservationList");
 %>
</head>
<body>

	<div class="container">
		<div style="padding-top: 30px">
			<h1>Booking Management</h1>
			<hr>
		</div>

		<div>
			<table class="table table-striped">
			<%if(reservations !=null){ %>
				<tr>
					<th>ID</th>
					<th>customerName</th>
					<th>From</th>
					<th>To</th>
					<th>Departure time</th>
					<th>Arrival time</th>
					<th>booking Status</th>
					<th>payment status</th>
					
				</tr>
				<%for(ReservationBean r:reservations) {if(r != null){%>
				<tr>
					<td><%=r.getBookingId() %></td>
					<td><%=r.getCustomerName() %></td>
					<td><%=r.getSourceAirport() %></td>
					<td><%=r.getDestinationAirport() %></td>
					<td><%=r.getDepartureTime() %></td>
					<td><%=r.getArrivalTime() %></td>
					<td><%=r.getBookingStatus() %></td>
					<td><%=r.getPaymentstatus() %></td>	
					
					<td> <a href="../BookingServlet?flag=cancelBooking&bookingID=<%=r.getBookingId() %>"><button type="button" class="btn btn-info">Cancel</button> </a></td>
					<td> <a href="../BookingServlet?flag=issueTicket&bookingID=<%=r.getBookingId() %>"><button type="button" class="btn btn-info">Issue Ticket</button> </a></td>
				</tr>
				<%}}}else{ %>
				<tr>
					<td><p>Error - Can not find any information about Booking in system, please contact Project 273 - Team 4 - <strong>Amol</strong></p></td>
				</tr>
			<%} %>
			
			</table>
		</div>
		<hr>
	</div>
	<!-- /container -->

</body>
</html>