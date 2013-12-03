package sjsu.cmpe273.client.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.beans.MonthsBean;
import sjsu.cmpe273.project.client.AirlineClient;

public class EditJourneyFlight extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int journeyId = Integer.parseInt(request.getParameter("flightId"));
		JourneyDetailBean journeyDetailBean = null;
		
		JourneyDetailBean journeyList[] = new JourneyDetailBean[1];
		
		AirlineClient airlineClient = new AirlineClient();
		
		journeyDetailBean = airlineClient.journeyDetail(journeyId);
		
		journeyList[0] = journeyDetailBean;
		
		request.setAttribute("Journeys", journeyList);
		
		
		List<MonthsBean> monthsList = new ArrayList<>();
		monthsList.add(new MonthsBean("01", "Jan"));
		monthsList.add(new MonthsBean("02", "Feb"));
		monthsList.add(new MonthsBean("03", "Mar"));
		monthsList.add(new MonthsBean("04", "Apr"));
		monthsList.add(new MonthsBean("05", "May"));
		monthsList.add(new MonthsBean("06", "Jun"));
		monthsList.add(new MonthsBean("07", "Jul"));
		monthsList.add(new MonthsBean("08", "Aug"));	
		monthsList.add(new MonthsBean("09", "Sep"));
		monthsList.add(new MonthsBean("10", "Oct"));
		monthsList.add(new MonthsBean("11", "Nov"));
		monthsList.add(new MonthsBean("12", "Dec"));
		
		List<String> days = new ArrayList<>();
		for (int day = 1; day <= 31; day++) {
			if(day < 10){
				days.add("0" + day);
			} else {
				days.add(day + "");
			}
		}
		
		List<String> hours = new ArrayList<>();
		for (int hour = 0; hour < 24; hour++) {
			if(hour < 10){
				hours.add("0" + hour);
			} else {
				hours.add(hour + "");
			}
		}
		
		List<String> minutes = new ArrayList<>();
		for (int minute = 0; minute < 60; minute++) {
			if(minute < 10) {
				minutes.add("0" + minute);
			} else {
				minutes.add(minute + "");
			}
		}
		
		request.getSession().setAttribute("Months", monthsList);
		request.getSession().setAttribute("Days", days);
		request.getSession().setAttribute("Hours", hours);
		request.getSession().setAttribute("Minutes", minutes);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/EditFlight.jsp");
		dispatcher.forward(request, response);
	}
}
