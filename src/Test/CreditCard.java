package Test;

public class CreditCard implements Payment{
	public void pay(double amount) {
		System.out.println("AmountCredit: " + amount);
	}
}
