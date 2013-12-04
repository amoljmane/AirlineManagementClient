<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="header.jsp"%>
<body>
	<div class="container">
		
		<div style="padding-top: 30px">
			<h1>Person Management</h1><hr>
		</div>
		
		<table class="table table-striped">
			<tr>
				<th>LastName</th>
				<th>FirstName</th>
				<th>SSN</th>
				<th>passport</th>
				<th>email</th>
				<th>address 1</th>
				<th>address 2</th>
				<th>ZipCode</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
			</tr>
			</div>
			<!-- Button trigger modal -->
			<button class="btn btn-primary btn-lg" data-toggle="modal"
				data-target="#Modal">Search Employee</button>

			<div class="modal fade" id="Modal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">Search Employee</h4>
						</div>

						<form action="../EmployeeServlet?flag=searchEmployee"
							method="post">
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

			</div>
			<!-- /container -->
</body>
</html>