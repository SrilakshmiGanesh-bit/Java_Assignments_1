package Test;

public class Bike extends Vehicle{
	
	String hasGear="has gears";
	@Override
	public void start() {
		System.out.println("the car starts "+hasGear);
	}

}	
