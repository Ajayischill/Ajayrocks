package handling_exceptions_try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/* 
 * This code demonstrates error handling. We use the try block to put the code we want to run. The sysout message doesn't get printed because there's an error here -- the test2.txt file can't 
 * actually be found. Hence Java moves to the catch block. The error is passed to e and printStackTrace is the method used to print the error message to the console. You can see that it's a FileNotFoundException.
 * Then the last message runs because it's outside the code block. Your code continues and isn't completely stymied due to the error. 
 */

public class App {

	public static void main(String[] args) {
		File file = new File("test2.txt");
		try {
			FileReader fr = new FileReader(file);
			System.out.println("This won't be run if an exception is found.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("This code still runs because it's outside the Try block.");

	}

}
