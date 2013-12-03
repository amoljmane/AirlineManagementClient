<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Journey</title>
<script type="text/javascript">
function submitJourneyForm(id) {
	document.getElementById("flightId").value = id;
	document.forms["editFlight"].submit();
}
</script>
</head>
<body>
	<div align="center">
	<br><br><br>
	<h2> All Flights :: </h2>
	 
		<table border="1" cellspacing="0%" align="center" cellpadding="8%">
				<tr>
					<td align="center">Flight Name</td>
					<td align="center">Source Location</td>
					<td align="center">Source Airport</td>
					<td align="center">Departure Time</td>
					<td align="center">Destination Location</td>
					<td align="center">Destination Airport</td>
					<td align="center">Arrival Time</td>
					<td align="center">Seats Booked</td>
					<td align="center">Seats Available</td>
					<td align="center">Ticket Price</td>
					<td align="center">Edit</td>
				</tr>
			<c:forEach var="journey" items="${Journeys}">
				<tr>
					<td align="center">${journey.flight_name}</td>
					<td align="center">${journey.sourceLocation.location_name}</td>
					<td align="center">${journey.sourceLocation.airport_name}</td>
					<td align="center">${journey.departure_time}</td>
					<td align="center">${journey.destinationLocation.location_name}</td>
					<td align="center">${journey.destinationLocation.airport_name}</td>
					<td align="center">${journey.arrival_time}</td>
					<td align="center">${journey.seats_booked}</td>
					<td align="center">${journey.seats_available}</td>
					<td align="center">${journey.ticket_price}</td>
					<td align="center">
						<!-- <input type="button" value="Edit Flight"/>  -->
						<a href="#" onclick="javascript:submitJourneyForm(${journey.journey_id});">Edit </a>
						
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<form action="editFlight" name="editFlight" id="editFlight" method="post">
			<input type="hidden" name="flightId" id="flightId" value="${journey.journey_id}"> ${journey.journey_id}
	</form>
</body>
</html>