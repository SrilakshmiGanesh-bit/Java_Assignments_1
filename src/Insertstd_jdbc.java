package Test_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class Insertstd_jdbc {
	Connection con=DBconnection.connections();
	Scanner sc=new Scanner(System.in);
	String createtable="create table if not exists stddatas("
			+ "stdid int primary key,"
			+ "stdname varchar(100),"
			+ "stdmark double,"
			+ "course varchar(100));";
	
	public void createtable() {
		try {
			Statement st=con.createStatement();
			st.executeUpdate(createtable);
			System.out.println("table created");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	String insertdata="insert into stddatas(stdid,stdname,stdmark,course) values(?,?,?,?)";
	
	public void insertabledata() {
		try {
			System.out.println("enter the std id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter std name");
			String name=sc.nextLine();
			System.out.println("Enter the stdmark");
			double mark=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the course");
			String course=sc.nextLine();
			try {
				PreparedStatement ps=con.prepareStatement(insertdata);
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setDouble(3, mark);
				ps.setString(4, course);
				
				int row=ps.executeUpdate();
				if(row==1) {
					System.out.println("Std data inserted successfully");
				}
				
				else {
					System.out.println("failed to insert std data");
				}
				
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
