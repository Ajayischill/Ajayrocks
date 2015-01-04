package access_modifiers;

public class GracePoint {
	public String PublicString = "GracePoint: Good morning (public)";
	private String PrivateString = "GracePoint: Good morning (private)";
	/*default*/ String DefaultString = "GracePoint: Good morning (default)";
	protected String ProtectedString = "GracePoint: Good morning (protected)";
	
	public void printAllStrings() {
		System.out.println("GracePoint all: " + PublicString + ", " + PrivateString + ", " + DefaultString + ", " + ProtectedString);
	}

}
