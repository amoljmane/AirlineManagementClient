package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sjsu.cmpe273.project.client.AirlineClient;

public class CancelJourneyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int journeyId = Integer.parseInt(request.getParameter("flightId"));
		 
		AirlineClient airlineClient = new AirlineClient();
		
		boolean isCancelled = airlineClient.cancelJourney(journeyId);
		
		String url = "/AdminPage.jsp";
		
		if (isCancelled) {
			request.setAttribute("cancelFlight", "Flight Cancelled Successfully!!");
		} else {
			request.setAttribute("cancelFlight", "Flight cannot be Cancelled!!");
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response); 
	}
}
