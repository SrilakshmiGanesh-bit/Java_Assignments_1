package assignment_5_loop;

public class Employee {
	public final int tax=10;
	public static int empcnt=0;
	public static int[] empsalary= {45000,65000,90000,10000,25000};
	public static void highsalary() {
		for(int arrs:empsalary) {
			if(arrs>50000) {
				empcnt++;
				System.out.println("the employer with salary "+ arrs +"has high salary");
			}
			else {
				System.out.println("the employer with salary "+ arrs +"has low salary");
				
			}
		}
        System.out.println("Total Employees: " + empcnt);

	}
	

}
