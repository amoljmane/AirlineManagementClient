<%@ page import="sjsu.cmpe273.project.beans.*"%>
<%
	HttpSession hs = request.getSession();
	String userType = (String) hs.getAttribute("userType") == null ? "": (String) hs.getAttribute("userType");
	UserBean user = (UserBean) hs.getAttribute("user");
	
	String first_name = "";
	if (user == null) {
		response.sendRedirect("../client/client.jsp");
	}else{
		first_name = user.getPerson().getFirst_name();
	}
	
	String message = request.getParameter("message");
	if(message == null ){message = "Please Select Service...";}
	else if(message.equals("edit")){message = "Edit Employee Information Successfully!";}
	else if(message.equals("editError")){message = "Error!! - Edit Employee Information UN-successfully!";}
	else if(message.equals("delete")){message ="Delete Employee Information Successfully!";}
	else if(message.equals("deleteError")){message ="Error!! - Delete Employee Information Un-Successfully!";}
	else if(message.equals("deleteCustomerError")){message ="Error!! - Delete Customer UN-Successfully!";}
	else if(message.equals("deleteCustomer")){message =" Delete Customer Successfully!";}
	else if(message.equals("editCustomerShowError")){message ="Error!! - Can Not Show Customer Information In Detail!";}
	else if(message.equals("editCustomerError")){message ="Error!! - Edit Customer Un-successfully!";}
	else if(message.equals("editCustomer")){message =" Edit Customer successfully! ";}
	else if(message.equals("showCustomerEorror")){message ="Error!! - Can Not Show Customer List!!";}
	else if(message.equals("1")){message = "Create employee successfully";}
	else if(message.equals("2")){message = "Error!! -Create employee UN-successfully";}
	else if(message.equals("3")){message = "Create employee successfully";}
	else if(message.equals("4")){message = "Error!! - Employee Existed";}
	else if(message.equals("0")){message = "Error!! - Create employee UN-successfully";}
	else if(message.equals("FlightAdded")){message="Congradulation!!! Flighted added successfully!!!";}
	else if(message.equals("FlightAddedError")){message="Error - Flighted added un-successfully!!!";}
	else if(message.equals("deleteJourney")){message="Delete a Journey successfully!!!!";}
	else if(message.equals("deleteJourneyError")){message="Error - Delete a Journey UN-successfully!!!!";}
	/*
	String  addFlightMessage = (String)request.getSession().getAttribute("FlightAdded");
	if(addFlightMessage == null){
		addFlightMessage = "";
	}else if(addFlightMessage.equals("successfully")){
		addFlightMessage = "Congradulation!!! Flighted added successfully!!!";
	}else if(addFlightMessage.equals("unsuccessfully")){
		addFlightMessage ="So Sad !!! Flighted added un-successfully!!!";
	}
	*/
	
	String noFlight = request.getParameter("NoFlight");
	if(noFlight == null){
		noFlight = "";
	}
%>