package assignment_9_multithreading;

public class WaitandNotify {
	boolean orderplaced=false;
	boolean isfoodprepared=false;
	
	 synchronized void collectorder() {
		 
			
		 orderplaced=true;
		 System.out.println("Your order has been placed");
		 notifyAll();
		 
		 while(!isfoodprepared) {
			 try {
			 wait();
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		 System.out.println("You have collected the food");
		 
		 
		 
	 
		 
	 }
		
	 synchronized void chefpreparesfood() {
		 
		 while(!orderplaced) {
			 try {
				 wait();
		 
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
	 System.out.println("chef is preparing your order");
			 
		
			 try {
				 Thread.sleep(2000);				 
			 }
			 catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		 
		 isfoodprepared=true;
		 System.out.println("Order has been prepared");
		 notifyAll();
		 }
		
		 
	 
	 
	         
	 
	
	public static void main(String[] args) throws InterruptedException {
		WaitandNotify order=new WaitandNotify();
		Thread t1=new Thread(()->{
			order.collectorder();
		});
		Thread t2=new Thread(()->{
			order.chefpreparesfood();
		});
		

		
		t1.start();
		
		t2.start();
		
		
	}

}
