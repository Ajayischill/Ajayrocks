package stringbuilder;

/**
 * StringBuilder is a class that lets you manipulate strings. It's available in
 * the default Java package. Why do you need StringBuilder? Basically it allows
 * you to conserve memory and reduce the number of objects you create.
 * 
 * For example, if you were to add something to a string, such as s1 = s1 +
 * "hello there", you're actually creating a new variable, not just adding onto
 * an existing string definition. The previous assignment of s1 becomes eligible
 * for garbage collection which means you're wasting resources and memory every
 * time you manipulate strings this way.
 * 
 * Instead of adding to strings like this, it's more common to use something
 * called StringBuilder. This class lets you insert or append text into an
 * existing string.
 * 
 * Create a new StringBuilder object. Then pass the StringBuilder constructor
 * your existing string. Now you can append, insert, or otherwise manipulate the
 * string.
 * 
 * @author tjohnson
 *
 */

public class MyStringBuilderDemo {

	public static void main(String[] args) {
		String s1 = "Welcome";

		// don't do this because is wastes memory and creates a need for garbage collection to dispose of unused variables.
		// s1 = s1 + "to our town."

		
		// StringBuilder is a class for working with strings. Here we create a new StringBuilder class. 
		// We pass the StringBuilder constructor our string. Then we call the append method to add to the string.
		StringBuilder sb = new StringBuilder(s1);
		sb.append(" to California!");
		
		
		// here our string has some extra whitespaces. we call length to see how many white spaces there are. 
		String s2 = "Welcome!          ";
		int len1 = s2.length();
		System.out.println(len1);
		// now we call the trim method to get rid of those white spaces. 
		String s3 = s2.trim();

		System.out.println(sb);
		System.out.println(s3.length());
	}

}
