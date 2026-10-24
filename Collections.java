package Test_java;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections {
	
	
	public void removedup() {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(5);
		arr.add(3);
		arr.add(5);
		arr.add(2);
		arr.add(3);
		
		
		HashSet<Integer> hash=new HashSet<Integer>(arr);
		System.out.println("Original arraylist with dupliates "+arr);
		System.out.println("hashsets after removing duplicates"+hash);
	}
	
	public static void main(String[] args) {

	Collections c=new Collections();
	c.removedup();
	}

}
