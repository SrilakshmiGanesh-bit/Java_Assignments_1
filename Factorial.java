package Test_java;

public class Factorial {
	public void factorials(int n) {
		int factorial=1;
		for(int i=1;i<=n;i++) {
			factorial *=i;//
			
		}
		System.out.println("Factorial of "+n+" is "+factorial);
	}
	
	public static void main(String[] args) {
		Factorial fact=new Factorial();
		fact.factorials(6);
	}

}
