package assignment_9_multithreading;

public class ShoppingApplication implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
			System.out.println("Order "+i+" has been placed");
			Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}
	

	
	public static void main(String [] args) {
		ShoppingApplication shop=new ShoppingApplication();
		Thread t1=new Thread(shop);
//		
		t1.start();
		
		
		
	}
	

}
