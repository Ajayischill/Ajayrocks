/**
 * This is an example of a for loop. The for method takes 3 arguments (initial
 * condition, evaluation logic, and the counter. Here we're saying that the
 * initial condition is 0. We're both declaring a variable and setting it to 0
 * at the same time here. Then the evaluation is as long as i is less than 5,
 * run this logic. Finally, after running the logic, add 1 to i.
 * 
 */
public class forLoop {

	void runForLoop() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("The value of i is: %d\n", i);
		}
	}

	public static void main(String[] args) {
		forLoop forLoop1 = new forLoop();
		forLoop1.runForLoop();
	}

}
