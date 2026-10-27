package assignment_9_multithreading;

public class Notifyall {
	boolean isresultannounced=false;
	synchronized void std1() {
		System.out.println("student 1 is waiting for result");
		while(!isresultannounced) {
		try {	
		wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}}
		System.out.println("student 1 received result");
	
	}
	synchronized void std2() {
		System.out.println("student 2 is waiting for result");
		while(!isresultannounced) {
			try {
			wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}}
			System.out.println("student 2 received result");
		
	}
	synchronized void std3() {
		System.out.println("student 3 is waiting for result");
		while(!isresultannounced) {
		try {
		wait();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}}
	
		System.out.println("student 3 received result");
	}
	
	synchronized void  teacher() {
		
		while(!isresultannounced) {
		System.out.println("the teacher is going to publish the result");
		
		isresultannounced=true;
		notifyAll();
		System.out.println("The result has been announced");
	
	}
	}
	public static void main(String[] args) {
		Notifyall notify=new Notifyall();
		
		Thread t1=new Thread(()->{
			notify.std1();
			});
		Thread t2=new Thread(()->{
			notify.std2();
			});
		Thread t3=new Thread(()->{
			notify.std3();
			});
		Thread teacher=new Thread(()->{
			notify.teacher();
		});
		
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		teacher.start();
		
		
		
		
	}

}
