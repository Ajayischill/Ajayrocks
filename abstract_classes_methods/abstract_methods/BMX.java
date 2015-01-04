package abstract_methods;

// the BMX class extends Bicycle means it inherits all the super classes members (fields and methods)

public class BMX extends Bicycle {

	// you have to implement all methods in the class that are abstract. in this case, just installWheel() is abstract.
	@Override
	public void installWheel() {
		System.out.println("install the wheel");

	}

}
