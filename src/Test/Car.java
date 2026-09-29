package Test;

public class Car extends Vehicle{
	int numberOfDoors=4;
	@Override
	public void start() {
		System.out.println("the car starts and  number of doors in car "+(numberOfDoors));
	}

}
