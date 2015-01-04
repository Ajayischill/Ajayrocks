/**
 * This code demonstrates a simple counting loop using the while-do statement.
 * You put a while condition in parentheses, using with a variable that starts
 * at a certain value. Then in the curly braces, you put the do action. Each
 * time the routine runs through the action, the value++ adds 1 to the value.
 * The do-while logic ends when the value is 10.
 * 
 *
 */

public class countingLoop {

	int value = 0;

	void countMe() {

		while (value < 10) {
			System.out.println("hello" + value);
			value++;
		}

	}

	public static void main(String[] args) {
		countingLoop countingLoop1 = new countingLoop();
		countingLoop1.countMe();
	}
}
