/**
 * 
 * This demonstrates how constructors works. In KittenConstructor, I have 2 constructors declared, one that takes an argument and one that doesn't. Java looks at the arguments when I create a new 
 * object and runs the right constructor. 
 */

package constructor_exploration;

public class App {

	public static void main(String[] args) {
		KittenConstructor myKitty1 = new KittenConstructor("Boots");
		System.out.println("My kitten's name is " + myKitty1.name + ".");

		KittenConstructor myKitty2 = new KittenConstructor();
		System.out.println("My kitten's name is " + myKitty2.name + ".");
		
		

	}

}
