public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Tom";
		person1.age = 39;
		
		
		person1.speak();
		
		// here we declare a new integer variable called years and set it equal to the value that is returned from the 
		// person1.calculateRetirement(); method. If you look at that method in the Person.java file, you'll see that
		// rather than void, we preface the method with int. this means that it will return an integer. if you just left
		// it at void, it wouldn't return anything. since it returns an integer, we can set what that method returns equal
		// to a variable. however, if the method didn't return any value, you couldn't just set the variable equal 
		// to the method. 

		int years = person1.calculateRetirement();
		System.out.println(years);
		
		int retirementAge = person1.getAge();
		System.out.println(retirementAge);

	}
}
