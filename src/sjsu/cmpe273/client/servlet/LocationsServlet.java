package sjsu.cmpe273.client.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.project.beans.LocationsBean;
import sjsu.cmpe273.project.beans.MonthsBean;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

/**
 * Servlet implementation class LocationsServlet
 */
public class LocationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocationsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("11111111111111111");
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
		LocationsBean [] locations = proxy.listAllLocations();
		System.out.println(locations[0].getAddress());
		
		

		List<MonthsBean> monthsList = new ArrayList<MonthsBean>();
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
		
		/*List<Integer> days = new ArrayList<>();
		for (int day = 1; day <= 31; day++) {
			days.add(day);
		}*/
		
		List<String> days = new ArrayList<String>();
		for (int day = 1; day <= 31; day++) {
			if(day < 10){
				days.add("0" + day);
			} else {
				days.add(day + "");
			}
		}
		
		/*List<Integer> hours = new ArrayList<>();
		for (int hour = 0; hour < 24; hour++) {
			hours.add(hour);
		}*/
		
		
		List<String> hours = new ArrayList<String>();
		for (int hour = 0; hour < 24; hour++) {
			if(hour < 10){
				hours.add("0" + hour);
			} else {
				hours.add(hour + "");
			}
		}
		
		/*List<Integer> minutes = new ArrayList<>();
		for (int minute = 0; minute < 60; minute++) {
			minutes.add(minute);
		}*/
		
		List<String> minutes = new ArrayList<String>();
		for (int minute = 0; minute < 60; minute++) {
			if(minute < 10) {
				minutes.add("0" + minute);
			} else {
				minutes.add(minute + "");
			}
		}
		
		HttpSession hs = request.getSession();
		hs.setAttribute("locations", locations);
		
		request.getSession().setAttribute("Months", monthsList);
		request.getSession().setAttribute("Days", days);
		request.getSession().setAttribute("Hours", hours);
		request.getSession().setAttribute("Minutes", minutes);
		
		
		
		response.sendRedirect("client/client.jsp");
//		RequestDispatcher dispatcher = request.getRequestDispatcher();
//		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
