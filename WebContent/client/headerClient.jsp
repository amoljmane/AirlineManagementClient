<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="parameters.jsp" %>
<%@ page import="sjsu.cmpe273.project.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery.js"></script>
<script src="../dist/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

<link rel="stylesheet" href="../dist/css/bootstrap.min.css">
<link rel="stylesheet" href="../dist/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="../dist/css/justified-nav.css">
<link rel="stylesheet" href="../dist/css/style.css">
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
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
				<a class="navbar-brand" href="">Airline Management System</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="">Home</a>
					</li>
					<li><a href=""></a>
					</li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown">Services<b class="caret"></b> </a>
						<ul class="dropdown-menu">
							<li><a href="">Your Booking</a>
							</li>
							<li><a href=""></a>
							</li>
							<li><a href=""></a>
							</li>
							<li><a href=""></a>
							</li>
						</ul></li>
				</ul>

				<%
					if (user == null) {
				%>

				<form class="navbar-form navbar-right" method="post"
					action="">
					<div class="form-group">
						<input type="text" placeholder="Email" class="form-control"
							name="email">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" class="form-control"
							name="password">
					</div>
					<button type="submit" class="btn btn-success">Sign in</button>
					<div>
						<font color="white"><%=errorMessage%></font>
					</div>
				</form>
				<%
					} else {
				%>
				<form class="navbar-form navbar-right" method="post"
					action="/SimpleMathSolverClient/UserLogoutServlet">
					<span style="color: white">Hi, <%=""%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<button type="submit" class="btn btn-success">Log Out</button>
				</form>
				<%
					}
				%>
			</div>
			<!--/.navbar-collapse -->


		</div>
	</div>

</body>
</html>