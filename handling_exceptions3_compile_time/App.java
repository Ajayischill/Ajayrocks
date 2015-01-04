import javax.management.BadStringOperationException;
/*
 * This is an example of how an IDE is able to catch errors even before you compile your code. You can see here that we can't even run the code. Eclipse identifies the error and flags it with a 
 * red X. 
 */

public class App {

	public static void main(String[] args) {
		Bball myGame = new Bball();
		try {
			// here i'm passing the method an integer when it requires a string; however, this error is caught here in the 
			// IDE rather than at run-time.
			myGame.playBball(5);
		} catch (BadStringOperationException e) {
			
			e.printStackTrace();
		}

	}

}
