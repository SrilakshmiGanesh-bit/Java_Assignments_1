package assignment_8_strbuilder;

import java.util.Optional;

public class Optionalclass {
	public void stdmanagement() {
		Optional<String> name=Optional.ofNullable(null);
		Optional<String> name1=Optional.ofNullable("shree");
		System.out.println("For null "+name.isPresent());
		System.out.println("For null "+name.orElse("Student name not available"));
		System.out.println("for value "+name1.isPresent());
		System.out.println("for value "+name1.orElse("Student name not available"));
		
	}
	public static void main(String[] args) {
		Optionalclass op=new Optionalclass();
		op.stdmanagement();
	}

}
