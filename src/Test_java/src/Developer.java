package Test_java;

public class Developer extends Employee{
	@Override
	public void salary() {
		int salary=60000;
		super.salary();
		System.out.println("Developer earns salary higher than everyone "+salary);
	}

	public static void main(String[] args) {
		
		Developer d=new Developer();
		d.salary();
		
		// TODO Auto-generated method stub

	}

}
