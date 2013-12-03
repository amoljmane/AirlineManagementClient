package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.client.AirlineClient;

public class AddJourneyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		JourneyDetailBean journeyDetailBean = new JourneyDetailBean();
		String depatureTime = (String) request.getParameter("departureTimestamp");
		depatureTime = depatureTime + ":00";
		String arrivalTime = (String) request.getParameter("destinationTimestamp");
		arrivalTime = arrivalTime + ":00";
		journeyDetailBean.setArrival_time(arrivalTime);
		journeyDetailBean.setDeparture_time(depatureTime);
		journeyDetailBean.setFlight_source(Integer.parseInt(request.getParameter("departureId")));
		journeyDetailBean.setFlight_destination(Integer.parseInt(request.getParameter("destinationId")));
		journeyDetailBean.setSeats_available(Integer.parseInt(request.getParameter("seatsAvailable")));
		journeyDetailBean.setFlight_id(Integer.parseInt(request.getParameter("flightId")));

		boolean isAdded = false;
		boolean isDuplicate = false;

		String url = null;
		AirlineClient client = new AirlineClient();

		isDuplicate = client.checkDuplicateFlight(journeyDetailBean);

		if (!isDuplicate) {
			isAdded = client.scheduleFlight(journeyDetailBean);
		} else {
			request.setAttribute("DuplicateFlight", "This flight is not available! Try again!!");
		}
		
		if (isAdded) {
			request.setAttribute("FlightAdded", "Flight Added succesfully!!");
			url = "/AdminPage.jsp";
		} else {
			url = "/Journey.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
