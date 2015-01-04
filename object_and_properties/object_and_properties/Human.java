package object_and_properties;

public class Human {

	String name;
	int age;
	void speak() {
		System.out.println("Hello, my name is " + name +". I am " + age + " years old.");
	}
	void interact(String location) {
	    System.out.println("when you are "+ age + " years old, I will need your help in the " + location + ".");
	}
	
	
	public static void main(String[] args) {
		Human human1 = new Human();
		human1.name = "Tom Johnson";
		human1.age = 39;

		Human human2 = new Human();
		human2.name = "Shannon Johnson";
		human2.age = 37;
		System.out.println(human1.name + " and " + human2.name + " are awesome.");
		
		human1.speak();
		human2.speak();
		human1.interact("kitchen");
	}
}