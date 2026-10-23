package assignment_7_filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class FileHandling {
	public static void main(String[] args) throws Exception {
		File file=new File("student.txt");
		if(file.createNewFile()) {
			System.out.println(file+" file created");
		}
		else {
			System.out.println("file already exits");
		}
		
	
	}

}
