package Operators;

import java.util.Scanner;

public class Operators {
	Scanner sc=new Scanner(System.in);
	/*
1. A student has scored 85 marks out of 100. Store the marks as int, but calculate the percentage as a double.
Question:
Write a Java program using type casting and arithmetic operators to calculate and display the percentage.
	 */
	void Percentages() {
	int mark=80;
	double percentage=(double) mark;
	System.out.println("Percentage:"+((percentage/100)*100));
	}
/*
	2. Product Price Calculation
	A product costs 999.50. The customer buys 3 products and receives a discount of 10%.
	Question:
	Write a Java program using type casting, arithmetic operators, and assignment operators to calculate the final price.
	 */
	void ProductpriceCalculation() {
		float costs=999.50f;
		// 
		System.out.println("enter the quantity of product:");
		int quantity=sc.nextInt();
		double discount=((costs*3)/100)*10;
		float discountvalue=(float) discount;
		if(quantity==3) {
			System.out.println("Total price is "+ ((costs*3)-discountvalue));			
		}
		else {
		System.out.println("Total price is "+(costs*quantity));
		}
		
	}
	/*
3.An employee's monthly salary is 25000. The company gives a 15% increment.

Question:
Write a Java program using arithmetic and relational operators to calculate the new salary and check whether the new salary is greater than 28000
	 */
	
	void Salarycalculator() {
		int salary=25000;
		double incrementsalary=((salary/100)*15)+salary;
		System.out.println(incrementsalary);
		System.out.println(incrementsalary>28000);
	}
	
	/*
	 * A user enters the value 25 as a double.

double value = 25.75;
Question:
Convert the double value into an int using explicit type casting and use the % operator to check whether the converted number is even or odd.


	 */
	void Numberconversion() {
		// using explicit type casting
		double value=25.75d;
		int intvalue=(int) value;
		System.out.println(intvalue%2==0);
		
		
	}
	void Drivingeligibility() {
		double age=21.5;
		int intage=(int) age;
		System.out.println((intage>=18 && intage<=60));
	}
	

}
