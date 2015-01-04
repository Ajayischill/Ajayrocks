/**
 * This code demonstrates the idea of a method. The countFruit() method prints a
 * couple of things out. The method is contained with the Fruit class. To run
 * the method, you first create a new object from the class. Then you use dot
 * notation to run the method, e.g., fruit.countFruit().
 * 
 * 
 */

public class Fruit {

	// Declare and initialize three variables
	int numOranges = 5; // Count of oranges
	int numApples = 10; // Count of apples
	int numFruit = 0; // Count of fruit

	void countFruit() {
		numFruit = numOranges + numApples; // Calculate the total fruit count
		// Display the result
		System.out.println("A totally fruity program");
		System.out.println("Total fruit is " + numFruit);
	}

	public static void main(String[] args) {
		Fruit fruit1 = new Fruit();
		fruit1.countFruit();
	}
}
