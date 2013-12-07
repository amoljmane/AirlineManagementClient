<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<%@ include file="header.jsp"%>
<%
	JourneyDetailBean journey = (JourneyDetailBean)hs.getAttribute("journey");
	LocationsBean[] locations  = (LocationsBean[])hs.getAttribute("locations");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
$(function() {
	$("#departureT").datepicker();
});
	var input = function(){
		var departureAir =$('#departureAir').val("<%=journey.getSourceLocation().getAirport_name()%>");
		var arrivalAir = $('#arrivalAir').val("<%=journey.getDestinationLocation().getAirport_name()%>");
		var departureT = $('#departureT').val("<%=journey.getDeparture_time()%>");
		var arrivalT = $('#arrivalT').val("<%=journey.getArrival_time()%>");
		var price = $('#price').val("<%=journey.getTicket_price()%>");
		var seats = $('#seats').val("<%=journey.getSeats_available()%>");
		var flight = $('#flight').val("<%=journey.getFlight_name()%>");
	}
</script>
</head>

<body onload="input()">
	<div class="container">
		<div style="padding-top: 30px">
			<h1>Edit Journey Info</h1>
			<hr>
		</div>


		<form action="../JourneyServlet?flag=edit&j_id=<%=journey.getJourney_id() %>" method="post">
			<div >
				<div >
					<label >Flight Name</label>
					<div >
						<input type="text" id="flight"  name="flight"
							placeholder="Flight Name" required>
					</div>
					<label></label>
				</div>
				
				<div >
					<label >Departure Airport</label>
					<div >
					<!-- <label class="label label-primary">From :</label> -->
			<select name="from">
			<% if(locations != null) { for(LocationsBean lo : locations){%>
				<option  value="<%=lo.getLocation_id()%>"><%=lo.getLocation_name() %></option>
			<% }} %>
			</select>
						<!-- <input type="text" id="departureAir" name="departureAir" placeholder="Departure Airport"> -->
					</div>
					<label></label>
				</div>

				<div >
					<label >Arrival Airport</label>
					<div >
					<!-- <label class="label label-primary"> To :</label> -->
			<select name="to">
				<% if(locations != null) { for(LocationsBean lo : locations){%>
				<option  value="<%=lo.getLocation_id()%>"><%=lo.getLocation_name() %></option>
			<% }} %>
			</select>
						<!-- <input type="text" id="arrivalAir"  name="arrivalAir" " placeholder="Arrival Airport" required> -->
					</div>
					<label></label>
				</div>
				
				<div>
					<label >Departure Time</label>
					<div >
						<input type="text" id="departureT"  name="departureT"  >
						
						<select name="departureHour" id="departureHour">
							<option value="-1" selected="selected" style="padding-left: 1%">Hour..</option>
							<c:forEach var="hour" items="${Hours}">
								<option value="${hour}">${hour}</option>
							</c:forEach>
						</select> <select name="departureMinute" id="departureMinute">
							<option value="-1" selected="selected" style="padding-left: 1%">Minute..</option>
							<c:forEach var="minute" items="${Minutes}">
								<option value="${minute}">${minute}</option>
							</c:forEach>
						</select>
					</div>
					<label></label>
				</div>
				<div >
					<label >Arrival Time</label>
					<div >
						<input type="text" id="arrivalT"  name="arrivalT" placeholder="Arrival Time" required>
						<select name="arrivalHour" id="arrivalHour">
							<option value="-1" selected="selected" style="padding-left: 1%">Hour..</option>
							<c:forEach var="hour" items="${Hours}">
								<option value="${hour}">${hour}</option>
							</c:forEach>
						</select> <select name="arrivalMinute" id="arrivalMinute">
							<option value="-1" selected="selected" style="padding-left: 1%">Minute..</option>
							<c:forEach var="minute" items="${Minutes}">
								<option value="${minute}">${minute}</option>
							</c:forEach>
						</select>
					</div>
					<label></label>
				</div>


				<div >
					<label >Price</label>
					<div >
						<input type="text" id="price"  name="price"
							placeholder="price" required>
					</div>
					<label></label>
				</div>
				<!-- <div >
					<label >Number of Seats</label>
					<div >
						<input type="text" id="seats"  name="seats" placeholder="seats" required>
					</div>
					<label></label>
				</div> -->

			</div>
			<div >
				<button type="submit" >submit</button>
			</div>
		</form>

	</div>
</body>
</html>