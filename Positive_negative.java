package Test_java;

public class Positive_negative {
	// poitive and negative
	
	public void posorneg(int a) {
		if(a>0) {
			System.out.println(a+" is a positive number");
		}
		else {
			System.out.println(a+" is a negative number");
		}
	}
	
	public static void main(String[] args) {
		Positive_negative p=new Positive_negative();
		p.posorneg(-5);
	}

}
