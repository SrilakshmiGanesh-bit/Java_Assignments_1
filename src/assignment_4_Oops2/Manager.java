package assignment_4_Oops2;

public class Manager extends Employee implements Bonus{
	@Override
	public void interfaceBonus() {
		System.out.println("Bonus implemented");
	}
	void work() {
		System.out.println("Work implemented");
	}	
}
