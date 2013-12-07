<%@ page import="sjsu.cmpe273.project.beans.*"%>
<%
	String errorMessage = "";
	String user = null;
	String message = request.getParameter("errorMessage");
	if (message == null) {
		message = "";
	}

%>
