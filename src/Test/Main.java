package Test;

public class Main {
	public static void main(String[] args) {
	BankAccount bank=new BankAccount();
	bank.setBalance(50000);
	bank.getBalance();
	bank.deposit(50000);
	System.out.println(bank.getBalance());
	bank.withdrawal(50000);
	System.out.println(bank.getBalance());
	
	// employer details
	Developer developer=new Developer();
	developer.displayDetails();
	
	// payment system
	Payment upi=new UPI();
	upi.pay(2000);
	Payment credit=new CreditCard();
	credit.pay(300);
	Payment debit=new DebitCard();
	debit.pay(5000);
	
.	//library management system
	Book book1 =new Book();
	book1.setTitle("Wings of Fire");
	book1.setAuthor("APJ Abdul Kalam");
	book1.setPrice(500);
	Book book2=new Book();
	book2.setTitle("Harry Potter");
	book2.setAuthor("J.K. Rowling");
	book2.setPrice(500);
	book1.displayBook();
	book2.displayBook();
	
	
	// 10. Real-World OOP Challenge
	Vehicle car=new Car();
	car.start();
	Vehicle bike=new Bike();
	bike.start();

	
	
	
	
	}
}
