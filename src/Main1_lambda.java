package Test_java;

public class Main1_lambda {
	public static void main(String[] args) {
	Calculator cal=(int a, int b)->{
		return a+b;
	};
	System.out.println("add :"+ cal.add(5, 10));
	}

}
