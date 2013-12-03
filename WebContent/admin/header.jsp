<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="SessionControl.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  
	<div class="masthead">
		<h3 class="text-muted">Project name</h3>
		<ul class="nav nav-justified">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="#">Employee Management</a></li>
			<li><a href="#">Person Management</a></li>
			<li><a href="#">Flight Management</a></li>
			<li><a href="#">Booking Management</a></li>
			<li><a href="#">Search</a></li>
		</ul>
	</div>
	-->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Airline Management System</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="">Home</a></li>
					<li><a href="AdvertismentsPost.jsp"></a></li>
					<li class="dropdown"><a href="sellAndBuyRec.jsp"
						class="dropdown-toggle" data-toggle="dropdown">Management <b
							class="caret"></b> </a>
						<ul class="dropdown-menu">
							<li><a href="../EmployeeServlet">Employee Management</a></li>
							<li><a href="PersonMng.jsp">Person Management</a></li>
							<li><a href="FlightMng.jsp">Flight Management</a></li>
							<li><a href="BookingMng.jsp">Booking Management</a></li>
						</ul>
					</li>
				</ul>
				
				<form class="navbar-form navbar-right" method="post" action="../LogoutServlet">
					<span style="color: white">Hi Admin: <%=first_name%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<button type="submit" class="btn btn-success">Log Out</button>
				</form>
	
			</div>
			<!--/.navbar-collapse -->
		</div>
	</div>
</body>
</html>