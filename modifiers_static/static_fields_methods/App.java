package static_fields_methods;

public class App {
	
	public static void main(String[] args) {
		Bicycle Rockhopper = new Bicycle(5, 10, 500);
		
		// access the static variable like this: class.field_name. Not as object.field_name. This lets people know 
		// that the field belongs to the class and not necessarily the object. 
		System.out.println(Bicycle.numberOfBicycles);
		
		Rockhopper.getID();
		
		Bicycle Huffy = new Bicycle(7,23, 600);
		System.out.println(Bicycle.numberOfBicycles);
		Huffy.getID();
		
		// let's call a static method. Notice that we use class.method() and not object.method();
		Bicycle.welcome();
		
		// however, you can also use object.method() and it will work -- it's just not a best practice
		
		Huffy.welcome();
		
	}

}
