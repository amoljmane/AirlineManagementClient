package sjsu.cmpe273.client.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String flag = request.getParameter("flag") == null ? "list" : request
				.getParameter("flag");
		System.out.println("flag ---> " + flag);
		String url = "admin/EmployeeMng.jsp";
		String ssn = request.getParameter("ssn");
		int userSsn = -1;
		if (ssn != null) {
			userSsn = Integer.parseInt(ssn);
		}

		UserBean employee = new UserBean();
		PersonBean person = new PersonBean();
		AirlineEmployeeBean employeeBean = new AirlineEmployeeBean();

		if (flag.equals("addEmployee")) {
			person.setAddress_line1(request.getParameter("address1"));
			person.setAddress_line2(request.getParameter("address1"));
			person.setCity(request.getParameter("city"));
			person.setCounrty(request.getParameter("country"));
			person.setEmail_address(request.getParameter("email"));
			person.setFirst_name(request.getParameter("lastname"));
			person.setLast_name(request.getParameter("firstname"));
			person.setPerson_type(2);
			person.setState(request.getParameter("state"));
			person.setZip_code(request.getParameter("zipCode"));
			person.setPassport_number(request.getParameter("passport"));

			employeeBean.setSsn(Integer.parseInt(request.getParameter("ssn")));
			employeeBean.setDesignation(2);

			employee.setPerson(person);
			employee.setEmployeeBean(employeeBean);

			int status = proxy.createEmployee(employee);
			if (status == 1) {
				url = "admin/adminManagement.jsp?addMessage=success";
			} else if (status == 2) {
				url = "admin/adminManagement.jsp?addMessage=error{2}";
			} else if (status == 3) {
				url = "admin/adminManagement.jsp?addMessage=success1";
			} else if (status == 4) {
				url = "admin/adminManagement.jsp?addMessage=emplyExisted";
			} else {
				url = "admin/adminManagement.jsp?addMessage=unsuccess";
			}

		} else if (flag.equals("editEmployee")) {

			url = "admin/adminManagement.jsp?editMessage=success";

		} else if (flag.equals("deleteEmployee")) {

			if (proxy.deleteEmployee(userSsn)) {
				url = "admin/adminManagement.jsp?deleteMessage=success";
			}

		} else if (flag.equals("searchEmployee")) {
			String searchType = request.getParameter("searchType");
			// System.out.println("searchType ---> "+searchType);
			String keyWords = request.getParameter("keyWords");
			// System.out.println("keyWords ---> "+keyWords);

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

		} else if (flag.equals("list")) {

			UserBean[] employees = proxy.listAllEmployees();
			hs.setAttribute("employees", employees);
		}
		response.sendRedirect(url);
	}

}
