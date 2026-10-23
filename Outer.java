	package assignment_8_strbuilder;
	
	public class Outer {
		int stdid=1;
		String stdname="shree";
		
		class Inner {
			public void displaystddetails() {
				System.out.println("std name:"+stdname+ " std id:"+stdid);
				
			}
		}
		
		public static void main(String[] args) {
			Outer o=new Outer();
			Outer.Inner i=o.new  Inner();
			i.displaystddetails();
		}
	
	}
