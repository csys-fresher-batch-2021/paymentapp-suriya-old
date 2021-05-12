package in.suriya.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.suriya.service.StaffService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobilenumber = request.getParameter("mobilenumber");
		String password = request.getParameter("password");
		boolean valid = StaffService.validater(mobilenumber, password);

		if (valid) {
			String message = "Successfully logged in";
			response.sendRedirect("login.jsp?infoMessage=" + message);
		} else {
			String message = "Invalid Login Credentials";
			response.sendRedirect("login.jsp?errorMessage=" + message);
		}
		
	}

	
	}

	


