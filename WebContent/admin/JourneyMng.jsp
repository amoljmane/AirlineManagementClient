<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../dist/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="../dist/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="../dist/css/justified-nav.css">

<!-- Latest compiled and minified JavaScript -->

</head>
<%@ include file="header.jsp"%>
<%
	JourneyDetailBean[] journeys = (JourneyDetailBean[]) hs .getAttribute("listJourney");
%>
<body>
	<div class="container">
		<div style="padding-top: 30px">
			<h1>Journey Management</h1>
			<hr>
		</div>
		<!-- Button trigger modal -->
		<button class="btn btn-primary btn-lg" data-toggle="modal"
			data-target="#Modal">Search Journey</button>
		<a href="../adminAction"><button class="btn btn-primary btn-lg" >Add Journey</button></a>
			
		<div class="modal fade" id="Modal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">Search Journey</h4>
					</div>

					<form action="../EmployeeServlet?flag=searchEmployee" method="post">
						<div class="modal-body">
							<label>Search Type</label> <select name="searchType">
								<option value="email">email</option>
								<option value="ssn">SSN</option>
								<option value="passport">passport</option>
							</select> <input type="text" class="form-control" name="keyWords"
								placeholder="key words" required><label></label>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">Search</button>
						</div>
					</form>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->

		<div>
			<table class="table table-striped">
				<tr>
					<th>ID</th>
					<th>Flight ID</th>
					<th>From</th>
					<th>To</th>
					<th>Departure time</th>
					<th>Arrival time</th>
					<th>Seats Available</th>
					<th>Seats Booked</th>
					<th>Ticket Price</th>
				</tr>
				<%
					if (journeys != null) {
						for (JourneyDetailBean j : journeys) {
				%>
				<tr>
					<td><%=j.getJourney_id()%></td>
					<td><%=j.getFlight_name()%></td>
					<td><%=j.getSourceLocation().getLocation_name()%></td>
					<td><%=j.getDestinationLocation().getLocation_name()%></td>
					<td><%=j.getDeparture_time()%></td>
					<td><%=j.getArrival_time()%></td>
					<td><%=j.getSeats_available()%></td>
					<td><%=j.getSeats_booked()%></td>
					<td><%=j.getTicket_price()%></td>
					

					<td>
					<a href="../JourneyServlet"><button type="button" class="btn btn-info">Edit</button>  </a> 
					<a href="../JourneyServlet?flag=deleteJourney&j_id=<%=j.getJourney_id()%>"><button type="button" class="btn btn-info">Delete</button> </a> 
					<a href="../JourneyServlet"><button type="button" class="btn btn-info">Show</button> </a>
					</td>
				</tr>
				<%
					}
					}
				
				%>
			</table>
		</div>
		<hr>
	</div>
	<!-- /container -->
</body>
</html>