package assignment_7_filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File_handling_2 {
	public static void main(String[] args) throws Exception {
		File file=new File("student.txt");
		if(file.createNewFile()) {
			System.out.println(file+" file created");
		}
		else {
			System.out.println("file already exits");
		}
		FileWriter wrote=new FileWriter("student.txt",true);
		wrote.write("welcome back");
		wrote.close();
		FileReader read=new FileReader("student.txt");
		String data1=read.readAllAsString()	;
		System.out.println(data1);
	
	}

}
