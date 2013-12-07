package sjsu.cmpe273.client.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.beans.PaymentDetailsBean;
import sjsu.cmpe273.project.beans.PersonBean;
import sjsu.cmpe273.project.beans.UserBean;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

/**
 * Servlet implementation class PaymentServlet
 */
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request ,response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PersonBean person =(PersonBean) request.getAttribute("person");
//		JourneyDetailBean journey = (JourneyDetailBean)request.getAttribute("journey");
		String url = "";
		HttpSession hs = request.getSession();
		JourneyDetailBean journey  =(JourneyDetailBean) hs.getAttribute("journey");
		UserBean person =(UserBean) hs.getAttribute("person");
		System.out.println("price --->"+journey.getTicket_price());
		System.out.println("is Person -- >" + person.getPerson().getAddress_line1());
		
		String paymentMethod = request.getParameter("paymentMethod");
//		String firstname = request.getParameter("firstname");
//		String lastname = request.getParameter("lastname");
		String cardnumber = request.getParameter("cardnumber");
		String csv = request.getParameter("csv");
		
		PaymentDetailsBean payment = new PaymentDetailsBean();
		payment.setAccount_number(0);
		payment.setAmount_paid((int)journey.getTicket_price());
		payment.setCard_number(Long.parseLong(cardnumber));
		payment.setPayment_method(4);

		UserBean[] users = new UserBean[1];
		users[0] = person;
		
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
		try {
			proxy.createBooking(journey, users, payment);
			hs.removeAttribute("journey");
			hs.removeAttribute("person");
			url="client/errorPage.jsp?message=success";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(" error on createBooking ");
			url="client/errorPage.jsp?message=error";
		}
		
		response.sendRedirect(url);
	}

}
