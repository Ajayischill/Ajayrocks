/**
 * The code shows instance variables (I think that's what they're called) for a
 * class, and how you use dot notation to set and access the instance variables.
 * For StaticStuff, there are two instance variables: name and description. You
 * have to set the type and access for each variable when you declare it. That's
 * why you see the public String and public static String before the variables.
 * Then you can set the variable by using dot notation with class.variable, like
 * this: StaticStuff.name. The showName method just prints out the name and
 * description.
 * 
 *
 */
public class StaticStuff {
	public String name;
	public static String description;

	public void showName() {

		System.out.println(name);
		System.out.println(description);
	}


}
