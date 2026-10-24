package Test_java;

public class StringComparision {
	public void strcompare() {
		// for primitive types we can use ==
		
		String a = new String("Java");
        String b = new String("Java");
		
		System.out.println(a==b);
		// for string we should use equals
	
		System.out.println(a.equals(b));
	}
	
	
	public static void main(String[] args) {
		StringComparision str=new StringComparision();
		str.strcompare();
		
		
	}

}
