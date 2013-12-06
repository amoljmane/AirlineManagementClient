package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.client.util.DateFormatConverter;
import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

/**
 * Servlet implementation class searchFlightServlet
 */
public class SearchFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String to = request.getParameter("to");
		String from = request.getParameter("from");
		String departure_time = DateFormatConverter.convertToMySqlDate(request.getParameter("time"),false);
		System.out.println(" search flights!");
		String url = "";
		JourneyDetailBean journey = new JourneyDetailBean();
		JourneyDetailBean[] journeys = proxy.searchJourneys(to, from, departure_time);
		if(journeys != null){
			HttpSession hs = request.getSession();
			hs.setAttribute("journeys", journeys);
			url = "client/client.jsp";
		}else{
			url = "client/client.jsp?errorMessage=NoFlights";
		}
		response.sendRedirect(url);
	}
}
