package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.project.beans.UserBean;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String UserType = request.getParameter("who")==null?"":request.getParameter("who");
		UserBean user = proxy.login(email, password);
		
		if (user != null) {
			HttpSession hs = request.getSession();
			hs.setAttribute("user", user);
			if (user.getPerson().getPerson_type() == 3) {
				hs.setAttribute("userType", "admin");
				response.sendRedirect("admin/adminManagement.jsp");
			} else {
				hs.setAttribute("userType", "client");
				response.sendRedirect("clientMain.jsp");
			}
		}else{
			if(UserType.equals("admin")){
				response.sendRedirect("admin/adminLogin.jsp?error=loginError");
			}else if(UserType.equals("client")){
				response.sendRedirect("clientMain.jsp?error=loginError");
			}
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
