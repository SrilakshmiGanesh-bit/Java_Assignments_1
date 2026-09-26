package assignment_2_oops;

public class Vehicle {
	private int vehiclespeed;
	void start() {
		System.out.println("Vehicle starts");
	}
	void stop() {
		System.out.println("Vehicle stops");

		
	}
	public void setSpeed(int vehiclespeed) {
		this.vehiclespeed=vehiclespeed;
	}
	public int getSpeed() {
		return vehiclespeed;
	}
	
	

}
