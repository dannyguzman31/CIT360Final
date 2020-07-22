<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="web.app.util.DBUtil" %>

<%
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	Connection con = DBUtil.getMySqlConnection();
	Statement st = con.createStatement();
	ResultSet rs;
	rs = st.executeQuery("select * from CUSTOMER where USER_NAME='"
			+ userName + "' and PASSWORD='" + password + "'");
	if (rs.next()) {
		session.setAttribute("userName", userName);
		response.sendRedirect("successlogin.jsp");
	} else {
		out.println("Invalid password <a href='index.html'>try again</a>");
	}
%>