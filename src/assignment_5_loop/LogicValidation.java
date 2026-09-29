package assignment_5_loop;

import java.util.Scanner;

public class LogicValidation {
	Scanner sc=new Scanner(System.in);
	public void Validate() {
		System.out.println("please enter the username");
		String username=sc.nextLine();
		System.out.println("please enter your password");
		String pass=sc.nextLine();
		if(username.equals("admin") && pass.equals("12345")) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Invalid logins");
		}
	}

}
