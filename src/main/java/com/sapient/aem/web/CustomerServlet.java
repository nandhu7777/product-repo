package com.sapient.aem.web;



import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.sapient.aem.exception.CustomerException;
import com.sapient.aem.model.Customer;
import com.sapient.aem.service.CustomerService;
import com.sapient.aem.service.CustomerServiceImpl;



@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService customerservice= new CustomerServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();

		try {
			Integer customerNo = Integer.parseInt(request.getParameter("customerNo"));

			Customer customer= customerservice.getCustomerById(customerNo);

			if(customer != null) {

				request.setAttribute("customer", customer);
				request.getRequestDispatcher("WEB-INF/views/all-cutomer-list.jsp")
				.include(request, response);
			} else {
				out.println("<html><body><h2>"+"Something wrong!"+"</h2></body></html>");

			}
		} catch (CustomerException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}



}