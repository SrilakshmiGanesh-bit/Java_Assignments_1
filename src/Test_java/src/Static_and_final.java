package Test_java;

public class Static_and_final {
	
	public static void  display() {
		final String password="shree2003";
		System.out.println("password before reassgining:"+password);
		/*
		 *we cannot reassign final variables
		 * password="shree";
		 * System.out.println("password after reassigining:"+password);
		 */
	}
	
	
	
	
	public static void main(String [] args) {
		
		// we can call static method with class name dont need to create object
		Static_and_final.display();
	}

}
