package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	static String url="jdbc:mysql://localhost:3306/emp";
	static String username="root";
	static String password="shree";
	
	
	public static  Connection  dbconnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		conn= DriverManager.getConnection(url, username, password);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("class no found error"+ e.getMessage());
		}
		return conn;
	}
}
