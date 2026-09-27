package assignment_4_Oops2;

public class Main {
	public static void main(String[] args) {
		//Abstract
		Payment credit=new Creditcard();
		Payment upi=new UPI();
		credit.payment();
		upi.payment();	
		
		// interface
		
		Vehicle car=new Car();
		car.start();
		car.stop();
		Vehicle bike=new Bike();
		bike.start();
		bike.stop();
		
		
		//Access Modifier
			BankAccount bank=new BankAccount();
			bank.accno();// public 
			System.out.println(bank.Accname);
			bank.balancecheck();
			AccessModify access=new AccessModify();
			access.accno(); // public value accessed from BankAccount and inherted the class to AccessModify
			Default defaults=new Default();
			defaults.defaults();
			System.out.println(defaults.defaultnum);
			
		// 4. Abstract Class + Interface – Employee System

			Manager manager=new Manager();
			manager.work();
			manager.interfaceBonus();
			
			
			// 5. Access Modifier + Inheritance

			CollegeStudent std=new CollegeStudent();
			std.setPassword("shree2003");
			std.name();
			System.out.println(std.getPassword());
		
		
	}

	private static char[] getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
