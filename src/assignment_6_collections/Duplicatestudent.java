package assignment_6_collections;

import java.util.HashSet;

public class Duplicatestudent {
	 int rollno;
	 String name;
	 String department;
	public Duplicatestudent(int rollno, String name, String department) {
		this.rollno = rollno;
		this.name = name;
		this.department = department;
	}
	public Duplicatestudent() {
	}
	@Override
	public boolean equals(Object obj) {
		Duplicatestudent ds=(Duplicatestudent) obj;
		
		return  this.rollno==ds.rollno;
	}
	@Override
	public int hashCode() {
		return Long.hashCode(rollno);
	}
	
	
	
	public void hashsets() {
		HashSet<Duplicatestudent> duplicate=new HashSet<Duplicatestudent>();
		duplicate.add(new Duplicatestudent(10,"shree","Biomedical"));
		duplicate.add(new Duplicatestudent(11,"krish","civil"));
		duplicate.add(new Duplicatestudent(12,"gayathri","mechanical"));
		duplicate.add(new Duplicatestudent(13,"ganesh","cse"));
		duplicate.add(new Duplicatestudent(13,"uma","eee"));
		for(Duplicatestudent d:duplicate) {
			System.out.println(d.name+" " +d.department+" "+d.rollno);
		}
		
		
		
		}
	public static void main(String[] args) {
		Duplicatestudent dup=new Duplicatestudent();
		dup.hashsets();
	}
	


}
