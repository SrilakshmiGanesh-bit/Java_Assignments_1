package assignment_9_multithreading;

public class Synchronization {
	double bankBalance=5000;
	synchronized public void withdraw1() {
		int withdrawamount=4000;
		if(bankBalance>withdrawamount) {
			bankBalance=bankBalance-withdrawamount;
			System.out.println("The amount "+withdrawamount+" has been withdrawn from withdraw1");
		}
		else {
			System.out.println("The balance is less u cannot withdraw");
		}
	}
	synchronized public void withdraw2() {
		int withdrawamount=4000;
		if(bankBalance>withdrawamount) {
			bankBalance=bankBalance-withdrawamount;
			System.out.println("The amount "+withdrawamount+" has been withdrawn from withdraw2");
		}
		else {
			System.out.println("The balance is less u cannot withdraw ");
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		Synchronization sync=new Synchronization();
		Thread t1=new Thread(()->{
			sync.withdraw1();
		});
		Thread t2=new Thread(()->{
			sync.withdraw2();
		});
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("The balance after withdraw is "+ sync.bankBalance);
	}

}
