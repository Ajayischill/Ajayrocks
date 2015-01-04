package interfaces;

public class Galaxy implements Phone {

	// this string is from the interface
	String OnButton = "on your galaxy mark";
	
	// you can also create your own strings even though you're implementing an interface
	String myButton = "my button";

	public void ringTone() {
		System.out
				.println("galax-rinnngggg ... galax-rinnngggg .... galx-rinnggggg");
		System.out.println(OnButton + " " + myButton);

	}
}
