/**
 * This shows an example of a try-catch block. You use this to avoid having your
 * application get hung up with an error during runtime (runtime errors only
 * manifest themselves when you're running the application, whereas compile time
 * errors appear when you compile your app. To quickly insert a try-catch block,
 * highlight what you want to put into the try block, right click, and select
 * Surround with > Try Catch block. If there's an error in the try block, this
 * error will be handled by the catch block, and then your application will keep
 * on running. That's the cool thing about catching the exception. Your
 * application can keep going.
 * 
 * The general name for the exception is "(Exception e)". This says to catch any
 * exception and push it into the variable e. Then you can call different
 * methods against e to print it out.
 * 
 * The error here is that we have a string array consisting of 1 item, and we
 * want to print the second item (which doesn't exist) in the array.
 *
 */

public class App {
	
	public static void main(String[] args) {
		
	try {
		String[] string = { "welcome" };
		System.out.println(string[1]);

	} catch (Exception e) {

		e.printStackTrace();
		// System.out.println("there was error here");
	}
	System.out.println("the application is still running.");
}

}




