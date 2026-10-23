package assignment_4_Oops2;

public class Student {
	public String name="shree";
	int rollno=47;// default
	private String password;
	protected String clg="PSR";
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
}
