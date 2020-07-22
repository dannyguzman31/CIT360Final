/*
 *  Project by : Daniel Guzman
 *  Date: June 22, 2020 
 *  Class: CIT 360 Final Project 
 *  NOTES: 
 *  This class its my controller class, here I am collecting the data from
 *  the user and storing that data by calling my UserDAO class and addUserDetails method,
 *  if the insertion is successful, it will be forward to the success.java class 
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String f_Name = request.getParameter("f_Name");
		String l_Name = request.getParameter("l_Name");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password1");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String question = request.getParameter("question");

		HttpSession session = request.getSession(true);
		try {
			UserDAO userDAO = new UserDAO();
			
			
			userDAO.addUserDetails(f_Name, l_Name, userName, password, email, phone, question);
			
			response.sendRedirect("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
