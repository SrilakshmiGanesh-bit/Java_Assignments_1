package Test_java;

public class Main {
	
	
	
	public static void main(String []args) {
		System.out.println(DBconnection.connections());
		Insertstd_jdbc m=new Insertstd_jdbc();
		m.createtable();
		m.insertabledata();
	}

}
