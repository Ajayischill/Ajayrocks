package access_modifiers;

public class Episode extends GracePoint {
	public void printProtectedString() {
		System.out.println("from subclass: " + ProtectedString); // i can use ProtectedString because protected can be used in subclasses
	}

}
