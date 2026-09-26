package assignment_3_conditions;

import java.util.Scanner;

public class Gradecalculation {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks");
		int mark=sc.nextInt();
		if(mark>=90 && mark<=100) {
			System.out.println("A Grade");
		}
		else if(mark>=75 && mark<=89) {
			System.out.println("B Grade");
		}
		else if(mark>=50 && mark<=74) {
			System.out.println("C Grade");
		}
		else if(mark>=40 && mark<=49) {
			System.out.println("D Grade");
		}
		else if(mark<40 ) {
			System.out.println("Fail");
		}
	}

}
