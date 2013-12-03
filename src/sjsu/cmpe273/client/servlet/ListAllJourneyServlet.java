package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.client.AirlineClient;

public class ListAllJourneyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JourneyDetailBean journeyList[] = null;
		
		AirlineClient airlineClient = new AirlineClient();
		
		journeyList = airlineClient.listAllJourneys();
		
		String url = null;
		if(journeyList == null) {
			
		} else {
			request.setAttribute("Journeys", journeyList);
			url = "/ListAllJourney.jsp";
//			url = "/AdminPage.jsp";
		}
//		System.out.println("Here I am");
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
