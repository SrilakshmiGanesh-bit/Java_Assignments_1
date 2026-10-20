package assignment_7_filehandling;

import java.util.HashMap;

public class Hashmap {
	public void hashmaps() {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "shree");
		map.put(2, "ramesh");
		map.put(3, "rahul");
		System.out.println(map);
	}
	
	
	public static void main(String[] args) {
		Hashmap hashh=new Hashmap();
		hashh.hashmaps();
	}

}
