package assignment_6_collections;

import java.util.ArrayList;

public class Studentmanagement {

	 String name;
	 int rollno;
	 int mark;
	 Studentmanagement(String name, int rollno, int mark) {
		this.name = name;
		this.rollno = rollno;
		this.mark = mark;
		
	}
	 Studentmanagement(){
		 
	 }
	 public  void stdmanage() {
			ArrayList<Studentmanagement> student=new ArrayList<Studentmanagement>();
			student.add(new Studentmanagement("shree",22,100));
			student.add(new Studentmanagement("kumar",24,95));
			student.add(new Studentmanagement("sai",30,90));
			student.add(new Studentmanagement("anu",35,89));
			student.add(new Studentmanagement("akash",40,85));
			Studentmanagement large=student.get(0);
			for(Studentmanagement s:student) {
				if(s.mark>large.mark) {
					large=s;
				}
			}
			
			System.out.println("the student who got highestmark "+large.mark+" and the student is "+large.name);
			
			
		}
	 public static void main(String[] args) {
		 Studentmanagement std=new Studentmanagement();
		 std.stdmanage();
		 
}
	 
	
	
	
	

}
