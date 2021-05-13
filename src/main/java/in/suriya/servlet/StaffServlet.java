package in.suriya.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.suriya.service.StaffService;

/**
 * Servlet implementation class StaffServlet
 */
@WebServlet("/StaffServlet")
public class StaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
		  String mobileNo =request.getParameter("mobilenumber");
		  String password = request.getParameter("password");
		  boolean valid = StaffService.staffValidater(mobileNo,password);

		  if (valid) {
			 String message = "Successfully logged in";
			 response.sendRedirect("login.jsp?infoMessage=" + message);
		  }else {
			  String message = "invalid Login Credentials";
			  response.sendRedirect("login.jsp?infoMessage=" + message);
			  
		  }
		}catch(Exception e) {
			
			String message = "Invalid mobile Number";
			response.sendRedirect("login.jsp?errorMessage=" + message);
			
		}
		
		
	}

	
	}

	


