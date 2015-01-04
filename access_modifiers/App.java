import access_modifiers.Episode;
import access_modifiers.GracePoint;

/* 
 * Demonstrates access modifiers. There are two packages: the default and a package called access_modifiers. GracePoint is in this 
 * outside package.
 */

public class App {
	
	

	public static void main(String[] args) {
		
		GracePoint myGracePoint = new GracePoint();
		System.out.println(myGracePoint.PublicString); // works anywhere because string is public
		// System.out.println(myGracePoint.PrivateString); // won't work because we're outside the class
		// System.out.println(myGracePoint.DefaultString); // won't work because we're outside the package
		// System.out.println(myGracePoint.ProtectedString); // won't work because we're outside the package
		
		myGracePoint.printAllStrings(); // prints all strings by referencing a method that is public. inside the method, the strings are referenced.
		
		
		GoodWife myGoodWife = new GoodWife();
		System.out.println(myGoodWife.DefaultString); // works because we're in the same package
		System.out.println(myGoodWife.ProtectedString); // works because we're in the same package
		
		Episode myEpisode = new Episode();
		myEpisode.printProtectedString();
	}

}
