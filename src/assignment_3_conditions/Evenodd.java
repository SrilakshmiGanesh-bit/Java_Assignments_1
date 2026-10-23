package assignment_3_conditions;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		// ternary operator
		System.out.println("The number is " + (num%2==0?"Even" : "Odd"));
		

	}

}
