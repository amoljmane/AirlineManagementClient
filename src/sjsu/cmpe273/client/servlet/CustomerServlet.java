package sjsu.cmpe273.client.servlet;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sjsu.cmpe273.client.util.DateFormatConverter;
import sjsu.cmpe273.project.beans.AirlineEmployeeBean;
import sjsu.cmpe273.project.beans.PersonBean;
import sjsu.cmpe273.project.beans.UserBean;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/PersonMng.jsp";
		HttpSession hs = request.getSession();
		String flag = request.getParameter("flag") == null ? "list" : request.getParameter("flag");
		if(flag.equals("list")){
			listAllCustomer(hs);
		}else if(flag.equals("showEdit")){
			
			url = showEdit(request, hs);
			
		}else if(flag.equals("deleteCustomer")){
			
			url = deleteCustomer(request);
			
		}else if(flag.equals("showACustomer")){
			
			System.out.println("show customer");
			UserBean[] customer = this.showACustomer(request);
			if(customer != null){
				hs.setAttribute("customer", customer[0]);
				url="admin/CustomerDetail.jsp";
			}else{
				url = "admin/adminManagement.jsp?message=showCustomerEorror";
			}
		}else if(flag.equals("editCustomer")){
			 url = editCustomer(request);
		}
		response.sendRedirect(url);
	}
	
	
	public String editCustomer(HttpServletRequest request){
		String url = "";
		try {
			if(proxy.updatePerson(formUserBean(request).getPerson())){
				url = "admin/adminManagement.jsp?message=editCustomer";
			}else{
				url = "admin/adminManagement.jsp?message=editCustomerError";
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error happen in method{ editCustomer }");
		}
		
		return url;
	}
	
	
	public String showEdit(HttpServletRequest request, HttpSession hs){
		String url = "";
		UserBean customer = this.findPersonByID(request, hs);
		if(customer != null){
			hs.setAttribute("customer", customer);
			url = "admin/editCustomer.jsp";
		}else{
			url = "admin/adminManagement.jsp?message=editCustomerShowError";
		}
		return url;
	}
	
	public String deleteCustomer(HttpServletRequest request){
		String id = request.getParameter("person_id");
		String url="";
		try {
			if(proxy.deleteEmployee(Integer.parseInt(id))){
				url = "admin/adminManagement.jsp?message=deleteCustomer";
			}else{
				url = "admin/adminManagement.jsp?message=deleteCustomerError";
			}
		} catch (RemoteException e) {
			e.printStackTrace();
			url = "admin/adminManagement.jsp?message=deleteCustomerError";
		}
		return url;
	}
	
	public UserBean[] showACustomer(HttpServletRequest request){
		String id = request.getParameter("person_id");
		String url = "";
		UserBean user = new  UserBean();
		PersonBean p = new PersonBean();
		p.setPerson_id(Integer.parseInt(id));
		user.setPerson(p);
		try {
			UserBean[] u = proxy.searchCustomer("person_id", user);
			System.out.println("UserBean ----" + u);
			return u;
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" Error --- show a customer failed ");
			return null;
		}
		
	}
	
	
	public void listAllCustomer(HttpSession hs){
		UserBean[] customers;
		try {
			customers = proxy.listAllCustomer();
			hs.setAttribute("allCustomers", customers);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public UserBean findPersonByID( HttpServletRequest request, HttpSession hs){
		UserBean[] employees = (UserBean[])hs.getAttribute("allCustomers");
		
		String pid = request.getParameter("person_id");
		System.out.println("pid--2-->"+ pid);
		int id = Integer.parseInt(pid);
		for(UserBean e :employees){
			if(e.getPerson().getPerson_id() == id){
				return e;
			}
		}
		return null;
	}
	
	public UserBean formUserBean(HttpServletRequest request){
		UserBean user = new UserBean();
		PersonBean person = new PersonBean();
		AirlineEmployeeBean emp = new AirlineEmployeeBean();
		
		int pid = Integer.parseInt(request.getParameter("person_id"));
		person.setPerson_id(pid);
		person.setAddress_line1(request.getParameter("address1"));
		person.setAddress_line2(request.getParameter("address1"));
		person.setCity(request.getParameter("city"));
		person.setCountry(request.getParameter("country"));
		person.setEmail_address(request.getParameter("email"));
		person.setFirst_name(request.getParameter("lastname"));
		person.setLast_name(request.getParameter("firstname"));
		person.setPerson_type(1);
		person.setState(request.getParameter("state"));
		person.setZip_code(request.getParameter("zipCode"));
		person.setPassport_number(request.getParameter("passport"));
		String birthday = DateFormatConverter.convertToMySqlDate(request.getParameter("birthday"),true);
		person.setDob(birthday);
		
		user.setPerson(person);
		
		emp.setSsn(Integer.parseInt(request.getParameter("ssn")));
		emp.setPerson_id(pid);
		user.setEmployeeBean(emp);
		
		return user ;
	}

}
