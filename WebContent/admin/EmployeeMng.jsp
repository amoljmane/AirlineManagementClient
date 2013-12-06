<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<%
	 UserBean[] employees = (UserBean[])hs.getAttribute("employees");
%>
</head>

<body>
	<div class="container">

		<div style="padding-top: 30px">
			<h1>Employee Management</h1><hr>
		</div>

		<!-- Button trigger modal -->
		<button class="btn btn-primary btn-lg" data-toggle="modal"
			data-target="#myModal">Add Employee</button>

		<!-- Modal For Add Employee-->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">Add Employee</h4>
					</div>
					<form action="../EmployeeServlet?flag=addEmployee" method="post">
						<div class="modal-body">
							<input type="text" class="form-control" name="lastname" placeholder="last name" required autofocus><label></label>
							<input type="text" class="form-control" name="firstname"  placeholder="first name" required><label></label>
							<input type="text" class="form-control" name="ssn"  placeholder="ssn" required><label></label>
							<input type="text" id="datepicker" class="form-control" name="birthday"  placeholder="birthday" required><label></label>
							<input type="text" class="form-control" name="passport"  placeholder="passport" required><label></label>
							<input type="text" class="form-control" name="email"  placeholder="email" required><label></label>
							<input type="text" class="form-control" name="address1"  placeholder="address_1" required><label></label>
							<input type="text" class="form-control" name="address2"  placeholder="address_2" ><label></label>
							<input type="text" class="form-control" name="zipCode"  placeholder="zip code" required><label></label>
							<input type="text" class="form-control" name="city"  placeholder="city" required><label></label>
							<input type="text" class="form-control" name="state" placeholder="state" required><label></label>
							<input type="text" class="form-control" name="country"  placeholder="country" required><label></label>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">submit</button>
						</div>
					</form>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->

		<!-- Button trigger modal -->
		<button class="btn btn-primary btn-lg" data-toggle="modal"
			data-target="#Modal">Search Employee</button>
		<!-- Modal For Search Employee-->
		<div class="modal fade" id="Modal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">Search Employee</h4>
					</div>
					
					<form action="../EmployeeServlet?flag=searchEmployee" method="post">
						<div class="modal-body">
							<label>Search Type</label>
							<select name="searchType">
								<option value="email">email</option>
								<option value="ssn">SSN</option>
								<option value="passport">passport</option>
							</select>
							<input type="text" class="form-control" name="keyWords"  placeholder="key words" required><label></label>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
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
					<th>LastName</th>
					<th>FirstName</th>
					<th>SSN</th>
					<th>Birthday</th>
					<th>passport</th>
					<th>email</th>
					<th>address 1</th>
					<th>address 2</th>
					<th></th>
					<th></th>
				</tr>
				<%if(employees != null){for(UserBean employee : employees){%>
				<tr>
					<td><%=employee.getPerson().getPerson_id() %></td>
					<td><%=employee.getPerson().getLast_name() %></td>
					<td><%=employee.getPerson().getFirst_name()%></td>
					<td><%=employee.getEmployeeBean().getSsn() %></td>
					<td><%=employee.getPerson().getDob() %></td>
					<td><%=employee.getPerson().getPassport_number() %></td>
					<td><%=employee.getPerson().getEmail_address()%></td>
					<td><%=employee.getPerson().getAddress_line1() %></td>
					<td><%=employee.getPerson().getAddress_line2() %></td>
					<td>
						<a href="../EmployeeServlet?flag=showEdit&person_id=<%=employee.getPerson().getPerson_id()%>"><button type="button" class="btn btn-info">Edit</button></a>
						<a href="../EmployeeServlet?flag=deleteEmployee&employee_id=<%=employee.getPerson().getPerson_id()%>"><button type="button" class="btn btn-info">Delete</button></a>
						<a href="../EmployeeServlet?flag=showAEmployee&person_id=<%=employee.getPerson().getPerson_id()%>"><button type="button" class="btn btn-info">Show</button></a>
					</td>
				</tr>
				<%}} %>
			</table>
		</div>
		<hr>
	</div>
	<!-- /container -->

</body>
</html>