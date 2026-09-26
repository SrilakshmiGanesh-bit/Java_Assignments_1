package assignment_3_conditions;

import java.util.Scanner;

public class Voting_Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age please");
		int age=sc.nextInt();
		System.out.println((age>=18?"Eligible to Vote":"Not Eligible"));
		

	}

}
