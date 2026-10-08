package assignment_6_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class ArraytoHashlist {
	
	int rollno;
	String name;
	int mark;
	
	ArraytoHashlist(){
		
	}
	ArraytoHashlist(int rollno, String name, int mark){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	}
	
	public void hasharr() {
		ArrayList<ArraytoHashlist> arrhash=new ArrayList<>();
		arrhash.add(new ArraytoHashlist(25,"shree",95));
		arrhash.add(new ArraytoHashlist(26,"krish",85));
		arrhash.add(new ArraytoHashlist(27,"anu",65));
		arrhash.add(new ArraytoHashlist(28,"gayu",75));
		arrhash.add(new ArraytoHashlist(25,"shreelakshmi",80));
		arrhash.add(new ArraytoHashlist(2,"ram",55));
		// here passing arraylist in the hash()
		HashSet<ArraytoHashlist> hash=new HashSet<>(arrhash);
		
		
		for(ArraytoHashlist a:hash) {
			System.out.println(a.name+" "+a.rollno+" "+a.mark);
		}
	}
	
		
		
	

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArraytoHashlist other = (ArraytoHashlist) obj;
		return rollno == other.rollno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraytoHashlist arr=new ArraytoHashlist();
		arr.hasharr();
	
	}

}
