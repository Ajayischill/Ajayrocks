
public class Person {

	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name + ". I'm " + age
				+ " years old.");
	}

	int calculateRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
}
