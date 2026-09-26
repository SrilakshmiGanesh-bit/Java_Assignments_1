package assignment_2_oops;

public class Encapsulation {
	/*
	 * A bank wants to protect a customer's accountNumber and balance from direct modification. The balance should only be changed through deposit() and withdraw() methods.

Question: Create a BankAccount class using encapsulation with private variables, getters/setters where appropriate, and methods for deposit and withdrawal.
	 */
	
	private long accountNumber;
	private long balance;
	
	public void setAccno(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public long getAccno() {
		return accountNumber;
	}
	
	
	public long getBalance() {
		return balance;
	}
	public void deposit(long depositvalue) {
		balance+=depositvalue;		
	}
	public void withdrawal(long withdrawvalue) {
	   balance-=withdrawvalue;
	}

}
