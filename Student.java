package Test_java;

public class Student {
	int stdid;
	String stdname;
	double marks;
	public Student(int stdid,String stdname,double marks) {
		this.stdid=stdid;
		this.stdname=stdname;
		this.marks=marks;
	}
	
	public static void main(String[] args) {
		Student std=new Student(1,"shree",96.8);
		System.out.println("The Student id is "+std.stdid+" student name is "+std.stdname+" student mark is "+std.marks);
		
	}

}
