package assignment_3_conditions;

import java.util.Scanner;

public class Largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num 1");
		int n1=sc.nextInt();
		System.out.println("Enter num 2");
		int n2=sc.nextInt();
		System.out.println("The largest number is "+ (n1>n2?n1:n2));
	}

}
