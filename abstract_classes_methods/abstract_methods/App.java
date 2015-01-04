package abstract_methods;

public class App {

	public static void main(String[] args) {
		
		// Bicycle class cannot be instantiated because is abstract
					//Bicycle myBike = new Bicycle();
					// you can only extend an abstract class
					
		
		BMX myBMX = new BMX();
			
		// here's a method we overwrote because it's abstract
		myBMX.installWheel();
		
		// however, this method didn't need to be overwritten because it's not abstract
		myBMX.installErgonomicGrips();
			
		}
		

	}
