package abstract_methods;

/* Abstract methods
 If you add the word abstract before a class, it means you can't instantiate it. Other classes must extend it in order to use it. In this example, Bicycle is an abstract class. In my App.java file, when I try to 
 instantiate it, I get an error. However, when I create a BMX class that extends Bicycle, it works. When you extend a class, you have to implement all of its methods.
 */
abstract class Bicycle {

	//subclasses must implement this abstract method
	// abstract methods do not specify a body
	abstract void installWheel();
  
	// subclasses don't need to implement this concrete method; they can optionally use it if they want.
	protected void installErgonomicGrips() {
    	System.out.println("Install the ergonomic grips.");
    };

}
