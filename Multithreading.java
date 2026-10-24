package Test_java;

public class Multithreading  {
		public void thread1() {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(2000);
					System.out.println("From thread 1 "+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
		
		public void thread2() {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
					System.out.println("From thread 2 "+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
		public static void main(String[] args) {
			Multithreading thread=new Multithreading();
		Thread t1=new Thread(()->{
		     thread.thread1();
		     });
		
		
		Thread t2=new Thread(()->{
			thread.thread2();
		});
		t1.start();
		t2.start();
		
		
		}
}
