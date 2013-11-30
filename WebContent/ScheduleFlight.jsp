<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function changeValue() {
	if(document.getElementById("flightSelect").value == -1){
		document.getElementById("maximumSeats").value = 0;
		document.getElementById("maximumSeats").style.display = "none";
	} else {
		document.getElementById("maximumSeats").value = document.getElementById("flightSelect").value;
		document.getElementById("maximumSeats").style.display = "block";
	}
}

function changeValue1(count) { 
	if(document.getElementById("flightSelect").value == -1){
		document.getElementById("maximumSeats").value = 0;
		document.getElementById("maximumSeats").style.display = "none";
	} else {
		document.getElementById("maximumSeats").value = count;
		document.getElementById("maximumSeats").style.display = "block";
	}
}
 
function setDestinationAirport() {	 
	if(document.getElementById("destinationLocation").value == -1) {
		document.getElementById("destinationAirport").value = "";
		document.getElementById("destinationAirport").style.display = "none";	
	} else {
		document.getElementById("destinationAirport").value = document.getElementById("destinationLocation").value;
		document.getElementById("destinationAirport").style.display = "block";	
	}
}
function setDepartureAirport() {
	if(document.getElementById("departureLocation").value == -1) {
		document.getElementById("departureAirport").value = "";
		document.getElementById("departureAirport").style.display = "none";	
	} else {
		document.getElementById("departureAirport").value = document.getElementById("departureLocation").value;
		document.getElementById("departureAirport").style.display = "block";	
	}
}
</script>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="3%">
		<tr>
			<td>
				Select Flight
			</td>
			<td>
				Maximum Seats
			</td>
			<td>
				Departure Airport
			</td>
			<td>
				Departure City
			</td>
			<td>
				Destination Airport
			</td>
			<td>
				Destination City
			</td>
			<td>
				Departure Time
			</td>
			<td>
				Destination Time
			</td>
			<td>
				Number of Seats
			</td>
			<td>
			</td>
		</tr>
		<tr>
			<td>
				<select name="flightSelect" id="flightSelect"  style="width: 100%;" >
					<option value="-1" selected="selected" onclick="changeValue1(-1)" style="padding-left: 1%"></option>
					<c:forEach var="flight" items="${Flights}">
						<option value="${flight.flight_id}" onclick="changeValue1(${flight.seats})">${flight.flight_name}</option>
					</c:forEach>
				</select>
			</td>
			<td align="center">
				<input type="text" name="maximumSeats" id="maximumSeats" value="0" disabled="disabled" style="display: none;" size="13" align="middle"/>
			</td>
			<td>
				<select name="departureLocation" id="departureLocation"  style="width: 100%;" >
					<option value="-1" selected="selected" onclick="setDepartureAirport()" style="padding-left: 1%">  </option>
					<c:forEach var="location" items="${Locations}">
						<option value="${location.location_name}" onclick="setDepartureAirport()" >${location.airport_name}</option>
					</c:forEach>
				</select>
			</td>
			<td align="center">
				<input type="text" name="departureAirport" id="departureAirport" value="" disabled="disabled" style="display: none;" size="13" align="middle"/>
			</td>
			<td>
				<select name="destinationLocation" id="destinationLocation"  style="width: 100%;" >
					<option value="-1" selected="selected" onclick="setDestinationAirport()" style="padding-left: 1%"></option>
					<c:forEach var="location" items="${Locations}">
						<option value="${location.location_name}" onclick="setDestinationAirport()">${location.airport_name}</option>
					</c:forEach>
				</select>
			</td>
			<td align="center">
				<input type="text" name="destinationAirport" id="destinationAirport" value="" disabled="disabled" style="display: none;" size="13" align="middle"/>
			</td>
			
			<td>
				<select name="departureYear" id="departureYear">
					<option value="2013" selected="selected">2013</option>
					<option value="2014">2014</option>
					<option value="2015">2015</option>
				</select>
				<select name="departureMonth" id="departureMonth"  >
					<option value="-1" selected="selected" style="padding-left: 1%">Month..</option>
					<c:forEach var="month" items="${Months}">
						<option value="${month.monthNumber}" >${month.month}</option>
					</c:forEach>
				</select>
				<select name="departureDay" id="departureDay"  >
					<option value="-1" selected="selected" style="padding-left: 1%">Day..</option>
					<c:forEach var="day" items="${Days}">
						<option value="${day}" >${day}</option>
					</c:forEach>
				</select>
				<select name="departureHour" id="departureHour"  >
					<option value="-1" selected="selected" style="padding-left: 1%">Hour..</option>
					<c:forEach var="hour" items="${Hours}">
						<option value="${hour}" >${hour}</option>
					</c:forEach>
				</select>
				<select name="departureMinute" id="departureMinute"  >
					<option value="-1" selected="selected" style="padding-left: 1%">Minute..</option>
					<c:forEach var="minute" items="${Minutes}">
						<option value="${minute}" >${minute}</option>
					</c:forEach>
				</select>
			</td>
			
			<td>
				<select name="destinationYear" id="destinationYear">
					<option value="2013" selected="selected">2013</option>
					<option value="2014">2014</option>
					<option value="2015">2015</option>
				</select>
				<select name="destinationMonth" id="destinationMonth"  >
					<option value="-1" selected="selected" style="padding-left: 1%">Month..</option>
					<c:forEach var="month" items="${Months}">
						<option value="${month.monthNumber}" >${month.month}</option>
					</c:forEach>
				</select>
				<select name="destinationDay" id="destinationDay"  >
					<option value="-1" selected="selected" style="padding-left: 1%">Day..</option>
					<c:forEach var="day" items="${Days}">
						<option value="${day}" >${day}</option>
					</c:forEach>
				</select>
				<select name="destinationHour" id="destinationHour"  >
					<option value="-1" selected="selected" style="padding-left: 1%">Hour..</option>
					<c:forEach var="hour" items="${Hours}">
						<option value="${hour}" >${hour}</option>
					</c:forEach>
				</select>
				<select name="destinationMinute" id="destinationMinute"  >
					<option value="-1" selected="selected" style="padding-left: 1%">Minute..</option>
					<c:forEach var="minute" items="${Minutes}">
						<option value="${minute}" >${minute}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<input type="text" value="0" name="numberOfSeats" id="numberOfSeats" />
			</td>
			<td>
				<input type="button" value="Create Flight" name="createFlight" id="createFlight"/>
			</td>
		</tr>
	</table>
</body>
</html>