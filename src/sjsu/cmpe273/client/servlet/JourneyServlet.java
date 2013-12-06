package sjsu.cmpe273.client.servlet;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

/**
 * Servlet implementation class JourneyServlet
 */
public class JourneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		String url = "admin/adminManagement.jsp";
		String flag = request.getParameter("flag") == null ? "list" : request.getParameter("flag");
		System.out.println("flag ---> " + flag);
		
		if(flag.equals("list")){
			if(!ListJourney(hs)){
				url = "admin/adminManagement.jsp&message=listError";
			}else{
				url = "admin/JourneyMng.jsp";
			}
		}else if(flag.equals("showEdit")){
			
		}else if(flag.equals("edit")){
			
		}else if(flag.equals("showAJourneyDetail")){
			
		}else if(flag.equals("deleteJourney")){
			if(this.deleteJourney(request)){
				url = "admin/adminManagement.jsp&message=deleteJourney";
			}else{
				url = "admin/adminManagement.jsp&message=deleteJourneyError";
			}
		}
		
		response.sendRedirect(url);
	}
	
	public boolean ListJourney(HttpSession hs){
		boolean isSuccess = true;
		try {
			JourneyDetailBean [] j = proxy.listAllJourneys();
			hs.setAttribute("listJourney", j);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error ---> in servlet { JourneyServlet } method{ ListJourney }");
			isSuccess = false;
		}
		return isSuccess;
	}
	public void showEdit(){
		
	}
	public void editJourney(){}
	public void showJourneyDetail(){}
	
	
	public boolean deleteJourney(HttpServletRequest request){
		String id = request.getParameter("j_id");
		int j_id = Integer.parseInt(id);
		boolean isSucces = true ;
		try {
			isSucces = proxy.cancelJourney(j_id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error ---> from { JourneyServlet } , method{ deleteJourney }");
			isSucces = false;
		}
		return isSucces;
	}
	
	

}
