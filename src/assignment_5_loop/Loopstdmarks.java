package assignment_5_loop;

public class Loopstdmarks {
	public void marks(){
	int[] mark= {20,75,50,10,100};
	for(int i=0; i<mark.length;i++) {
		if(mark[i]>50) {
			System.out.println("The std with mark "+ mark[i] +" has passed the exam");
		}
		else {
			System.out.println("The std with mark "+ mark[i] +" has failed the exam");

		}
	}
	}

}
