/*
 *  Project by : Daniel Guzman
 *  Date: June 22, 2020 
 *  Class: CIT 360 Final Project 
 *  NOTES:
 *  	Created this class to create a new connection to mySQL 
 */

package web.app.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUtil {
	public static Connection getMySqlConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/Bank", "root", "");
		return con;
	}

	public static void cleanUp(Statement st, Connection con) {
		try {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
