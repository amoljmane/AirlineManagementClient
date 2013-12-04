<%@ page import="sjsu.cmpe273.project.beans.*"%>
<%
	String message = request.getParameter("errorMessage");
	if (message == null) {
		message = "";
	}
	
	String noflightsMessage = "";
	JourneyDetailBean[] journeys = (JourneyDetailBean[]) request
			.getSession().getAttribute("journeys");
	if (journeys != null) {
		System.out.println(journeys[0].getFlight_id() + "---> from:"
				+ journeys[0].getFrom().getLocation_name() + " to:"
				+ journeys[0].getTo().getLocation_name());
	}else{
		noflightsMessage = "No Flights Recently for your requirements ! Please wait patiently...";
	}
	
	String errorMessage = "";
	String user = null;
%>
