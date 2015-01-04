package casting;

/*
 * Casting is changing the primitive data type of a value from one type to another. You usually downgrade the type, making
 * a large bucket smaller. In this example, we have two values: a long and a double. A double holds more than a long. In our case, 
 * the double's payload could really be handled more efficiently with a smaller data type: a long. So we will cast the double's data type to a 
 * a long. You cast by putting the data type you want to cast to in parentheses before the value. 
 * 
 */

public class App {

	public static void main(String[] args) {

		// for longs, must add L after number; for double, add a d.
		long myLong = 88;
		double myDouble = 8000.7;
		
		myDouble = (long)myDouble;
	    System.out.println(myDouble);
		
	}

}
