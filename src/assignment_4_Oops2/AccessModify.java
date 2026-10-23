package assignment_4_Oops2;

public class AccessModify extends BankAccount {
	public void accno() {
	
		System.out.println(Accno);// public can access from  diff class same package using extends
		System.out.println(Accname);// same package diff class through extends
	}
	
	

}
