package assignment_5_loop;

public class Main {
	public static void main(String[] args) {
	Loopstdmarks stdresult=new Loopstdmarks();
	stdresult.marks();
	LogicValidation validates=new LogicValidation();
	validates.Validate();
	
	Final finals=new Final();
	System.out.println("pf for basic salary" );
	finals.pfcal();
	
	finals.basicsalary=25000;
	finals.pfcal();
	
	// static
	Student std1=new Student();
	System.out.println(std1.clgname);
	Student std2=new Student();
	System.out.println(std2.clgname);
	Student std3=new Student();
	System.out.println(std3.clgname);	
	
	// staticfinal
	Employee.highsalary();
	
	
	}
	
	//

}
