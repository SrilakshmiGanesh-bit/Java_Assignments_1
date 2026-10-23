package Test;

public class DebitCard implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("DebitAmount: " + amount);
	}
}
