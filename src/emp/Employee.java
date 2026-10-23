package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {

    Connection conn = Dbconnection.dbconnection();
    Scanner sc = new Scanner(System.in); 
    public void empregister() {
    	System.out.println("______________________Employeee registration______________________");
    	empinsert();
    	System.out.println("______________________Registration successfull______________________");
    }
    String login="select * from emptable where empid=? and  emppassword=?";
    public boolean login() {
    	
    	System.out.println();
    	 if (conn == null) {
             System.out.println("Database connection failed");
             return false;
         }
    	 System.out.println("Enter your employee ID:");
    	 int empid = sc.nextInt();
    	 sc.nextLine();

    	 System.out.println("Enter your password:");
    	 String emppassword = sc.nextLine();
    	 try (PreparedStatement ps = conn.prepareStatement(login)) {
    		    ps.setInt(1, empid);
    		    ps.setString(2, emppassword);
    		    try (ResultSet rs = ps.executeQuery()) {
    		        if (rs.next()) {
    		            System.out.println("Login successful!");
    		            return true;
    		        } else {
    		            System.out.println("Invalid employee ID or password");
    		            return false;
    		        }
    		    }
    		}catch(SQLException e) {
    			System.out.println(e.getMessage());
    			return false;
    		}
    	
    }
    
    
    String tablecreation =
        "CREATE TABLE IF NOT EXISTS emptable (" +
        "empid INT PRIMARY KEY, " +
        "empname VARCHAR(50), " +
        "empsalary DOUBLE, " +
        "empshifttime VARCHAR(50), " +
        "emppassword VARCHAR(10))";

    public void emptablecreation() {
        if (conn == null) {
            System.out.println("Database connection failed");
            return;
        }

        try (Statement st = conn.createStatement()) {
            st.executeUpdate(tablecreation);
            System.out.println("Table is ready");

        } catch (SQLException e) {
            System.out.println("Table error: " + e.getMessage());
        }
    }

    String insert =
        "INSERT INTO emptable " +
        "(empid, empname, empsalary, empshifttime, emppassword) " +
        "VALUES (?, ?, ?, ?, ?)";

    public void empinsert() {
        if (conn == null) {
            System.out.println("Database connection failed");
            return;
        }

        try {
            System.out.println("Enter your emp ID:");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter your emp name:");
            String empname = sc.nextLine();

            System.out.println("Enter your emp salary:");
            double empsalary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter your emp shift:");
            String empshifttime = sc.nextLine();

            System.out.println("Enter your emp password:");
            String emppassword = sc.nextLine();

            try (PreparedStatement ps = conn.prepareStatement(insert)) {
                ps.setInt(1, empid);
                ps.setString(2, empname);
                ps.setDouble(3, empsalary);
                ps.setString(4, empshifttime);
                ps.setString(5, emppassword);

                int row = ps.executeUpdate();

                if (row == 1) {
                    System.out.println("Data stored successfully");
                } else {
                    System.out.println("Data not stored");
                }
            }

        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter the correct data type.");
            sc.nextLine();
        }
    }

    String display = "SELECT * FROM emptable";

    public void Displayall() {
        if (conn == null) {
            System.out.println("Database connection failed");
            return;
        }

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(display)) {

            boolean found = false;

            while (rs.next()) {
                found = true;

                System.out.println(
                    "Emp ID: " + rs.getInt("empid") +
                    ", Emp Name: " + rs.getString("empname") +
                    ", Emp Salary: " + rs.getDouble("empsalary") +
                    ", Emp Shift: " + rs.getString("empshifttime")
                );
            }

            if (!found) {
                System.out.println("No employee records found");
            }

        } catch (SQLException e) {
            System.out.println("Display error: " + e.getMessage());
        }
    }

    String displayone = "SELECT * FROM emptable WHERE empid = ?";

    public void displayid() {
        if (conn == null) {
            System.out.println("Database connection failed");
            return;
        }

        try {
            System.out.println("Enter your search ID:");
            int empid = sc.nextInt();

            try (PreparedStatement ps = conn.prepareStatement(displayone)) {
                ps.setInt(1, empid);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        System.out.println(
                            "Emp ID: " + rs.getInt("empid") +
                            ", Emp Name: " + rs.getString("empname") +
                            ", Emp Salary: " + rs.getDouble("empsalary") +
                            ", Emp Shift: " + rs.getString("empshifttime")
                        );
                    } else {
                        System.out.println("Employee ID not found");
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("Search error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid numeric employee ID");
            sc.nextLine();
        }
    }
		String updateemp="update emptable set empid=?,empname=?,empsalary=?,empshifttime=?, emppassword=?"+
	"where empid=?";
		public void updateemp() {
			try {
				System.out.println("enter your old emp id to update");
				int oldempid=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your new emp id");
				int newempid=sc.nextInt();
				sc.nextLine();
				System.out.println("enter your empname");
				String empname=sc.nextLine();
				System.out.println("enter your empsalary");
				double empsalary=sc.nextDouble();
				sc.nextLine();
				System.out.println("enter your shift time");
				String empshifttime=sc.nextLine();
				System.out.println("enter your password");
				String emppassword=sc.nextLine();
				PreparedStatement ps=conn.prepareStatement(updateemp);
				ps.setInt(1,newempid);
				ps.setString(2, empname);
				ps.setDouble(3, empsalary);
				ps.setString(4, empshifttime);
				ps.setString(5, emppassword);
				ps.setInt(6, oldempid);
				int row =ps.executeUpdate();
				if(row==1) {
					System.out.println("data is updated");
					
				}
				else {
					System.out.println("data is not updated");
				}
			}catch(SQLException e) {
			System.out.println(e.getMessage());
			}
		}
		String deleteemp="delete from emptable where empid=?";
		public void deleteempdata() {
			try {
				System.out.println("enter your empid to delete");
				int empid=sc.nextInt();
				PreparedStatement ps=conn.prepareStatement(deleteemp);
				ps.setInt(1, empid);
				int row =ps.executeUpdate();
				if(row==1) {
					System.out.println("Data is deleted");
				}
				else {
					System.out.println("data is not updated");
				}
				
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}		
	}
		

