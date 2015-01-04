import java.util.Scanner;

/**
 * Here we demonstrate the ability to accept inputs from the user. The inputs
 * depend on a package called java.util.Scanner. When you import this package,
 * you can then use the Scanner class and nextInt method.
 * 
 * This code creates a new Scanner object called input. This object takes the
 * System.in argument (which I'm not actually sure about). Basically you set the
 * value for value using the .nextInt argument, and then you print that value to
 * a line.
 * 
 */

public class IntegerCount {

	void runIntegerCount() {
		// create the scanner object
		Scanner input = new Scanner(System.in);

		// output the prompt
		System.out.println("How old are you?");

		// wait for the user to enter something.
		int value = input.nextInt();

		// add another prompt
		System.out.println("What is your name?");

		// wait for user to enter something
		String name = input.nextLine();

		// tell them what they entered
		System.out.println("Your name is " + name + ". You are " + value
				+ " years old.");
	}

	public static void main(String[] args) {
		IntegerCount integercount1 = new IntegerCount();
		integercount1.runIntegerCount();
	}
}
