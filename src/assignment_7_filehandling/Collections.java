package assignment_7_filehandling;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections {
	public static void hashsets() {
		
		HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(10);
		hash.add(20);
		hash.add(10);
		hash.add(30);
		hash.add(20);
		
		System.out.println("Hashset output:"+hash);
		
		
	}
	public static void main(String[] args) {
		Collections.hashsets();
	}

}
