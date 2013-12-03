package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.client.AirlineClient;

public class UpdateJourneyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JourneyDetailBean journeyDetailBean = new JourneyDetailBean();
		String depatureTime = (String) request.getParameter("departureTimestamp");
		depatureTime = depatureTime + ":00";
		String arrivalTime = (String) request.getParameter("destinationTimestamp");
		arrivalTime = arrivalTime + ":00";
		
//		System.out.println(depatureTime + "  " + arrivalTime);
		
		int flightId = Integer.parseInt(request.getParameter("flightId"));
//		System.out.println("Flight Id " + flightId);
		AirlineClient airlineClient = new AirlineClient();
		journeyDetailBean = airlineClient.journeyDetail(flightId);
		
		journeyDetailBean.setArrival_time(arrivalTime);
		journeyDetailBean.setDeparture_time(depatureTime);
		
		boolean isDuplicate = airlineClient.checkDuplicateFlight(journeyDetailBean);
		boolean isInserted = true;
		String url = null;
		System.out.println(isDuplicate);
		if(!isDuplicate){
			isInserted = airlineClient.updatejourney(journeyDetailBean);
		}  
		
		if(isInserted){
			url ="/AdminPage.jsp";
			request.setAttribute("updateStatus", "Flight updated successfully!!!");
		} else {
			url ="/AdminPage.jsp";
			request.setAttribute("updateStatus", "Flight is not updated successfully!!!");
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response); 
	}
}
