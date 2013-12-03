<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function submitCancelForm(form) {
	form.flightId.value = document.getElementById("flightIdHidden").value; 
	alert(form.flightId.value);
	form.submit();
}
function submitForm(form) {		 
	
	var toSubmit = true;
	
	if(document.getElementById("departureYear").value == -1 ||  document.getElementById("departureMonth").value == -1 ||
			document.getElementById("departureDay").value == -1 || document.getElementById("departureHour").value == -1 ||
			document.getElementById("departureMinute").value == -1) {
		toSubmit = false;
		alert("Select Departure Date Properly!!");
		document.getElementById("departureYear").focus();
	}
	
	if(document.getElementById("destinationYear").value == -1 || document.getElementById("destinationMonth").value == -1 || 
			document.getElementById("destinationDay").value == -1 || document.getElementById("destinationHour").value == -1 ||
			document.getElementById("destinationMinute").value == -1){
		toSubmit = false;
		alert("Select Arrival Date Properly!!");
		document.getElementById("destinationYear").focus();
	}
	
	if(document.getElementById("departureYear").value != document.getElementById("destinationYear").value) {
		toSubmit = false;
		alert(" Dates cannot defer more than 24 hours!!");
		document.getElementById("departureYear").focus();						
	}
	

	var deptTime = document.getElementById("departureYear").value + "-" + document.getElementById("departureMonth").value + "-" + document.getElementById("departureDay").value
					+ " " + document.getElementById("departureHour").value + ":" + document.getElementById("departureMinute").value;
	
	var arrTime = document.getElementById("destinationYear").value + "-" + document.getElementById("destinationMonth").value + "-" + document.getElementById("destinationDay").value
					+ " " + document.getElementById("destinationHour").value + ":" + document.getElementById("destinationMinute").value;
	/* alert(arrTime); */
	form.departureTimestamp.value = deptTime;
	form.destinationTimestamp.value = arrTime;
	form.flightId.value = document.getElementById("flightIdHidden").value; 
	/* alert(toSubmit + "toSubmit"); */
	if(toSubmit == true) {
		/* alert(form.flightId.value);  */
		form.submit();
	} 
}

</script>
</head>
<body>
	<div>
		<c:forEach var="journey" items="${Journeys}">
			<input type="hidden" name="flightIdHidden" id="flightIdHidden" value="${journey.journey_id}">
		</c:forEach>
	</div>
	<div align="left">
	<br><br><br>
	<h2 style="padding-left: 6%"> Flights Details :: </h2>
	 
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
				</tr>
			</c:forEach>
		</table>
	</div>
	<br><br><br> 
	<div>
		<table border="0" cellspacing="5%" cellpadding="7%"  align="center">
			<tr>
				<td></td>
				<td align="center">Year</td>
				<td align="center">Month</td>
				<td align="center">Day</td>
				<td align="center">Hour</td>
				<td align="center">Minute</td>
			</tr>
			<tr>
				<td>
					New Departure Time :
				</td>
				<td>
					<select name="departureYear" id="departureYear">
						<option value="2013" selected="selected">2013</option>
						<option value="2014">2014</option>
						<option value="2015">2015</option>
					</select>
				</td>
				<td>
					<select name="departureMonth" id="departureMonth"  >
						<option value="-1" selected="selected" style="padding-left: 1%">Month..</option>
						<c:forEach var="month" items="${Months}">
							<option value="${month.monthNumber}" >${month.month}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="departureDay" id="departureDay"  >
						<option value="-1" selected="selected" style="padding-left: 1%">Day..</option>
						<c:forEach var="day" items="${Days}">
							<option value="${day}" >${day}</option>
						</c:forEach>
					</select>
				</td>
				<td>		
					<select name="departureHour" id="departureHour"  >
						<option value="-1" selected="selected" style="padding-left: 1%">Hour..</option>
						<c:forEach var="hour" items="${Hours}">
							<option value="${hour}" >${hour}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="departureMinute" id="departureMinute"  >
						<option value="-1" selected="selected" style="padding-left: 1%">Minute..</option>
						<c:forEach var="minute" items="${Minutes}">
							<option value="${minute}" >${minute}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					New Arrival Time :
				</td>
				<td>
					<select name="destinationYear" id="destinationYear">
						<option value="2013" selected="selected">2013</option>
						<option value="2014">2014</option>
						<option value="2015">2015</option>
					</select>
				</td>
				<td>
					<select name="destinationMonth" id="destinationMonth"  >
						<option value="-1" selected="selected" style="padding-left: 1%">Month..</option>
						<c:forEach var="month" items="${Months}">
							<option value="${month.monthNumber}" >${month.month}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="destinationDay" id="destinationDay"  >
						<option value="-1" selected="selected" style="padding-left: 1%">Day..</option>
						<c:forEach var="day" items="${Days}">
							<option value="${day}" >${day}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="destinationHour" id="destinationHour"  >
						<option value="-1" selected="selected" style="padding-left: 1%">Hour..</option>
						<c:forEach var="hour" items="${Hours}">
							<option value="${hour}" >${hour}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="destinationMinute" id="destinationMinute"  >
						<option value="-1" selected="selected" style="padding-left: 1%">Minute..</option>
						<c:forEach var="minute" items="${Minutes}">
							<option value="${minute}" >${minute}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="3">
						<form action="updateJourney" method="post" name="createFlightForm" id="createFlightForm">
					 		<input type="hidden" value="-1" name="departureId" id="departureId"/>
					 		<input type="hidden" value="-1" name="destinationId" id="destinationId"/>
					 		<input type="hidden" value="amol" name="departureTimestamp" id="departureTimestamp"/>
					 		<input type="hidden" value="" name="destinationTimestamp" id="destinationTimestamp"/>
					 		<input type="hidden" value="-1" name="seatsAvailable" id="seatsAvailable"/>
					 		<input type="hidden" value="-1" name="flightId" id="flightId"/>
							<input type="button" value="Update Flight" name="createFlight" id="createFlight" onclick="javascript:submitForm(this.form)"/>	 	
					 	</form>
				</td>
				<td colspan="3">
						<form action="cancelJourney" method="post" name="cancelFlightForm" id="cancelFlightForm">					 		 
					 		<input type="hidden" value="-1" name="flightId" id="flightId"/>
							<input type="button" value="Cancel Flight" name="createFlight" id="createFlight" onclick="javascript:submitCancelForm(this.form)"/>	 	
					 	</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>