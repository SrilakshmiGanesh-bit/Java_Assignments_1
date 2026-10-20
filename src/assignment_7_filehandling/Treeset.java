package assignment_7_filehandling;

import java.util.TreeSet;

public class Treeset {
	
	public void hashtree(){
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(40);
		tree.add(10);
		tree.add(30);
		tree.add(20);
		System.out.println(tree);
		
	}
	
	public static void main(String[] args) {
		Treeset trees=new Treeset();
		trees.hashtree();
	}

}
