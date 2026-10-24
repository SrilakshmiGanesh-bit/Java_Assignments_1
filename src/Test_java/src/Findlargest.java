package Test_java;

public class Findlargest {
	public int a=100;// access in same and diff class and same and diff packages
	 int b=200;// default access in same and diff class using extends
	private int c=500;// only access inside the class
	public int findlargest() {
		if(a>=b && a>=c) {
			return a;
		}
		else if(b>=a && b>=c) {
			return b;
		}
		else {
			return c;
		}
	}
	
	
	public static void main(String [] args) {
		Findlargest find=new Findlargest();
		System.out.println(find.findlargest());
	}

}
