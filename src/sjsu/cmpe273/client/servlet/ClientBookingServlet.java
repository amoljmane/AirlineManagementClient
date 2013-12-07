package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.beans.PersonBean;
import sjsu.cmpe273.project.beans.TravelerBean;
import sjsu.cmpe273.project.beans.UserBean;

/**
 * Servlet implementation class ClientBookingServlet
 */
public class ClientBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientBookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int journey_id = Integer.parseInt(request.getParameter("journey_id"));
		float price = Float.parseFloat(request.getParameter("price"));
		PersonBean person = new PersonBean();
		person.setAddress_line1(request.getParameter("address1"));
		person.setAddress_line2(request.getParameter("address2"));
		person.setCity(request.getParameter("city"));
		person.setCountry(request.getParameter("country"));
		person.setEmail_address(request.getParameter("email"));
		person.setFirst_name(request.getParameter("firstname"));
		person.setLast_name(request.getParameter("lastname"));
		person.setPassport_number(request.getParameter("passport"));
		person.setState(request.getParameter("state"));
		person.setZip_code(request.getParameter("zipcode"));
		
		TravelerBean travelerBean = new TravelerBean();
		travelerBean.setSsn(Integer.parseInt(request.getParameter("ssn")));
		
		JourneyDetailBean journey = new JourneyDetailBean();
		
		journey.setTicket_price(price);
		journey.setJourney_id(journey_id);
		
		UserBean user = new UserBean();
		user.setPerson(person);
		user.setTraveler(travelerBean);
		
		request.setAttribute("person", user);
		request.setAttribute("journey", journey);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("client/payment.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
