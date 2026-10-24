package Test_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	static String url="jdbc:mysql://localhost:3306/stddata";
	static String username="root";
	static String password="shree";
	
	public static Connection connections() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,username,password);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}

}
