<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="SessionControl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="../dist/css/bootstrap.min.css">
<link rel="stylesheet" href="../dist/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="../dist/css/justified-nav.css">
<script src="https://code.jquery.com/jquery.js"></script>
<script src="../dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#datepicker").datepicker();
	});
	
	
	$(function() {
		var availableTags = [ "San Jose", "San Francisco", "Ney York",
				"Shanghai", "Beijing", "Sichuan", "Chicago", "Shengzhen",
				"Xiamen", "Tokyo", "Busan" ];
		$(".tags").autocomplete({
			source : availableTags
		});
	});
</script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="adminManagement.jsp">Airline
					Management System</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="">Home</a>
					</li>
					<li><a href=""></a>
					</li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown">Management<b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="../EmployeeServlet">Employee Management</a>
							</li>
							<li><a href="../CustomerServlet">Customer Management</a>
							</li>
							<li><a href="../JourneyServlet">Journey Management</a>
							</li>
							<li><a href="BookingMng.jsp">Booking Management</a>
							</li>
						</ul></li>
				</ul>

				<form class="navbar-form navbar-right" method="post"
					action="../LogoutServlet">
					<span style="color: white">Hi Admin: <%=first_name%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<button type="submit" class="btn btn-success">Log Out</button>
				</form>

			</div>
			<!--/.navbar-collapse -->
		</div>
	</div>

</body>
</html>