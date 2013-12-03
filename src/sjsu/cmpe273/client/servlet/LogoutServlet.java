package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.project.beans.UserBean;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		String who = request.getParameter("who");
		String url = null;
		UserBean user = (UserBean)hs.getAttribute("user");
		hs.removeAttribute("user");
		if(user.getPerson().getPerson_type() == 3){
			url="admin/adminLogin.jsp";
			
		}else{
			url="clientMain.jsp";
		}
		response.sendRedirect(url);
	}

}
