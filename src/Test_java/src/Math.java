package Test_java;

public class Math {
	public void mathfunctions() {
		System.out.println("Square root : "+java.lang.Math.sqrt(16));
		System.out.println("Power : "+java.lang.Math.pow(2, 8));
		System.out.println("Absolute value: "+java.lang.Math.abs(-25));
		System.out.println("Maximum: "+java.lang.Math.max(100, 500));
	}
	public static void main(String [] args) {
		Math m=new Math();
		m.mathfunctions();
	}

}
