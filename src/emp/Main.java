package emp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	Employee emp = new Employee();

    	emp.emptablecreation();
    	emp.empregister();
    	if(emp.login()) {
    		System.out.println("Welcome to employee management");
    	}
    	else{
    		System.out.println("Please sign in again");
    		return;
    	}
    	
    	
    	int choice=0;
    	Employee call=new Employee();
    	
    		
    	
    	
    	do {
    		System.out.println("-------------------Employee Management------------------ ");
    		System.out.println("1.Insert emp data");
    		System.out.println("2.display all emp data");
    		System.out.println("3.display selected or particular emp data");
    		System.out.println("4.update employee data");
    		System.out.println("5.delete employee data");
    		System.out.println("0. to exit");
    		System.out.println("enter your option");
    		choice=sc.nextInt();
    		switch(choice) {
    		case 1:
    			call.empinsert();
    			break;
    		case 2:
    			call.Displayall();
    			break;
    		case 3:
    			call.displayid();
    			break;
    			
    		case 4:
    			call.updateemp();
    			break;
    		case 5:
    			call.deleteempdata();
    			break;
    		case 0:
    			System.out.println("exit.....");
    			break;
    		default:
    			System.out.println("incorrect options");
    		}
    		
    	}while(choice !=0);

		/*
		 * Employee employee = new Employee();
		 * 
		 * employee.emptablecreation();
		 * 
		 * employee.empinsert();
		 * 
		 * employee.Displayall(); employee.updateemp();
		 */
        // Search by employee ID when required:
//        employee.displayid();
        //employee.deleteempdata();
        
    }
}