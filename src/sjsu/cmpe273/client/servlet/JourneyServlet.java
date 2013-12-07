package sjsu.cmpe273.client.servlet;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.client.util.DateFormatConverter;
import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.beans.PassengerBean;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

/**
 * Servlet implementation class JourneyServlet
 */
public class JourneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		String url = "admin/adminManagement.jsp";
		String flag = request.getParameter("flag") == null ? "list" : request
				.getParameter("flag");
		System.out.println("flag ---> " + flag);

		if (flag.equals("list")) {
			if (!ListJourney(hs)) {
				url = "admin/adminManagement.jsp?message=listError";
			} else {
				url = "admin/JourneyMng.jsp";
			}
		} else if (flag.equals("showEdit")) {
			if (showEdit(request)) {
				url = "admin/editJourney.jsp";
			} else {
				url = "admin/adminManagement.jsp?message=showEditDetailError";
			}

		} else if (flag.equals("edit")) {
			if (editJourney(request)) {
				url = "admin/adminManagement.jsp?message=editJourneySuccessful";
			} else {
				url = "admin/adminManagement.jsp?message=editJourneyError";
			}

		} else if (flag.equals("showAJourneyDetail")) {

			if (showJourneyDetail(request)) {
				url = "admin/JourneyInfor.jsp";
			} else {
				url = "admin/adminManagement.jsp?message=showAJourneyDetailError";
			}

		} else if (flag.equals("deleteJourney")) {
			if (this.deleteJourney(request)) {
				url = "admin/adminManagement.jsp?message=deleteJourney";
			} else {
				url = "admin/adminManagement.jsp?message=deleteJourneyError";
			}
		}

		response.sendRedirect(url);
		// RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		// dispatcher.forward(request, response);
	}

	public boolean ListJourney(HttpSession hs) {
		boolean isSuccess = true;
		try {
			JourneyDetailBean[] j = proxy.listAllJourneys();
			// System.err.println("JourneyDetailBean--->"+j[0].getArrival_time());
			hs.setAttribute("listJourney", j);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error ---> in servlet { JourneyServlet } method{ ListJourney }");
			isSuccess = false;
		}
		return isSuccess;
	}

	public boolean showEdit(HttpServletRequest request) {
		int j_id = Integer.parseInt(request.getParameter("j_id"));
		boolean isSuccess = true;
		try {
			JourneyDetailBean journey = proxy.journeyDetail(j_id);
			HttpSession hs = request.getSession();
			hs.setAttribute("journey", journey);
		} catch (RemoteException e) {

			e.printStackTrace();
			System.out
					.println("erroor in servlet [JourneyServlet] , method { showEdit }");
			isSuccess = false;
		}
		return isSuccess;
	}

	public boolean editJourney(HttpServletRequest request) {
		String id = request.getParameter("j_id");
		String flightName = request.getParameter("flight");
		String departureAir = request.getParameter("from");
		String arrivalAir = request.getParameter("to");
		String departureTime = request.getParameter("departureT");
		String departureHour = request.getParameter("departureHour");
		String departureMin = request.getParameter("departureMinute");
		String arrivalTime = request.getParameter("arrivalT");
		String arrivalHour = request.getParameter("arrivalHour");
		String arrivalMin = request.getParameter("arrivalMinute");
		String price = request.getParameter("price");

		boolean isSuccess = true;

		if (!(departureAir.equals(arrivalAir) || departureHour.equals("-1")
				|| departureMin.equals("-1") || arrivalTime.equals("-1") || arrivalHour
				.equals("-1"))) {

			JourneyDetailBean j = new JourneyDetailBean();
			j.setJourney_id(Integer.parseInt(id));
			j.setFlight_name(flightName);
			j.setFlight_source(Integer.parseInt(departureAir));
			j.setFlight_destination(Integer.parseInt(arrivalAir));
			String d_time = DateFormatConverter.convertToMySqlDate(
					departureTime, false)
					+ " "
					+ departureHour
					+ ":"
					+ departureMin + ":00";
			String a_time = DateFormatConverter.convertToMySqlDate(arrivalTime,
					false) + " " + arrivalHour + ":" + arrivalMin + ":00";

			j.setDeparture_time(d_time);
			j.setArrival_time(a_time);
			j.setJourney_id(Integer.parseInt(id));

			try {
				/*
				 * JourneyDetailBean journey = proxy.journeyDetail(Integer
				 * .parseInt(id));
				 */
				isSuccess = proxy.updatejourney(j);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error in Servlet{ JourneyServlet} , method{ editJourney }");
				isSuccess = false;
			}
		}
		return isSuccess;
	}

	public boolean deleteJourney(HttpServletRequest request) {
		String id = request.getParameter("j_id");
		int j_id = Integer.parseInt(id);
		boolean isSucces = true;
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

	/*
	 * --------- Dec 7th------
	 */
	// shibai
	public boolean showJourneyDetail(HttpServletRequest request) {
		boolean flag = true;
		int journey_id = Integer.parseInt(request.getParameter("j_id"));
		JourneyDetailBean journey = null;
		try {
			journey = proxy.journeyDetail(journey_id);
			PassengerBean passengerBean = proxy.passengerOnBoard(journey);
			if (journey != null) {

				request.getSession().setAttribute("journey", journey);
				request.getSession().setAttribute("passengerBean",passengerBean);
				// request.setAttribute("journey", journey);
				// request.setAttribute("passengerBean", passengerBean);
				flag = true;
			} else {
				flag = false;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error - in servlet{ JourneyServlet} , method{ showJourneyDetail } ");
			flag = false;
		}
		return flag;
	}
	/*
	 * ------- end -----
	 */

}
