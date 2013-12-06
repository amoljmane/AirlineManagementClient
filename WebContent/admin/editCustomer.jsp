<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%
	UserBean emply = (UserBean) hs.getAttribute("customer");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
$(function() {
	$("#birthday").datepicker();
});

	var input = function(){
		var person_id =$('#person_id').val("<%=emply.getPerson().getPerson_id()%>");
		var firstname = $('#firstname').val("<%=emply.getPerson().getFirst_name()%>");
		var lastname = $('#lastname').val("<%=emply.getPerson().getLast_name()%>");
		var ssn = $('#ssn').val("<%=emply.getTraveler().getSsn()%>");
		var passport = $('#passport').val("<%=emply.getPerson().getPassport_number()%>");
		var email = $('#email').val("<%=emply.getPerson().getEmail_address()%>");
		var address1 = $('#address1').val("<%=emply.getPerson().getAddress_line1()%>");
		var address2 = $('#address2').val("<%=emply.getPerson().getAddress_line2()%>");
		var zipCode = $('#zipCode').val("<%=emply.getPerson().getZip_code()%>");
		var city = $('#city').val("<%=emply.getPerson().getCity()%>");
		var state = $('#state').val("<%=emply.getPerson().getState()%>");
		var country = $('#country').val("<%=emply.getPerson().getCountry()%>");
		var birthday =$('#birthday').val("<%=emply.getPerson().getDob()%>");
	}
</script>
</head>

<body onload="input()">
	<div class="container">
		<div style="padding-top: 30px">
			<h1>Edit Customer Info</h1>
			<hr>
		</div>


		<form class="form-horizontal c" role="form"
			action="../CustomerServlet?flag=editCustomer&person_id=<%=emply.getTraveler().getPerson_id() %>" method="post">
			<div class="modal-body">
			<div class="form-group">
					<label class="col-sm-2 control-label">Person ID</label>
					<div class="col-sm-10">
						<input type="text" id="person_id" class="form-control"
							name="person_id" placeholder="person_id" disabled="disabled">
					</div>
					<label></label>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">last name</label>
					<div class="col-sm-10">
						<input type="text" id="lastname" class="form-control"
							name="lastname" placeholder="last name" required autofocus>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">firstname</label>
					<div class="col-sm-10">
						<input type="text" id="firstname" class="form-control"
							name="firstname" placeholder="first name" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">ssn</label>
					<div class="col-sm-10">
						<input type="text" id="ssn" class="form-control" name="ssn"
							placeholder="Format: 123456789" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">birthday</label>
					<div class="col-sm-10">
						<input type="text" id="birthday" class="form-control" name="birthday"
							placeholder="Format: 10/01/2011" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">passport</label>
					<div class="col-sm-10">
						<input type="text" id="passport" class="form-control"
							name="passport" placeholder="passport" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">email</label>
					<div class="col-sm-10">
						<input type="text" id="email" class="form-control" name="email"
							placeholder="email" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">address1</label>
					<div class="col-sm-10">
						<input type="text" id="address1" class="form-control"
							name="address1" placeholder="address_1" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">address2</label>
					<div class="col-sm-10">
						<input type="text" id="address2" class="form-control"
							name="address2" placeholder="address_2">
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">zipCode</label>
					<div class="col-sm-10">
						<input type="text" id="zipCode" class="form-control"
							name="zipCode" placeholder="zip code" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">city</label>
					<div class="col-sm-10">
						<input type="text" id="city" class="form-control" name="city"
							placeholder="city" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">state</label>
					<div class="col-sm-10">
						<input type="text" id="state" class="form-control" name="state"
							placeholder="state" required>
					</div>
					<label></label>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">country</label>
					<div class="col-sm-10">
						<input type="text" id="country" class="form-control"
							name="country" placeholder="country" required>
					</div>
					<label></label>
				</div>
			</div>
			<div class="modal-footer">
				<button type="submit" class="btn btn-primary">submit</button>
			</div>
		</form>

	</div>
</body>
</html>