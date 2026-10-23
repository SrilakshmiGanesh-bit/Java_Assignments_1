package assignment_6_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentsearch {
	 int rollno;
	 String name;
	 String department;
	public Studentsearch(int rollno, String name, String department) {
		this.rollno = rollno;
		this.name = name;
		this.department = department;
	}
	public Studentsearch() {
		
	}
	
	
	

Scanner sc=new Scanner(System.in);
	
	
	public void search() {
		ArrayList<Studentsearch> student=new ArrayList<Studentsearch>();
		student.add(new Studentsearch(10,"shree","Biomedical"));
		student.add(new Studentsearch(11,"krish","civil"));
		student.add(new Studentsearch(12,"gayathri","mechanical"));
		student.add(new Studentsearch(13,"ganesh","cse"));
		student.add(new Studentsearch(13,"uma","eee"));
		 
		 System.out.println("enter student roll num:");
		int roll=sc.nextInt();
		for(Studentsearch s:student) {
			if(s.rollno==roll) {
				System.out.println("the Student with roll no "+s.rollno+" is "+s.name);
			}
		}
		
		
	
	}
	public static void main(String[] args) {
		Studentsearch std=new Studentsearch();
		std.search();
	}
}
