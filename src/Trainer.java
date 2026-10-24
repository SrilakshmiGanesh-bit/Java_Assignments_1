package Test_java;

public class Trainer extends Employee{// inherited
	@Override // method over riding
	public void salary() {
		int salary=50000;
		super.salary();
		System.out.println("Trainner trains the employee and the salary is "+salary);
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t=new Trainer();
		t.salary();

	}

}
