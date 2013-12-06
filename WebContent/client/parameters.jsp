<%@ page import="sjsu.cmpe273.project.beans.*"%>
<%
	String errorMessage = "";
	String user = null;
	String message = request.getParameter("errorMessage");
	if (message == null) {
		message = "";
	}

	String noflightsMessage = "";
	JourneyDetailBean[] journeys = (JourneyDetailBean[]) request.getSession().getAttribute("journeys");
	if (journeys == null) {
		noflightsMessage = "No Flights Recently for your requirements ! Please wait patiently...";
	} else {

	}
%>
