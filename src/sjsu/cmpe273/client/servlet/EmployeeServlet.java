package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		String flag = request.getParameter("flag") == null ? "list" : request.getParameter("flag");
		System.out.println("flag ---> " + flag);
		String url = "admin/EmployeeMng.jsp";
		

		UserBean employee = new UserBean();
		PersonBean person = new PersonBean();
		
		AirlineEmployeeBean employeeBean = new AirlineEmployeeBean();

		if (flag.equals("addEmployee")) {
			
			person = this.formUserBean(request).getPerson();
			
			employeeBean.setSsn(Integer.parseInt(request.getParameter("ssn")));
			employeeBean.setDesignation(2);

			employee.setPerson(person);
			employee.setEmployeeBean(employeeBean);

			/*
			 *  status 1 ---> add success
			 *  status 2 ---> error
			 *  status 3 ---> person existed but not employee, insert into employee
			 *  status 4 ---> employee existed
			 *  status 5 ---> unsuccess
			 */
			int status = proxy.createEmployee(employee);
			url = "admin/adminManagement.jsp?message="+status;

		} else if (flag.equals("editEmployee")) {
			
			PersonBean p = this.formUserBean(request).getPerson();
			
			if(proxy.updateEmployee(p)){
				url = "admin/adminManagement.jsp?message=edit";
			}else{
				url = "admin/adminManagement.jsp?message=editError";
			}
			System.out.println(url);
		} else if (flag.equals("deleteEmployee")) {
			String id = request.getParameter("employee_id");
			if(id == null) id="-1";
			int employee_id = Integer.parseInt(id);
			if (proxy.deleteEmployee(employee_id)) {
				url = "admin/adminManagement.jsp?message=delete";
			}else{
				url = "admin/adminManagement.jsp?message=deleteError";
			}

		} else if (flag.equals("searchEmployee")) {
			String searchType = request.getParameter("searchType");
			String keyWords = request.getParameter("keyWords");

			if (searchType.equals("email")) {
				person.setEmail_address(keyWords);
				employee.setPerson(person);
			}
			if (searchType.equals("ssn")) {
				int s = Integer.parseInt(keyWords);
				employeeBean.setSsn(s);
				employee.setEmployeeBean(employeeBean);
			}
			if (searchType.endsWith("passport")) {
				person.setPassport_number(keyWords);
				employee.setPerson(person);
			}
			UserBean[] employees = proxy.searchEmployee(searchType, employee);
			hs.removeAttribute("employees");
			hs.setAttribute("employees", employees);
			// url="admin/adminLogin?searchMessage=success";

		} else if(flag.equals("showAEmployee")){
				
			//hs.removeAttribute("employeeShowed");
			hs.setAttribute("employeeShowed", findPersonByID(request, hs));
			url = "admin/EmployeeDetail.jsp";
			
		}else if(flag.equals("showEdit")){
			
			//hs.removeAttribute("employeeShowed");
			hs.setAttribute("employeeShowed", findPersonByID( request, hs));
			url = "admin/edit.jsp";
			
		}else if (flag.equals("list")) {

			UserBean[] employees = proxy.listAllEmployees();
			hs.setAttribute("employees", employees);
		}
		response.sendRedirect(url);
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
		person.setPerson_type(2);
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
	
	public UserBean findPersonByID( HttpServletRequest request, HttpSession hs){
		UserBean[] employees = (UserBean[])hs.getAttribute("employees");
		
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

}
