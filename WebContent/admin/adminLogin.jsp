<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../dist/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="../dist/css/bootstrap-theme.min.css">

<%
	String error = (String)request.getParameter("error")==null?"":"loginError";
	
	%>
</head>
<body>
	<div class="container">
		<form class="form-signin col-md-4" action="../userLogin?who=admin" method="post">
			<h2 class="form-signin-heading">Please sign in</h2>
			<input type="text" class="form-control" name="email"
				placeholder="Email address" required autofocus> <input
				type="password" class="form-control" name="password"
				placeholder="Password" required><label class="checkbox">
				<input type="checkbox" value="remember-me">Remember me </label>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
				<%if(error.equals("loginError")){ %>
				<div class="alert alert-danger">Email or password is not corrected! </div>
				<%} %>
		</form>


	
	</div>
	<!-- /container -->
	

	<script src="https://code.jquery.com/jquery.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="../dist/js/bootstrap.min.js"></script>
</body>
</html>