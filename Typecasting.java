package Test_java;

public class Typecasting {
	public static void main(String[] args) {
		// typecasting in data types
		int a=100;
	    double b=a;//widening
	    System.out.println(a);
	    System.out.println(b);
	    double c=100.5;
	    int d=(int) c;// narrowing 
	    System.out.println(c);
	    System.out.println(d);
	    
	    char i='a';
	    int j=i;
	    System.err.println(i);
	    System.out.println(j);
	    int k=97;
	    char l=(char)k;
	    System.out.println(k);
	    System.out.println(l);
	    
	}

}
