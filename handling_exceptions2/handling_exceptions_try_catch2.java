/*
 * This code provides another example of the try-catch block. Hre we have an error in the argument for the URI method. we are using \\ instead of the proper // syntax. 
 * When the error happens, the code goes to the catch block and the error is passed to the variable e if it's a URISyntaxException error. the getMessage() method prints out the reason for the error. 
 * 
 * Tip: when you create a try-catch block using the right-click, surround with try-catch block option, it 
 * will automatically insert the right kind of error handling based on the @throws argument in the 
 * documentation for the method. 
 * 
 * After the catch block, the code continues and the last sysout message is printed to the console.
 */

import java.net.URI;
import java.net.URISyntaxException;

public class handling_exceptions_try_catch2 {

	public static void main(String[] args) {
		try {
			URI uri = new URI("http:\\idratherbewriting.com");
		} catch (URISyntaxException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("please go to my site.");

	}

}
