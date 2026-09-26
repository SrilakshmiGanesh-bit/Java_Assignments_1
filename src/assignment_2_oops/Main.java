	package assignment_2_oops;
	
	public class Main {
	
		
		public static void main(String[] args) {
			//class and object
			StudentInformation s1=new StudentInformation();
			StudentInformation s2=new StudentInformation();
			s1.name="shree";
			s2.name="anu";
			s1.rollno=25;
			s2.rollno=30;
			s1.mark=95;
			s2.mark=75;
			// inheritance
			
			s1.displaystudent();
			s2.displaystudent();
			Developer d=new Developer();
			d.empinfo("shree", 1, 50000);
			d.programming("Java");
			d.displayfulldetails();
			
			// encapsulation
			Encapsulation e=new Encapsulation();
			e.setAccno(12345);
			e.deposit(50000);
			System.out.println("Balance after deposit is "+  e.getBalance());
			e.withdrawal(10000);
			System.out.println("Balance after withdrawal is "+ e.getBalance());
			// polymorphism
			
			UPII_child upi=new UPII_child();
			upi.pay();
			Cash_child cash=new Cash_child();
			cash.pay();
			Card_child card=new Card_child();
			card.pay();
			// OVerall oops scenario
			Vehicle vehicle=new Vehicle();// object
			vehicle.setSpeed(50);// encapsulation
			System.out.println("Vehicle speed is "+ vehicle.getSpeed()+"kmph");
			Car car=new Car();
			car.start();// polymorphism
			Bike bike=new Bike();
			bike.start();
			vehicle.stop();
			
			
			
			
			
		}
	}
