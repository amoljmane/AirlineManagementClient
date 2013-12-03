<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Schedule Flight</title>
<script type="text/javascript">
	function changeValue() {
		if (document.getElementById("flightSelect").value == -1) {
			document.getElementById("maximumSeats").value = 0;
			/* document.getElementById("maximumSeats").style.display = "none"; */
		} else {
			document.getElementById("maximumSeats").value = document
					.getElementById("flightSelect").value;
			document.getElementById("maximumSeats").style.display = "block";
		}
	}

	function changeValue1(count) {
		if (document.getElementById("flightSelect").value == -1) {
			document.getElementById("maximumSeats").value = 0;
			document.getElementById("maximumSeats").style.display = "none";
		} else {
			document.getElementById("maximumSeats").value = count;
			document.getElementById("maximumSeats").style.display = "block";
		}
	}

	function setDestinationAirport(destinationId) {
		var form = document.forms["createFlightForm"];
		if (document.getElementById("destinationLocation").value == -1) {
			document.getElementById("destinationAirport").value = "";
			/* document.getElementById("destinationAirport").style.display = "none"; */
			form.destinationId.value = -1;
		} else {
			document.getElementById("destinationAirport").value = document
					.getElementById("destinationLocation").value;
			document.getElementById("destinationAirport").style.display = "block";
			form.destinationId.value = destinationId;
		}
	}
	
	function setDepartureAirport(locationId) {
		var form = document.forms["createFlightForm"];
		 
		if (document.getElementById("departureLocation").value == -1) {
			document.getElementById("departureAirport").value = "";
			/* document.getElementById("departureAirport").style.display = "none"; */
			form.departureId.value = -1;
		} else {
			document.getElementById("departureAirport").value = document.getElementById("departureLocation").value;
			document.getElementById("departureAirport").style.display = "block";
			document.getElementById("departureId").value = locationId;
			form.departureId.value = locationId;
		}
	}
	
	function setSeatsAvailable(seatCount){
		var form = document.forms["createFlightForm"];
		form.seatsAvailable.value = seatCount;
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
 		
		if(form.departureId.value == -1){
			toSubmit = false;
			alert(" Please Select Departure Airport!!");
			document.getElementById("departureId").focus();
		}
		
		if(form.destinationId.value == -1){
			toSubmit = false;
			alert(" Please Select Destination Airport!!");
			document.getElementById("destinationId").focus();
		}
		
		if(form.seatsAvailable.value == -1){
			toSubmit = false;
			alert(" Please Enter seats available for booking!!");
			document.getElementById("seatsAvailable").focus();
		}
		
		if(document.getElementById("flightSelect").value == -1) {
			toSubmit = false;
			alert(" Please Select flight !!");
			document.getElementById("flightSelect").focus();			
		}
		
		if(document.getElementById("maximumSeats").value < document.getElementById("numberOfSeats").value ){
			toSubmit = false;
			alert(" Please Enter seats available less than maximum seats !!");
			document.getElementById("numberOfSeats").focus();						
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

		form.departureTimestamp.value = deptTime;
		form.destinationTimestamp.value = arrTime;
		form.flightId.value = document.getElementById("flightSelect").value;
		
		form.ticketPrice.value = document.getElementById("ticketPriceInput").value;
		alert(form.ticketPrice.value);
		
		if(form.ticketPrice.value == 0){
			toSubmit = false;
			alert("Enter Ticket Price!!");
			form.ticketPrice.focus();
		}
		
		if(isNaN(form.ticketPrice.value)){
			toSubmit = false;
			alert("Enter valid Ticket Price!!");
			form.ticketPrice.focus();
		}
	    if(toSubmit == true) {
			form.submit();
		}  
	}
</script>
</head>
<body>
<br><br><br><br>
<div align="center">
<h1>** Schedule a Flight **</h1>
<%
	String duplicate = (String)request.getAttribute("DuplicateFlight");
	if(duplicate != null) {
		%>
		<h3><%= duplicate %></h3>
		<%
	}
%>
</div>
<br><br><br>

<div align="center">
	<table border="0" cellspacing="5%" cellpadding="5%"  align="center">
	<tr style="padding-bottom: 2%;">
		<td style="padding-right: 4%;"></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td align="center">Year</td>
		<td align="center">Month</td>
		<td align="center">Day</td>
		<td align="center">Hour</td>
		<td align="center">Minute</td>		
	</tr>
 	<tr>
		<td >
			Departure Airport :
		</td>
		<td>
			<select name="departureLocation" id="departureLocation"  style="width: 100%;" >
				<option value="-1" selected="selected" onclick="setDepartureAirport(-1)" style="padding-left: 1%">  </option>
				<c:forEach var="location" items="${Locations}">
					<option value="${location.location_name}" onclick="setDepartureAirport(${location.location_id})" >${location.airport_name}</option>
				</c:forEach>
			</select>
		</td>
		<td>
			Departure City :
		</td>
		<td align="center">
			<!-- <input type="text" name="departureAirport" id="departureAirport" value="" disabled="disabled" style="display: none;" size="13" align="middle"/> -->
			<input type="text" name="departureAirport" id="departureAirport" value=""  disabled="disabled"  size="13" align="middle"/>
		</td>
		<td>
			Departure Time :
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
		<td></td>
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>	 
	 </tr>
	 <tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>	 
	 </tr>	 
	<tr>
		<td>
			Destination Airport :
		</td>
		<td>
			<select name="destinationLocation" id="destinationLocation"  style="width: 100%;" >
				<option value="-1" selected="selected" onclick="setDestinationAirport(-1)" style="padding-left: 1%"></option>
				<c:forEach var="location" items="${Locations}">
					<option value="${location.location_name}" onclick="setDestinationAirport(${location.location_id})">${location.airport_name}</option>
				</c:forEach>
			</select>
		</td>
		<td>
			Destination City :
		</td>
		<td align="center">
			<!-- <input type="text" name="destinationAirport" id="destinationAirport" value="" disabled="disabled" style="display: none;" size="13" align="middle"/> -->
			<input type="text" name="destinationAirport" id="destinationAirport" value="" disabled="disabled"  size="13" align="middle"/>
		</td>
		<td>
			Arrival Time :
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
		<td></td>
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>	 
	 </tr>
	 <tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>	 
	 </tr>
	<tr>
		<td>
			Select Flight :
		</td>
		<td>
			<select name="flightSelect" id="flightSelect"  style="width: 100%;" >
				<option value="-1" selected="selected" onclick="changeValue1(-1)" style="padding-left: 1%"></option>
				<c:forEach var="flight" items="${Flights}">
					<option value="${flight.flight_id}" onclick="changeValue1(${flight.seats})">${flight.flight_name}</option>
				</c:forEach>
			</select>
		</td>
		<td>
			Maximum Seats :
		</td>
		<td>
			<input type="text" name="maximumSeats" id="maximumSeats" value="0" disabled="disabled" style="display: none;" size="13" align="middle"/>
		</td>
		<td>
			Number of Seats :
		</td>
		<td>
			<input type="text" value="0" name="numberOfSeats" id="numberOfSeats" size="6" onchange="setSeatsAvailable(this.value)"/>
		</td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	 <tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>	 
	 </tr>
	 <tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>	 
	 </tr>
	 <tr>
	 	<td>
	 		Enter Ticket Price ::
	 	</td>
	 	<td>
	 		<input type="text" value="0" name="ticketPriceInput" id="ticketPriceInput" />
	 	</td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>		 
		<td></td>
		<td></td>
		<td></td>		 	
	 </tr>
	 <tr align="center">
	 	<td colspan="10">
	 	<form action="saveJourneyDetails" method="post" name="createFlightForm" id="createFlightForm">
	 		<input type="hidden" value="-1" name="ticketPrice" id="ticketPrice"/>
	 		<input type="hidden" value="-1" name="departureId" id="departureId"/>
	 		<input type="hidden" value="-1" name="destinationId" id="destinationId"/>
	 		<input type="hidden" value="amol" name="departureTimestamp" id="departureTimestamp"/>
	 		<input type="hidden" value="" name="destinationTimestamp" id="destinationTimestamp"/>
	 		<input type="hidden" value="-1" name="seatsAvailable" id="seatsAvailable"/>
	 		<input type="hidden" value="-1" name="flightId" id="flightId"/>
			<input type="button" value="Create Flight" name="createFlight" id="createFlight" onclick="javascript:submitForm(this.form)"/>	 	
	 	</form>
	 	</td>
	 </tr>	
	</table>
</div>
</body>
</html>