package assignment_9_multithreading;

public class Product {
	boolean isproductready=false;
	synchronized void customer1() {
		System.out.println("customer 1 is waiting");
		while(!isproductready) {
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println("customer 1 recieved product");
	}
	synchronized void customer2() {
		System.out.println("customer 2 is waiting");
		while(!isproductready) {
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}System.out.println("customer 2 recieved product");
		
	}
	synchronized void customer3() {
		System.out.println("customer 3 is waiting");
		while(!isproductready) {
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println("customer 3 recieved product");
		
	}
	synchronized void products() {
		System.out.println("company is producing the product");
		isproductready=true;
		notifyAll();
		System.out.println("company produced the product and notified the customer");
		
		
	}
	public static void main(String[] args) {
		Product p=new Product();
		Thread t1=new Thread(()->{
			p.customer1();
		});
		Thread t2=new Thread(()->{
			p.customer2();
		});
		Thread t3=new Thread(()->{
			p.customer3();
		});
		Thread product=new Thread(()->{
			p.products();
		});
		
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		product.start();
	}

}
