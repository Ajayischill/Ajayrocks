package handling_exceptions_no_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/*
 * This code demonstrates what happens if you don't use try-catch blocks. When you run the code, you see that the sysout message doesn't print because the error stops the program from continuing. 
 * This is why it's essential to anticipate errors and use try-catch blocks to properly handle them.
 * This class requires you to add a throws statement to the main method. this makes the error message more specific. 
 */

public class App {

public static void main(String[] args) throws FileNotFoundException {
	
		File myfile = new File("test2.txt");
		FileReader fr = new FileReader(myfile);

		System.out.println("still here...");
	}

}
