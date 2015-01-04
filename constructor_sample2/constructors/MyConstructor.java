package constructors;

public class MyConstructor {
	
	public String name = "jeff";
	
	public MyConstructor(String name) {
		System.out.println("constructor is running!");
		this.name = name;
		System.out.println("I am " + name + ". Would you like to play a game?");
	}
	
	public void myConstructorMethod() {
		System.out.println("Your name is " + name);
	}

}
