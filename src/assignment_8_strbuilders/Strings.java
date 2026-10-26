package assignment_8_strbuilders;

public class Strings {
	public void stringconcat() {
		
	// String is immutable
		// we cannot change the existing value
		// where as it will create new object and refers it
	String name="java";
	System.out.println("Original: " + name);

	name=name+" programming";
	System.out.println("Updated: "+ name);
	}
   
	public static void main(String[] args) {
		Strings str=new Strings();
		str.stringconcat();
	}

}
