<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="headerClient.jsp"%>
<script type="text/javascript">
  function clickon(){
	  
	  alert("successful");
  }
</script>

<body>

	<div style="padding-top: 50px">
		<h1>Search Flights</h1><hr>
		<form action="../SearchFlightServlet" method="post">
			<label class="label label-primary">From :</label><input onclick="clickon()" class="tags" name="from">
			<label class="label label-primary"> To :</label><input class="tags" name="to">
			<label class="label label-primary">Departure time:</label> <input type="text" id="datepicker" name="time">
			<button type="submit">search</button>
		</form>
		<hr>
	</div>
	
	<div  id="result">
		<div>
			<table class="table table-striped">
				<tr>
					<th>Airline Info</th>
					<th>Departure / Arrive Time</th>
					<th>Departure / Arrive Airport</th>
					<th>Price</th>
					<th>Booking</th>
				</tr>
				<%if(journeys != null){for(JourneyDetailBean  j : journeys){%>
				<tr>
					<td><%=j.getAirline_name()%></td>
					<td><%=j.getDeparture_time()%> <br> <%=j.getArrival_time() %></td>
					<td><%=j.getSourceLocation().getAirport_name()%> <br> <%=j.getDestinationLocation().getAirport_name() %></td>
					<td><%=j.getTicket_price() %></td>
					<td><a href=""><button type="button" class="btn btn-info">Booking</button></a></td>
				</tr>
				<%}} %>
			</table>
		</div>
	</div>
</body>
</html>