<%@ page import="sjsu.cmpe273.project.beans.*"%>
<%
	HttpSession hs = request.getSession();
	String userType = (String) hs.getAttribute("userType") == null ? ""
			: (String) hs.getAttribute("userType");
	UserBean user = (UserBean) hs.getAttribute("user");
	
	String first_name = "";
	if (user == null) {
		response.sendRedirect("../clientMain.jsp");
	}else{
		first_name = user.getPerson().getFirst_name();
	}
	
	String message = request.getParameter("addMessage");
	if(message == null ){message = "Please Select Service...";}
%>