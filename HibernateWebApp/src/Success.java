
/*
 *  Project by : Daniel Guzman
 *  Date: June 22, 2020 
 *  Class: CIT 360 Final Project 
 *  NOTES: 
 *  This class is call once the user has submitted a registration info
 *  it displays a message in html with a link to return to the log in page. 
 */


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		writer.println("<html>" + "<body bgcolor='#FFF3E8'>" + "<center>"
				+ "Thank you for creating an account with us!" +  "</center>" + "</body>" +
				"  <a href=\"index.html\">Continue to log in</a>  "
				+ "</html>");
		
	}

}
