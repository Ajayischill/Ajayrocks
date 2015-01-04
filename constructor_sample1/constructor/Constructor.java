package constructor;

public class Constructor {
	public String name = "Carey";
	public String town = "Kansas";
	
	public Constructor(String name, String town) {
		this.name = name;
		this.town = town;
		System.out.println("My name is " + name + ". I'm from "+ town + ".");
		
	}
		public void sampleConstructorMethod() {
			System.out.println("hi " + name + ". I've never met someone from " + town + ".");
	}
	

}
