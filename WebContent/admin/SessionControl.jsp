<%@ page import="sjsu.cmpe273.project.beans.*"%>
<%
	HttpSession hs = request.getSession();
	String userType = (String) hs.getAttribute("userType") == null ? ""
			: (String) hs.getAttribute("userType");
	UserBean user = (UserBean) hs.getAttribute("user");
	
	String first_name = "";
	if (user == null) {
		response.sendRedirect("../client/client.jsp");
	}else{
		first_name = user.getPerson().getFirst_name();
	}
	
	String message = request.getParameter("addMessage");
	if(message == null ){message = "Please Select Service...";}
	
	String  addFlightMessage = (String)request.getSession().getAttribute("FlightAdded");
	if(addFlightMessage == null){
		addFlightMessage = "";
	}
	else if(addFlightMessage.equals("successfully")){
		addFlightMessage = "Congradulation!!! Flighted added successfully!!!";
	}else if(addFlightMessage.equals("unsuccessfully")){
		addFlightMessage ="So Sad !!! Flighted added un-successfully!!!";
	}
	
	String noFlight = request.getParameter("NoFlight");
	if(noFlight == null){
		noFlight = "";
	}
%>