package static_fields_methods;

/* 
 * Gives an example of a static field.
 * Note that this example comes from Oracle's documentation here: https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
 * 
 * We want to know how many instances of bicycles have been created. So the field numberOfBicycles can't be particular to the 
 * instance. It has to be applicable to the class as a whole. So we make the variable static. Now this field is unchanging -- it 
 * belongs to the class, not the instance of the class. 
 */

public class Bicycle {

	private int cadence;
	private int gear;
	private int speed;
	private int id;

	// This is a "class variable". All objects will refer to this same class
	// variable.
	static int numberOfBicycles = 0;

	// here's the class constructor
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;

		// when the class is instantiated, the class variable is incremented by
		// 1.
		id = ++numberOfBicycles;

	}

	// new method to return the ID instance variable
	public int getID() {
		return id;
	}

	// this method is static, so it belongs to the class, not to a particular instance.
	public static void welcome() {
		System.out.println("Welcome to your new bike!");
	}

}