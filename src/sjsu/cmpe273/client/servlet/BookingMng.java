package sjsu.cmpe273.client.servlet;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.project.beans.BookingDetailBean;
import sjsu.cmpe273.project.beans.ReservationLists;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

/**
 * Servlet implementation class BookingMng
 */
public class BookingMng extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/PersonMng.jsp";
		HttpSession hs = request.getSession();
		String flag = request.getParameter("flag") == null ? "list" : request.getParameter("flag");
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
		//proxy.setEndpoint("");
		
		try{
			if(flag.equals("list")){
				ReservationLists rl = listBooking(proxy);
				request.setAttribute("list", rl);
				if (rl != null) {
					url = "admin/adminManagement.jsp?message=BookingListed";
				}else {
					url = "admin/adminManagement.jsp?message=BookingListedError";
				}
			}else if(flag.equals("cancelBooking")){
				int bookingID = Integer.parseInt(request.getParameter("bookingID"));
				boolean cancelled = cancelBooking(proxy,bookingID);
				request.setAttribute("cancel", cancelled);
				if (cancelled) {
					url = "admin/adminManagement.jsp?message=BookingCancelled";
				}else{
					url = "admin/adminManagement.jsp?message=BookingCancelledError";
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			url = "admin/adminManagement.jsp?message=CancelOrListingBookingError";
		}
		
		response.sendRedirect(url);
	}
	
	// list all booking
	public ReservationLists listBooking(AirlineManagementServiceProxy proxy) throws RemoteException{
		return proxy.listAllReservation();
	}
	
	// cancel booking
	public boolean cancelBooking(AirlineManagementServiceProxy proxy, int bookingID) throws RemoteException{
		return proxy.cancelBooking(bookingID);
	}

}
